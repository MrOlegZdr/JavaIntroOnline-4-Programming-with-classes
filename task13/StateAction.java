package by.jonline.pr04.prwclass.task13;

import java.util.ArrayList;
import java.util.Iterator;

public class StateAction {

	public City findCityByNameInList(ArrayList<City> cityList, String cityName) {

		if (cityList != null) {
			Iterator<City> iterator = cityList.iterator();
			while (iterator.hasNext()) {
				City city = iterator.next();
				if (city.getName().equals(cityName)) {
					return city;
				}
			}
			return null;
		} else {
			return null;
		}
	}

	public void showAllCitiesInDistrict(District district) {
		if (district != null) {
			System.out.println(district.getName() + ", города района:");
			Iterator<City> iterator = district.getCities().iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().getName());
			}
		}
	}

	public void showCitiesInList(ArrayList<City> cityList, String message) {
		if (cityList != null) {
			System.out.println(message + ":");
			Iterator<City> iterator = cityList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().toString());
			}
		}
	}

	public void showCapital(State state) {
		if (state != null && state.getCapital() != null) {
			System.out.println("Столица государства " + state.getName() + ":");
			System.out.println(state.getCapital().toString());
		} else {
			System.out.println("Столица не найдена");
		}
	}

	public void showIntInformation(int number, String message) {
		System.out.println(message + ": " + number);
	}

	public ArrayList<City> formListOfAdministrativeCenters(ArrayList<?> unit) {
		ArrayList<City> listOfAdministrativeCenters = new ArrayList<City>();
		Iterator<?> iterator = unit.iterator();
		while (iterator.hasNext()) {
			if (unit.get(0).getClass().equals(District.class)) {
				City tempCity = ((District) iterator.next()).getDistrictCenter();
				if (tempCity != null) {
					listOfAdministrativeCenters.add(tempCity);
				}
			} else if (unit.get(0).getClass().equals(Region.class)) {
				City tempCity = ((Region) iterator.next()).getRegionalCenter();
				if (tempCity != null) {
					listOfAdministrativeCenters.add(tempCity);
				}
			}
		}
		return listOfAdministrativeCenters;
	}

	public int calculateRegionCount(State state) {
		if (state != null) {
			return state.getRegions().size();
		} else {
			return 0;
		}
	}

	public int calculateRegionArea(Region region) {
		int area = 0;
		if (region != null) {
			Iterator<District> iterator = region.getDistricts().iterator();
			while (iterator.hasNext()) {
				area += iterator.next().getArea();
			}
		}
		return area;
	}

	public int calculateStateArea(State state) {
		int area = 0;
		if (state != null) {
			Iterator<Region> iterator = state.getRegions().iterator();
			while (iterator.hasNext()) {
				area += calculateRegionArea(iterator.next());
			}
		}
		return area;
	}

}