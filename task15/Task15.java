package by.jonline.pr04.prwclass.task15;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т.д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Task15 {

	public static void main(String[] args) {

		TravelAgency homeTour = new TravelAgency("ДомТур");
		AgencyHelper agencyHelper = new AgencyHelper();
		homeTour.addVoucher(new Voucher("Dubai", VoucherType.RECREATION, TransportType.PLANE, MealType.FB, 10));
		homeTour.addVoucher(
				new Voucher("Sharm-El-Sheikh", VoucherType.RECREATION, TransportType.PLANE, MealType.AI, 14));
		homeTour.addVoucher(new Voucher("Warsaw", VoucherType.TOUR, TransportType.BUS, MealType.HB, 3));
		homeTour.addVoucher(new Voucher("Bialystok", VoucherType.SHOPPING, TransportType.BUS, MealType.NO, 1));
		homeTour.addVoucher(new Voucher("Cuba", VoucherType.CRUISE, TransportType.SHIP, MealType.HB, 24));
		homeTour.addVoucher(new Voucher("Zurzach", VoucherType.RECOVERY, TransportType.PLANE, MealType.FB, 14));
		homeTour.addVoucher(new Voucher("Prague", VoucherType.TOUR, TransportType.BUS, MealType.BB, 7));
		homeTour.addVoucher(new Voucher("Prague", VoucherType.SHOPPING, TransportType.BUS, MealType.BB, 3));
		homeTour.addVoucher(new Voucher("Prague", VoucherType.RECREATION, TransportType.PLANE, MealType.HB, 10));

		Client client = agencyHelper.voucherChecker(homeTour);
		agencyHelper.showClient(client);
	}

}