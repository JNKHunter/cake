package question32;

import util.ArrayUtils;

/**
 * Created by jhunter on 1/7/17.
 */
public class Main {

    public static void main(String[] args) {
        int HIGHEST_POSSIBLE = 100;
        int[] unsortedArray = ArrayUtils.generateRandomArray(100, 0, HIGHEST_POSSIBLE);
        int[] numsToCounts = new int[HIGHEST_POSSIBLE + 1];

        for(int i = 0; i < unsortedArray.length; i++){
            numsToCounts[unsortedArray[i]] += 1;
        }

        int[] sortedArray = new int[unsortedArray.length];
        int currentSortedIndex = 0;

        for(int i = 0; i < numsToCounts.length; i++){

            for(int j = 0; j < numsToCounts[i]; j++){
                sortedArray[currentSortedIndex] = i;
                currentSortedIndex++;
            }

        }

        for(int i : sortedArray){
            System.out.println(i);
        }
    }
}
