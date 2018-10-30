package observer.model;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject<String> {

    private List<Observer> observers;
    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null object/Observer");
        }
        if (!observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public String getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to my topic : " + message);
        this.message = message;
        notifyObservers();
    }
}
