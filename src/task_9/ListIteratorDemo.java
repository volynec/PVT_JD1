package task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by user on 20.12.2017.
 */
public class ListIteratorDemo {
    public List<Integer> list = new ArrayList<>();
    public List <String> stringList = new ArrayList<>();

    public List<Integer> getSomeListRatings() {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
        return list;
    }

    public List <String> getSomeStudentList(){
        stringList.add("Дмитрий");
        stringList.add("Вадим");
        stringList.add("Иван");
        stringList.add("Руслан");
        stringList.add("Виталий");
        stringList.add("Вадим");
        stringList.add("Антон");
        stringList.add("Сергей");
        stringList.add("Тимур");
        stringList.add("Николай");
        stringList.add("Юрий");
        stringList.add("Егор");
        return stringList;
    }



    public void printList(List<?> list){
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            System.out.print(element + " ");
        }
        System.out.println( );
    }

     public List<Integer> removeUnsatisfactoryGrades(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int element = listIterator.next();
            if (element < 5) {
                listIterator.remove();
            }
        }
        return list;
    }

    public int highestScore(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        Integer candidate = listIterator.next();
        while (listIterator.hasNext()) {
            Integer element = listIterator.next();
            if (element.compareTo(candidate) > 0)
                candidate = element;
        }
        return candidate;
    }
    public void reverseList(List <String> list){
        ListIterator <String> listIterator =list.listIterator();
        while(listIterator.hasNext()){
            listIterator.next();
        }
        while (listIterator.hasPrevious()){
            System.out.print (listIterator.previous()+ " ");
        }
        System.out.println();
    }

}


