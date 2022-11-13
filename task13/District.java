package by.jonline.pr04.prwclass.task13;

import java.util.ArrayList;

public class District {

	private String name;
	private ArrayList<City> cities;
	private City districtCenter;
	private int area;

	public District(String name, ArrayList<City> cities, int area) {
		this.name = name;
		this.cities = new ArrayList<City>(cities);
		this.area = area;
	}

	public ArrayList<City> getCities() {
		return new ArrayList<City>(cities);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getDistrictCenter() {
		return districtCenter;
	}

	public void setDistrictCenter(City districtCenter) {
		StateValidator stateValidator = new StateValidator();
		if (stateValidator.isCityInList(cities, districtCenter)) {
			this.districtCenter = districtCenter;
		} else {
			System.out.printf("Города %s в текущем районе не существует\n", districtCenter.getName());
		}
	}

	public void setDistrictCenter(String cityName) {
		StateAction stateAction = new StateAction();
		StateValidator stateValidator = new StateValidator();
		City districtCenter = stateAction.findCityByNameInList(cities, cityName);
		if (districtCenter != null && stateValidator.isCityInList(cities, districtCenter)) {
			this.districtCenter = districtCenter;
		} else {
			System.out.printf("Города %s в текущем районе не существует\n", cityName);
		}
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void addCity(City city) {
		if (city != null) {
			cities.add(city);
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(name).append(", ");
		if (districtCenter != null) {
			result.append("районный центр: ").append(districtCenter.getName()).append('\n');
		} else {
			result.append("районный центр не назначен").append('\n');
		}
		if (cities != null) {
			result.append("Города района:\n");
			for (City city : cities) {
				result.append(city.toString()).append('\n');
			}
		}
		result.append("Площадь района: ").append(area).append(" кв.км" + '\n');
		return result.toString();
	}

	@Override
	public District clone() {
		District district = new District(name, new ArrayList<City>(cities), area);
		district.districtCenter = this.districtCenter;
		return district;
	}
}