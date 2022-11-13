package by.jonline.pr04.prwclass.task14;

public class Account {

	private final String number;
	private boolean lock;
	private double amount;
	private long clientId;

	{
		lock = false;
		amount = 0;
		clientId = 0;
	}

	public Account(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}

	public double getAmount() {
		return amount;
	}

	public void changeAmount(double transactionAmount) {
		if (!lock) {
			amount += transactionAmount;
		} else {
			System.out.println("Счет блокирован, изменения невозможны");
		}
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "Счет " + number + "; Сумма " + amount + "; Блокирован: " + lock;
	}
}