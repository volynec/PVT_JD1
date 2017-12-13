package task_7;

/**
 * Created by user on 12.12.2017.
 */
public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return (a.distance(b) + b.distance(c) + c.distance(a)) / 2;
    }

    @Override
    public double perimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    @Override
    public String toString() {
        return "Triangle sides lengths: " + a.distance(b) + ", " + b.distance(c) + ", " + c.distance(a)
                + "\nResulting Area: " + area()
                + "\nResulting Perimeter: " + perimeter() + "\n";
    }
}
