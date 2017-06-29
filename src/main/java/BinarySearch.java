import util.ArrayUtils;

import java.util.Arrays;

/**
 * Created by John on 6/27/17.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,5,6,7,13,15,20,29};
        //Find value that adds to 13
        Arrays.sort(array);
        System.out.println(search(array, 15));
    }

    public static int search(int[] a, int key) {

        int lo = 0;
       int hi = a.length - 1;
       while(lo < hi) {
           int mid = lo + (hi - lo)/2;
           if (a[mid] > key ) hi = mid - 1;
           else if (a[mid] < key ) lo = mid + 1;
           else return mid;
       }

       return -1;
    }
}