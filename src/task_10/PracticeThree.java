package task_10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 27.12.2017.
 */
public class PracticeThree {
    public static void main(String[] args) {
        Map<Integer, Integer> mapOne = new HashMap<>();
        mapOne.put(6, 3);
        mapOne.put(5, 2);
        mapOne.put(2, 1);
        mapOne.put(0, 3);

        Map<Integer, Integer> mapTwo = new HashMap<>();
        mapTwo.put(6, -5);
        mapTwo.put(4, 1);
        mapTwo.put(2, 3);
        mapTwo.put(1, 5);

        for (Map.Entry<Integer, Integer> entry : mapOne.entrySet()) {
            Integer map1_key = entry.getKey();
            Integer map1_value = entry.getValue();
            if (mapTwo.containsKey(map1_key)) {
                Integer map2_value = mapTwo.get(map1_key);
                mapTwo.put(map1_key, map1_value + map2_value);
            } else {
                mapTwo.put(map1_key, map1_value);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapTwo.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.print(0 + " ");
            } else if (entry.getValue() == 1) {
                System.out.print("x^" + entry.getKey() + " ");
            } else if (entry.getKey() == 1) {
                System.out.print(entry.getValue() + "x ");
            } else if (entry.getKey() == 0) {
                System.out.print(entry.getValue() + " ");
            } else {
                System.out.print(entry.getValue() + "x^" + entry.getKey() + " ");
            }
        }
    }
}
