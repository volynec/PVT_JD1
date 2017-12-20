package task_8.exampleAnnotation.anTest;

import java.lang.reflect.Field;

/**
 * Created by user on 20.12.2017.
 */
public class MyAnnotationHanlder {
    public void handle(Object ob) throws Exception {
        Field[] fields = ob.getClass().getFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(MyAnnotation.class)) {

                MyAnnotation myAnn = field.getAnnotation(MyAnnotation.class);
                int maxLen=myAnn.maxLength();
                System.out.println("Max length is:"+maxLen);
                if(maxLen<field.get(ob).toString().length()){
                    throw new Exception("You have eneterd string greater than max length."+maxLen);
                }

            }
        }
    }
}
