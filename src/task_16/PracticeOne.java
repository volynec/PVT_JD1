package task_16;

import java.util.Arrays;

/**
 * Created by user on 14.01.2018.
 * 1.	Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
 */
public class PracticeOne {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        double average = Arrays.stream(arr)
                .filter(n -> n % 5 == 0)
                .mapToDouble(n -> n)
                .average().getAsDouble();
        System.out.println(average);
    }
}
