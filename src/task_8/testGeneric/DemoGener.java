package task_8.testGeneric;

/**
 * Created by user on 18.12.2017.
 */
public class DemoGener {
    public static void main(String[] args) {
        Gener <Integer, Double>gener = new Gener<>(1,123d);
        System.out.println(gener.toString());
    }
}
