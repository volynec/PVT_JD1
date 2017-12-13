package task_7;

/**
 * Created by user on 12.12.2017.
 */
public class Rectangle extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle() {
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    @Override
    public double area() {

        return a.distance(b) * b.distance(c);
    }

    @Override
    public double perimeter() {

        return 2 * (a.distance(b) + b.distance(c));
    }

    @Override
    public String toString() {

        return "Rectangle width: " + a.distance(b) + " and length: " + b.distance(c)
                + "\nResulting area: " + area()
                + "\nRectangle " + area()
                + "\nResulting perimeter: " + perimeter() ;
    }
}