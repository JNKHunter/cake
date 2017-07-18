package sorting;

import java.util.Comparator;

/**
 * Created by John on 7/18/17.
 */
public class InsertionSort <V> {

    private V[] array;
    private Comparator<V> comp;

    public InsertionSort(V[] array, Comparator<V> comp) {
        this.array = array;
        this.comp = comp;
    }

    private boolean less(V v, V w, Comparator comparator) {
        return comparator.compare(v, w) < 0;
    }

    public void sort() {
        for(int i = 1; i < array.length; i++) {
            for(int j = i; j > 0 && less(array[j], array[j-1], comp); j--) {
                if(comp.compare(array[j], array[j-1]) < 0) {
                    V tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public V[] getArray() {
        return array;
    }
}
