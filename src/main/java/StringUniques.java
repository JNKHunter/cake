/**
 * Created by John on 6/28/17.
 */
public class StringUniques {
    private static boolean isUniqueChar(String string) {
        if(string.length() > 128){
            return false;
        }

        boolean[] characters = new boolean[128];

        for(int i = 0; i < string.length(); i++){
            char curChar = string.charAt(i);
            if(characters[(int)curChar] == true){
                return false;
            }else{
                characters[(int)curChar] = true;
            }
        }
        return true;
}

    public static void main(String[] args) {
        String str1 = "ABCDEFGAIJKL";
        String str2 = "ABCDEFGHIJKL";
        System.out.print(isUniqueChar(str1));
    }
}
