package task_7;

/**
 * Created by user on 12.12.2017.
 */
public abstract class Shape implements Perimeterable {
    abstract double area();

    boolean equalsShape(Shape shape) {

        return this.area() == shape.area();
    }
}
