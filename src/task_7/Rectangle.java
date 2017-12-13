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
    public String toString() {

        return "Rectangle width: " + getA().distance(getB()) + " and length: " + getB().distance(getC())
                + "\nResulting area: " + area()
                + "\nResulting perimeter: " + perimeter() +"\n";
    }
}
