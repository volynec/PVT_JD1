package task_11;

/**
 * Created by user on 30.12.2017.
 */
public class PracticeFiveExample {
    static void divide() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            try {
                int[] a = new int[10];
                a[11] = 100;
            } catch (Exception e1) {
                e1.initCause(e);
                throw e1;
            }
        }
    }

    public static void main(String[] args) {
        try {
            divide();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Cause for this exception is " + e.getCause());
        }
    }
}
