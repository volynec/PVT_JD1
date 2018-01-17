package task_11.PracticeFive;

/**
 * Created by user on 01.01.2018.
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

  }
