package task_7;

/**
 * Created by user on 13.12.2017.
 */
public class ShapeUtils {
    public static boolean isRectangle(Quadrilateral quadrilateral) {
        Point a = quadrilateral.getA();
        Point b = quadrilateral.getB();
        Point c = quadrilateral.getC();
        Point d = quadrilateral.getD();

        return ((a.distance(b) == c.distance(d)) && (b.distance(c) == d.distance(a)) && (a.distance(c) == b.distance(d)));

    }
}
