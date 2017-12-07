package task_4;

/**
 * Created by user on 02.12.2017.
 * 1. Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 * Написать программу для тестирования возможностей класса.
 */
public class Period {
    public static final int ONE_MINUTE_SECOND = 60;
    public static final int ONE_HOUR_SECOND = 3600;
    public int second;
    public int minute;
    public int hour;

    public Period(int second) {
        this.second = second;
    }

    public Period(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int isFullSeconds() {
        int timeSeconds = second + (minute * ONE_MINUTE_SECOND) + (hour * ONE_HOUR_SECOND);
        return timeSeconds;
    }

    public void printTime(int seconds) {

        int hours = seconds / ONE_HOUR_SECOND;
        int minutes = (seconds % ONE_HOUR_SECOND) / ONE_MINUTE_SECOND;
        seconds = seconds % ONE_MINUTE_SECOND;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }


}
