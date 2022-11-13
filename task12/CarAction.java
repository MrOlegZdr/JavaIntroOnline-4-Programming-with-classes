package by.jonline.pr04.prwclass.task12;

public class CarAction {
	
	public void printCarModel(Car car) {
		if(car != null) {
			System.out.println("Модель автомобиля:");
			System.out.println(car.getModel());
		}
	}
}