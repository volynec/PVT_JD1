package task_3.workTask;

import java.math.BigInteger;

import static task_2.homeTask.DateFormat.inputNumber;

/**
 * Created by user on 29.11.2017.
 * Написать алгоритм расчета факториала , используя циклы (for и while).
 */
public class ExampleArrayTen {
    public static void main(String[] args) {
        int number = inputNumber();
        BigInteger numberFactarial = isFactarial(number);
        System.out.println("Factorial: " + number + " is: "+ numberFactarial);
    }

    public static BigInteger isFactarial(int number) {

        BigInteger numberFactarial = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            numberFactarial = numberFactarial.multiply(BigInteger.valueOf(i));
        }
        return numberFactarial;
    }
}
