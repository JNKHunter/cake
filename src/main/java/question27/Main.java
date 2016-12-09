package question27;

import java.util.Arrays;

/**
 * Created by jhunter on 12/7/16.
 */
public class Main {

    public static void main(String[] args) {
        String message = "find you will pain only go you recordings security the into if i";
        System.out.println(reverseWords(message));
    }

    public static String reverseWords(String message){
        String[] sArray = message.split("\\s");
        int middle = (int)Math.floor(sArray.length/2);

        for(int i = 0; i < middle; i++){

            String former = sArray[i];
            String latter = sArray[(sArray.length - 1) - i];

            sArray[i] = latter;
            sArray[(sArray.length - 1) - i] = former;

        }

        return Arrays.toString(sArray);
    }
}
