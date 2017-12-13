package task_7;

/**
 * Created by user on 12.12.2017.
 */
public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Quadrilateral(new Point(1, 1), new Point(1, 4), new Point(5, 4), new Point(5, 1));
        ShapeUtils shapeUtils = new ShapeUtils();
        System.out.println(rectangle);
        System.out.println("Quadrilateral is: "+ shapeUtils.isRectangle((Quadrilateral) rectangle)+ "\n");

        Shape circle = new Circle(new Point(0, 0), new Point(0, 5));
        System.out.println(circle);

        Shape triangle = new Triangle(new Point(1, 1), new Point(1, 4), new Point(5, 1));
        System.out.println(triangle);
    }
}
