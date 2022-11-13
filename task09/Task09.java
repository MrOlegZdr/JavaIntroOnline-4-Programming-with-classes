package by.jonline.pr04.prwclass.task09;

/* Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив
 * типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных
 * и вывести эти данные на консоль.
 * 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * а) список книг заданного автора;
 * б) список книг, выпущенных заданным издательством;
 * в) список книг, выпущенных после заданного года.
 */

public class Task09 {

	public static void main(String[] args) {

		Book book = new Book("Title", "Author", "PublishingHouse", 2000, 100, 10, Binding.HARDCOVER);

		BookShop bookShop = new BookShop();
		bookShop.addBook(book);
		bookShop.addBook(new Book("Темная башня: Стрелок", "Кинг С.", "Donald M. Grant, Publisher, Inc.", 1982, 224, 63,
				Binding.HARDCOVER));
		bookShop.addBook(new Book("Темная башня: Извлечение троих", "Кинг С.", "Donald M. Grant, Publisher, Inc.", 1987,
				234, 68, Binding.HARDCOVER));
		bookShop.addBook(new Book("Темная башня: Бесплодные земли", "Кинг С.", "Donald M. Grant, Publisher, Inc.", 1991,
				240, 46, Binding.HARDCOVER));
		bookShop.addBook(new Book("Темная башня: Колдун и кристалл", "Кинг С.", "Donald M. Grant, Publisher, Inc.",
				1997, 365, 83, Binding.HARDCOVER));
		bookShop.addBook(new Book("Темная башня: Ветер сквозь замочную скважину", "Кинг С.",
				"Donald M. Grant, Publisher, Inc.", 2012, 336, 78, Binding.HARDCOVER));
		bookShop.addBook(new Book("Темная башня: Волки Кальи", "Кинг С.", "Donald M. Grant, Publisher, Inc.", 2003, 370,
				90, Binding.HARDCOVER));
		bookShop.addBook(new Book("Темная башня: Песнь Сюзанны", "Кинг С.", "Donald M. Grant, Publisher, Inc.", 2004,
				275, 55, Binding.HARDCOVER));
		bookShop.addBook(new Book("Темная башня: Тёмная Башня", "Кинг С.", "Donald M. Grant, Publisher, Inc.", 2004,
				340, 85, Binding.HARDCOVER));
		bookShop.addBook(new Book("Чужак", "Кинг С.", "Charles Scribner's Sons", 2018, 576, 10, Binding.COPTIC));

		BookShopAction bookShopAction = new BookShopAction();

		bookShopAction.showAllBooks(bookShop);
		bookShopAction.showBookList(bookShopAction.findBooksByAuthor(bookShop, "Кинг С."), "Книги автора " + "Кинг С.");
		bookShopAction.showBookList(bookShopAction.findBooksByPublishingHouse(bookShop, "Charles Scribner's Sons"),
				"Книги издательства " + "Charles Scribner's Sons");
		bookShopAction.showBookList(bookShopAction.findBooksPublishedAfterYear(bookShop, 2000),
				"Книги, выпущенные после 2000 года");
	}

}