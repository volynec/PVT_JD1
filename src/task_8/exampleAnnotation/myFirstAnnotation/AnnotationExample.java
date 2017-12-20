package task_8.exampleAnnotation.myFirstAnnotation;

/**
 * Created by user on 20.12.2017.
 */

import java.lang.reflect.Method;


public class AnnotationExample {

    @MyFirstAnnotation(value = "DOACTION")
    public void doBatting() {
        System.out.println("Batting performed");
    }

    public void doBowling() {
        System.out.println("Bowling performed");
    }

    public static void main(String[] args) throws Exception {
        {
            AnnotationExample anExample = new AnnotationExample();
            Method[] methodsArray = anExample.getClass().getMethods();
            for (int i = 0; i < methodsArray.length; i++) {
                Method method = methodsArray[i];
                if (method.isAnnotationPresent(MyFirstAnnotation.class)) {
                    MyFirstAnnotation myAnnObject = (method.getAnnotation(MyFirstAnnotation.class));
                    System.out.println("My annotation value:" + myAnnObject.value());
                    method.invoke(anExample, null);
                }
            }
        }
    }
}

