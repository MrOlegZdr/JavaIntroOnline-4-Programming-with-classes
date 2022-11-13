package by.jonline.pr04.prwclass.task15;

public final class Client {
	private String name;
	private Voucher voucher;

	public Client(String name, Voucher voucher) {
		this.name = name;
		this.voucher = voucher;
	}

	public String getName() {
		return name;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	@Override
	public String toString() {
		return "Клиент " + name + "; назначенный тур:\n" + voucher.toString();
	}
}