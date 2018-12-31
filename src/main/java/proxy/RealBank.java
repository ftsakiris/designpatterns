package proxy;

public class RealBank implements Bank {
    @Override
    public void withdraw(String clientName) throws Exception {
        System.out.println("Withdraw from the atm");
    }
}
