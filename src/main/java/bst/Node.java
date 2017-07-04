package bst;

/**
 * Created by John on 6/29/17.
 */
public class Node {
    private Integer key;//Must implement Comperable
    private Integer val;
    private Node left, right;

    public Node(Integer key, Integer val) {
        this.key = key;
        this.val = val;
    }

    public Integer getKey() {
        return key;
    }

    public Integer getVal() {
        return val;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
