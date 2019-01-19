package chainofresponsibility;

public class DirectorPurchasePower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE * 10;
    }

    @Override
    protected String getRole() {
        return "DIRECTOR";
    }
}
