package by.jonline.pr04.prwclass.task09;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShopAction {

	public void showAllBooks(BookShop bookShop) {
		// Метод выводит все книги магазина bookShop
		if (bookShop != null && !bookShop.getBooks().isEmpty()) {
			System.out.println("Все книги книжного магазина:");
			Iterator<Book> iterator = bookShop.getBooks().iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().toString());
			}
		} else {
			System.out.println("Книги отсутствуют");
		}
	}

	public void showBookList(ArrayList<Book> bookList, String message) {
		// Метод выводит список книг
		if (bookList != null && !bookList.isEmpty()) {
			System.out.println(message + " (" + bookList.size() + " шт.):");
			Iterator<Book> iterator = bookList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().toString());
			}
		} else {
			System.out.println("Книги отсутствуют");
		}
	}

	public ArrayList<Book> findBooksByAuthor(BookShop bookShop, String author) {
		// Метод возвращает список книг магазина booSkhop конкретного автора author
		if (bookShop != null && !bookShop.getBooks().isEmpty()) {
			ArrayList<Book> bookList = new ArrayList<Book>();
			Iterator<Book> iterator = bookShop.getBooks().iterator();
			while (iterator.hasNext()) {
				Book tempBook = iterator.next();
				if (tempBook.getAuthor().equals(author)) {
					bookList.add((Book) tempBook.clone());
				}
			}
			return bookList;
		} else {
			return null;
		}
	}

	public ArrayList<Book> findBooksByPublishingHouse(BookShop bookShop, String publishingHouse) {
		// Метод возвращает список книг магазина bookShop конкретного издательства
		// publishingHouse
		if (bookShop != null && !bookShop.getBooks().isEmpty()) {
			ArrayList<Book> bookList = new ArrayList<Book>();
			Iterator<Book> iterator = bookShop.getBooks().iterator();
			while (iterator.hasNext()) {
				Book tempBook = iterator.next();
				if (tempBook.getPublishingHouse().equals(publishingHouse)) {
					bookList.add((Book) tempBook.clone());
				}
			}
			return bookList;
		} else {
			return null;
		}
	}

	public ArrayList<Book> findBooksPublishedAfterYear(BookShop bookShop, int year) {
		// Метод возвращает список книг магазина bookShop, выпущенных после года year
		if (bookShop != null && !bookShop.getBooks().isEmpty()) {
			ArrayList<Book> bookList = new ArrayList<Book>();
			Iterator<Book> iterator = bookShop.getBooks().iterator();
			while (iterator.hasNext()) {
				Book tempBook = iterator.next();
				if (tempBook.getYear() > year) {
					bookList.add((Book) tempBook.clone());
				}
			}
			return bookList;
		} else {
			return null;
		}
	}
}