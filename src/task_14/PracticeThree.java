package task_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 08.01.2018.
 * <p>
 * Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова совпадает с первой буквой следующего слова
 */
public class PracticeThree {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/task_14/input.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                String[] words = str.split("[\\s,.:!?]+");
                for (int i = 0; i <words.length-1 ; i++) {
                    if (words[i].charAt(words[i].length()-1)==words[i+1].charAt(0)){
                        System.out.println(words[i]);
                        System.out.println(words[i+1]);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
