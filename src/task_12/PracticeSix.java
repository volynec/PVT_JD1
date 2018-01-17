package task_12;

/**
 * Created by user on 03.01.2018.
 * . Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 * <p>
 * Пример: aaabbcdeef ->abcdef
 */
public class PracticeSix {
    public static void main(String[] args) {
        String text = "aaabbcdeeff";
        System.out.println(text + " - " + replaceDuplicates(text));
//        text = text.replaceAll("([a-z])\\1+", "$1");
    }

    private static String replaceDuplicates(String text) {
        if (text == null | text.length() < 2)
            return text;
        char[] textArray = text.toCharArray();
        int j = 0;
        for (int i = 0; i < textArray.length - 1; i++) {
            j++;
            if (textArray[i] == textArray[j]) {
                textArray[i] = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : textArray) {
            if (c != 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
