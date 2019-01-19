package chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        CeoPurchasePower ceo = new CeoPurchasePower();
        DirectorPurchasePower director = new DirectorPurchasePower();
        ManagerPurchasePower manager = new ManagerPurchasePower();


        ceo.setSuccessor(director);
        director.setSuccessor(ceo);
        manager.setSuccessor(director);

        while (true) {
            System.out.println("Enter the amount to check");
            System.out.println(">>");

            final double amount = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
            manager.purchasePower(new PurchaseRequest(amount, "Buy Stuff"));
        }
    }

}