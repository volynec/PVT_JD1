package task_15;

import java.io.Serializable;

/**
 * Created by user on 10.01.2018.
 */
public class Touchpad implements Serializable {
    String model;
    boolean keyboardBacklight;

    public Touchpad(boolean keyboardBacklight, String model) {
        this.keyboardBacklight = keyboardBacklight;
        this.model = model;
    }

    public Touchpad(boolean keyboardBacklight) {
        this.keyboardBacklight = keyboardBacklight;
    }

    public Touchpad(String model) {
        this.model = model;
    }
}
