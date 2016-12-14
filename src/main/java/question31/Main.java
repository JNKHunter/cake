package question31;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhunter on 12/13/16.
 */
public class Main {

    public static void main(String[] args) {
        Set<String> cats = getPermutations("cat");

        for(String cat : cats){
            System.out.println(cat);
        }



    }

    public static Set<String> getPermutations(String inputString){

        if(inputString.length() <= 1){
            return new HashSet<>(Arrays.asList(inputString));
        }

        String allCharsExceptLast = inputString.substring(0,inputString.length() - 1);
        char lastChar = inputString.charAt(inputString.length() - 1);

        Set<String> permutationsOfAllCharactersExceptLast = getPermutations(allCharsExceptLast);
        Set<String> permutations = new HashSet<String>();
        for(String permutationOfAllCharactersExceptLast : permutationsOfAllCharactersExceptLast){
            for(int position = 0; position <=allCharsExceptLast.length(); position++){
                String permutation = permutationOfAllCharactersExceptLast.substring(0,position) + lastChar +
                        permutationOfAllCharactersExceptLast.substring(position);
                permutations.add(permutation);
            }
        }

        return permutations;
    }
}
