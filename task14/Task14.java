package by.jonline.pr04.prwclass.task14;

/* Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Task14 {

	public static void main(String[] args) {

		Bank alfa = new Bank("Альфа Банк", "ALFA");
		BankManagement bankManagement = new BankManagement();
		for (int i = 0; i < 10; i++) {
			alfa.createAccount();
			alfa.createClient();
		}

		bankManagement.showAllClients(alfa);

		bankManagement.setClientToAccount(alfa, "BY22ALFA30120000000000000008", 1);
		bankManagement.setClientToAccount(alfa, "BY22ALFA30120000000000000006", 1);
		bankManagement.setClientToAccount(alfa, "BY22ALFA30120000000000000004", 1);
		bankManagement.setClientToAccount(alfa, "BY22ALFA30120000000000000003", 1);
		bankManagement.setClientToAccount(alfa, "BY22ALFA30120000000000000001", 1);

		alfa.getAccount("BY22ALFA30120000000000000008").setLock(true);
		alfa.getAccount("BY22ALFA30120000000000000006").changeAmount(15.6);
		alfa.getAccount("BY22ALFA30120000000000000004").changeAmount(-30.6);
		alfa.getAccount("BY22ALFA30120000000000000003").changeAmount(20.3);
		alfa.getAccount("BY22ALFA30120000000000000001").changeAmount(-3.3);

		alfa.getClient(1).setName("Иванов И.И.");
		System.out.println(alfa.getClient(1).toString());

		bankManagement.sortAccountByName(alfa);
		System.out.printf("Сумма по счетам с отрицательным балансом: %f\n", bankManagement.calculateAmount(alfa, -1));
		System.out.printf("Сумма по счетам с положительным балансом: %f\n", bankManagement.calculateAmount(alfa, 1));
		System.out.printf("Сумма по всем счетам: %f\n", bankManagement.calculateAmount(alfa, 0));
	}

}