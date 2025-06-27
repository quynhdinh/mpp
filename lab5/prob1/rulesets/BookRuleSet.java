package lab5.prob1.rulesets;

import java.awt.Component;
import java.util.Arrays;

import lab5.prob1.gui.BookWindow;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		BookWindow w = (BookWindow) ob;
		String isbn = w.getIsbnValue().trim();
		try {
			if (isbn.isEmpty() || w.getPriceValue().isEmpty() || w.getTitleValue().isEmpty())
				throw new RuleException("All fields must be nonempty");

			System.out.println(isbn + " / " + isbn.length());
			if (!isbn.matches("[0-9]+") || (isbn.length() != 10 && isbn.length() != 13))
				throw new RuleException("Isbn must be numeric and consist of either 10 or 13 characters");

			if (isbn.length() == 10 && isbn.charAt(0) > '1')
				throw new RuleException("If Isbn has length 10, the first digit must be 0 or 1");

			if (isbn.length() == 13 && !Arrays.asList("978", "979").contains(isbn.substring(0, 3)))
				throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979");

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