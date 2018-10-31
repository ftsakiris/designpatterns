package factory.store;

import factory.model.Hamburger;
import factory.model.JamaicanCheeseBurger;
import factory.model.JamaicanVeggieBurger;

public class JamaicaHamburgerStore extends HamburgerStore {

    @Override
    protected Hamburger create(String type) {

        if (type.equals("cheese")) {
            return new JamaicanCheeseBurger();
        } else if (type.equals("veggie")) {
            return new JamaicanVeggieBurger();
        }
        return null;
    }
}
