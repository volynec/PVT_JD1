package task_12;

/**
 * Created by user on 03.01.2018.
 * Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
 */
public class PracticeFive {
    public static void main(String[] args) {
        String text = "Подсчитать     количество  слов         в  тексте.  Учесть, что  слова    могут разделяться  несколькими               пробелами.";

        while (text.contains("  ")) {
            String replace = text.replace("  ", " ");
            text = replace;
        }

        String[] textArray = text.split(" ");
        System.out.println(text);
        System.out.println("Number of words in the text is: "+textArray.length);
    }
}
