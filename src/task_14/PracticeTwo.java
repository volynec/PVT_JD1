package task_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 08.01.2018.
 * <p>
 * Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 */
public class PracticeTwo {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/task_14/input.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                String[] words = str.split("[\\s,.:!?]+");
                Pattern pattern = Pattern.compile("^[аоэиуыеёюя]");
                for (String word : words) {
                    Matcher matcher = pattern.matcher(word.toLowerCase());
                    if (matcher.find()) {
                        System.out.println(word);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
