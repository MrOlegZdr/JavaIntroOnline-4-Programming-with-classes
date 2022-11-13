package by.jonline.pr04.prwclass.task15;

public enum MealType {

	NO("Без питания"), BB("Только завтрак"), HB("Полупансион"), FB("Полный пансион"), AI("Все включено");

	private String typeName;

	private MealType(String typeName) {
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