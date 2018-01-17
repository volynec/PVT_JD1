package task_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 08.01.2018.
 * <p>
 * Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 */
public class PracticeFour {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/task_14/input.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                String[] words = str.split("[\\s,.:!?]+");
                Pattern pattern = Pattern.compile("\\b\\d+\\b");
                List<Integer> list = new ArrayList<>();
                for (String word : words) {
                    Matcher matcher = pattern.matcher(word);
                    if (matcher.find()) {
                         list.add(Integer.parseInt(word));
                    }
                }
                System.out.println(Collections.max(list));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
