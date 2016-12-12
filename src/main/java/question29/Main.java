package question29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jhunter on 12/9/16.
 */
public class Main {
    public static void main(String[] args) {

    }

    public static boolean validate(String code){

        int codeLength = code.length();

        for(int i = 0; i < codeLength; i++){

        }

        return false;
    }

    public static boolean isOpener(char c){
        List<Character> openers = Arrays.asList('[','(','{');

        if (openers.contains(c)) {
            return true;
        }
        return false;
    }

    public static boolean isCloser(char c){
        List<Character> openers = Arrays.asList(')',']','}');

        if (openers.contains(c)) {
            return true;
        }
        return false;
    }
}
