import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by John on 7/10/17.
 */
public class SimpleLinkedList {

    private static Node head;

    private static class Node {
        int val = 0;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static void addNode(int value){
        if(head == null) {
            head = new Node(value);
        } else {
            Node n = head;

            while(n.next != null) {
                n = n.next;
            }

            Node newTail = new Node(value);
            n.next = newTail;
        }


    }

    public static Node kthElement(Node n, int count, int offset) {
        if(n.next != null) {
            n = n.next;
            Node returnNode = kthElement(n, count + 1, offset);

            if(count == count - offset){
                return n;
            }

            if(returnNode == null) return null;
            if(returnNode != null) return returnNode;
        }

        return null;
    }

    public static void removeDups(){
        Node n = head;
        Set<Integer> cache = new HashSet<>();
        cache.add(n.val);

        while(n.next != null){
            int curVal = n.next.val;

            if(cache.contains(curVal)){
                Node del = n.next;
                n.next = n.next.next;
                del = null;
            }else{
                cache.add(curVal);
            }

            if(n.next != null) {
                n = n.next;
            }

        }
    }

    public boolean isPalindrome(Node n, int count) {
        Stack<Integer> stack = new Stack<>();

        int mid = count/2;
        int i = 0;
        while(i < mid){
            stack.push(n.val);
            n = n.next;
            ++i;
        }

        if(count % 2 != 0){
            n = n.next;
        }

        while(n != null) {
            Integer popped = stack.pop();
            if(popped != n.val) return false;
            n = n.next;
        }

        return true;
    }

    public Node partition(Node n, int value) {
        Node ltv = null;
        Node gtv = null;
        Node ltvh = null;
        Node gtvh = null;

        while(n != null) {
            if(n.val < value) {
                if(ltv != null) {
                    ltv.next = new Node(n.val);
                    ltv = ltv.next;
                } else {
                    ltv = new Node(n.val);
                    ltvh = ltv;
                }
            }else{
                if(gtv != null) {
                    gtv.next = new Node(n.val);
                    gtv = gtv.next;
                } else {
                    gtv = new Node(n.val);
                    gtvh = gtv;
                }
            }

            Node prev = n;
            n = n.next;
            prev = null;
        }
        ltv.next = gtvh;
        return ltvh;
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.addNode(2);
        list.addNode(1);
        list.addNode(3);
        list.addNode(3);
        list.addNode(3);
        list.addNode(3);
        list.addNode(1);
        list.addNode(1);

        boolean b = list.isPalindrome(head, 8);
        int i = 0;

    }


}
