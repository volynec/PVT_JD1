package task_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 03.01.2018.
 * <p>
 * Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
 * В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */
public class PracticeOne {
    public static void main(String[] args) {
        String email = "example@gmail.com";
        Pattern pattern = Pattern.compile("\\b[A-Za-z][A-Za-z0-9_]+@[A-Za-z0-9_]+\\.(org|com)\\b");
        Matcher matcher = pattern.matcher(email);
        boolean found = matcher.matches();
        if (found) {
            System.out.println("Check");
            System.out.println(matcher.group());
        } else {
            System.out.println("Check failed");
        }
    }
}
