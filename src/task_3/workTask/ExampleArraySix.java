package task_3.workTask;

import java.util.Arrays;

/**
 * Created by user on 29.11.2017.
 * Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 * 2-х двумерных массивов.
 */
public class ExampleArraySix {
    public static void main(String[] args) {
        int arrayA[][] = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        int arrayB[][] = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        System.out.println("ArrayA:");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                System.out.print(arrayA[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("ArrayB:");
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB[i].length; j++) {
                System.out.print(arrayB[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Array  equals is: " + equalsDimensionalArray(arrayA, arrayB));
    }

    public static boolean equalsDimensionalArray(int[][] arrayA, int[][] arrayB) {
        if (arrayA == null || arrayB == null)
            return false;
        if (arrayA.length != arrayB.length)
            return false;
        for (int i = 0; i < (arrayA.length); i++) {
            if ((arrayA[i].length != arrayB[i].length))
                return false;
        }
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if ((arrayA[i][j] != arrayB[i][j]))
                    return false;
            }
        }
        return true;
    }
}
