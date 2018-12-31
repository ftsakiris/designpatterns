package proxy;

public class Main {

    public static void main(String[] args) throws Exception {

        Bank bank = new ProxyBank();

        bank.withdraw("Paulo");
        bank.withdraw("test");
    }
}