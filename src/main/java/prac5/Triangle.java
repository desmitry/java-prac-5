package prac5;

// треугольник из прошлых работ: стороны в массиве, площадь по формуле Герона
public class Triangle extends Shape {

    private final double[] sides;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("стороны должны быть положительными");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("из сторон " + a + ", " + b + ", " + c + " нельзя построить треугольник");
        }
        sides = new double[] { a, b, c };
    }

    @Override
    public String getName() {
        return String.format("Треугольник %.1f×%.1f×%.1f", sides[0], sides[1], sides[2]);
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public double perimeter() {
        return sides[0] + sides[1] + sides[2];
    }
}
