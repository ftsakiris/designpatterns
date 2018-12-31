package state.model.state;

import state.model.SodaVendingMachine;

public abstract class State {

    private SodaVendingMachine sodaVendingMachine;

    public State(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    public abstract void insertMoney();

    public abstract void ejectMoney();

    public abstract void select();

    public abstract void dispense();

    public void setHasMoneyState() {
        this.sodaVendingMachine.setCurrentState(this.sodaVendingMachine.getHasMoneyState());
    }

    public void setNoMoneyState() {
        this.sodaVendingMachine.setCurrentState(this.sodaVendingMachine.getNoMoneyState());
    }

    public void setSoldOutState() {
        this.sodaVendingMachine.setCurrentState(this.sodaVendingMachine.getSoldOutState());
    }

    public void setSoldState() {
        this.sodaVendingMachine.sodaIsSold();
        this.sodaVendingMachine.setCurrentState(this.sodaVendingMachine.getSoldState());
    }

    public int getNumberOfSodas() {
        return this.sodaVendingMachine.getNumberOfSodas();
    }

}