package task_7;

/**
 * Created by user on 12.12.2017.
 */
public class Circle extends Shape {

    private Point radius;
    private Point centre;

    private final double PI = Math.PI;

    public Circle() {
    }

    public Circle(Point centre, Point radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(centre.distance(radius), 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * centre.distance(radius);
    }

    @Override
    public String toString() {
        return "Circle radius: " + centre.distance(radius)
                + "\nResulting Area: " + area()
                + "\nResulting Perimeter: " + perimeter() + "\n";
    }
}
