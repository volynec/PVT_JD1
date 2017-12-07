package task_4;

/**
 * Created by user on 02.12.2017.
 */
public class RunPeriod {
    public static void main(String[] args) {

        Period periodOne = new Period(59);
        Period periodTwo = new Period(59, 58, 23);
        int periodOneFullSeconds = periodOne.isFullSeconds();
        int periodTwoFullSeconds = periodTwo.isFullSeconds();
        periodOne.printTime(periodOneFullSeconds);
        periodTwo.printTime(periodTwoFullSeconds);

    }
}
