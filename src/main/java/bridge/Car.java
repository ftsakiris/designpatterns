package bridge;

public class Car extends Vehicle {
    public Car(WorkShop workShop, WorkShop workShop2) {
        super(workShop, workShop2);
    }

    @Override
    protected void onManufacture() {
        System.out.println("create car");
    }

}