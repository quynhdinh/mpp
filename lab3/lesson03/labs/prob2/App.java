package lesson03.labs.prob2;

import java.util.List;

/**
 * Main class is for testing your code; you can uncomment
 * the code here once you have implemented classes.
 * 
 * However, the way
 * data has been populated into the LandlordInfo and Building
 * objects violates the design indicated in the UML diagram for
 * this problem. Refactor the code in the main method so that
 * data is loaded in a correct manner; you can verify that you
 * have done this successfully by moving the Main class into a
 * different package.
 *
 */
public class App {

	public static void main(String[] args) {
		List<Apartment> apts0 = List.of(
				new Apartment(600),
				new Apartment(700));
		List<Apartment> apts1 = List.of(
				new Apartment(500),
				new Apartment(450));

		List<Apartment> apts2 = List.of(
				new Apartment(1100),
				new Apartment(650));

		List<Apartment> apts3 = List.of(
				new Apartment(6750),
				new Apartment(945));

		List<Building> bldgs = List.of(
				new Building(apts0, 150, 400),
				new Building(apts1, 175, 900),
				new Building(apts2, 150, 300),
				new Building(apts3, 175, 775));

		LandlordInfo landlord = new LandlordInfo(bldgs);
		System.out.println(landlord.calcProfits());
	}
}
