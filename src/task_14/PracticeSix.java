package task_14;

import java.io.File;

/**
 * Created by user on 09.01.2018.
 * Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
 */
public class PracticeSix {

    public static void main(String[] arg) {
        String Path = "c:\\Intel\\";
        File file = new File(Path);

        if (file.exists()) {
            getContent(file, 0);
        } else System.out.println("Directory is not found...");
    }

    public static void getContent(File dir, int indents) {
        for (int i = 0; i < indents; i++)
            System.out.print("\t");

        if (dir.isFile())
            System.out.println(dir.getName());
        else {
            System.out.println(dir.getName());
            File[] files = dir.listFiles();
            for (File file : files)
                getContent(file, indents + 1);
        }
    }
}

