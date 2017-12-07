package task_3.workTask;

import java.util.Arrays;

/**
 * Created by user on 28.11.2017.
 * 4. Создать массив из 4 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class ExampleArrayFour {
    public static void main(String[] args) {
        boolean isActive = true;
        int array[] = new int[4];
        int count =0;
        while (isActive) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 90 + 10);
                count++;
            }
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isActive = true;
                    break;
                } else {
                    isActive = false;
                }
            }
        }
        isActive = true;
        System.out.println(Arrays.toString(array) + " Array is ascending: " + isActive + " on the "+count+" try");
    }
}



