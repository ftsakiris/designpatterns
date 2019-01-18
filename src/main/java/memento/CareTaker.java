package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker<T> {

    private List<Memento<T>> statelist = new ArrayList<>();

    public void addMemento(Memento<T> memento) {
        statelist.add(memento);
    }

    public Memento<T> getMemento(int i) {
        return statelist.get(i);
    }
}
