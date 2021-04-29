public class ShapeFactory {
    public Shape getShape(int type) {
        if (type == 1) {
            return new Circle();
        } else if (type == 2) {
            return new Square();
        } else if (type == 3) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
