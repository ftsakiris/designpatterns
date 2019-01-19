package bridge;

public class Bike extends Vehicle {
    public Bike(WorkShop workShop, WorkShop workShop2) {
        super(workShop, workShop2);
    }

    @Override
    protected void onManufacture() {
        System.out.println("create bike");
    }

}