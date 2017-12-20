package task_8.exampleAnnotation.myAnnatation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by user on 20.12.2017.
 */
public class TransactionRunner {

    public void cardReplenishment() {
        System.out.println("Card replenishment");
    }

    public void paymentCreditCard() {
        System.out.println("Payment by credit card");
    }

    @Transaction
    public void remittance() {

        System.out.println("Remittance");

    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TransactionRunner transactionRunner = new TransactionRunner();
        Method[] trasactionMethod = transactionRunner.getClass().getMethods();
        for (int i = 0; i < trasactionMethod.length; i++) {
            Method method = trasactionMethod[i];
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Transaction is started");
                method.invoke(transactionRunner, null);
                System.out.println("Transaction is ended");
            }

        }
    }
}
