package memento;

public class Originator<T> {

    // this property id the model
    private T state;

    public T getState() {
        return state;
    }

    public void setState(T state) {
        this.state = state;
    }

    public Memento<T> createMemento() {
        return new Memento<>(state);
    }

    public void setMemento(Memento<T> memento) {
        state = memento.getState();
    }
}
