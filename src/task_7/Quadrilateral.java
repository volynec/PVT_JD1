package task_7;

/**
 * Created by user on 12.12.2017.
 */
public   class Quadrilateral extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral() {
    }

    public Quadrilateral(Point a, Point b, Point c, Point d) {
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
    double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
