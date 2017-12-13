package task_7;

/**
 * Created by user on 13.12.2017.
 */
public class Rectangle extends Quadrilateral {

    public Rectangle() {
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    @Override
    public double area() {

        return  getA().distance(getB()) * getB().distance(getC());
    }

    @Override
    public double perimeter() {

        return 2 * (getA().distance(getB())) + getB().distance(getC());
    }

    @Override
    public String toString() {

        return "Quadrilateral width: " + getA().distance(getB()) + " and length: " + getB().distance(getC())
                + "\nResulting area: " + area()
                + "\nResulting perimeter: " + perimeter() ;
    }
}
