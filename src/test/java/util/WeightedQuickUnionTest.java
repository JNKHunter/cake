package util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jhunter on 2/10/17.
 */
public class WeightedQuickUnionTest {

    private WeightedQuickUnion wqu;

    @Before
    public void setup(){
        wqu = new WeightedQuickUnion(10);
    }


    @Test
    public void count() throws Exception {
        assertEquals(10, wqu.count());
        wqu.union(1,2);
        wqu.union(3,4);
        assertEquals(8, wqu.count());
    }

    @Test
    public void find() throws Exception {
        wqu.union(1,2);
        wqu.union(2,3);
        assertEquals(1, wqu.find(2));
        wqu.union(4,5);
        wqu.union(1,5);
        assertEquals(1, wqu.find(5));
    }

    @Test
    public void connected() throws Exception {
        wqu.union(1,2);
        wqu.union(2,3);
        wqu.union(3,4);
        wqu.union(7,8);
        wqu.union(8,9);
        wqu.union(1,9);
        assertTrue(wqu.connected(2,9));
    }

}