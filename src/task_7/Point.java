package task_7;

/**
 * Created by user on 12.12.2017.
 */
public class Point {
public int x;
public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point from, Point to) {
        return Math.sqrt(Math.pow(from.x - to.x, 2) + Math.pow(from.y - to.y, 2));
    }
    public double distance(Point to) {
        return distance(this, to);
    }
}
