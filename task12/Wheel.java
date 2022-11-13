package by.jonline.pr04.prwclass.task12;

public class Wheel {

	private String manufacturer;
	private int size;

	private boolean rotation;

	{
		rotation = false;
	}

	public Wheel(String manufacturer, int size) {
		this.manufacturer = manufacturer;
		this.size = size;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setRotation(boolean rotation) {
		this.rotation = rotation;
	}

	public boolean isRotation() {
		return rotation;
	}

	@Override
	public String toString() {
		return "Wheel: " + size + "\"; Mfr: " + manufacturer;
	}
}