package state.model.state;

import state.model.SodaVendingMachine;

public class NoMoneyState extends State {

    public NoMoneyState(SodaVendingMachine sodaVendingMachine) {
        super(sodaVendingMachine);
    }

    @Override
    public void insertMoney() {
        System.out.println("You inserted a dollar");
        setHasMoneyState();
    }

    @Override
    public void ejectMoney() {
        System.out.println("You have not inserted a dollar");
    }

    @Override
    public void select() {
        System.out.println("You selected, but there is not money!");
    }

    @Override
    public void dispense() {
        System.out.println("pay me first!");
    }

    @Override
    public String toString() {
        return "waiting for a dollar..";
    }
}
