package by.jonline.pr04.prwclass.task10;

import java.time.LocalTime;

/* Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив
 * типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных
 * и вывести эти данные на консоль.
 * 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * а) список рейсов для заданного пункта назначения;
 * б) список рейсов для заданного дня недели;
 * в) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Task10 {

	public static void main(String[] args) {

		Airline airline = new Airline("Ганновер", "XQ 234", new AircraftType(AircraftManufacturer.BOEING, "737-800"),
				LocalTime.of(21, 50), DayOfWeek.SUNDAY);

		Airport airport = new Airport();
		airport.addAirline(airline);
		airport.addAirline(new Airline("Измир", "XQ 7292", new AircraftType(AircraftManufacturer.BOEING, "737-800"),
				LocalTime.of(20, 15), DayOfWeek.TUESDAY));
		airport.addAirline(new Airline("Ливерпуль", "U2 7032", new AircraftType(AircraftManufacturer.AIRBUS, "A320"),
				LocalTime.of(20, 15), DayOfWeek.TUESDAY));
		airport.addAirline(new Airline("Доха", "QR 72", new AircraftType(AircraftManufacturer.BOEING, "787-800"),
				LocalTime.of(20, 20), DayOfWeek.TUESDAY));
		airport.addAirline(new Airline("Лондон", "LH 908", new AircraftType(AircraftManufacturer.AIRBUS, "A320 NEO"),
				LocalTime.of(14, 00), DayOfWeek.THURSDAY));
		airport.addAirline(new Airline("Дубай", "LH 630", new AircraftType(AircraftManufacturer.AIRBUS, "А330-300"),
				LocalTime.of(14, 10), DayOfWeek.THURSDAY));
		airport.addAirline(new Airline("Вашингтон", "DE 2074", new AircraftType(AircraftManufacturer.BOEING, "767-300"),
				LocalTime.of(14, 15), DayOfWeek.SATURDAY));
		airport.addAirline(new Airline("Чикаго", "UA 945", new AircraftType(AircraftManufacturer.BOEING, "787-800"),
				LocalTime.of(8, 35), DayOfWeek.FRIDAY));
		airport.addAirline(new Airline("Лондон", "LH 928", new AircraftType(AircraftManufacturer.EMBRAER, "190"),
				LocalTime.of(8, 15), DayOfWeek.FRIDAY));
		airport.addAirline(new Airline("Ганновер", "LH 48", new AircraftType(AircraftManufacturer.AIRBUS, "A319"),
				LocalTime.of(9, 10), DayOfWeek.SATURDAY));

		AirportAction airportAction = new AirportAction();
		airportAction.showAllAirlines(airport);

		airportAction.showAirlineList(airportAction.findAirlineByDestination(airport, "Лондон"), "Рейсы в Лондон:");
		airportAction.showAirlineList(airportAction.findAirlineByDayOfWeek(airport, DayOfWeek.TUESDAY),
				"Рейсы во вторник:");
		airportAction.showAirlineList(
				airportAction.findAirlineByDayOfWeekLaterTime(airport, DayOfWeek.THURSDAY, LocalTime.of(15, 00)),
				"Рейсы в среду, позже 14.00:");

	}

}