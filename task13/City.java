package by.jonline.pr04.prwclass.task13;

public class City {

	private String name;

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Город: " + name;
	}

	public boolean equals(City city) {
		return this.name.equals(city.name);
	}

	@Override
	public City clone() {
		return new City(name);
	}
}