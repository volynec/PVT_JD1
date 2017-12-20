package task_8.exampleAnnotation.myTest;

/**
 * Created by user on 20.12.2017.
 */
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestRunner testRunner = new TestRunner();
        testRunner.runTests(new Test());
    }
}