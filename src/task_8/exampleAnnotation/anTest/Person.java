package task_8.exampleAnnotation.anTest;

/**
 * Created by user on 20.12.2017.
 */
public class Person {

    @MyAnnotation(maxLength = 10)
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
