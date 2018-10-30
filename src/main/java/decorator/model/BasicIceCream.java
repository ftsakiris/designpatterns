package decorator.model;

import decorator.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    private Double price;
    private Integer amount;

    public BasicIceCream(Double price, Integer amount) {
        this.price = price;
        this.amount = amount;
        System.out.println("Creating Basic Ice Cream");
    }

    @Override
    public Integer getAmount() {
        return amount;
    }

    @Override
    public Double cost() {
        return price * amount;
    }
}
