package bridge;

public abstract class Vehicle {
    private WorkShop workShop;
    private WorkShop workShop2;

    public Vehicle(WorkShop workShop, WorkShop workShop2) {
        this.workShop = workShop;
        this.workShop2 = workShop2;
    }

    public void manufacture() {
        onManufacture();
        workShop.make();
        workShop2.make();
    }

    protected abstract void onManufacture();
}
