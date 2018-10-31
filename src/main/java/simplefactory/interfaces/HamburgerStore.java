package simplefactory.interfaces;

import simplefactory.model.Hamburger;

public abstract class HamburgerStore {

    private SimpleHamburgerFactory factory;

    public HamburgerStore(SimpleHamburgerFactory factory) {
        this.factory = factory;
    }

    public Hamburger orderHamburger(String type) {
        Hamburger hamburger = factory.create(type);
        hamburger.prepare();
        hamburger.cook();
        hamburger.box();
        return hamburger;
    }
}
