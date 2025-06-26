package lesson03.labs.prob3;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property p : properties)
			totalRent += p.computeRent();
		return totalRent;
	}

	public static List<Property> getByCity(Property[] properties, String city) {
		List<Property> res = new ArrayList<>();
		for (Property property : properties)
			if (property.getAddress().getCity().equals(city))
				res.add(property);
		return res;

	}
}
