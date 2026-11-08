package prac5;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("радиус должен быть положительным");
        }
        this.radius = radius;
    }

    @Override
    public String getName() {
        return String.format("Круг r = %.1f", radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
