package task_2;

import java.util.Scanner;

/**
 * 1. Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
 Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
 Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
 Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length()

 */
public class ConsoleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String firstWord = sc.next();
        System.out.println("Enter the second word: ");
        String secondWord = sc.next();
        sc.close();
        if (firstWord.equals(secondWord)) {
            System.out.println("Excellent! The words are the same.");
        } else if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("Good. The words are almost same");
        } else if (firstWord.length() == secondWord.length()) {
            System.out.println("The words of the same length");
        } else {
            System.out.println("The words are different. Try again.");
        }


    }
}
