package task_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 27.12.2017.
 */
public class PracticeTwo {
    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        for (String value : map.values()) {
            set.add(value);
        }
        return map.size() == set.size();
    }


    public static void main(String[] args) {
        Map<String, String> mapOne = new HashMap<>();
        mapOne.put("Marty", "Stepp");
        mapOne.put("Stuart", "Reges");
        mapOne.put("Jessica", "Miller");
        mapOne.put("Amanda", "Camp");
        mapOne.put("Hal", "Perkins");

        Map<String, String> mapTwo = new HashMap<>();
        mapTwo.put("Kendrick", "Perkins");
        mapTwo.put("Stuart", "Reges");
        mapTwo.put("Jessica", "Miller");
        mapTwo.put("Bruce", "Reges");
        mapTwo.put("Hal", "Perkins");

        System.out.println("Same values is: " + isUnique(mapOne));
        System.out.println("Same values is: " + isUnique(mapTwo));
    }
}
