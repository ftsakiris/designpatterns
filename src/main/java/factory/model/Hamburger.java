package factory.model;

public abstract class Hamburger {

    private String name;
    private String sauce;
    private String buns;

    public Hamburger() {
    }

    public Hamburger(String name, String sauce, String buns) {
        this.name = name;
        this.sauce = sauce;
        this.buns = buns;
    }

    public void prepare() {
        System.out.println("Preparing : " + name);
        System.out.println("Adding sauce : " + sauce);
        System.out.println("Adding buns : " + buns);
    }

    public void cook() {
        System.out.println("Cooking...");
    }

    public void box() {
        System.out.println("Boxing...");
    }

    public String getName() {
        return name;
    }
}
