package task_7;

/**
 * Created by user on 13.12.2017.
 */
public class ShapeUtils {
public static boolean isRectangle(Rectangle rectangle){
Point a = rectangle.getA();
Point b = rectangle.getB();
Point c = rectangle.getC();
Point d = rectangle.getD();

    return  ((a.distance(b)==c.distance(d))&&(b.distance(c)==d.distance(a))&&(a.distance(c)==b.distance(d)));

}
}
