package state;

import state.model.SodaVendingMachine;

public class Main {

    public static void main(String[] args) {

        SodaVendingMachine machine = new SodaVendingMachine(10);

        System.out.println(machine);

        machine.insertMoney();
        machine.select();
        machine.dispense();

        System.out.println(machine);

        machine.insertMoney();
        machine.select();
        machine.dispense();

        machine.insertMoney();
        machine.select();
        machine.dispense();

        System.out.println(machine);
    }
}