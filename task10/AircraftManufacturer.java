package by.jonline.pr04.prwclass.task10;

public enum AircraftManufacturer {

	BOEING("Boeing"), AIRBUS("Airbus"), BOMBARDIER("Bombardier"), EMBRAER("Embraer"), CESSNA("Cessna"), ANTONOV("Ан"),
	IL("Ил"), TUPOLEV("Ту");

	private String realName;

	private AircraftManufacturer() {

	}

	private AircraftManufacturer(String realName) {
		this.realName = realName;
	}

	public String getRealName() {
		return realName;
	}
}