package ShapeAreaCalculator;

public class Circle extends Shape{
    private double radius;
    private double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}
