package factory.store;

import factory.model.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type) {
        Hamburger hamburger = create(type);
        hamburger.prepare();
        hamburger.cook();
        hamburger.box();
        return hamburger;
    }

    protected abstract Hamburger create(String type);
}
