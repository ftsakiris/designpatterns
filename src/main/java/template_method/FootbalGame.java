package template_method;

public class FootbalGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("Footbal initialize");
    }

    @Override
    protected void start() {
        System.out.println("Footbal start");
    }

    @Override
    protected void end() {
        System.out.println("Footbal end");
    }

    protected void addNewCharacterToTheGame() {
        System.out.println("add new Footbal character");
    }
}
