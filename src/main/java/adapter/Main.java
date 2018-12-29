package adapter;

public class Main {

    public static void main(String[] args) {

        SocketAdapterImpl socketAdapter = new SocketAdapterImpl();

        assert socketAdapter.get240Volt().getVolts() == 240;
    }
}