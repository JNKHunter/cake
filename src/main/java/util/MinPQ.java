package util;

import java.util.Comparator;
import java.util.NoSuchElementException;

import static com.sun.xml.internal.xsom.impl.UName.comparator;

/**
 * Created by John on 7/5/17.
 */
public class MinPQ<Key> {

    private Key[] pq;
    private int n;
    private Comparator<Key> comparator;

    public MinPQ(int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    public void insert(Key x) {
        if (n == pq.length - 1) resize(2 * pq.length);

        pq[++n] = x;
        swim(n);
        assert isMinHeap();
    }

    public Key delMin() {
        exch(1,n);
        Key min = pq[n--];
        sink(1);
        pq[n+1] = null;
        if((n>0) && (n == (pq.length - 1) / 4)) resize(pq.length / 2);
        return min;
    }
    

    private void swim(int k) {
      while (k > 1 && greater(k/2, k)) {
          exch(k, k/2);
          k = k/2;
      }
    }

    private void sink(int k) {
        while (2*k <= n) {
            int j = 2*k;
            if(n < n && greater(j, j+1)) j++;
            if(!greater(k,j)) break;
            exch(k,j);
            k=j;
        }
    }

    private boolean isMinHeap() {
        return isMinHeap(1);
    }

    // is subtree of pq[1..n] rooted at k a min heap?
    private boolean isMinHeap(int k) {
        if (k > n) return true;
        int left = 2*k;
        int right = 2*k + 1;
        if (left  <= n && greater(k, left))  return false;
        if (right <= n && greater(k, right)) return false;
        return isMinHeap(left) && isMinHeap(right);
    }

    /*public Key delMin() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        exch(1, n);
        Key min = pq[n--];
        sink(1);
        pq[n+1] = null;         // avoid loitering and help with garbage collection
        if ((n > 0) && (n == (pq.length - 1) / 4)) resize(pq.length  / 2);
        assert isMinHeap();
        return min;
    }*/

    private boolean greater(int i, int j) {
      if (comparator == null) {
          return ((Comparable<Key>) pq[i]).compareTo(pq[j]) > 0;
      } else {
          return comparator.compare(pq[i], pq[j]) > 0;
      }
    }

    private void exch(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }

    private void resize(int capacity) {
        assert capacity > n;
    }


}
