package bridge;

public class Main {

    public static void main(String[] args) {
        Asseble asseble = new Asseble();
        Make make = new Make();

        Bike bike = new Bike(make, asseble);
        Car car = new Car(make, asseble);

        bike.manufacture();
        car.manufacture();
    }
}