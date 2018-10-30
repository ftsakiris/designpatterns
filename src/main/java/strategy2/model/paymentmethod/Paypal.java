package strategy2.model.paymentmethod;

import strategy2.controller.Payment;

public class Paypal implements Payment {

    private String email;
    private String password;

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println("pay from paypal : " + amount);
    }
}
