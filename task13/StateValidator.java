package by.jonline.pr04.prwclass.task13;

import java.util.ArrayList;
import java.util.Iterator;

public class StateValidator {

/*	public boolean isCityInList(ArrayList<City> cityList, City city) {

		boolean result = false;
		if (cityList != null && city != null) {
			Iterator<City> iterator = cityList.iterator();
			while (iterator.hasNext() && !result) {
				if (iterator.next().equals(city)) {
					result = true;
				}
			}
		}

		return result;
	}
*/
/*	public boolean isCityInDistrictsCenterList(ArrayList<District> districts, City city) {

		boolean result = false;
		if (districts != null && city != null) {
			Iterator<District> iterator = districts.iterator();
			while (iterator.hasNext() && !result) {
				if (iterator.next().getDistrictCenter().equals(city)) {
					result = true;
				}
			}
		}

		return result;
	}
*/
	public boolean isCityInList(ArrayList<?> cityList, City city) {

		boolean result = false;
		if (cityList != null && city != null) {
			Iterator<?> iterator = cityList.iterator();
			while (iterator.hasNext() && !result) {
				if (cityList.get(0).getClass().equals(City.class) && iterator.next().equals(city)) {
					result = true;
				} else if (cityList.get(0).getClass().equals(District.class)
						&& ((District) iterator.next()).getDistrictCenter().equals(city)) {
					result = true;
				} else if (cityList.get(0).getClass().equals(Region.class)
						&& ((Region) iterator.next()).getRegionalCenter().equals(city)) {
					result = true;
				}
			}
		}

		return result;
	}

}