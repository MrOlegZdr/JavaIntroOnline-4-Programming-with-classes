package by.jonline.pr04.prwclass.task09;

public class Book {

	private static long count = 1L;
	private long id;
	private String title;
	private String author;
	private String publishingHouse;
	private int year;
	private int pageCount;
	private int price;
	private Binding binding;

	{
		id = count++;
	}

	public Book() {
//		id = count;
		title = "No Title";
		author = "No Author";
		publishingHouse = "Not Published";
		year = 2000;
		pageCount = 0;
		price = 0;
		binding = Binding.HARDCOVER;
	}

	public Book(String title, String author, String publishingHouse, int year, int pageCount, int price,
			Binding binding) {
//		id = count;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.year = year;
		this.pageCount = pageCount;
		this.price = price;
		this.binding = binding;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return "Книга № " + id + ": " + author + " - " + title + ". " + publishingHouse + ", " + year + ". " + pageCount
				+ "c. - " + binding.getMethodType() + ". Цена: " + price + " у.е.";
	}

	@Override
	public Object clone() {
		Book copyBook = new Book();
		count--;
		copyBook.id = this.id;
		copyBook.title = this.title;
		copyBook.author = this.author;
		copyBook.publishingHouse = this.publishingHouse;
		copyBook.year = this.year;
		copyBook.pageCount = this.pageCount;
		copyBook.price = this.price;
		copyBook.binding = this.binding;
		return copyBook;
	}
}