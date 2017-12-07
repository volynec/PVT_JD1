package task_3.workTask;

/**
 * Created by user on 28.11.2017.
 * Создать двухмерный квадратный массив, и заполнить его "бабочкой", т.е. таким образом:
 * <p>
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 * <p>
 * Вывести его на экран, заменив 1 символом *, а 0 - пробелом.
 */
public class ExampleArrayFive {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        int i;
        int j;

        for (i = 0; i < array.length / 2 + 1; i++) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i)))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        for (i = array.length - 1; i >= array.length / 2 + 1; i--) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
