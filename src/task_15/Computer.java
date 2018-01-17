package task_15;

import java.io.Serializable;

/**
 * Created by user on 10.01.2018.
 */
public class Computer implements Serializable {
    String CPU;
    int RAM;
    int HDD;

    public Computer(String CPU, int HDD, int RAM) {
        this.CPU = CPU;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    }
