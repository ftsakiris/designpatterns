package adapter;

public class SocketAdapterImpl implements SocketAdapter {

    private Socket socket;

    public SocketAdapterImpl() {
        this.socket = new Socket();
    }

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolts(socket.getVolt(), 10);
    }

    @Override
    public Volt get240Volt() {
        return convertVolts(socket.getVolt(), 1/2);
    }

    @Override
    public Volt get3Volt() {
        return convertVolts(socket.getVolt(), 40);
    }

    private Volt convertVolts(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}
