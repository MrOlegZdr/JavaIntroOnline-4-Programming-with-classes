package by.jonline.pr04.prwclass.task09;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShop {
	private ArrayList<Book> books;

	{
		books = new ArrayList<Book>();
	}

	public BookShop() {

	}

	public BookShop(int numberOfBooks) {

		for (int i = 0; i < numberOfBooks; i++) {
			books.add(new Book());
		}
	}

	public ArrayList<Book> getBooks() {
		return new ArrayList<Book>(books);
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = new ArrayList<Book>(books);
	}

	public void addBook(Book book) {
		books.add((Book) book.clone());
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Book book : books) {
			result.append(book.toString());
			result.append('\n');
		}
		result.deleteCharAt(result.length() - 1);
		return result.toString();
	}

	@Override
	public Object clone() {
		BookShop bookShopCopy = new BookShop();
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			bookShopCopy.addBook(iterator.next());
		}
		return bookShopCopy;
	}
}