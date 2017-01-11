package dataStructures.linkedlist;

/**
 * Created by jhunter on 1/11/17.
 */
public class Node {
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Node(Node next, Object data) {
        this.next = next;
        this.data = data;
    }

    public void setNext(Node nextNode){
        this.next = nextNode;
    }

    public Node getNext(){
        return this.next;
    }

    public Object getData() {
        return data;
    }
}
