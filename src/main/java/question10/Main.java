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
        node7.right = node12;
        node5.left = node2;
        node6.right = node6;
        node12.left = node9;
        node12.right = node15;
        node2.left = node1;
        node2.right = node4;

        BinaryTreeNode secondLargest = get2ndLargest(node7);
        int i = 0;

    }

    public static BinaryTreeNode get2ndLargest(BinaryTreeNode n) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode largest = n;
        BinaryTreeNode nextLargest = n;

        BinaryTreeNode current = n;
        while(current != null) {
            stack.push(current);
            current = current.left;
        }

        while(stack.size() > 0) {
            current = stack.pop();
            if(current.value > largest.value) {
                nextLargest = largest;
                largest = current;
            }


            if(current.right != null){
                current = current.right;

                while(current != null){
                    stack.push(current);
                    current = current.left;
                }
            }
        }

        return nextLargest;
        
    }
}
