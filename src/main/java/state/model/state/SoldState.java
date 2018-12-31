package state.model.state;

import state.model.SodaVendingMachine;

public class SoldState extends State {

    public SoldState(SodaVendingMachine sodaVendingMachine) {
        super(sodaVendingMachine);
    }

    @Override
    public void insertMoney() {
        System.out.println("Give a second.. soda coming right out");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Sorry.. soda coming right out");
    }

    @Override
    public void select() {
        System.out.println("Nope.. you cannot eject the money if you already have the money");
    }

    @Override
    public void dispense() {
        if (getNumberOfSodas() > 0) {
            setNoMoneyState();
        } else {
            System.out.println("Sorry out of sodas!");
            setSoldOutState();
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
