package task_11.PracticeFive;

/**
 * Created by user on 01.01.2018.
 */
public class Main {
    public static void main(String[] args) {
        Checking c = new Checking();
        try {
            c.divisionNumber();
        } catch (MyException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
        System.out.println("end");
    }

}

