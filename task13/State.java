package by.jonline.pr04.prwclass.task13;

import java.util.ArrayList;

public class State {

	private String name;
	private ArrayList<Region> regions;
	private City capital;

	public State(String name, ArrayList<Region> regions) {
		this.name = name;
		this.regions = new ArrayList<Region>(regions);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Region> getRegions() {
		return new ArrayList<Region>(regions);
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		StateValidator stateValidator = new StateValidator();
		if (stateValidator.isCityInList(regions, capital)) {
			this.capital = capital;
		} else {
			System.out.printf("В государстве не существует областного центра %s, который может стать столицей\n",
					capital.getName());
		}
	}

	public void addRegion(Region region) {
		if (region != null) {
			regions.add(region);
		}
	}

	public void setCapital(String cityName) {
		StateAction stateAction = new StateAction();
		StateValidator stateValidator = new StateValidator();
		City capital = stateAction.findCityByNameInList(stateAction.formListOfAdministrativeCenters(regions), cityName);
		if (capital != null && stateValidator.isCityInList(regions, capital)) {
			this.capital = capital;
		} else {
			System.out.printf("В государстве не существует областного центра %s, который может стать столицей\n",
					cityName);
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(name).append(", ");
		if (capital != null) {
			result.append("столица: ").append(capital.getName()).append('\n');
		} else {
			result.append("столица не назначена\n");
		}
		if (regions != null) {
			result.append("Области:\n");
			for (Region region : regions) {
				result.append(region.toString());
			}
		} else {
			result.append("Областей не задано");
		}
		return result.toString();
	}
}