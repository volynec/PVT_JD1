package task_11;

/**
 * Created by user on 01.01.2018.
 */
public class PracticeSix {
    public static void main(String[] args) {
        int number = -1 + (int) (Math.random() * 3);
        int[] array = new int[1];
        try {
            int result = 10 / number;
            int[] arr = new int[number];
            array[number] = 2;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (NegativeArraySizeException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("every time");
        }
        System.out.println("end");
    }
}
