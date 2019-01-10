package prototype;

public class Main {

    public static void main(String[] args) {
        Person fotis = new Person("Fotis", 29);

        System.out.println("Person 1: " + fotis);

        final Person clone = fotis.clone();
        System.out.println("Person 2: " + clone);
    }
}
