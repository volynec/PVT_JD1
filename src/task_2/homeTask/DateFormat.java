package task_2.homeTask;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 1. Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 Вывести дату следующего дня в формате "День.Месяц.Год".
 Учесть переход на следующий месяц, а также следующий год.
 Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.

 */
public class DateFormat {
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static void main(String[] args) throws ParseException {

        System.out.println("Enter day");
        int day = inputNumber();
        System.out.println("Enter month");
        int month = inputNumber();
        System.out.println("Enter year");
        int year = inputNumber();
        int dayMax = 0;

        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                dayMax = 31;
                break;

            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                dayMax = 30;
                break;

            case FEBRUARY:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    dayMax = 29;
                } else {
                    dayMax = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        if (day != dayMax) {
            day++;
        } else {
            day = 1;
            if (month == DECEMBER) {
                year++;
                month = 1;
            } else {
                month++;
            }
        }

        if (day > dayMax) {
            System.out.println("Invalid date");
            System.exit(0);
        }

        System.out.println(formatDate(day, month, year));
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
        } while (number <= 0);

        return number;
    }

    public static String formatDate(int day, int month, int year) throws ParseException {

        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("dd.MM.yyyy");
        Date date = simpleDateFormat.parse(day + "." + month + "." + year);

        return  simpleDateFormat.format(date);
    }
}





