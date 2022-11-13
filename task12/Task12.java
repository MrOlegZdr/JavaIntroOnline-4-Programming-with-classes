package by.jonline.pr04.prwclass.task12;

/* Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Task12 {

	public static void main(String[] args) {

		Engine engineLHDi = new Engine("2,2 L HDi", "2-D", 2200, 4, 204);
		Wheel wheelBr19 = new Wheel("Bridgestone", 19);
		Car peugeot508 = new Car("Peugeot 508", engineLHDi, wheelBr19);

		CarAction carAction = new CarAction();

		carAction.printCarModel(peugeot508);
		peugeot508.drive();
		peugeot508.stop();
		peugeot508.fillUp();
		peugeot508.wheelReplacement();

//		System.out.println(peugeot508.toString());
//		System.out.println(engineLHDi.toString());
//		System.out.println(wheelBr19.toString());
	}

}