package util;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by jhunter on 1/7/17.
 */
public class ArrayUtilsTest {
    @Test
    public void testGenerateRandomArray() throws Exception {
        int [] theArray = ArrayUtils.generateRandomArray(100000,0,100);

        Arrays.sort(theArray);

        assertEquals(0, theArray[0]);

        for(int i = 0; i < 100; i++){
            System.out.println(theArray[i]);
        }

    }

}