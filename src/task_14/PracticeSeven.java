package task_14;

import java.io.*;

/**
 * Created by user on 09.01.2018.
 * Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
 */
public class PracticeSeven {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/task_14/PracticeTwo.java"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/task_14/PracticeTwoR.java"))) {
            String s;
            System.out.println();
            while ((s = br.readLine()) != null) {
                StringBuilder sb = new StringBuilder(s);
                bw.write(sb.reverse().toString() + "\n");
            }
            bw.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

