import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by John on 6/28/17.
 */
public class HashTableTest {
    HashTable table;

    @Before
    public void setup(){
        table = new HashTable(3);
    }


    @Test
    public void putTest() throws Exception {
        table.put("Hello", "1");
        table.put("World", "2");
        table.put("What", "3");
        table.put("A", "4");
        table.put("Wonderful", "5");
        table.put("Du", "6");
        table.put("DuHast", "7");
    }

}