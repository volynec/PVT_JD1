package task_15;

/**
 * Created by user on 10.01.2018.
 * 3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
 Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
 Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.


 */
public class Notebook extends Computer {

    Touchpad touchpad;
    transient  String Brand;

    public Notebook(String CPU, int HDD, int RAM, String brand, Touchpad touchpad) {
        super(CPU, HDD, RAM);
        Brand = brand;
        this.touchpad = touchpad;
    }
}
