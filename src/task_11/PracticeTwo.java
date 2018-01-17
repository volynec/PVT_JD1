package task_11;

/**
 * Created by user on 29.12.2017.
 * <p/>
 * 2.	Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */
public class PracticeTwo {
    public static void main(String[] args) {
        int[] array = new int[1];
        try {
            array[2] = 2;
        } catch (RuntimeException e) {
            e.printStackTrace();


        }
        System.out.println("Continue work");
    }
}
