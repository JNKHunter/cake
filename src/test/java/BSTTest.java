import org.junit.Before;
import org.junit.Test;

/**
 * Created by John on 7/5/17.
 */
public class BSTTest {

    private BST bst;

    private class BST {
        public Node root;

        public void inOrderTraversal(Node node){
            if(node != null) {
                inOrderTraversal(node.left);
                System.out.println(node.key);
                inOrderTraversal(node.right);
            }
        }

        public void preOrderTraversal(Node node) {
            if(node != null) {
                System.out.println(node.key);
                preOrderTraversal(node.left);
                preOrderTraversal(node.right);
            }
        }

        public void postOrderTraversal(Node node){
            if(node != null) {
                postOrderTraversal(node.left);
                postOrderTraversal(node.right);
                System.out.println(node.key);
            }
        }
    }


    private class Node {

        public Node(int key, int val) {
            this.key = key;
            this.value = val;
        }
        public int key;
        public int value;
        public Node left;
        public Node right;
    }

    @Before
    public void setup() {
        bst = new BST();
        bst.root = new Node(8, 8);
        bst.root.left = new Node(4, 8);
        bst.root.right = new Node(10, 8);
        bst.root.left.left = new Node(2, 8);
        bst.root.left.right = new Node(6, 8);
        bst.root.right.right = new Node(20, 8);
    }

    @Test
    public void setInOrderTraversal() throws Exception {
        System.out.println("In order traversal");
        bst.inOrderTraversal(bst.root);
        System.out.println("Pre order traversal");
        bst.preOrderTraversal(bst.root);
        System.out.println("Post order traversal");
        bst.postOrderTraversal(bst.root);

    }


}
