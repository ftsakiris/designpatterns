package chainofresponsibility;

public class ManagerPurchasePower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE;
    }

    @Override
    protected String getRole() {
        return "MANAGER";
    }
}
