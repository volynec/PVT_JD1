package task_9;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by user on 22.12.2017.
 *
 * 6.	Имеется текст. Следует составить для него частотный словарь.
 *
 */
public class FrequencyCounter {
    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<>();
        String text = " Denise sees the fleece,Denise sees the fleas. At least Denise could sneeze and feed and freeze the fleas. ";
        text = text.toLowerCase();
        text = text.replaceAll("\\p{Punct}"," ");
        Scanner scanner = new Scanner(text);
        while (scanner.hasNext()) {
            String word = scanner.next().trim();
            Integer count = words.get(word);
            if (count != null) {
                count++;
                words.put(word, count);
            } else {
                count = 1;
                words.put(word, count);
            }
        }
        scanner.close();
        System.out.println(words);
    }
}
