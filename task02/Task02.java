package by.jonline.pr04.prwclass.task02;

/* Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get-
 * методы для полей экземпляра класса.
 */

public class Task02 {

	public static void main(String[] args) {

		Test2 test2 = new Test2();
		Test2 test22 = new Test2(7, 12);

		System.out.println(test2.getVarA());
		test22.setVarB(32);
		System.out.println(test22.getVarB());

	}

}
