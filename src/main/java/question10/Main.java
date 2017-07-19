package question10;

import java.util.Stack;

/**
 * Created by John on 7/18/17.
 */
public class Main {
    public static void main(String[] args) {
        BinaryTreeNode node7 = new BinaryTreeNode(7);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node12 = new BinaryTreeNode(12);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node9 = new BinaryTreeNode(9);
        BinaryTreeNode node15 = new BinaryTreeNode(15);

        node7.left = node5;
       
        node5.left = node2;
        node6.right = node6;
        node12.left = node9;
        
        node2.left = node1;
        node2.right = node4;

        BinaryTreeNode secondLargest = get2ndLargest(node7);
        int i = 0;

    }

    public static BinaryTreeNode get2ndLargest(BinaryTreeNode n) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode largest = n;
        BinaryTreeNode nextLargest = n;

        int counter = 0;

        BinaryTreeNode current = n;
        while(current != null) {
            stack.push(current);
            current = current.right;
        }

        while(stack.size() > 0) {
            current = stack.pop();
            if(current.value > nextLargest.value) {
                if(current.value > largest.value) {
                    nextLargest = largest;
                    largest = current;
                } else {
                    nextLargest = current;
                }
                
                counter += 1;
                if(counter == 2) {
                    return nextLargest;
                }
            }


            if(current.left != null){
                current = current.left;

                while(current != null){
                    stack.push(current);
                    current = current.right;
                }
            }
        }

        return nextLargest;
        
    }
}
