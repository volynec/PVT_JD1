package task_3.workTask;

import java.util.Arrays;

/**
 * 3. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */
public class ExampleArrayThree {
    public static void main(String[] args) {
        int array[] = new int[10];
        int indexOfMin = 0;
        int indexOfMax = 0;
        int amountBetweenMaxMini = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ", ");
        }

        int valueOfMin = array[0];
        int valueOfMax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= valueOfMax) {
                indexOfMax = i;
                valueOfMax = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= valueOfMin) {
                indexOfMin = i;
                valueOfMin = array[i];
            }
        }
        System.out.println("\n" + "Minimum value of the array: " + valueOfMin);
        System.out.println("Minimum index of the array: " + indexOfMin);
        System.out.println("Maximum value of the array: " + valueOfMax);
        System.out.println("Maximum index of the array: " + indexOfMax);
        if (indexOfMin < indexOfMax) {
            for (int i = indexOfMin + 1; i < indexOfMax; i++) {
                amountBetweenMaxMini += array[i];
            }
        } else {
            for (int i = indexOfMax + 1; i < indexOfMin; i++) {
                amountBetweenMaxMini += array[i];
            }
        }

        System.out.println("The addition of array elements located between the minimum and maximum values: " + amountBetweenMaxMini);
        System.out.println(Arrays.toString(sortArray(array)));
    }
    public static int[] sortArray(int[]array){
        for (int i = (array.length-1); i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

}
