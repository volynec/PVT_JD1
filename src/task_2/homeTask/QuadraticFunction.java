package task_2.homeTask;

import java.util.Scanner;

/**
 * . Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли данные.
 Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
 При решении создать и использовать следующие вынесенные функции:
 - функция isPositive, определяющая, является ли число положительным
 - функция isZero, определяющая, является ли число нулём
 - функция discriminant, вычисляющая дискриминант

 */
public class QuadraticFunction {
    public static void main(String[] args) {
        System.out.println("Calculate the roots of a quadratic equation of the form");
        System.out.println("ax^2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = checkIsZero();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();

        double D = discriminant(a, b, c);
        if (isPositive(D)) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("The roots of equation: x1 = " + x1 + ", x2 = " + x2);
        } else if (isZero(D)) {
            double x;
            x = -b / (2 * a);
            System.out.println("The equation has a single root: x = " + x);
        } else
            System.out.println("The equation has no real roots!");
    }

    public static boolean isZero(double num) {
        return num == 0;
    }

    public static boolean isPositive(double num) {
        return num < 0;
    }

    public static double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double checkIsZero() {
        Scanner sc = new Scanner(System.in);
        double number;
        do {
            System.out.println("a: can not be zero");
            while (!sc.hasNextDouble()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number == 0);

        return number;
    }
}
