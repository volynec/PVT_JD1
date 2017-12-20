package task_7;

import static task_7.ShapeUtils.buildRectangle;


/**
 * Created by user on 12.12.2017.
 */
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = buildRectangle(new Point(1, 1), new Point(1, 4), new Point(5, 4), new Point(5, 1));
        System.out.println(rectangle);

        Shape circle = new Circle(new Point(0, 0), new Point(0, 5));
        System.out.println(circle);

        Shape triangle = new Triangle(new Point(1, 1), new Point(1, 4), new Point(5, 1));
        System.out.println(triangle);
        System.out.println("Area Rectangle = Triangle  is: " + rectangle.equalsShape(triangle));

        rectangle.equals(triangle);
    }
}
