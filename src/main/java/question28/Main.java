package question28;

/**
 * Created by jhunter on 12/8/16.
 */
public class Main {

    public static void main(String[] args) {
        String message = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
        System.out.println(returnClosingParenIndex(message, 28));
    }


    static int returnClosingParenIndex(String msg, int openParenIndex){

        int msgLength = msg.length();
        int openParen = 0;
        int closeParen = 0;

        for(int i = openParenIndex; i < msgLength; i++){

            if(Character.toString(msg.charAt(i)).equals("(")){
                openParen += 1;
            }

            if(Character.toString(msg.charAt(i)).equals(")")){
                closeParen += 1;
            }

            if((openParen - closeParen) == 0){
                return i;
            }
        }

        return 0;
    }
}
