package by.jonline.pr04.prwclass.task10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

public class AirportAction {

	public void showAllAirlines(Airport airport) {
		// Метод выводит все вылеты аэропорта
		if (airport != null && !airport.getAirlineList().isEmpty()) {
			System.out.println("Все рейсы аэропорта:");
			Iterator<Airline> iterator = airport.getAirlineList().iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().toString());
			}
		} else {
			System.out.println("Рейсы отсутствуют");
		}
	}

	public void showAirlineList(ArrayList<Airline> airlineList, String message) {
		// Метод выводит список рейсов
		if (airlineList != null && !airlineList.isEmpty()) {
			System.out.println(message);
			Iterator<Airline> iterator = airlineList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().toString());
			}
		} else {
			System.out.println("Список рейсов пуст");
		}
	}

	public ArrayList<Airline> findAirlineByDestination(Airport airport, String destination) {
		// Метод возвращает список рейсов по пункту назначения
		if (airport != null) {
			ArrayList<Airline> result = new ArrayList<Airline>();
			Iterator<Airline> iterator = airport.getAirlineList().iterator();
			while (iterator.hasNext()) {
				Airline tempAirline = iterator.next();
				if (tempAirline.getDestination().equals(destination)) {
					result.add(tempAirline);
				}
			}
			return result;
		} else {
			return null;
		}
	}

	public ArrayList<Airline> findAirlineByDayOfWeek(Airport airport, DayOfWeek dayOfWeek) {
		// Метод возвращает список рейсов по дню недели
		if (airport != null) {
			ArrayList<Airline> result = new ArrayList<Airline>();
			Iterator<Airline> iterator = airport.getAirlineList().iterator();
			while (iterator.hasNext()) {
				Airline tempAirline = iterator.next();
				if (tempAirline.getDayOfWeek() == dayOfWeek) {
					result.add(tempAirline);
				}
			}
			return result;
		} else {
			return null;
		}
	}

	public ArrayList<Airline> findAirlineByDayOfWeekLaterTime(Airport airport, DayOfWeek dayOfWeek,
			LocalTime departureTime) {
		// Метод возвращает список рейсов по дню недели, позже заданного времени
		if (airport != null) {
			ArrayList<Airline> result = new ArrayList<Airline>();
			Iterator<Airline> iterator = airport.getAirlineList().iterator();
			while (iterator.hasNext()) {
				Airline tempAirline = iterator.next();
				if (tempAirline.getDayOfWeek() == dayOfWeek
						&& tempAirline.getDepartureTime().compareTo(departureTime) > 0) {
					result.add(tempAirline);
				}
			}
			return result;
		} else {
			return null;
		}
	}

}