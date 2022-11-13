package by.jonline.pr04.prwclass.task13;

import java.util.ArrayList;

public class Region {

	private String name;
	private ArrayList<District> districts;
	private City regionalCenter;

	public Region(String name, ArrayList<District> districts) {
		this.name = name;
		this.districts = new ArrayList<District>(districts);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<District> getDistricts() {
		return new ArrayList<District>(districts);
	}

	public City getRegionalCenter() {
		return regionalCenter;
	}

	public void addDistrict(District district) {
		if (district != null) {
			districts.add(district);
		}
	}

	public void setRegionalCenter(City regionalCenter) {
		StateValidator stateValidator = new StateValidator();
		if (stateValidator.isCityInList(districts, regionalCenter)) {
			this.regionalCenter = regionalCenter;
		} else {
			System.out.printf("В текущей области не существует районного центра %s, который может стать областным\n",
					regionalCenter.getName());
		}
	}

	public void setRegionalCenter(String cityName) {
		StateAction stateAction = new StateAction();
		StateValidator stateValidator = new StateValidator();
		City regionalCenter = stateAction.findCityByNameInList(stateAction.formListOfAdministrativeCenters(districts),
				cityName);
		if (regionalCenter != null && stateValidator.isCityInList(districts, regionalCenter)) {
			this.regionalCenter = regionalCenter;
		} else {
			System.out.printf(
					"В текущей области не существует районного центра %s, который может быть назначен областным\n",
					cityName);
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(name).append(", ");
		if (regionalCenter != null) {
			result.append("областной центр: ").append(regionalCenter.getName()).append('\n');
		} else {
			result.append("областной центр не назначен\n");
		}
		if (districts != null) {
			result.append("Районы области:\n");
			for (District district : districts) {
				result.append(district.toString());
			}
		} else {
			result.append("Районов не задано");
		}
		return result.toString();
	}
}