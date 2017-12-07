package task_3.workTask;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 29.11.2017.
 * Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.
 * Вывести результат в формате "Карта of Масть". Например, "AceofSpades".
 * Валет - Jack, Дама - Queen, Король - King, Туз - Ace, Червы - Hearts, Пики - Spades, Трефы - Clubs, Бубны - Diamonds
 */
public class ExampleArraySeven {
    public static void main(String[] args) {
        int count = 0;
        String aceo[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "Король", "Ace"};
        String spades[] = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String cardDeck[] = new String[52];
        for (int i = 0; i < aceo.length; i++) {
            for (int j = 0; j < spades.length; j++) {
                cardDeck[count] = aceo[i] + " of "+spades[j];
                count++;
            }
        }
        System.out.println(Arrays.toString(cardDeck));
        System.out.println(cardDeck[(int) (Math.random() * 52)]);
        shuffleArray(cardDeck);
    }

    public static void shuffleArray(String[] cardDeck) {
        Random random = new Random();
        for (int i = cardDeck.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = cardDeck[index];
            cardDeck[index] = cardDeck[i];
            cardDeck[i] = temp;
        }
        System.out.println(Arrays.toString(cardDeck));
    }
}
