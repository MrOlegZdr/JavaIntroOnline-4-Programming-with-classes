package by.jonline.pr04.prwclass.task15;

public class Voucher {

	private String name;
	private VoucherType voucherType;
	private TransportType transportType;
	private MealType mealType;
	private int numberOfDays;

	public Voucher(String name) {

		this.name = name;
		voucherType = VoucherType.RECREATION;
		transportType = TransportType.PLANE;
		mealType = MealType.NO;
		numberOfDays = 10;

	}

	public Voucher(String name, VoucherType voucherType, TransportType transportType, MealType mealType,
			int numberOfDays) {

		this.name = name;
		this.voucherType = voucherType;
		this.transportType = transportType;
		this.mealType = mealType;
		this.numberOfDays = numberOfDays;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VoucherType getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(VoucherType voucherType) {
		this.voucherType = voucherType;
	}

	public TransportType getTransportType() {
		return transportType;
	}

	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}

	public MealType getMealType() {
		return mealType;
	}

	public void setMealType(MealType mealType) {
		this.mealType = mealType;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	@Override
	public String toString() {
		return "Название тура: " + name + "; Тип: " + voucherType.getTypeName() + "; Тип транспорта: "
				+ transportType.getTypeName() + "; Тип питания: " + mealType.getTypeName() + "; Количество дней: "
				+ numberOfDays;
	}

	@Override
	public Voucher clone() {
		Voucher voucher = new Voucher(name, voucherType, transportType, mealType, numberOfDays);
		return voucher;
	}
}