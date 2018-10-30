package strategy2.model.paymentmethod;

import strategy2.controller.Payment;

public class CreditCard implements Payment {

    private String email;
    private String cardNumber;

    public CreditCard(String email, String cardNumber) {
        this.email = email;
        this.cardNumber = cardNumber;
    }

    public void pay(int amount) {
        System.out.println("pay from CreditCard : " + amount);
    }
}
