package task_5;

import java.math.BigDecimal;

/**
 * Created by user on 07.12.2017.
 * Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
 * Задать методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal.
 */
public class ArithmeticOperations {
    int variableInt;
    long variableLong;
    double variableDouble;
    BigDecimal bigDecimal;



    public ArithmeticOperations(double variableDouble, BigDecimal bigDecimal) {
        this.variableDouble = variableDouble;
        this.bigDecimal = bigDecimal;
    }

    public ArithmeticOperations(int variableInt, long variableLong) {

        this.variableInt = variableInt;
        this.variableLong = variableLong;
    }

    public long addition() {
        return variableInt + variableLong;
    }

    private long divide() {
        return variableLong / variableInt;
    }

    public BigDecimal subtraction() {
        return bigDecimal.subtract(BigDecimal.valueOf(variableDouble));
    }

    public BigDecimal multiplication() {
        return bigDecimal.multiply(BigDecimal.valueOf(variableDouble));
    }

    public static void main(String[] args) {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations(123, 456L);
        ArithmeticOperations arithmeticOperations2 = new ArithmeticOperations(12.34, BigDecimal.valueOf(56.78));

        long additionInteger = arithmeticOperations.addition();
        long divideInteger = arithmeticOperations.divide();
        BigDecimal subtractionBigDecimal = arithmeticOperations2.subtraction();
        BigDecimal multiplicationBigDecimal = arithmeticOperations2.multiplication();

        System.out.println(additionInteger);
        System.out.println(divideInteger);
        System.out.println(subtractionBigDecimal);
        System.out.println(multiplicationBigDecimal);
    }


}
