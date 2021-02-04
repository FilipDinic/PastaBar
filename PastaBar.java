import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {

		String[] ingredients = { "Makarone", "Spagete", "Bologneze", "Curetina", "Govedja prsut", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };

		int[] price = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		String[] regularcustomers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };

		double finalPrice = 0;
		String customerentry = "";

		Scanner s = new Scanner(System.in);
		System.out.println("Izvolite!!");

		while (!customerentry.equals("Poruci")) {// Jedino sam ovo nasao na googlu kao mogucnost da izadjem iz petlje
			System.out.println("Izaberite sastojak za pastu: ");
			customerentry = s.nextLine();// Na googlu sam nasao da samo sa nextLine prepoznaje dve reci kao jednu iz
											// sastojaka, i da mi ne stampa dva puta zaredom "Izaberite sastojak za
											// pastu: " ukoliko su dve reci u nazivu sastojka
			int index = findIngredient(ingredients, customerentry);
			if (index >= 0) {
				finalPrice = finalPrice + price[index];
			} else {
				System.out.println("Nevalidan unos!");
			}
		}
		System.out.println("Unesite vas broj telefona (format 06...): ");
		String b = s.next();
		boolean isRegular = isRegularCustomer(regularcustomers, b);
		if (isRegular) {
			finalPrice = finalPrice - finalPrice / 10;
		}
		System.out.println("Vasa pasta iznosi: " + finalPrice + " " + "rsd");
		System.out.println("Prijatno!!");
	}

	public static int findIngredient(String[] ingredients, String ingredientName) {
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredientName)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {

		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phoneNumbers[i].equals(phone)) {
				return true;
			}
		}
		return false;
	}

}