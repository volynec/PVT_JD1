package task_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by user on 08.01.2018.
 * <p>
 * Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */
public class PracticeOne {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/task_14/input.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
