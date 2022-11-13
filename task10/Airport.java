package by.jonline.pr04.prwclass.task10;

import java.util.ArrayList;

public class Airport {

	private ArrayList<Airline> airlineList;

	{
		airlineList = new ArrayList<Airline>();
	}

	public Airport() {

	}

	public ArrayList<Airline> getAirlineList() {
		return new ArrayList<Airline>(airlineList);
	}

	public void setAirlineList(ArrayList<Airline> airlineList) {
		this.airlineList = new ArrayList<Airline>(airlineList);
	}

	public void addAirline(Airline airline) {
		airlineList.add(airline);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Airline airline : airlineList) {
			result.append(airline.toString());
			result.append('\n');
		}
		result.deleteCharAt(result.length() - 1);
		return result.toString();
	}
}