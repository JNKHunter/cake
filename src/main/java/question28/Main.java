package question28;

/**
 * Created by jhunter on 12/8/16.
 */
public class Main {

    public static void main(String[] args) {
        String message = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
        returnClosingParenIndex(message, 10);
    }


    static int returnClosingParenIndex(String msg, int openParenIndex){

        int msgLength = msg.length();
        int openParen = 0;
        int closeParen = 0;
        char cur = msg.charAt(openParenIndex);

        for(int i = openParenIndex; i < msgLength; i++){

        }

        System.out.println(cur);

        return 0;
    }
}
