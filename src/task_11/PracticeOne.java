package task_11;

/**
 * Created by user on 29.12.2017.
 * <p/>
 * 1.	Объявите переменную со значением null. Вызовите метод у этой переменной.
 * Отловите возникшее исключение.
 */
public class PracticeOne {
    public static void main(String[] args) {
        String str = null;
        try {
            str.length();
        } catch (RuntimeException e) {
            System.err.println("str.length is null");
            str = "";
        }
        System.out.println("Continue work");
        str.length();
    }
}
