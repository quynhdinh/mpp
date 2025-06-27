package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.CDWindow;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Price must be a floating point number with two decimal places
 * 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		try {
			CDWindow w = (CDWindow) ob;
			if (w.getArtistValue().isEmpty() || w.getPriceValue().isEmpty() || w.getTitleValue().isEmpty())
				throw new RuleException("All fields must be nonempty");

			String price = w.getPriceValue().trim();
			int price_length = price.length();

			if (!price.contains(".") || price_length - (price.indexOf(".") + 1) < 2)
				throw new RuleException("Price must be a floating point number with two decimal places");

			if (Double.valueOf(price) <= 0.49)
				throw new RuleException("Price must be a number greater than 0.49.");
		} catch (Exception e) {
			throw new RuleException(e.getMessage());
		}
	}

}