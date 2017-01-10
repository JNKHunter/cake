package question33;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jhunter on 1/9/17.
 */
public class FindDuplicateIntTest {

    @Test
    public void testSums() throws Exception{

        FindDuplicateInt findDuplicateInt = new FindDuplicateInt(new int[]{1,2,3,4,5,6,7,8}, 8);

        assertEquals(36, findDuplicateInt.sumAllValues(8));


    }

    @Test
    public void testDuplicateSum() throws Exception{
        FindDuplicateInt findDuplicateInt = new FindDuplicateInt(new int[]{1,2,3,4,5,5,6,7,8}, 8);
        assertEquals(5, findDuplicateInt.findDuplicate());
    }

}