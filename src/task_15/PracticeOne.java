package task_15;

import java.io.*;

/**
 * Created by user on 10.01.2018.
 * 1.	Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого и не буфиризированого символьного ввода вывода.
 */
public class PracticeOne {
    public static long iStream() {
        long start;
        long end;

        start = System.nanoTime();
        try (FileOutputStream out = new FileOutputStream("src/task_15/output.txt")) {
            for (int i = 0; i < 5242880; i++) {
                out.write(1);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileInputStream in = new FileInputStream("src/task_15/output.txt")) {
            int c;
            while ((c = in.read()) != -1) {
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        end = System.nanoTime();
        return start - end;
    }

    public static long buffStream() {
        long start;
        long end;

        start = System.nanoTime();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/task_15/outputBuff.txt"))) {
            for (int i = 0; i < 5242880; i++) {
                out.write(1);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/task_15/outputBuff.txt"))) {
            int c;
            while ((c = in.read()) != -1) {
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        end = System.nanoTime();
        return start - end;
    }

    public static void main(String[] args) {
        System.out.println("Time of operation iStream: " + iStream());
        System.out.println("Time of operation buffStream: " + buffStream());

    }
}
