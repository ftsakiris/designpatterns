package strategy2;

import strategy2.model.Product;
import strategy2.model.ShoppingCart;
import strategy2.model.paymentmethod.CreditCard;
import strategy2.model.paymentmethod.Paypal;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("0121", 3));
        shoppingCart.addProduct(new Product("0122", 7));

        shoppingCart.pay(new CreditCard("ds@giamil", "dss34"));
        shoppingCart.pay(new Paypal("ds@giamil", "dss34"));
    }
}
