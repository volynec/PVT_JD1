package task_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by user on 14.01.2018.
 * <p>
 * 2.	Дан список строк. Найти количество уникальных строк длиной более 8 символов.
 */
public class PracticeTwo {
    public static void main(String[] args) {
        String str = "Дан список строк. Найти количество уникальных строк длиной более 8 символов.";
        String[] words = str.toLowerCase().split("[\\s,.:!?]+");
        List<String> list = new ArrayList<>(Arrays.asList(words));
        System.out.println("Before: " + list);
        List<String> modList = list.stream()
                .distinct()
                .filter(word -> word.length() > 8)
                .collect(Collectors.toList());
        System.out.println("After: " + modList);

    }
}
