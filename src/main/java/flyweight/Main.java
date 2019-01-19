package flyweight;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        final Circle black = (Circle) shapeFactory.getShape("black");

        black.draw();
        black.setRadius(100);
        shapeFactory.getShape("black").draw();

    }

}