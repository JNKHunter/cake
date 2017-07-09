import java.util.*;

/**
 * Created by John on 7/7/17.
 */
public class MinBinTree {

    private class Node{
        public int key;
        public Node left;
        public Node right;
        public boolean visited = false;

        public Node(int key){
            this.key = key;
        }
    }
    
    private Node root;

    public MinBinTree(int[] a) {
        root = buildTree(a, 0, a.length - 1);
        List<Queue<Node>> levels = countLevels(root);
        int i = 0;
    }

    public void put(int key) {
        root = put(root, key);
    }

    private Node put(Node x, int key) {
        if(x == null) return new Node(key);

        if(key < x.key)
            x.left = put(x.left, key);
        if(key > x.key)
            x.right = put(x.right, key);

        return x;
    }

    private Node buildTree(int[] a, int lo, int hi){
        if(lo > hi) return null;

        int mid = (lo + hi)/2;

        Node n = new Node(a[mid]);
        n.left = buildTree(a, lo, mid-1);
        n.right = buildTree(a, mid+1, hi);

        return n;
    }

    public List<Queue<Node>> countLevels(Node n) {
        Queue<Node> q = new LinkedList<>();
        List<Queue<Node>> levels = new ArrayList<>();
        n.visited = true;
        q.add(n);
        int counter = 1;
        int loops = 1;

        while(!q.isEmpty()) {
            Node cur = q.remove();

            if(counter == loops){
                levels.add(new LinkedList<>());
            }

            if(counter != 0){
                levels.get(levels.size() - 1).add(cur);
            }

            if(cur.left != null) {
                if(!cur.left.visited){
                    cur.left.visited = true;
                    q.add(cur.left);
                }
            }
            
            if(cur.right != null) {
                if(!cur.right.visited){
                    cur.right.visited = true;
                    q.add(cur.right);
                }
            }

            counter -= 1;
            if(counter == 0){
                loops *= 2;
                counter = loops;
            }
        }
        return levels;
    }

    public int checkBalancedHights(Node n){
        if(n == null) return -1;

        int leftHeight = checkBalancedHights(n.left);
        if(leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkBalancedHights(n.right);
        if(rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int delta = Math.abs(leftHeight - rightHeight);
        if(delta > 1){
            return Integer.MIN_VALUE;
        }else{
            return Math.max(leftHeight, rightHeight);
        }
    }

    public boolean isBalanced(Node n){
        return checkBalancedHights(root) != Integer.MIN_VALUE;
    }
}
