package state.model.state;

import state.model.SodaVendingMachine;

public class SoldOutState extends State {

    public SoldOutState(SodaVendingMachine sodaVendingMachine) {
        super(sodaVendingMachine);
    }

    @Override
    public void insertMoney() {
        System.out.println("Machine sold out");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Insert money first");
    }

    @Override
    public void select() {
        System.out.println("No soda available");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out");
    }

    @Override
    public String toString() {
        return "Sold out";
    }
}
