package task_7;

/**
 * Created by user on 13.12.2017.
 */
public class ShapeUtils {
      static Rectangle buildRectangle(Point a, Point b, Point c, Point d) {
        Rectangle rectangle = null;
        if ((a.distance(b) == c.distance(d)) && (b.distance(c) == d.distance(a)) && (a.distance(c) == b.distance(d))) {
            rectangle = new Rectangle(a, b, c, d);
        }
        return rectangle;
    }

}
