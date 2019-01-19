package chainofresponsibility;

public abstract class PurchasePower {

    protected static final double BASE = 1000;

    protected PurchasePower successor;

    protected abstract double getAllowable();

    protected abstract String getRole();

    public PurchasePower() {
    }

    public PurchasePower(PurchasePower successor) {
        this.successor = successor;
    }

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    public void purchasePower(PurchaseRequest request) {
        if (request.getAmount() < getAllowable()) {
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } else {
            System.out.println("nope");
        }
    }

    public PurchasePower getSuccessor() {
        return successor;
    }
}