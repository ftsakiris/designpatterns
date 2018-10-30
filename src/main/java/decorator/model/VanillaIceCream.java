package decorator.model;

import decorator.interfaces.IceCream;
import decorator.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Creating Vanilla Ice Cream");
    }

    @Override
    public Double cost() {
        return 0.3 * getAmount() + super.cost();
    }
}
