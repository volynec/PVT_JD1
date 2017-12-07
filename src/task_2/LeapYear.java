package task_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 4*. Написать программу, которая считывает число, месяц и год, введённые пользователем в виде трёх целых чисел.
 Программа должна определять, является ли введённая дата реальной и выводить результат.
 Использовать следующую информацию:
 Январь, март, май, июль, август, октябрь, декабрь - 31 день
 Апрель, июнь, сентябрь, ноябрь - 30 дней
 Февраль - 28 дней в обычный год, 29 дней в високосный

 */
public class LeapYear {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        int day = 0;
        int month = 0;
        int year = 0;
        if (sc.hasNextInt()) {
            day = sc.nextInt();
            System.out.println("Enter month");
            month = sc.nextInt();
            System.out.println("Enter year");
            year = sc.nextInt();
        } else {
            System.out.println("You did not enter an integer");
            System.exit(0);
        }
        if (month > 12)
            System.out.println("Date incorrectly entered");
        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                if (day != 0 & day <= 29) {
                    showResult(day, month, year);
                } else {
                    System.out.println("Date incorrectly entered");
                }
            } else if (day != 0 & day <= 28) {
                showResult(day, month, year);
            } else {
                System.out.println("Date incorrectly entered");
            }
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day != 0 & day <= 31) {
                showResult(day, month, year);
            } else {
                System.out.println("Date incorrectly entered");
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day != 0 & day <= 30) {
                showResult(day, month, year);
            } else {
                System.out.println("Date incorrectly entered");
            }
        }

    }

    private static void showResult(int day, int month, int year) throws ParseException {
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("dd.MM.yyyy");
        Date date = simpleDateFormat.parse(day + "." + month + "." + year);
        System.out.println( simpleDateFormat.format(date));
    }
}

