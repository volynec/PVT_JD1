package task_11.PracticeThree;

/**
 * Created by user on 29.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape( );

        try {
            System.out.println(shape.getAreaValue(-2, 1));
        } catch (CustomShapeException e) {
            System.out.println("value of 'width' or 'length' is negative: "+"length; "+e.getLength() +" width: " +e.getWidth() );
        }
    }
}