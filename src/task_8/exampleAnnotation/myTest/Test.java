package task_8.exampleAnnotation.myTest;

/**
 * Created by user on 20.12.2017.
 */
public class Test {
    @MyTest
    public void firstTest() {
        System.out.println("Running first testGeneric");
    }

    @MyTest
    public void secondTest() {
        System.out.println("Running 2nd testGeneric");
    }

    public void thirdTest() {
        System.out.println("Running 3rd testGeneric");
    }

    private void helperMethod() {
        System.out.println("I am helper method");
    }
}
