package task_8;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.12.2017.
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(123, " Hello ");
        System.out.println(pair.getKey() + pair.getValue());
        Pair<String, Integer> swapPair = PairUtil.swap(pair);
        System.out.println(swapPair.getKey() + " " + swapPair.getValue());



    }
}



