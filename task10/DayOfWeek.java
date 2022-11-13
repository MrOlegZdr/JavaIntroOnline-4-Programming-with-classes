package by.jonline.pr04.prwclass.task10;

public enum DayOfWeek {

	MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

	private String shortName;

	private DayOfWeek() {

	}

	private DayOfWeek(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}
}