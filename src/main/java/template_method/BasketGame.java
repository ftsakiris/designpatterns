package template_method;

public class BasketGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("Basket initialize");
    }

    @Override
    protected void start() {
        System.out.println("Basket start");
    }

    @Override
    protected void end() {
        System.out.println("Basket end");
    }

    protected void addNewCharacterToTheGame() {
        System.out.println("add new Basket character");
    }
}