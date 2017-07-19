/**
 * Created by John on 7/19/17.
 */
public class ArrayPermutation {

    static int[] a = {1,2,3,4,5};
    static int[] b = {5,2,3,1,4};

    public static void main(String[] args) {
        int permutation = 0;

        for(int i = 0; i < a.length; i++ ) {
            permutation ^= a[i];
            permutation ^= b[i];
        }

        System.out.println("value is: " + permutation);
    }
}
