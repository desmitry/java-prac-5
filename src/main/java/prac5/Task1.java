package prac5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// иерархия фигур: абстрактный класс Shape и наследники Triangle, Rectangle, Circle;
// все фигуры лежат в одном списке List<Shape> и сортируются по площади через Comparable<Shape>
public class Task1 {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(3, 4, 5));
        shapes.add(new Rectangle(4, 2.5));
        shapes.add(new Circle(1.5));
        shapes.add(new Triangle(5, 5, 6));
        shapes.add(new Rectangle(1, 1));
        shapes.add(new Circle(0.5));

        try {
            shapes.add(new Triangle(1, 2, 10));
        } catch (IllegalArgumentException e) {
            System.out.println("Фигура не добавлена: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Фигуры в порядке добавления:");
        printAll(shapes);

        Collections.sort(shapes);
        System.out.println();
        System.out.println("Фигуры по возрастанию площади (Collections.sort):");
        printAll(shapes);

        System.out.println();
        System.out.println("Самая большая фигура: " + Collections.max(shapes).getName());
        System.out.printf("Суммарная площадь: %.4f%n", totalArea(shapes));
    }

    // метод не знает конкретных классов, работает только с общим типом Shape
    static void printAll(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("  " + shape);
        }
    }

    static double totalArea(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}
