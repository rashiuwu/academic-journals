import shapeArea.Triangle;
import shapeArea.Rectangle;

public class TestShapeArea {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        double triangleArea = t.area(10, 5);   // base=10, height=5
        double rectangleArea = r.area(8, 4);   // length=8, breadth=4

        System.out.println("Area of Triangle = " + triangleArea);
        System.out.println("Area of Rectangle = " + rectangleArea);
    }
}
