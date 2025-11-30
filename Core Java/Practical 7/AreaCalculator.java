public class AreaCalculator {

public double area(double base, double height) {
return 0.5 * base * height;
}

public double area(double length, double width,
boolean isRectangle) {
return length * width;
}

public double area(double radius) {
return Math.PI * radius * radius;
}

public static void main(String[] args) {
AreaCalculator calculator = new AreaCalculator();

double triangleArea = calculator.area(5, 10);
double rectangleArea = calculator.area(7, 4, true);
double circleArea = calculator.area(3);

System.out.println("Area of Triangle: " +
triangleArea);
System.out.println("Area of Rectangle: " +
rectangleArea);

System.out.println("Area of Circle: " + circleArea);
}
}