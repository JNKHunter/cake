import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 7/4/17.
 */
public class StringCompression {
    
    public static void main(String[] args) {

        System.out.println(compress("aaacaaacaaacaaac"));

    }

    public static String compress(String s) {
        StringBuilder b = new StringBuilder();
        int curCount = 1;
        int rp = 0;
        char curChar = s.charAt(rp);

        while(rp < s.length() - 1) {
            if(s.charAt(rp + 1) == curChar){
                curCount += 1;
            }else {
                b.append(curChar);
                b.append(curCount);
                curCount = 1;
                curChar = s.charAt(rp + 1) ;
            }

            rp += 1;
            if(b.length() >= s.length()) {
                return s;
            }
        }

        b.append(curChar);
        b.append(curCount);

        return b.toString();
    }
}


