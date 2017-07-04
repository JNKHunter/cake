/**
 * Created by John on 7/2/17.
 */
public class URLEncode {

    public static void main(String[] args) {
        String value = "Mr John Smith    ";
        int len = 13;

        String ca = new String(encode(value, len));
        System.out.println(ca);

    }

    public static char[] encode(String array, int realLen) {

        char[] ca = array.toCharArray();
        int left = realLen - 1;
        int right = ca.length - 1;

        while(left > 0) {

            if(ca[left] == ' '){
                left -=1;
                ca[right] = '0';
                right -= 1;
                ca[right] = '2';
                right -=1;
                ca[right] = '%';
                right -=1;
            }

            else if (ca[left - 1] != ' ') {
                ca[right] = ca[left];
                left -= 1;
                right -= 1;
            }else{
                ca[right] = ca[left];
                left -=2;
                right -= 1;
                ca[right] = '0';
                right -= 1;
                ca[right] = '2';
                right -=1;
                ca[right] = '%';
                right -=1;
            }
        }
        ca[right] = ca[left];
        return ca;
    }

}
