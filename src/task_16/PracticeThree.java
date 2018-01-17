package task_16;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 14.01.2018.
 * 3.	Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
 */
public class PracticeThree {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Найти", 1);
        map.put("сумму", 2);
        map.put("всех", 3);
        map.put("значений", 4);
        map.put("длина", 5);
        map.put("ключей", 6);
        map.put("которых", 7);
        map.put("меньше", 8);
        map.put("семи", 9);
        map.put("символов", 11);

        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(entry -> entry.getValue())
                .sum();
        System.out.println(sum);
    }
}
