package task_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by user on 10.01.2018.
 * <p>
 * 2.	Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
 * Десериализовать объект из того же файла, вывести значения полей в консоль.
 */
public class ComputerRun {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/task_15/serializableComputer.txt"))) {
            Computer computer = new Computer("Intel Core i7", 2000, 16);
            oos.writeObject(computer);
            oos.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/task_15/serializableComputer.txt")))
        {
            Computer computer=(Computer)ois.readObject();
            System.out.printf("CPU: %s \t HDD: %d \t RAM: %d \n", computer.CPU, computer.HDD,computer.RAM);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
