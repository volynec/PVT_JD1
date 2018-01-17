package task_9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.12.2017.
 * <p>
 * 5.	Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.
 */
public class ListCollection {
    public List<Integer> listRetainAll(List<Integer> first, List<Integer> second) {
            List<Integer> result = new ArrayList<>(first);
            result.retainAll(second);
            return result;
    }

    public List<Integer> listRemoveAll(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>(first);
        result.removeAll(second);
        return result;
    }

    public static void main(String[] args) {
        ListCollection listCollection = new ListCollection();
        List<Integer> listFirst = new ArrayList<>();
        listFirst.add(1);
        listFirst.add(2);
        listFirst.add(3);
        listFirst.add(4);
        listFirst.add(5);
        List<Integer> listSecond = new ArrayList<>();
        listSecond.add(9);
        listSecond.add(8);
        listSecond.add(7);
        listSecond.add(6);
        listSecond.add(5);
        listSecond.add(4);

        System.out.println(listFirst);
        System.out.println(listSecond);

        System.out.println(listCollection.listRetainAll(listFirst, listSecond));
        System.out.println(listCollection.listRemoveAll(listSecond, listFirst));
    }
}
