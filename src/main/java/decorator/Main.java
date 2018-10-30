package decorator;

import decorator.interfaces.IceCream;
import decorator.model.BasicIceCream;
import decorator.model.ChocolateIceCream;
import decorator.model.VanillaIceCream;

public class Main {

    public static void main(String[] args) {

        BasicIceCream basicIceCream = new BasicIceCream(0.5, 2);
        IceCream chocolateIceCream = new ChocolateIceCream(basicIceCream);
        IceCream vanillaIceCream = new VanillaIceCream(basicIceCream);

        System.out.println(chocolateIceCream.cost());
        System.out.println(vanillaIceCream.cost());
    }
}
