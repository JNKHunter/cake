package question30;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhunter on 12/13/16.
 */
public class Main2 {

    public static boolean hasPalindromePermutation(String theString) {

        // track characters we've seen an odd number of times
        Set<Character> unpairedCharacters = new HashSet<Character>();

        for (char c : theString.toCharArray()) {
            if (unpairedCharacters.contains(c)) {
                unpairedCharacters.remove(c);
            } else {
                unpairedCharacters.add(c);
            }
        }

        // the string has a palindrome permutation if it
        // has one or zero characters without a pair
        return unpairedCharacters.size() <= 1;
    }
}