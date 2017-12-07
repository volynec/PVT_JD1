package task_4.Zakharov;

import java.util.Scanner;

/**
 * Created by user on 08.12.2017.
 */
public class TC {
    public static void main(String[] args) {

        BT terminal = new BT(20, 10, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму, которую Вы желаете снять: ");
        int summ = sc.nextInt();
        if (summ%10 != 0 || summ == 10 || summ == 30) {
            System.out.println("К сожалению, нет возможности выдать сумму 10 или 30.\nМинимальная сумма для снятия - 20.\n" +
                    "Пожалуйста, введите сумму кратную 10.");
        }
        sc.close();

        boolean need = terminal.getCash(summ);

        if (need) {
            System.out.println("Операция завершена.");
        }
    }
}
