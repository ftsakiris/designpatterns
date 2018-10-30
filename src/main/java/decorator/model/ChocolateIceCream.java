package decorator.model;

import decorator.interfaces.IceCream;
import decorator.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Creating Chocolate Ice Cream");
    }

    @Override
    public Double cost() {
        return 0.2 * getAmount() + super.cost();
    }
}
