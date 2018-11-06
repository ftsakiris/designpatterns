package command.model.batman;

public class BatmanReceiver {

    private String name;

    public BatmanReceiver(String name) {
        this.name = name;
    }

    public void moveUp() {
        System.out.println(getName() + " move up");
    }

    public void moveDown() {
        System.out.println(getName() + " move down");
    }

    public void moveLeft() {
        System.out.println(getName() + " move left");
    }

    public void moveRight() {
        System.out.println(getName() + " move right");
    }

    public String getName() {
        return name;
    }
}