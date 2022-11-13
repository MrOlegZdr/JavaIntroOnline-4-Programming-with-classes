package by.jonline.pr04.prwclass.task06;

/* Составьте описание класса для представления времени. Предусмотрите возможности установки времени
 * и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей, поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд.
 */

public class Task06 {

	public static void main(String[] args) {

		ClassTime classTime = new ClassTime(10, 50, 55);
		System.out.println(classTime.toString());

		classTime.setHour(13);
		classTime.setMinute(53);
		classTime.setSecond(90);

		System.out.println(classTime.toString());

		classTime.addHour(10);
		classTime.addMinute(7);
		classTime.addSecond(1800);
		System.out.println(classTime.toString());
		
	}

}