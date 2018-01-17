package task_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 02.12.2017.
 * Создать класс, описывающий банкомат.
 * Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 20, 50 и 100.
 * Сделать методы для добавления денег в банкомат.
 * Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
 * При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class ATM {
    public static final int PAR_TWENTY = 20;
    public static final int PAR_FIFTY = 50;
    public static final int PAR_HUNDRED = 100;

    public int parTwenty;
    public int parFifty;
    public int parHundred;
    public int balance;
    public List<ParCombination> combinations = new ArrayList<>();


    public ATM(int parTwenty, int parFifty, int parHundred) {
        this.parTwenty = parTwenty;
        this.parFifty = parFifty;
        this.parHundred = parHundred;
    }

    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not an integer!");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0);


        return number;
    }

    public void putMoney() {

        System.out.println("Сколько купюр номиналом 100 Вы хотите добавить");
        parHundred += inputNumber();
        System.out.println("Сколько купюр номиналом 50 Вы хотите добавить");
        parFifty += inputNumber();
        System.out.println("Сколько купюр номиналом 20 Вы хотите добавить");
        parTwenty += inputNumber();


    }

    public int checkBalance() {
        balance = parHundred * PAR_HUNDRED + parFifty * PAR_FIFTY + parTwenty * PAR_TWENTY;

        return balance;
    }

    public void withdrawMoney() {
        checkBalance();
        System.out.println("Ваш баланc состовляет: " + balance);
        System.out.println("Сколько денег вы хотите снять?");
        int money = inputNumber();
        if (balance > money) {
            takeMoney(money);
        } else {
            System.out.println("Недостаточно средств");
        }

    }

    public boolean takeMoney(int money) {

        boolean flag = true;
        List<ParCombination> combinations = findParCombinations(money);
        if (combinations.size() > 0) {
            sortCombinations(combinations);
        } else {
            System.out.println("Нет подходящего номинала");
        }


        for (ParCombination combination : combinations) {
            int nominalTwenty = combination.getTwenty();
            int nominalFifty = combination.getFifty();
            int nominalHundred = combination.getHundred();
            if (parTwenty - nominalTwenty >= 0 && parFifty - nominalFifty >= 0 && parHundred - nominalHundred >= 0) {
                parTwenty = parTwenty - nominalTwenty;
                parFifty = parFifty - nominalFifty;
                parHundred = parHundred - nominalHundred;
                System.out.println(nominalTwenty + " по 20р " +
                        " \n" + nominalFifty + " по 50р " +
                        " \n" + nominalHundred + " по 100р ");
                flag = false;
                break;
            } else {
                System.out.println("Нет подходящего номинала");
            }

        }

        return flag;
    }

    private void sortCombinations(List<ParCombination> combinations) {
        combinations.sort(new Comparator<ParCombination>() {
            @Override
            public int compare(ParCombination o1, ParCombination o2) {
                int value1 = o2.getHundred() - o1.getHundred();
                if (value1 == 0) {
                    int value2 = o2.getFifty() - o1.getFifty();
                    if (value2 == 0) {
                        return o2.getTwenty() - o1.getTwenty();
                    } else {
                        return value2;
                    }
                }
                return value1;
            }
        });
    }

    private List<ParCombination> findParCombinations(int money) {
        int[] nominal = {20, 50, 100};
        int[] vals = new int[money];
        printCombinations(money, 0, 0, nominal, vals);
        return this.combinations;
    }


    private void printCombinations(int target, int from, int index, int[] arr, int[] vals) {
        if (target == 0) {
            ParCombination nom = new ParCombination();
            for (int i = 0; i < index; i++) {
                if (vals[i] == 20) {
                    nom.setTwenty(1);
                }
                if (vals[i] == 50) {
                    nom.setFifty(1);
                }
                if (vals[i] == 100) {
                    nom.setHundred(1);
                }
//                System.out.print(vals[i] + " ");
            }
            this.combinations.add(nom);

            System.out.println();
        } else if (target < 0 || from >= arr.length) {
            return;
        } else {
            vals[index] = arr[from];
            // take arr[from] in set
            printCombinations(target - arr[from], from, index + 1, arr, vals);

            // dont take arr[from] in set
            printCombinations(target, from + 1, index, arr, vals);
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(0, 0, 0);
        atm.putMoney();
        atm.withdrawMoney();

    }

}




