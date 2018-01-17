package task_11.PracticeThree;

/**
 * Created by user on 29.12.2017.
 */
public class CustomShapeException extends Exception {
    private int width;
    private int length;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public CustomShapeException(int x, int y) {
        width = x;
        length = y;
    }
}
