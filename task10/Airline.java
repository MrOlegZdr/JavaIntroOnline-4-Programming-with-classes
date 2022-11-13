package by.jonline.pr04.prwclass.task10;

import java.time.LocalTime;

public class Airline {

	private String destination;
	private String flightNo;
	private AircraftType planeType;
	private LocalTime departureTime;
	private DayOfWeek dayOfWeek;

	public Airline() {

	}

	public Airline(String destination, String flightNo, AircraftType planeType, LocalTime departureTime,
			DayOfWeek dayOfWeek) {
		this.destination = destination;
		this.flightNo = flightNo;
		this.planeType = (AircraftType) planeType.clone();
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public AircraftType getPlaneType() {
		return (AircraftType) planeType.clone();
	}

	public void setPlaneType(AircraftType planeType) {
		this.planeType = (AircraftType) planeType.clone();
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "Flight Number: " + flightNo + "; To: " + destination + "; Departure Time: " + dayOfWeek.getShortName()
				+ " " + departureTime + "; " + planeType.toString();
	}

	@Override
	public Object clone() {
		return new Airline(destination, flightNo, (AircraftType) planeType.clone(), departureTime, dayOfWeek);
	}
}