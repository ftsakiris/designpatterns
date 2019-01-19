package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<String, Shape> map;

    public ShapeFactory() {
        this.map = new HashMap<>();
    }

    public Shape getShape(String shape) {
        Shape result = map.get(shape);

        if (result == null) {
            result = new Circle("green", 0, 0, 0);
            map.put(shape, result);
        }
        return result;
    }
}
