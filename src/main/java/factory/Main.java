package factory;

import factory.store.GreekHamburgerStore;
import factory.store.HamburgerStore;

public class Main {

    public static void main(String[] args) {
        HamburgerStore hamburgerStore = new GreekHamburgerStore();

        hamburgerStore.orderHamburger("veggie");
    }
}
