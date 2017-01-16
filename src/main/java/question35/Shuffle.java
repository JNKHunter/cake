package question35;

import util.ArrayUtils;

/**
 * Created by John on 1/16/17.
 */
public class Shuffle {

    public void shuffleArray(int[] theArray){
        int random = 0;
        int temp = 0;
        for(int i = 0; i < theArray.length - 1; i++){
            //Choose a random # between i and array.length
            random = ArrayUtils.generateRandomInt(i, theArray.length - 2);
            temp = theArray[i];
            theArray[i] = theArray[random];
            theArray[random] = temp;
        }
    }

}
