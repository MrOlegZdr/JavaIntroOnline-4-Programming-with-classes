package by.jonline.pr04.prwclass.task04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Train {
	private int number;
	private String destination;
	private Calendar departureTime;

	public Train() {
		number = 0;
		destination = "Отсутствует";
		departureTime = new GregorianCalendar(2022, Calendar.JANUARY, 1, 0, 0);
	}

	public Train(int number) {
		this.number = number;
		destination = "Отсутствует";
		departureTime = new GregorianCalendar(2022, Calendar.JANUARY, 1, 0, 0);
	}

	public Train(int number, String destination, Calendar departureTime) {
		this.number = number;
		this.destination = destination;
		this.departureTime = departureTime;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDepartureTime(Calendar departureTime) {
		this.departureTime = departureTime;
	}

	public Calendar getDepartureTime() {
		return departureTime;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM HH:mm");
		return "Поезд №: " + number + "; Станция назначения: " + destination + "; Время отправления: "
				+ sdf.format(departureTime.getTime());
	}
}
