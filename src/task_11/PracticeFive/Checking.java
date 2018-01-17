package task_11.PracticeFive;

/**
 * Created by user on 03.01.2018.
 */
public class Checking {
    int a = 0;

    public void divisionNumber() throws MyException {
        try {
            int b = 5 / a;
        } catch (Exception e) {
            throw new MyException("division by zero is forbidden", e);
        }
    }
}
