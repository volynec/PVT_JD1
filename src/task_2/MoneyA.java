package task_2;

import java.util.Scanner;

/**
 * 2. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").
 * a. Использовать конструкцию if-else.
 * b. Модифицировать в switch в отдельном файле.
 */
public class MoneyA {
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
        if (number <0){
            System.out.println("Please enter a positive number!");
            System.exit(0);
        }
            int lastNumber = number % 10;
        sc.close();
        if (number >= 5 && number <= 20) {
            System.out.println(number + " Рублей");
        } else if (lastNumber == 1) {
            System.out.println(number + " Рубль");
        } else if (lastNumber > 1 & lastNumber < 5) {
            System.out.println(number + " Рубля");
        } else {
            System.out.println(number + " Рублей");
        }

    }
}
