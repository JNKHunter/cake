import graph.Graph;
import graph.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by John on 7/7/17.
 */
public class GraphTest {

    private Graph graph;
    Node node1;
    Node node2;
    Node node3;
    Node node4;
    Node node5;
    Node node6;
    Node node7;
    Node node8;
    Node node9;
    Node node10;
    Node node11;
    Node node12;
    Node node13;

    @Before
    public void setUp() {
        graph = new Graph();
        node1 = new Node(1, 1);
        node2 = new Node(2, 2);
        node3 = new Node(3, 3);
        node4 = new Node(4, 4);
        node5 = new Node(5, 5);
        node6 = new Node(6, 6);
        node7 = new Node(7, 7);
        node8 = new Node(8, 8);
        node9 = new Node(9, 9);
        node10 = new Node(10, 10);
        node11 = new Node(11, 11);
        node12 = new Node(12, 12);
        node13 = new Node(13, 13);

        graph.add(node1);
        graph.add(node2);
        graph.add(node3);
        graph.add(node4);
        graph.add(node5);
        graph.add(node6);
        graph.add(node7);
        graph.add(node8);
        graph.add(node9);
        graph.add(node10);
        graph.add(node11);
        graph.add(node12);
        graph.add(node13);

        graph.connect(node1, node2);
        graph.connect(node2, node3);
        graph.connect(node3, node4);
        graph.connect(node4, node5);
        graph.connect(node5, node3);
        graph.connect(node5, node8);
        graph.connect(node6, node5);
        graph.connect(node7, node6);
        graph.connect(node7, node4);
        graph.connect(node8, node9);
        graph.connect(node8, node10);
        graph.connect(node9, node13);
        graph.connect(node10, node11);
        graph.connect(node12, node9);
        graph.connect(node13, node5);
    }

    @Test
    public void testConnections() {
        assertTrue(graph.isConnected(node1, node2));
        assertTrue(graph.isConnected(node4, node5));

        assertFalse(graph.isConnected(node4, node7));
        assertFalse(graph.isConnected(node6, node7));
        assertFalse(graph.isConnected(node2, node1));
        assertFalse(graph.isConnected(node1, node7));
    }

    @Test
    public void testFind() {
        assertTrue(graph.hasPath(node1, node5));
        graph.resetSearch();

        assertTrue(graph.hasPath(node1, node2));
        graph.resetSearch();

        assertTrue(graph.hasPath(node1, node3));
        graph.resetSearch();

        assertTrue(graph.hasPath(node1, node4));
        graph.resetSearch();

        assertTrue(graph.hasPath(node7, node5));
        graph.resetSearch();
        
        assertTrue(graph.hasPath(node12, node3));
        graph.resetSearch();

        assertTrue(graph.hasPath(node1, node11));
        graph.resetSearch();

        assertFalse(graph.hasPath(node11, node1));
        graph.resetSearch();

        assertFalse(graph.hasPath(node1, node7));
        graph.resetSearch();

        assertFalse(graph.hasPath(node1, node6));
        graph.resetSearch();
    }

    

}
