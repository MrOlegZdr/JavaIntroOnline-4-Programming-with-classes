package by.jonline.pr04.prwclass.task13;

import java.util.ArrayList;

/* Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Task13 {

	public static void main(String[] args) {

		City minsk = new City("Минск");
		City grodno = new City("Гродно");
		City brest = new City("Брест");
		City vitebsk = new City("Витебск");
		City mogilev = new City("Могилев");
		City gomel = new City("Гомель");

		ArrayList<City> minskList = new ArrayList<City>();
		minskList.add(minsk);
		ArrayList<City> grodnoList = new ArrayList<City>();
		grodnoList.add(grodno);
		ArrayList<City> brestList = new ArrayList<City>();
		brestList.add(brest);

		District minskii = new District("Минский район", minskList, 1943);
		minskii.addCity(new City("Заславль"));
		minskii.addCity(new City("Михановичи"));
		minskii.setDistrictCenter("Минск");

		District slutskii = new District("Слуцкий район", new ArrayList<City>(), 1821);
		slutskii.addCity(new City("Слуцк"));
		slutskii.addCity(new City("Вежи"));
		slutskii.setDistrictCenter("Слуцк");

		District grodnenskii = new District("Гродненский район", grodnoList, 2594);
		grodnenskii.addCity(new City("Индура"));
		grodnenskii.addCity(new City("Скидель"));
		grodnenskii.setDistrictCenter("Гродно");

		District brestskii = new District("Брестский район", brestList, 1545);
		brestskii.addCity(new City("Мухавец"));
		brestskii.addCity(new City("Медно"));
		brestskii.setDistrictCenter("Брест");

		District vitebskii = new District("Витебский район", new ArrayList<City>(), 2737);
		vitebskii.addCity(vitebsk);
		vitebskii.addCity(new City("Сураж"));
		vitebskii.setDistrictCenter("Витебск");

		District mogilevskii = new District("Могилевский район", new ArrayList<City>(), 1895);
		mogilevskii.addCity(mogilev);
		mogilevskii.addCity(new City("Жуково"));
		mogilevskii.setDistrictCenter("Могилев");

		District gomelskii = new District("Гомельский район", new ArrayList<City>(), 1951);
		gomelskii.addCity(gomel);
		gomelskii.addCity(new City("Михальки"));
		gomelskii.setDistrictCenter(gomel);

		Region minskaya = new Region("Минская область", new ArrayList<District>());
		minskaya.addDistrict(minskii);
		minskaya.addDistrict(slutskii);
		minskaya.setRegionalCenter("Минск");
		Region grodnenskaya = new Region("Гродненская область", new ArrayList<District>());
		grodnenskaya.addDistrict(grodnenskii);
		grodnenskaya.setRegionalCenter("Гродно");
		Region brestskaya = new Region("Брестская область", new ArrayList<District>());
		brestskaya.addDistrict(brestskii);
		brestskaya.setRegionalCenter(brest);

		State state = new State("Беларусь", new ArrayList<Region>());
		state.addRegion(minskaya);
		state.addRegion(grodnenskaya);
		state.addRegion(brestskaya);
		state.setCapital("Минск");

		StateAction stateAction = new StateAction();
		stateAction.showCapital(state);
		stateAction.showIntInformation(stateAction.calculateRegionCount(state), "Количество областей");
		stateAction.showIntInformation(stateAction.calculateStateArea(state), "Площадь государства");
		stateAction.showCitiesInList(stateAction.formListOfAdministrativeCenters(state.getRegions()),
				"Областные центры");
	}

}