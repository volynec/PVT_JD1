package task_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 22.12.2017.
 */
public class MySortedList {


    public List<Integer> list = new ArrayList<>();

    public List<Integer> getSomeIntegerList() {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100 - 50));
        }
        return list;
    }


    public static void main(String[] args) {
        MySortedList mySortedList = new MySortedList();
        List <Integer> list = mySortedList.getSomeIntegerList();
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer numberFirst, Integer numberSecond) {
                return numberFirst.compareTo(numberSecond);
            }
        });
        System.out.println(list);

    }
}

