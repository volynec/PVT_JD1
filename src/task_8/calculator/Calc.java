package task_8.calculator;

/**
 * Created by user on 18.12.2017.
 */

public class Calc<V extends Number, I extends Number> {
    public int a;
    private V firstNumber;
    private I secondNumber;

    public Calc(V firstNumber, I secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public Double addition() {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public Double divide() {
        return firstNumber.doubleValue() / secondNumber.doubleValue();
    }

    public Double subtraction() {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }

    public Double multiplication() {
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }


}
