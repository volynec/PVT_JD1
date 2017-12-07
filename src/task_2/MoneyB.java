package task_2;

import java.util.Scanner;

/**
 * Created by user on 25.11.2017.
 */
public class MoneyB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            System.out.println("You did not enter an integer");
            System.exit(0);
        }
        if (number < 0) {
            System.out.println("Please enter a positive number!");
            System.exit(0);
        }
        String money = "";
        int lastNumber = number % 10;
        sc.close();

        if (number >= 5 && number <= 20) {
            money = "Рублей";
        } else if (lastNumber == 1) {
            money = "Рубль";
        } else if (lastNumber > 1 & lastNumber < 5) {
            money = "Рубля";
        }

        switch (money) {
            case "Рублей":
                System.out.println(number + " " + money);
                break;
            case "Рубль":
                System.out.println(number + " " + money);
                break;
            case "Рубля":
                System.out.println(number + " " + money);
                break;
            default:
                System.out.println(number + " Рублей");
        }
    }
}

