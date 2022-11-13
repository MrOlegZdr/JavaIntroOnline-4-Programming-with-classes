package by.jonline.pr04.prwclass.task15;

import java.util.ArrayList;

public class TravelAgency {

	private String name;
	private ArrayList<Voucher> vouchers;

	{
		vouchers = new ArrayList<Voucher>();
	}

	public TravelAgency(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Voucher> getVouchers() {
		return new ArrayList<Voucher>(vouchers);
	}

	public void setVouchers(ArrayList<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	public void addVoucher(Voucher voucher) {
		vouchers.add(voucher);
	}

	@Override
	public String toString() {
		return "Агенство: " + name + '\n' + "Список туров:\n" + vouchers.toString();
	}
}