package util;

import java.util.Random;

/**
 * Created by jhunter on 1/7/17.
 */
public class ArrayUtils {

    public static int[] generateRandomArray(int arraySize, int minValue, int maxValue){
        int[] theArray = new int[arraySize];

        Random rand = new Random();

        for(int i = 0; i < arraySize; i++){
            theArray[i] = rand.nextInt((maxValue - minValue) + 1) + minValue;
        }

        return theArray;
    }

}
