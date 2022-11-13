package by.jonline.pr04.prwclass.task12;

public class Car {

	private String model;
	private Engine engine;
	private Wheel wheel;

	public Car(String model, Engine engine, Wheel wheel) {
		this.model = model;
		this.engine = engine;
		this.wheel = wheel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void drive() {
		engine.setOn(true);
		wheel.setRotation(true);
		System.out.println("Автомобиль едет");
	}
	
	public void stop() {
		engine.setOn(false);
		wheel.setRotation(false);
		System.out.println("Автомобиль стоит");
	}

	public void fillUp() {
		System.out.println("Автомобиль заправляется");
	}
	
	public void wheelReplacement() {
		System.out.println("Колесо заменео");
	}
	
	@Override
	public String toString() {
		return "Car: " + model + '\n' + engine.toString() + '\n' + wheel.toString();
	}
}