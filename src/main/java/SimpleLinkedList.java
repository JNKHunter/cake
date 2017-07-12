import java.util.HashSet;
import java.util.Set;

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

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(3);
        list.addNode(4);
        list.addNode(1);
        list.addNode(5);
        list.addNode(6);
        list.addNode(6);

        Node kth = list.kthElement(head, 0, 3);
        int i = 0;

    }


}
