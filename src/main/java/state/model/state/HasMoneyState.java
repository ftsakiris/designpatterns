package state.model.state;

import state.model.SodaVendingMachine;

public class HasMoneyState extends State {

    public HasMoneyState(SodaVendingMachine sodaVendingMachine) {
        super(sodaVendingMachine);
    }

    @Override
    public void insertMoney() {
        System.out.println("No need to insert a dollar");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Returning your dollar");
        setNoMoneyState();
    }

    @Override
    public void select() {
        System.out.println("Selected item..");
        setSoldState();
    }

    @Override
    public void dispense() {
        System.out.println("no soda dispensed");
    }

    @Override
    public String toString() {
        return "Waiting to a new selection";
    }
}
