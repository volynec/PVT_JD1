package task_8.testGeneric;

/**
 * Created by user on 18.12.2017.
 */
public class Gener<T1 extends Integer,T2 extends Double> {
    private T1 t1;
    private T2 t2;

    public Gener(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    @Override
    public String toString() {
        return "Gener{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }
}
