package strategy2.model;

import strategy2.controller.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(Payment payment) {
        payment.pay(calculateTotal());
        products.clear();
    }
}