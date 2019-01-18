package memento;

public class Main {

    public static void main(String[] args) {

        Originator<String> originator = new Originator<>();
        originator.setState("Monster");

        CareTaker<String> careTaker = new CareTaker<>();
        careTaker.addMemento(originator.createMemento());

        originator.setState("Monster 2");
        originator.setState("Monster 3");
        originator.setState("Monster 4");

        careTaker.addMemento(originator.createMemento());

        System.out.println(originator.getState());
        System.out.println(careTaker.getMemento(0).getState());
    }

}