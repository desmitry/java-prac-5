package prac5;

// общий тип для всех фигур: задаёт, что любая фигура умеет считать площадь и периметр,
// но как именно - решает каждый наследник; сравнение фигур по площади описано один раз здесь
public abstract class Shape implements Comparable<Shape> {

    public abstract String getName();

    public abstract double area();

    public abstract double perimeter();

    @Override
    public int compareTo(Shape other) {
        return Double.compare(area(), other.area());
    }

    @Override
    public String toString() {
        return String.format("%-28s S = %8.4f   P = %7.4f", getName(), area(), perimeter());
    }
}
