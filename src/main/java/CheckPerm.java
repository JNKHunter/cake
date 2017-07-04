import java.util.Arrays;

/**
 * Created by John on 7/1/17.
 */
public class CheckPerm {
    public static void main(String[] args) {
        String a = "helllo";
        String b = "leholl";
        String ab = a + b;
        char[] ca = ab.toCharArray();
        Arrays.sort(ca);

        int result = (int)ca[0];
        for(int i = 1; i < ca.length; i++) {
            result ^= (int)ca[i];
            if( (i + 1) % 2 == 0 ) {
                if (result != 0) {
                    System.out.println("Not a permutation");
                }
            }
        }

        System.out.println(result);
    }
}
