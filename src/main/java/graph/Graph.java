package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by John on 7/7/17.
 */
public class Graph {

    private Set<Node> nodes;

    public Graph() {
        nodes = new HashSet<>();
    }

    public boolean add(Node n) {
        return nodes.add(n);
    }

    public void connect(Node from, Node to) {
        if(nodes.contains(from) && nodes.contains(to)) {
            from.addConnection(to);
        }
    }

    public boolean hasPath(Node from, Node to) {
        return search(from, to);
    }

    public boolean isConnected(Node from, Node to) {
        return from.getConnections().contains(to);
    }

    public void resetSearch() {
        for(Node n : nodes) {
            n.setVisited(false);
        }
    }
    
    private boolean search(Node from, Node to) {

        if(from == null) return false;

        Queue<Node> q = new LinkedList<>();
        from.setVisited(true);
        q.add(from);

        while(!q.isEmpty()) {

            Node cur = q.remove();
            cur.setVisited(true);

            for(Node n : cur.getConnections()) {

                if(n == to) {
                    return true;
                }
                
                if(n.isVisited() != true) {
                    n.setVisited(true);
                    q.add(n);
                }

            }
        }
        return false;
    }

}
