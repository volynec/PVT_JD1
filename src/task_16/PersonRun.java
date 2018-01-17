package task_16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.01.2018.
 */
public class PersonRun {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(63, "Александр", "Лукашенко"));
        persons.add(new Person(65, "Владимир", "Путин"));
        persons.add(new Person(71, "Дональд ", "Трамп"));
        persons.add(new Person(52, "Пётр", "Порошенко"));
        persons.add(new Person(63, "Ангела", "Меркель"));
        persons.stream()
                .sorted((p1, p2) ->  p2.getAge()-p1.getAge())
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .filter(fullName -> fullName.length() < 15)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
