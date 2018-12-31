package state.model;

import state.model.state.*;

public class SodaVendingMachine {

    private State soldOutState;
    private State soldState;
    private State noMoneyState;
    private State hasMoneyState;

    private State currentState;
    private int numberOfSodas;

    public SodaVendingMachine(int numberOfSodas) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasMoneyState = new HasMoneyState(this);
        noMoneyState = new NoMoneyState(this);
        currentState = soldOutState;
        this.numberOfSodas = numberOfSodas;

        if (numberOfSodas > 0) {
            currentState = noMoneyState;
        }
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void ejectMoney() {
        currentState.ejectMoney();
    }

    public void select() {
        currentState.select();
    }

    public void dispense() {
        currentState.dispense();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public int getNumberOfSodas() {
        return numberOfSodas;
    }

    public void sodaIsSold() {
        numberOfSodas--;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "Soda VendingMachine {" +
                "currentState=" + currentState +
                ", numberOfSodas=" + numberOfSodas +
                '}';
    }
}