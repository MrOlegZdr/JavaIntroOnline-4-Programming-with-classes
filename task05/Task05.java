package by.jonline.pr04.prwclass.task05;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
 * свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
 * по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод, позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Task05 {

	public static void main(String[] args) {

		Counter counterDefault = new Counter();
		System.out.println("Инициализация значениями по умолчанию:");
		System.out.println(counterDefault.toString());

		Counter counter = new Counter(200L, 100L, 200L);
		System.out.println("Инициализация стартового значения в заданном диапазоне:");
		System.out.println(counter.toString());

		CounterAction counterAction = new CounterAction();
		System.out.println("Увеличение счетчика на 1 без переполнения границы диапазона:");
		counterAction.increaseCounter(counter, false);
		System.out.println(counter.toString());

		System.out.println("Увеличение счетчика на 1 с переполнением границы диапазона:");
		counterAction.increaseCounter(counter, true);
		System.out.println(counter.toString());

		System.out.println("Уменьшение счетчика на 1 без переполнения границы диапазона:");
		counterAction.decreaseCounter(counter, false);
		System.out.println(counter.toString());

		System.out.println("Уменьшение счетчика на 1 с переполнением границы диапазона:");
		counterAction.decreaseCounter(counter, true);
		System.out.println(counter.toString());
	}

}
