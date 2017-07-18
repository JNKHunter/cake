package sorting;

import java.util.Comparator;

/**
 * Created by John on 7/18/17.
 */
public class ShellSortMain {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        Node n13 = new Node(13);
        Node n14 = new Node(14);
        Node n15 = new Node(15);
        Node n16 = new Node(16);
        Node n17 = new Node(17);
        Node n18 = new Node(18);
        Node n19 = new Node(19);
        Node n20 = new Node(20);
        Node n21 = new Node(21);

        Node[] a = {n18, n5, n2, n20, n9, n3, n21, n4, n1, n16,  n17, n15, n10, n11, n7, n19, n6, n13, n8, n12, n14};

        ShellSort<Node> sort = new ShellSort<>(a, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.value > o1.value) return 1;
                if(o1.value < o2.value) return -1;
                return 0;
            }
        });

        sort.sort();
        for(Node n : a) {
            System.out.println(n.value);
        }
    }
}
