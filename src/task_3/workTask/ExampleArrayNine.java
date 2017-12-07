package task_3.workTask;

/**
 * Created by user on 29.11.2017.
 * . Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class ExampleArrayNine {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1000);
        for (int i = 2; i <(int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " This number is not simple!!!");
                return;
            }
        }
        System.out.println(number + " It's simple!");
    }
}

