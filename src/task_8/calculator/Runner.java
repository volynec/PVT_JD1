package task_8.calculator;

import task_8.exampleAnnotation.myAnnatation.ClassAnalyzer;

/**
 * Created by user on 18.12.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Calc calc = new Calc(1,2.1);
        System.out.println(calc.addition());
        System.out.println(calc.divide());
        System.out.println(calc.multiplication());
        System.out.println(calc.subtraction());


    }
}

