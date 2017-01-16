package question35;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by John on 1/16/17.
 */
public class ShuffleTest {
    @Test
    public void shuffleArrayTest() throws Exception {
        Shuffle shuffle = new Shuffle();
        int[] theArray = {1,2,3,4,5};
        shuffle.shuffleArray(theArray);
        assertEquals(5, theArray.length);
    }

}