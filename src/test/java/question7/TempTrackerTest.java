package question7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by John on 11/3/16.
 */
public class TempTrackerTest {
    TempTracker myTracker;

    @Before
    public void setUp() throws Exception {
        myTracker = new TempTracker();
    }

    @Test
    public void testMinCaching() throws Exception {
        myTracker.insert(0);
        myTracker.insert(1);
        myTracker.insert(2);
        myTracker.insert(3);
        myTracker.insert(-1);

        assertEquals(myTracker.getMin(), -1);
    }

}