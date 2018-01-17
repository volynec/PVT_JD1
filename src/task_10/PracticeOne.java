package task_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 26.12.2017.
 */
public class PracticeOne {
    public static void main(String[] args) {
        List list = new ArrayList();
        List<Integer> listIntegers = new ArrayList<>();
        listIntegers.add(3);
        listIntegers.add(7);
        listIntegers.add(3);
        listIntegers.add(-1);
        listIntegers.add(2);
        listIntegers.add(3);
        listIntegers.add(7);
        listIntegers.add(2);
        listIntegers.add(15);
        listIntegers.add(15);
        System.out.println("The  number of unique integers in list: " + countUnique(list));
        System.out.println("The  number of unique integers in list: " + countUnique(listIntegers));
    }

    public static int countUnique(List<Integer> list) {
        Set<Integer> integerSet = new HashSet<>(list);
        return integerSet.size();
    }
}
