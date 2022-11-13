package by.jonline.pr04.prwclass.task15;

public enum TransportType {

	BUS("Автобус"), PLANE("Самолет"), SHIP("Корабль");

	private String typeName;

	private TransportType(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}

	@Override
	public String toString() {
		return name() + " (" + typeName + ")";
	}
}