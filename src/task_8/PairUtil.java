package task_8;

/**
 * Created by user on 14.12.2017.
 */
public final class PairUtil {
@SuppressWarnings("all" )
    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        Pair<V, K> pairSwaped = new Pair<>(pair.getValue(), pair.getKey());
        return pairSwaped;
    }



}