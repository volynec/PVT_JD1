package task_14;

import java.io.*;
import java.util.*;

/**
 * Created by user on 09.01.2018.
 * Записать в двоичный файл 20 случайных чисел типа int. Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */
public class PracticeFive {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("FileOutputStream: "+ Arrays.toString(array));
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/task_14/output.txt"))) {
            for (int num : array) {
                dos.writeInt(num);
            }
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src/task_14/output.txt"))) {
            List<Integer> list = new ArrayList<>();
            while (dis.available() > 0) {
                list.add(dis.readInt());
            }
            OptionalDouble average = list.stream().mapToInt(a->a).average();

            System.out.println("FileInputStream: " +list);
            System.out.println("average: " + average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
