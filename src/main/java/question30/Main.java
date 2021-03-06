package question30;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jhunter on 12/12/16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(hasPalindrome("jjr"));

    }

    public static boolean hasPalindrome(String input){

        char currentChar;
        boolean isPalindrome = false;
        int inputLength = input.length();
        int totalRepeats = 0;
        Map<Character,Integer> characterMap = new HashMap<>();

        for(int i = 0; i < inputLength; i++){
            currentChar = input.charAt(i);

            if(characterMap.containsKey(currentChar)){
                characterMap.put(currentChar, characterMap.get(currentChar) + 1);
                if(characterMap.get(currentChar) % 2 == 0){
                    totalRepeats += 1;
                }

            }else{
                characterMap.put(currentChar, 1);
            }
        }

        if(totalRepeats == Math.floor(inputLength/2)){
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
