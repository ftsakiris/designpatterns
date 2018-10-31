package simplefactory.interfaces;

import simplefactory.model.CheeseHamburger;
import simplefactory.model.Hamburger;

public class SimpleHamburgerFactory {

    public Hamburger create(String type) {
        Hamburger hamburger = null;
        if ("CheeseHamburger".equals(type)) {
            hamburger = new CheeseHamburger();
        }
        return hamburger;
    }
}
