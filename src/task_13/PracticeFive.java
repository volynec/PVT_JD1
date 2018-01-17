package task_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 05.01.2018.
 *
 * Написать метод, который проверяет, является ли строка адресом IPv4.
 */
public class PracticeFive {
    public static void main(String[] args) {
        String s = "2.168.1.100";
        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        Matcher matcher = pattern.matcher(s);
        boolean found = matcher.matches();
        if (found) {
            System.out.println("Check");
            System.out.println(matcher.group());
        } else {
            System.out.println("Check failed");
        }
    }
}
