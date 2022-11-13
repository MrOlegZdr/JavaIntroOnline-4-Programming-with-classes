package by.jonline.pr04.prwclass.task01;

/* Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы
 * изменения этих переменных. Добавьте метод, который находит сумму значений этих
 * переменных, и метод, который находит наибольшее значение из этих двух переменных.
 */

public class Task01 {

	public static void main(String[] args) {

		Test1 test = new Test1(4, 25);
		test.printNumbers();

		test.setNumberA(13);
		test.setNumberB(65);
		test.printNumbers();

		System.out.printf("Сумма чисел %d и %d равна %d\n", test.getNumberA(), test.getNumberB(), test.sumAB());
		System.out.printf("Максимум из чисел %d и %d равен %d", test.getNumberA(), test.getNumberB(), test.maxAB());
	}

}
