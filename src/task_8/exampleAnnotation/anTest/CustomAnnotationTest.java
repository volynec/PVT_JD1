package task_8.exampleAnnotation.anTest;

/**
 * Created by user on 20.12.2017.
 */
public class CustomAnnotationTest {
    public static void main(String[] args) throws Exception {
        MyAnnotationHanlder parser = new MyAnnotationHanlder();
        Person person= new Person();
        person.setName("CONCRETEPAGE");
        parser.handle(person);
    }
}
