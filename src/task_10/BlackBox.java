package task_10;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by user on 27.12.2017.
 */
public class BlackBox {
    public static NavigableSet<Integer> blackSet;

    public static void main(String[] args) {
        blackSet = new TreeSet<>();
        blackSet.add(15);
        blackSet.add(0);
        blackSet.add(-8);
        blackSet.add(-8);
        blackSet.add(-8);
        blackSet.add(-8);
        blackSet.add(-8);
        blackSet.add(6);
        blackSet.add(6);
        blackSet.add(6);
        blackSet.add(32);
        blackSet.add(-29);
        blackSet.add(-29);
        blackSet.add(-29);
        blackSet.add(-22);
        blackSet.add(-38);
        blackSet.add(1);
        blackSet.add(33);
        blackSet.add(4);
        blackSet.add(-27);

        System.out.println("Black box numbers:");
        for (int number : blackSet) {
            System.out.print(number + " | ");
        }

        System.out.println();
        Integer minNumber = getMinNumber(20);
        Integer maxNumber = getMaxNmuber(20);
        if (minNumber != null) {
            System.out.println("K-th by the minimum number: " + minNumber);
        } else {
            System.out.println("There is no such element");
        }
        if (maxNumber != null) {
            System.out.println("N-th by the maximality of the element: " + maxNumber);
        } else {
            System.out.println("There is no such element");
        }


    }

    public static Integer getMinNumber(int number) {
        return getElementByIndex(blackSet.iterator(), number);

    }

    private static Integer getElementByIndex(Iterator<Integer> iterator, int number) {
        int i =1;
        while (iterator.hasNext()) {
            int setElement = iterator.next();
            if (i == number) {
                return setElement;
            }
            i++;
        }
        return null;
    }

    public static Integer getMaxNmuber(int number) {
        return getElementByIndex(blackSet.descendingSet().iterator(), number);
    }

}
