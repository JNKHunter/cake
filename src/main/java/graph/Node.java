package graph;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by John on 7/7/17.
 */
public class Node {
    private int key;
    private int value;
    private Set<Node> connections;
    private boolean isDigraph;
    private boolean visited;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        connections = new HashSet<>();
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addConnection(Node n) {
        connections.add(n);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Set<Node> getConnections() {
        return connections;
    }
}