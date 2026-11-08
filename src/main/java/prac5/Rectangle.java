package prac5;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("стороны должны быть положительными");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return String.format("Прямоугольник %.1f×%.1f", width, height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
