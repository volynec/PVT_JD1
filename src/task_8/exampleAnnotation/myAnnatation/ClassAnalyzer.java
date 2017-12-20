package task_8.exampleAnnotation.myAnnatation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by user on 20.12.2017.
 */
public class ClassAnalyzer {
    public static void analyze(Object object) {
        Class aClass = object.getClass();
        analyze(aClass);
    }
@Deprecated
    public static void analyze(Class aClass) {
        System.out.println("This object is: " + aClass);
        System.out.println(" Field"+"\n" );
        Field [] fields = aClass.getDeclaredFields();
        for (Field field :fields) {
            System.out.println( field);
        }
        System.out.println(" Method"+"\n" );
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method);
        }
        System.out.println(" Constructor"+"\n" );
        Constructor []  constructors =aClass.getDeclaredConstructors();
        for (Constructor  constructor: constructors){
            System.out.println(constructor);
        }
        System.out.println(" Annotation"+"\n" );
        Annotation [] annotations = aClass.getDeclaredAnnotations();
        for (Annotation annotation: annotations){
            System.out.println(annotation);
        }
    }


}
