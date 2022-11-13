package by.jonline.pr04.prwclass.task04;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.ListIterator;

public class DepoAction {

	public Train findTrainByNumber(Depo depo, int trainNumber) {
		// Метод возвращает поезд foundTrain из депо depo с заданным номером trainNumber
		// Если поездов с одинаковыми номерами несколько (что неправильно), то будет
		// возвращен первый найденный поезд
		// В случае отсутствия номера или депо - будет возвращен null
		if (depo != null) {
			ListIterator<Train> lIter = depo.getTrains().listIterator();
			Train foundTrain;
			while (lIter.hasNext()) {
				foundTrain = lIter.next();
				if (foundTrain.getNumber() == trainNumber) {
					return foundTrain;
				}
			}
			return null;
		} else {
			return null;
		}
	}

	public void showAllTrains(Depo depo) {
		// Метод выводит на экран все поезда из заданного депо depo,
		// выводит соответствующую запись, если депо или поезда отсутствуют

		if (depo != null) {
			System.out.println("Все поезда депо:");
			ListIterator<Train> lIter = depo.getTrains().listIterator();
			while (lIter.hasNext()) {
				System.out.println(lIter.next().toString());
			}
		} else {
			System.out.println("Депо отсутствует");
		}
	}

	public void showTrainInfo(Depo depo, int trainNumber) {
		// Метод выводит на экран поезд с номером trainNumber из депо depo

		if (depo != null) {
			Train train = findTrainByNumber(depo, trainNumber);
			if (train != null) {
				System.out.println(train.toString());
			} else {
				System.out.printf("Поезд с номером %d не найден", trainNumber);
			}
		} else {
			System.out.println("Депо отсутствует");
		}
	}

	public void changeTrainNumber(Depo depo, int oldTrainNumber, int newTrainNumber) {
		if (depo != null && newTrainNumber > 0) {
			if (findTrainByNumber(depo, oldTrainNumber) != null) {
				findTrainByNumber(depo, oldTrainNumber).setNumber(newTrainNumber);
			}
		}
	}

	public void changeTrainDestination(Depo depo, int trainNumber, String newDestination) {
		if (depo != null && findTrainByNumber(depo, trainNumber) != null) {
			findTrainByNumber(depo, trainNumber).setDestination(newDestination);
		}
	}

	public void changeTrainDepartureTime(Depo depo, int trainNumber, Calendar departureTime) {
		if (depo != null && findTrainByNumber(depo, trainNumber) != null) {
			findTrainByNumber(depo, trainNumber).setDepartureTime(departureTime);
		}
	}

	public Depo sortTrainsByNumber(Depo depo) {
		// Метод возвращает депо, в котором поезда отсортированы по возрастанию номеров
		// Реализована сортировка выбором. При желании, можно заменить на обычную
		// сортировку
		// последовательности ArrayList sort

		if (depo != null) {
			Depo sortedDepo = new Depo();
			Train tempTrain = new Train();
			ArrayList<Train> tempDepo = depo.getTrains();

			for (int i = 0; i < tempDepo.size() - 1; i++) {
				int minPosition = i;
				for (int j = i + 1; j < tempDepo.size(); j++) {
					minPosition = tempDepo.get(j).getNumber() < tempDepo.get(minPosition).getNumber() ? j : minPosition;
				}
				tempTrain = tempDepo.get(minPosition);
				tempDepo.set(minPosition, tempDepo.get(i));
				tempDepo.set(i, tempTrain);
			}
			sortedDepo.setTrains(tempDepo);
			return sortedDepo;
		} else {
			return null;
		}
	}

	public Depo sortTrainsByDestination(Depo depo) {
		// Метод возвращает депо, в котором поезда отсортированы по названиям пункта
		// назначения
		// Поезда с одинаковыми пунктами назначения упорядочены по времени отправления

		if (depo != null) {
			Depo sortedDepo = new Depo();
			Train tempTrain = new Train();
			ArrayList<Train> tempDepo = depo.getTrains();
			for (int i = 0; i < tempDepo.size() - 1; i++) {
				int minPosition = i;
				for (int j = i + 1; j < tempDepo.size(); j++) {
					int tempComp = tempDepo.get(j).getDestination()
							.compareToIgnoreCase(tempDepo.get(minPosition).getDestination());
					if (tempComp < 0) {
						minPosition = j;
					} else if (tempComp == 0) {
						if (tempDepo.get(j).getDepartureTime().getTimeInMillis() < tempDepo.get(minPosition)
								.getDepartureTime().getTimeInMillis()) {
							minPosition = j;
						}
					}
				}
				tempTrain = tempDepo.get(minPosition);
				tempDepo.set(minPosition, tempDepo.get(i));
				tempDepo.set(i, tempTrain);
			}

			return sortedDepo;
		} else {
			return null;
		}
	}
}
