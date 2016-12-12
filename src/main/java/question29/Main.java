package question29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by jhunter on 12/9/16.
 */
public class Main {
    public static void main(String[] args) {

    }

    public static boolean validate(String code){

        int codeLength = code.length();
        char currentChar;
        Stack<Character> blocks = new Stack<>();


        for(int i = 0; i < codeLength; i++){
            currentChar = code.charAt(i);

            if(isOpener(currentChar)){
                blocks.push(currentChar);
            }

            if(isCloser(currentChar)){
                char opener = getOpener(currentChar);
                
            }
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

    public static boolean isCloser(char c) {
        List<Character> openers = Arrays.asList(')', ']', '}');

        if (openers.contains(c)) {
            return true;
        }
        return false;
    }

    public static char getOpener(char c) {

        switch (c){

            case '}':
                return '{';

            case ']':
                return '{';
            case ')':
                return '(';

            default:
                return '0';
        }

    }
}
