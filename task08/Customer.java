package by.jonline.pr04.prwclass.task08;

public class Customer {

	private static long count = 0L;
	private long id;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String adress;
	private long creditCardNumber;
	private long bankAccountNumber;

	public Customer() {
		id = count++;
		firstName = "None";
		lastName = "None";
		fatherName = "None";
		adress = "None";
		creditCardNumber = 0L;
		bankAccountNumber = 0L;
	}

	public Customer(String lastName, String firstName, String fatherName, String adress, long creditCardNumber,
			long bankAccountNumber) {

		id = count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer " + id + ": " + lastName + " " + firstName + " " + fatherName + "; " + adress
				+ "; Credit Card " + creditCardNumber + "; Bank Account Number " + bankAccountNumber;
	}

	@Override
	public Object clone() {
		Customer customer = new Customer();
		count--;
		customer.id = this.id;
		customer.firstName = this.firstName;
		customer.lastName = this.lastName;
		customer.fatherName = this.fatherName;
		customer.adress = this.adress;
		customer.creditCardNumber = this.creditCardNumber;
		customer.bankAccountNumber = this.bankAccountNumber;

		return customer;
	}
}