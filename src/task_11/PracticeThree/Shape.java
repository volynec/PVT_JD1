package task_11.PracticeThree;

/**
 * Created by user on 29.12.2017.
 * <p/>
 * 3.	Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
 */
public class Shape {

    public int getAreaValue(int x, int y) throws CustomShapeException {
        if (x < 0 | y < 0) throw new CustomShapeException(x, y);
        return x * y;
    }

}
