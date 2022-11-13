package by.jonline.pr04.prwclass.task08;

import java.util.Arrays;

public class Shop {

	private Customer[] customers;

	public Shop(int numberOfCustomers) {
		customers = new Customer[numberOfCustomers];
		for (int i = 0; i < numberOfCustomers; i++) {
			customers[i] = new Customer();
		}
	}

	public Shop(Customer... customers) {
		this.customers = new Customer[customers.length];
		for (int i = 0; i < customers.length; i++) {
			this.customers[i] = (Customer) customers[i].clone();
		}
	}

	public Customer[] getCustomers() {
		return Arrays.copyOf(customers, customers.length);
	}

	public void setCustomers(Customer[] customers) {
		for (int i = 0; i < customers.length; i++) {
			this.customers[i] = (Customer) customers[i].clone();
		}
	}

	public void setCustomer(int i, Customer customer) {
		if (i >= 0 && i < customers.length) {
			this.customers[i] = (Customer) customer.clone();
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < customers.length; i++) {
			result.append(customers[i].toString());
			if (i != customers.length - 1) {
				result.append('\n');
			}
		}
		return result.toString();
	}

	@Override
	public Object clone() {
		Shop shop = new Shop(customers.length);
		shop.setCustomers(customers);

		return shop;
	}
}