package util;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by jhunter on 1/7/17.
 */
public class ArrayUtilsTest {

    int[] theArray;

    @Before
    public void setup(){
        theArray = ArrayUtils.generateRandomArray(100000,0,100);
        Arrays.sort(theArray);
    }

    @Test
    public void testMinValue() throws Exception {
        assertEquals(0, theArray[0]);
    }

    @Test
    public void textMaxValue() throws Exception {
        assertEquals(100, theArray[theArray.length - 1]);
    }

}