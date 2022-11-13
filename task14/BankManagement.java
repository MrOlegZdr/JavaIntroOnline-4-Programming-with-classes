package by.jonline.pr04.prwclass.task14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class BankManagement {

	private static long accountCount;
	private static long clientCount;

	{
		accountCount = 0L;
		clientCount = 0L;
	}

	public String genetrateNextAccountNumber(String branchCode) {
		StringBuilder result = new StringBuilder();
		int branchCodeDigit = 4; // in Belarus
		accountCount++;
		result.append("BY22");
		if (branchCode.length() == branchCodeDigit) {
			result.append(branchCode.toUpperCase());
		} else if (branchCode.length() < branchCodeDigit) {
			for (int i = 0; i < branchCodeDigit - branchCode.length(); i++) {
				result.append(0);
			}
			result.append(branchCode);
		} else {
			result.append(branchCode.substring(0, branchCodeDigit + 1).toUpperCase());
		}
		result.append("3012").append(String.format("%016d", accountCount));
		return result.toString();
	}

	public long generateNextClientId() {
		return ++clientCount;
	}

	public void showAllAccountListNames(Bank bank) {
		if (bank != null) {
			System.out.printf("Список номеров счетов в банке \"%s\":\n", bank.getName());
			for (Map.Entry<String, Account> account : bank.getAccountList().entrySet()) {
				System.out.println(account.getKey());
			}
		} else {
			System.out.println("Банк пустой");
		}
	}

	public void showAllClients(Bank bank) {
		if (bank != null) {
			System.out.printf("Список клиентов в банке \"%s\":\n", bank.getName());
			for (Map.Entry<Long, Client> client : bank.getClientList().entrySet()) {
				System.out.printf("Клиент (ID) %d: %s\n", client.getKey(), client.getValue().getName());
			}
		} else {
			System.out.println("Банк пустой");
		}
	}

	public void setClientToAccount(Bank bank, String accountNumber, long clientId) {
		if (bank != null && bank.getAccountList().containsKey(accountNumber)
				&& bank.getClientList().containsKey(clientId)) {
			bank.getClient(clientId).addAccount(bank.getAccount(accountNumber));
			bank.getAccount(accountNumber).setClientId(clientId);
			System.out.printf("Счет %s назначен\n", accountNumber);
		} else {
			System.out.println("Отсутствует необходимая информация");
		}
	}

	public void sortAccountByName(Bank bank) {
		if (bank != null && !bank.getAccountList().isEmpty()) {
			ArrayList<String> resultList = new ArrayList<>(bank.getAccountList().keySet());
			Collections.sort(resultList);
			System.out.println("Номера счетов в алфавитном порядке:");
			for (String name : resultList) {
				System.out.println(name);
			}
		} else {
			System.out.println("Отсутствует необходимая информация");
		}
	}

	public double calculateAmount(Bank bank, int amountSign) {
		// Если amountSign < 0, то считается сумма по счетам с отрицательным балансом
		// Если amountSign > 0, то считается сумма по счетам с положительным балансом
		// Если amountSign = 0, то считается сумма всех счетов
		double result = 0L;
		if (bank != null) {
			for (Map.Entry<String, Account> account : bank.getAccountList().entrySet()) {
				double tempAmount = account.getValue().getAmount();
				if ((amountSign == 0) || (amountSign < 0 && tempAmount < 0) || (amountSign > 0 && tempAmount > 0)) {
					result += tempAmount;
				}
			}
		}
		return result;
	}
}