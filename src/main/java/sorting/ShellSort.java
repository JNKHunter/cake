package sorting;

import java.util.Comparator;

/**
 * Created by John on 7/18/17.
 */
public class ShellSort<V> {

    private final Comparator comp;
    private final V[] array;

    public ShellSort(V[] array, Comparator comp){
        this.array = array;
        this.comp = comp;
    }

    private boolean less(V v, V w) {
        return comp.compare(v, w) < 0;
    }

    public V[] sort() {
        int h = 1;
        int n = array.length;

        while(h < n/3) h = 3*h + 1;

        while(h >= 1) {
            for(int i = h; i < n; i++) {
                for(int j = i; j >= h && less(array[j], array[j-h]); j-= h) {
                    V swap = array[j];
                    array[j] = array[j-h];
                    array[j-h] = swap;
                }
            }
            h /= 3;
        }
        return array;
    }
}
