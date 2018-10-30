package decorator.interfaces;

public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public Double cost() {
        return iceCream.cost();
    }

    @Override
    public Integer getAmount() {
        return iceCream.getAmount();
    }
}
