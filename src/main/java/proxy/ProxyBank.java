package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {

    private RealBank bank = new RealBank();
    private static List<String> bannedClients;

    static {
        bannedClients = new ArrayList<>();
        bannedClients.add("XXX");
        bannedClients.add("test");
        bannedClients.add("@xmil.com");
    }

    @Override
    public void withdraw(String clientName) throws Exception {
        if (bannedClients.contains(clientName)) {
            throw new Exception("Access Denied!!");
        }
        bank.withdraw(clientName);
    }
}
