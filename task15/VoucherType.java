package by.jonline.pr04.prwclass.task15;

public enum VoucherType {

	RECREATION("Отдых"), TOUR("Экскурсия"), RECOVERY("Лечение"), SHOPPING("Шоппинг"), CRUISE("Круиз");

	private String typeName;

	private VoucherType(String typeName) {
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