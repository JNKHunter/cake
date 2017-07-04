import java.util.HashMap;
import java.util.Map;

/**
 * Created by John on 7/3/17.
 */


public class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println(isPalPerm("HighnooonHigh"));
    }

    private static boolean isPalPerm(String s) {
        Map<Character, Integer> c = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);
            if(!cur.equals(" ")) {
                if(c.containsKey(cur)){
                    int charCount = c.get(cur);
                    c.put(cur, charCount + 1);

                } else {
                    c.put(cur, 1);
                }
            }
        }

        int numOdd = 0;

        for(Character key : c.keySet()) {
            if(c.get(key) % 2 != 0) {
                numOdd += 1;
            }

            if(numOdd > 1) {
                return false;
            }
        }

        return true;
    }
    
}
