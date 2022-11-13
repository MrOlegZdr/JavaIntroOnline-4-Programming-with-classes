package by.jonline.pr04.prwclass.task08;

import java.util.Random;

public class ShopAction {

	public Customer findCustomerById(Shop shop, long id) {
		// Метод возвращает Customer с заданным номером id
		if (shop != null) {
			int i = 0;
			while (i < shop.getCustomers().length) {
				if (shop.getCustomers()[i].getId() == id) {
					return (Customer) shop.getCustomers()[i].clone();
				} else {
					i++;
				}
			}
			return null;
		} else {
			return null;
		}
	}

	private int returnArrayPositionWithCustomerId(Shop shop, long id) {
		// Метод возвращает позицию в массиве customers в объекте shop с заданным
		// номером id
		if (shop != null && findCustomerById(shop, id) != null) {
			int i = 0;
			while (i < shop.getCustomers().length) {
				if (shop.getCustomers()[i].getId() == id) {
					return i;
				} else {
					i++;
				}
			}
		}
		return -1;
	}

	public void createNonEmptyCustomerInfo(Customer customer) {

		long minCardNumber = (long) Math.pow(10, 15);
		long maxCardNumber = (long) Math.pow(10, 16) - 1L;
		long minBankAccNumber = (long) Math.pow(10, 10);
		long maxBankAccNumber = (long) Math.pow(10, 11) - 1L;
		Random rnd = new Random();
		long creditCardNumber = Math.abs((rnd.nextLong() % (maxCardNumber - minCardNumber)) + minCardNumber);
		long bankAccountNumber = Math.abs((rnd.nextLong() % (maxBankAccNumber - minBankAccNumber)) + minBankAccNumber);

		if (customer != null) {
			customer.setFirstName("Customer " + customer.getId());
			customer.setLastName("None");
			customer.setFatherName("None");
			customer.setAdress("Str. Void 0-0");
			customer.setCreditCardNumber(creditCardNumber);
			customer.setBankAccountNumber(bankAccountNumber);
		} else {
			customer = new Customer();
			customer.setFirstName("Customer " + customer.getId());
			customer.setLastName("None");
			customer.setFatherName("None");
			customer.setAdress("Str. Void 0-0");
			customer.setCreditCardNumber(creditCardNumber);
			customer.setBankAccountNumber(bankAccountNumber);
		}
	}

	public void changeAllCustomerInfo(Shop shop, long id, Customer customer) {
		// Метод меняет информацию о customer с номером id в объекте shop (итоговая
		// информация станет customer)
		int position = returnArrayPositionWithCustomerId(shop, id);

		if (position != -1) {
			Customer resultCustomer = (Customer) findCustomerById(shop, id).clone();
			resultCustomer.setFirstName(customer.getFirstName());
			resultCustomer.setLastName(customer.getLastName());
			resultCustomer.setFatherName(customer.getFatherName());
			resultCustomer.setAdress(customer.getAdress());
			resultCustomer.setCreditCardNumber(customer.getCreditCardNumber());
			resultCustomer.setBankAccountNumber(customer.getBankAccountNumber());
			shop.setCustomer(position, resultCustomer);
		}

	}

	public void printCustomersSortByName(Shop shop) {
		if (shop != null) {

			StringBuilder[] customerName = new StringBuilder[shop.getCustomers().length];

			// Инициализация ФИО + :номер позиции массива
			for (int i = 0; i < customerName.length; i++) {
				customerName[i] = new StringBuilder();
				customerName[i].append(shop.getCustomers()[i].getLastName())
						.append(shop.getCustomers()[i].getFirstName()).append(shop.getCustomers()[i].getFatherName())
						.append(":IdPos:")
						.append(returnArrayPositionWithCustomerId(shop, shop.getCustomers()[i].getId()));
			}

			// Сортировка выбором
			int minPosition;
			StringBuilder tempCustomer = new StringBuilder();

			for (int i = 0; i < customerName.length - 1; i++) {
				minPosition = i;
				for (int j = i + 1; j < customerName.length; j++) {
					minPosition = customerName[j].compareTo(customerName[minPosition]) < 0 ? j : minPosition;
				}
				tempCustomer.append(customerName[minPosition]);
				customerName[minPosition].delete(0, customerName[minPosition].length());
				customerName[minPosition].append(customerName[i]);
				customerName[i].delete(0, customerName[i].length());
				customerName[i].append(tempCustomer);
				tempCustomer.delete(0, tempCustomer.length());
			}

			// Вывод покупателей по возрастанию (основываясь на ":")
			for (int i = 0; i < customerName.length; i++) {
				int idPos;
				idPos = customerName[i].lastIndexOf(":IdPos:") + ":IdPos:".length();
				int number;
				number = Integer.parseInt(customerName[i].substring(idPos, customerName[i].length()));

				System.out.println(shop.getCustomers()[number].toString());
			}

		}

	}

	public void printCustomersWithCardInRange(Shop shop, long cardNumberStart, long cardNumberEnd) {
		if (shop != null) {
			for (Customer customer : shop.getCustomers()) {
				if (customer.getCreditCardNumber() >= cardNumberStart
						&& customer.getCreditCardNumber() <= cardNumberEnd) {
					System.out.println(customer.toString());
				}
			}
		}
	}
}