/**
 * Created by John on 7/12/17.
 */
public class IntersectionList {
    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private static Node intersect(Node n1Head, Node n2Head) {

        Node n = n1Head;
        Node r = n2Head;

        int nCount = 0;
        int rCount = 0;

        while(n != null){
            ++nCount;
            n = n.next;
        }

        while(r != null){
            ++rCount;
            r = r.next;
        }

        if(nCount == rCount) {
            if(n != r) {
                return null;
            }
            else{
                while(n1Head != null){
                    if(n1Head == n2Head){
                        return n1Head;
                    }

                    n1Head = n1Head.next;
                    n2Head = n2Head.next;
                }
            }

        }

        Node intersectNode = nCount > rCount ? n1Head : n2Head;
        int intersect = Math.max(nCount, rCount) - Math.min(nCount, rCount);
        int count = 0;

        for(int i = 0; i < intersect; i++){
            intersectNode = intersectNode.next;
        }

        return intersectNode.next;

    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        Node r1 = new Node(5);
        Node r2 = new Node(6);
        Node r3 = new Node(7);
        Node r4 = new Node(8);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        r1.next = n2;
        r2.next = n3;
        r3.next = r4;
        
        n4.next = r3;

        Node intersection = intersect(n1, n2);
        int i = 0;

    }
}
