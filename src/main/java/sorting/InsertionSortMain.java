package sorting;

import java.util.Comparator;

/**
 * Created by John on 7/18/17.
 */



public class InsertionSortMain {


    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        Node[] a = {n5, n2, n3, n4, n1};

        InsertionSort<Node> insertionSort = new InsertionSort<>(a, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.value > o2.value) return 1;
                if(o1.value < o2.value) return -1;
                return 0;
            }
        });

        insertionSort.sort();
        Node[] b = insertionSort.getArray();

        for(int i = 0; i < b.length; i++) {
            System.out.println("First value is: " + b[i].value);
        }
    }
}
