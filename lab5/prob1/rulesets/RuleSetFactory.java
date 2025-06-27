package lab5.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lab5.prob1.gui.BookWindow;
import lab5.prob1.gui.CDWindow;

final public class RuleSetFactory {
	static public final HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(BookWindow.class, new BookRuleSet());
		map.put(CDWindow.class, new CDRuleSet());
	}
	private RuleSetFactory() {}
}