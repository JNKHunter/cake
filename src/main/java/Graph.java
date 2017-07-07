import java.util.HashSet;
import java.util.Set;

/**
 * Created by John on 7/7/17.
 */
public class Graph {

    private Set<Node> nodes;

    private class Node {
        private int key;
        private int value;
        private Set<Node> connections;
        private boolean isDigraph;

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
    }

    public Graph() {
        nodes = new HashSet<>();
    }

    public boolean add(Node n) {
        return nodes.add(n);
    }

    public void connect(Node from, Node to) {
        if(nodes.contains(from) && nodes.contains(to)) {
            
        }
    }

}
