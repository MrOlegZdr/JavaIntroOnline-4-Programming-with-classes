package by.jonline.pr04.prwclass.task14;

import java.util.HashMap;

public class Bank {

	private final String name;
	private final String branchCode;
	private HashMap<String, Account> accountList;
	private HashMap<Long, Client> clientList;
	private final BankManagement bankManagement;

	{
		accountList = new HashMap<String, Account>();
		clientList = new HashMap<Long, Client>();
		bankManagement = new BankManagement();
	}

	public Bank(String name, String branchCode) {
		this.name = name;
		this.branchCode = branchCode;
	}

	public String getName() {
		return name;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public HashMap<String, Account> getAccountList() {
		return new HashMap<String, Account>(accountList);
	}

	public Account getAccount(String accountName) {
		return accountList.get((String) accountName);
	}

	public void createAccount() {
		String accountName = bankManagement.genetrateNextAccountNumber(branchCode);
		if (!accountList.containsKey(accountName)) {
			System.out.printf("Счет %s создан\n", accountName);
			accountList.put(accountName, new Account(accountName));
		} else {
			System.out.printf("Счет не создан, т.к. %s уже существует\n", accountName);
		}
	}

	public HashMap<Long, Client> getClientList() {
		return new HashMap<Long, Client>(clientList);
	}

	public Client getClient(long clientId) {
		return clientList.get((long) clientId);
	}

	public void createClient() {
		long clientId = bankManagement.generateNextClientId();
		if (!clientList.containsKey(clientId)) {
			System.out.printf("Клиент (ID) %d создан\n", clientId);
			clientList.put(clientId, new Client(clientId));
		} else {
			System.out.printf("Клиент не создан, т.к. ID %d уже существует\n", clientId);
		}
	}

	public String toString() {

		return accountList.toString();
	}
}