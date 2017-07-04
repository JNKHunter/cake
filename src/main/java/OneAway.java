import java.util.HashMap;
import java.util.Map;

/**
 * Created by John on 7/4/17.
 */
public class OneAway {
    static Map<Character, Integer> s1Count = new HashMap<>();
    static Map<Character, Integer> s2Count = new HashMap<>();

    public static void main(String[] args){
        mapChars("Hellloe", "Helllor");
        boolean isOneAway = isOneAway();

        s1Count.size();
    }

    public static void mapChars(String s1, String s2) {

        String smaller = s1.length() <= s2.length() ? s1 : s2;
        String larger = s1.length() <= s2.length() ? s2 : s1;

        for(int i = 0; i < larger.length(); i++) {
            char a = larger.charAt(i);
            if(s1Count.containsKey(a)) s1Count.put(a, s1Count.get(a) + 1);
            else s1Count.put(a, 1);

            if(i < smaller.length()) {
                char b = smaller.charAt(i);
                if(s2Count.containsKey(b)) s2Count.put(b, s2Count.get(b) + 1);
                else s2Count.put(b, 1);
            }
        }
    }

    public static boolean isOneAway() {

        Map<Character, Integer> big;
        Map<Character, Integer> small;

        big = s1Count.size() <= s2Count.size() ? s1Count : s2Count;
        small = s1Count.size() <= s2Count.size() ? s2Count : s1Count;

        int delta = 0;

        for(Character key : big.keySet()) {
           int smallKeyCount = 0;
           int bigKeyCount = big.get(key);

           if(small.containsKey(key)) {
               smallKeyCount = small.get(key);
           }

           delta += Math.abs(bigKeyCount - smallKeyCount);

           if(delta > 1) return false;
        }

        return true;
    }
}
