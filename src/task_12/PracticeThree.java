package task_12;

/**
 * Created by user on 02.01.2018.
 * Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class PracticeThree {
    public static boolean checksString(String sentence, String word) {
        if (sentence.startsWith(word) & sentence.endsWith(word))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        String sentence = "Молчит Закон — народ молчит";
        String word = "Молчит";
        System.out.println("Предложение \"" + sentence + "\" Проаподозис? " + checksString(sentence.toLowerCase(), word.toLowerCase()));


    }
}
