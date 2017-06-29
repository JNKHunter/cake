/**
 * Created by John on 6/27/17.
 */
public class ReverseString {
    public static String reverseString(String s) {
        char[] characterArray = s.toCharArray();
        int i = 0;
        int j = characterArray.length - 1;

        while(i < j){
            char temp = characterArray[i];
            characterArray[i] = characterArray[j];
            characterArray[j] = temp;
            i++;
            j--;
        }

        return new String(characterArray);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}