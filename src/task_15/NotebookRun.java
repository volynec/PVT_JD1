package task_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by user on 10.01.2018.
 */
public class NotebookRun {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/task_15/serializableNotebook.txt"))) {
            Notebook notebook = new Notebook("Intel Core i7", 2000, 16, "ASUS", new Touchpad("Synaptics"));
            oos.writeObject(notebook);
            oos.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/task_15/serializableNotebook.txt"))) {
            Notebook notebook = (Notebook) ois.readObject();
            System.out.printf("CPU: %s \t HDD: %d \t RAM: %d \t Brand: %s \t Touchpad: %s \n", notebook.CPU, notebook.HDD, notebook.RAM, notebook.Brand, notebook.touchpad.model);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
