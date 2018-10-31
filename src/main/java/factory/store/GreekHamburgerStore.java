package factory.store;

import factory.model.GreekCheeseBurger;
import factory.model.GreekVeggieBurger;
import factory.model.Hamburger;

public class GreekHamburgerStore extends HamburgerStore {

    @Override
    protected Hamburger create(String type) {
        if (type.equals("cheese")) {
            return new GreekCheeseBurger();
        } else if (type.equals("veggie")) {
            return new GreekVeggieBurger();
        }
        return null;
    }
}
