package by.jonline.pr04.prwclass.task04;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
 * время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте
 * возможность сортировки элементов массива по номерам поездов. Добавьте возможность
 * вывода информации о поезде, номер которого введен пользователем. Добавьте возможность
 * сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

public class Task04 {

	public static void main(String[] args) {

		int numberOfTrains = 5;
		Depo depo = new Depo(numberOfTrains);
		DepoAction depoAction = new DepoAction();

		depoAction.changeTrainNumber(depo, 3, 12);
		depoAction.changeTrainNumber(depo, 1, 95);
		depoAction.changeTrainDestination(depo, 4, "Минск");
		depoAction.changeTrainDestination(depo, 2, "Гродно");
		depoAction.changeTrainDestination(depo, 95, "Гродно");
		depoAction.changeTrainDestination(depo, 5, "Минск");
		depoAction.changeTrainDestination(depo, 12, "Брест");
		depoAction.changeTrainDepartureTime(depo, 4, new GregorianCalendar(2022, Calendar.JANUARY, 10, 12, 10));
		depoAction.changeTrainDepartureTime(depo, 2, new GregorianCalendar(2022, Calendar.FEBRUARY, 1, 10, 33));
		depoAction.changeTrainDepartureTime(depo, 95, new GregorianCalendar(2022, Calendar.MARCH, 3, 16, 45));
		depoAction.changeTrainDepartureTime(depo, 12, new GregorianCalendar(2022, Calendar.MAY, 15, 14, 27));
		depoAction.showAllTrains(depo);

		depoAction.sortTrainsByNumber(depo);
		System.out.printf("\nОтсортированные поезда по номерам\n");
		depoAction.showAllTrains(depo);

		depoAction.sortTrainsByDestination(depo);
		System.out.printf("\nОтсортированные поезда по станциям назначения\n");
		depoAction.showAllTrains(depo);
		System.out.println();

		depoAction.showTrainInfo(depo, 9);
	}

}
