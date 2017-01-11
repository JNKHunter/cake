package dataStructures.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jhunter on 1/11/17.
 */
public class LinkedListTest {

    private LinkedList list;

    @Before
    public void setup(){
        list = new LinkedList();

        list.add(15);
        list.add(16);
        list.add(17);
    }

    @Test
    public void addToEndOfListTest() throws Exception {
        assertEquals(17, list.get(2));
    }

    @Test
    public void getAtIndexTest() throws Exception {
        assertEquals(16, list.get(1));
    }

    @Test
    public void removeAtIndexTest() throws Exception {

        list.add(18);
        list.add(19);

        assertEquals(true, list.remove(1));
        assertEquals(17, list.get(1));

        assertEquals(true, list.remove(1));
        assertEquals(15, list.get(0));
    }

}