package task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 21.12.2017.
 *
 * 4.	Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
 •	Задать размер стека.
 •	Внести цифру в стек.
 •	Извлечь цифру из стека.
 Вывести число, у которого цифры идут в обратном порядке.
 *
 */
public class StackJava<T> {
    private int size;
    private List<Integer> array;


    public StackJava(int s) {
        size = s;
        array = new ArrayList();
    }

    public void push(Integer number) {
        array.add(number);
    }

    public void pop() {
        if (array.isEmpty()) {
            System.out.println("Stack is empty");
        }
        array.remove(array.size() - 1);
    }
    public void reverseOrder (){
        for (int i = 0; i <array.size() ; i++) {
            int num= array.get(i);
            int reversenum =0;
            while( num != 0 )
            {
                reversenum = reversenum * 10;
                reversenum = reversenum + num%10;
                num = num/10;
            }
            System.out.print(reversenum +", ");
        }

    }

    @Override
    public String toString() {
        return "StackJava{" +
                "array=" + array +
                '}';
    }

    public static void main(String[] args) {
        StackJava<Integer> stackJava = new StackJava(3);
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            System.out.println("That's not a number!");
            sc.next();
        }
        for (int i = 0; i < stackJava.size; i++) {
            stackJava.push(sc.nextInt());
        }
        System.out.println(stackJava);
        stackJava.pop();
        System.out.println(stackJava);
        stackJava.reverseOrder();

    }
}
