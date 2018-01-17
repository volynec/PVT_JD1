package task_13;

/**
 * Created by user on 04.01.2018.
 *
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры, например <p id ="p1">,
 и замену их на простые теги абзацев <p>.

 */
public class PracticeThree {
    public static void main(String[] args) {
        String s = "<p id=\"p1\">This is a paragraph.</p>";
        String r = s.replaceAll("<p.*?>", "<p>");
        System.out.println(r);
    }
}