package task_12;

/**
 * Created by user on 03.01.2018.
 * . Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
 в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.

 */
public class PracticeFour {
    public static String getInitials(String fio) {

        StringBuilder sb = new StringBuilder();
        String[] fioArray = fio.split(" ");
        for (int i = 0; i < fioArray.length; i++) {
            String str = fioArray[i];
            sb.append(str.charAt(0));
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        String fullName = "волынец Дмитрий Михайлович";
        System.out.println(getInitials(fullName));

    }
}
