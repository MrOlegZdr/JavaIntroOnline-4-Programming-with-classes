package by.jonline.pr04.prwclass.task10;

public class AircraftType {

	private AircraftManufacturer aircraftManufacturer;
	private String aircraftModel;

	public AircraftType(AircraftManufacturer aircraftManufacturer, String aircraftModel) {
		this.aircraftManufacturer = aircraftManufacturer;
		this.aircraftModel = aircraftModel;
	}

	public AircraftManufacturer getAircraftManufacturer() {
		return aircraftManufacturer;
	}

	public void setAircraftManufacturer(AircraftManufacturer aircraftManufacturer) {
		this.aircraftManufacturer = aircraftManufacturer;
	}

	public String getAircraftModel() {
		return aircraftModel;
	}

	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}

	@Override
	public String toString() {
		return aircraftManufacturer.getRealName() + "-" + aircraftModel;
	}

	@Override
	public Object clone() {
		return new AircraftType(aircraftManufacturer, aircraftModel);
	}
}