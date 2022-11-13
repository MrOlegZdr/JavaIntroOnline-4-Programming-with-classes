package by.jonline.pr04.prwclass.task15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class AgencyHelper {

	public void showAllVouchers(TravelAgency travelAgency) {
		if (travelAgency != null) {
			if (!travelAgency.getVouchers().isEmpty()) {
				System.out.printf("Все туры агенства %s:\n", travelAgency.getName());
				for (Voucher voucher : travelAgency.getVouchers()) {
					System.out.println(voucher.toString());
				}
			} else {
				System.out.printf("В агенстве %s нет туров\n", travelAgency.getName());
			}
		}
	}

	public void showVouchers(HashMap<Integer, Voucher> vouchers) {
		if (!vouchers.isEmpty()) {
			System.out.printf("Список туров в %s (%d шт):\n", vouchers.get(1).getName(), vouchers.size());
			for (Map.Entry<Integer, Voucher> voucher : vouchers.entrySet()) {
				System.out.printf("#%d - %s\n", voucher.getKey(), voucher.getValue().toString());
			}
		} else {
			System.out.println("Туры отсутствуют");
		}
	}

	public void showClient(Client client) {
		if (client != null) {
			System.out.println(client.toString());
		} else {
			System.out.println("Клиент отсутствует");
		}
	}

	public HashMap<Integer, Voucher> selectVouchers(TravelAgency travelAgency, String voucherName) {
		if (travelAgency != null && !travelAgency.getVouchers().isEmpty()) {
			int number = 0;
			HashMap<Integer, Voucher> vouchers = new HashMap<>();
			for (Voucher voucher : travelAgency.getVouchers()) {
				if (voucher.getName().equals(voucherName)) {
					vouchers.put(++number, voucher.clone());
				}
			}
			return vouchers;
		} else {
			return null;
		}
	}

	public TreeSet<String> formDirectionList(TravelAgency travelAgency) {
		if (travelAgency != null && !travelAgency.getVouchers().isEmpty()) {
			TreeSet<String> directions = new TreeSet<>();
			for (Voucher voucher : travelAgency.getVouchers()) {
				directions.add(voucher.getName());
			}
			return directions;
		} else {
			return null;
		}
	}

	public String inputDataString(String message) {
		System.out.print(message);
		String result;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		result = sc.nextLine();
		return result;
	}

	public int inputDataInt(String message) {
		System.out.print(message + " >> ");
		int result;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(message + " >> ");
		}
		result = sc.nextInt();
		return result;
	}

	public Client voucherChecker(TravelAgency travelAgency) {
		if (travelAgency != null && !travelAgency.getVouchers().isEmpty()) {
			Client client = null;
			TreeSet<String> directions = formDirectionList(travelAgency);
			System.out.printf("Направления компании %s:\n%s\n", travelAgency.getName(), directions.toString());
			boolean isReady = false;
			do {
				String name = inputDataString("Введите направление >> ");
				if (directions.contains(name)) {
					HashMap<Integer, Voucher> directionList = selectVouchers(travelAgency, name);
					showVouchers(directionList);
					System.out.println("Сделайте выбор (введите соответствующую цифру):");
					System.out.println("1 - выбрать существующий тур;\n2 - подобрать тур по параметрам;\n0 - выход.");
					int option = inputDataInt("Введите цифру");
					switch (option) {
					default: // Выход
						System.out.println("Введено некорректное число");
					case 0: // Выход
						System.out.println("Осуществлен выход, тур не выбран");
						isReady = true;
						break;
					case 1: // Выбор существующего тура
						int voucherNumber = inputDataInt("Введите номер тура");
						while (voucherNumber < 1 || voucherNumber > directionList.size()) {
							System.out.println("Введен некорректный номер тура");
							voucherNumber = inputDataInt("Введите номер тура");
						}
						client = new Client(inputDataString("Введите свои данные (ФИО) >> "),
								directionList.get(voucherNumber));
						System.out.println("Тур назначен");
						isReady = true;
						break;
					case 2: // Изменение параметров существующего тура
						System.out.println("Введите тип тура из списка:");
						String vType = selectStringFromList(VoucherType.class, "Введите тип тура >> ");
						System.out.println("Введите тип транспорта:");
						String tType = selectStringFromList(TransportType.class, "Введите тип транспорта >> ");
						System.out.println("Введите тип питания:");
						String mType = selectStringFromList(MealType.class, "Введите тип питания >> ");
						int nDays = inputDataInt("Введите количество дней");
						while (nDays <= 0) {
							System.out.println("Введено некорректное количество дней");
							nDays = inputDataInt("Введите количество дней");
						}
						client = new Client(inputDataString("Введите свои данные (ФИО) >> "),
								new Voucher(name, VoucherType.valueOf(vType), TransportType.valueOf(tType),
										MealType.valueOf(mType), nDays));
						System.out.println("Тур назначен");
						isReady = true;
						break;
					}
				} else {
					System.out.println("Такого направления не существует");
					String decision = inputDataString("Хотите выбрать заново? (Y/N) >> ");
					while (!decision.toString().equalsIgnoreCase("y") && !decision.toString().equalsIgnoreCase("n")) {
						System.out.println("Введено некорректное решение");
						decision = inputDataString("Хотите выбрать заново? (Y/N) >> ");
					}
					if (decision.toString().equalsIgnoreCase("y")) {
						isReady = false;
					} else {
						System.out.println("Осуществлен выход, тур не выбран");
						isReady = true;
					}
				}
			} while (!isReady);
			return client;
		} else {
			System.out.println("Агенства не существует, выбор ваучаера невозможен");
			return null;
		}
	}

	public boolean isStringInList(ArrayList<String> list, String string, boolean ignoreCase) {
		if (list != null && list.size() != 0) {
			Iterator<String> iterator = list.iterator();
			boolean result = false;
			while (iterator.hasNext() && !result) {
				if (ignoreCase) {
					result = (iterator.next().equalsIgnoreCase(string)) ? true : false;
				} else {
					result = (iterator.next().equals(string)) ? true : false;
				}
			}
			return result;
		} else {
			return false;
		}
	}

	public <T extends Enum<T>> void printEnumValues(Class<T> enumeration) {
		for (Enum<T> value : enumeration.getEnumConstants()) {
			System.out.println(value.toString());
		}
	}

	public <T extends Enum<T>> ArrayList<String> formEnumNames(Class<T> enumeration) {
		ArrayList<String> result = new ArrayList<>();
		for (Enum<T> value : enumeration.getEnumConstants()) {
			result.add(value.name());
		}
		return result;
	}

	public <T extends Enum<T>> String selectStringFromList(Class<T> enumeration, String message) {
		printEnumValues(enumeration);
		String result = inputDataString(message);
		while (!isStringInList(formEnumNames(enumeration), result, true)) {
			System.out.println("Введены некорректные данные");
			result = inputDataString(message);
		}
		return result.toUpperCase();
	}
}