package task_4;

import java.util.Scanner;


public class XXX {

    public static void main(String[] args) {
        int money = inputNumber();

        if ((money % 100 == 10 || money % 100 == 30 || money % 100 == 50 || money % 100 == 70 || money % 100 == 90)
                && money >= 100) {
            int tempAmount = money - 50;

            int twentiesCount = 0;
            int twenties_remainder;
            int fiftiesCount;
            int hundredsCount;

            for (; ; ) {
                tempAmount = tempAmount - 20;
                twentiesCount++;
                if (tempAmount == 0) {
                    break;
                }
            }

            hundredsCount = twentiesCount / 5;
            twenties_remainder = twentiesCount % 5;
            fiftiesCount = hundredsCount * 2;

            System.out.println(String.format("Possible: 1x%s %sx20", 20, twentiesCount));
            if (hundredsCount > 0) {
                System.out.println(String.format("Possible: 1x%s %sx100 %sx20",20, hundredsCount, twenties_remainder));
                System.out.println(String.format("Possible: 1x%s %sx50 %sx20", 20, fiftiesCount, twenties_remainder));
            }
        } else if (money % 10 == 0 && money >= 100) {
            int twentiesCount = 0;
            int twenties_remainder;
            int fiftiesCount;
            int hundredsCount;

            for (; ; ) {
                money = money - 20;
                twentiesCount++;
                if (money == 0) {
                    break;
                }
            }

            hundredsCount = twentiesCount / 5;
            twenties_remainder = twentiesCount % 5;
            fiftiesCount = hundredsCount * 2;

            if (hundredsCount > 0) {
                System.out.println(String.format("Possible: %sx100 %sx20", hundredsCount, twenties_remainder));
                System.out.println(String.format("Possible: %sx50 %sx20", fiftiesCount, twenties_remainder));
            }
        } else if (money < 100) {
            //TODO: addition logic
            //TODO: check odd
        } else if (money % 10 != 0) {
            throw new IllegalStateException(".xxx");
        }
    }

    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0);

        return number;
    }
}
