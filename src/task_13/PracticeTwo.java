package task_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 03.01.2018.
 * <p>
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
 * с помощью регулярных выражений и выводящую их на страницу.
 */
public class PracticeTwo {
    public static void main(String[] args) {
        String s = "0x800f081f Ошибка 0xc000021a что это как с ним бороться?";
        Pattern p = Pattern.compile("0[xX]([0-9A-Fa-f]{2})*\\b");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
