package task_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by user on 15.01.2018.
 * 4.	Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
 Пример: список {5, 2, 4, 2, 1}
 Результирующая строка: "52421"

 */
public class PracticeFour {
    public static void main(String[] args) {
        int [] array = {5, 2, 4, 2, 1};
        String result = Arrays.stream(array)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
