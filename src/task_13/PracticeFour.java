package task_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 04.01.2018.
 *
 * Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
 и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
 X - код оператора
 Y - номер телефона

 */
public class PracticeFour {
    public static void main(String[] args) {
        String s = "+375293154444 +375293155555 ИП Плешко А.А. УНП: 192452682 Доставка по Минску БЕСПЛАТНО! Работаем по всей РБ! " +
                "1. Сосна \"Канадская\" 1.2 м. 60руб 1.5м. 73руб 1.8м. 97руб 2.2м. 109руб 2.5 м 160руб " +
                "2. Сосна \"Кедр\" 1.2 м. - 60руб 1.5м. - 73ру";
        Pattern pattern = Pattern.compile("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(s);
        String result = matcher.replaceAll("$1($2)$3-$4-$5");
        System.out.println(result);

    }
}
