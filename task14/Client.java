package by.jonline.pr04.prwclass.task14;

import java.util.ArrayList;

public class Client {

	private long id;
	private String name;
	private ArrayList<Account> accounts;

	{
		accounts = new ArrayList<Account>();
	}

	public Client(long id) {
		this.id = id;
		name = "No Name";
	}

	public Client(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAccount(Account account) {
		if (account != null) {
			accounts.add(account);
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Клиент (ID) ").append(id).append(" ").append(name).append('\n');
		result.append("Счета:\n").append(accounts.toString());
		return result.toString();
	}
}