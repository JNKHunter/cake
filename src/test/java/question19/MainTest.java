package question19;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jhunter on 1/6/17.
 */
public class MainTest {

    private StackQueue queue;

    @Before
    public void setup(){
        queue = new StackQueue();
    }

    @Test
    public void testEnqueue(){
        queue.enqueue(10);
        assertEquals((Integer)10,queue.peek());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals((Integer)10, queue.peek());
    }

    @Test
    public void testDequeue(){
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals((Integer)10, queue.dequeue());
    }

}