package by.jonline.pr04.prwclass.task12;

public class Engine {

	private String model;
	private String gasType;
	private int volume;
	private int cylinderCount;
	private int power;

	private boolean on;

	{
		on = false;
	}

	public Engine(String model, String gasType, int volume, int cylinderCount, int power) {
		this.model = model;
		this.gasType = gasType;
		this.volume = volume;
		this.cylinderCount = cylinderCount;
		this.power = power;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getGasType() {
		return gasType;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCylinderCount() {
		return cylinderCount;
	}

	public void setCylinderCount(int cylinderCount) {
		this.cylinderCount = cylinderCount;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	@Override
	public String toString() {
		return "Engine: " + model + "; " + gasType + "; " + volume + " cc; " + cylinderCount + " cylinders; " + power
				+ " hp";
	}
}