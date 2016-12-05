package question13;

/**
 * Created by jhunter on 12/4/16.
 */
public class Main {

    public static void main(String[] args) {
        String[] words = new String[]{
            "ptolemaic",
            "retrograde",
            "supplant",
            "undulate",
            "xenoepist",
            "asymptote", // <-- rotates here!
            "babka",
            "banoffee",
            "engender",
            "karpatka",
            "othellolagkage"
        };

        System.out.println(findRotationPoint(words));
    }

    public static int findRotationPoint(String[] words) {
        final String firstWord = words[0];

        int floorIndex = 0;
        int ceilingIndex = words.length - 1;

        while (floorIndex < ceilingIndex) {

            int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);

            if (words[guessIndex].compareTo(firstWord) > 0) {
                floorIndex = guessIndex;
            } else {
                ceilingIndex = guessIndex;
            }


            if (floorIndex + 1 == ceilingIndex) {

                break;
            }
        }

        return ceilingIndex;
    }

}
