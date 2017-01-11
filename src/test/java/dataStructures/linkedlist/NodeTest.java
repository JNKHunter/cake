package dataStructures.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jhunter on 1/11/17.
 */
public class NodeTest {

    @Test
    public void nodeSetNextTest(){
        Node node = new Node(new Object());
        Node nextNode = new Node(new Object());
        node.setNext(nextNode);

        assertSame(nextNode, node.getNext());
    }

}