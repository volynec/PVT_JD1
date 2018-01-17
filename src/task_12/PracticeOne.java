package task_12;

/**
 * Created by user on 01.01.2018.
 *
 *. Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.

 *
 */
public class PracticeOne {
    public static long additionString() {
        long start;
        long end;
        String str = "";
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            str = str + "1 ";
        }
        end = System.nanoTime();
        return start - end;
    }

    public static long appendStringBuilder() {
        long start;
        long end;
        StringBuilder stringBuilder = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("1 ");
        }
        end = System.nanoTime();
        return start - end;
    }

    public static void main(String[] args) {
        System.out.println("Time of operation iStream: " + additionString());
        System.out.println("Time of operation buffStream: " + appendStringBuilder());

    }
}
