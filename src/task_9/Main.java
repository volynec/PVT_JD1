package task_9;

import java.util.*;

/**
 * Created by user on 21.12.2017.
 *
 1.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 2.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
 3.	Вывести учеников из списка в обратном порядке. (2 варианта решения).
 *
 */
public class Main {
    public static void main(String[] args) {

        ListIteratorDemo listIteratorDemo = new ListIteratorDemo();
        System.out.println("list of pupils' grades:");
        List<Integer> studentRatings = listIteratorDemo.getSomeListRatings();
        listIteratorDemo.printList(studentRatings);
        System.out.println("list of satisfactory marks  of students:");
        listIteratorDemo.removeUnsatisfactoryGrades(studentRatings);
        listIteratorDemo.printList(studentRatings);
        System.out.println("high mark is: " + listIteratorDemo.highestScore(studentRatings));
        System.out.println("list of students:");
        List<String> studentList = listIteratorDemo.getSomeStudentList();
        listIteratorDemo.printList(studentList);
        System.out.println("list of students in the reverse order:");
        listIteratorDemo.reverseList(studentList);
         Collections.reverse(studentList);
        System.out.println("list of students in the reverse order v2:");
        listIteratorDemo.printList(studentList);



    }
}
