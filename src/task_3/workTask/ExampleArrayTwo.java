package task_3.workTask;

/**
 * 2. Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
 */
public class ExampleArrayTwo {
    public static void main(String[] args) {
        int count = 0;
        int array[] = new int[12];
        for (int i = 1; i < 100; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                array[count] = i;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ":");
        }
    }
}
