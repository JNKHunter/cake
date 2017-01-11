package dataStructures.linkedlist;

import java.text.ParseException;

/**
 * Created by jhunter on 1/11/17.
 */
public class LinkedList {
    private Node head;
    private int counter;

    public LinkedList(){
        counter = 0;
    }

    //Adds a node to the end of the list
    public void add(Object data){

        if(head != null){
            Node current = head;

            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new Node(data));
        }else{
            head = new Node(data);
        }

        counter++;
    }

    //Adds a node at a particular location in the list
    public void add(Object data, int index){
        if (head != null) {
            Node current = head;
            for(int i = 0; i < index && current.getNext() != null; i++){
                current = current.getNext();
            }

            Node newNode = new Node(data);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }else{
            head = new Node(data);
        }

        counter++;
    }

    public Object get(int index){
        if(index < 0){
            return null;
        }

        if(head != null){
            Node current = head;
            for(int i = 0; i < index; i++){
                if(current.getNext() == null){
                    return null;
                }

                current = current.getNext();
            }

            return current.getData();
        }

        return null;

    }

    public boolean remove(int index){
        if(index < 1 || index > counter){
            return false;
        }

        if(head != null){
            Node current = head;
            for(int i = 1; i < index; i++){
                if(current.getNext() == null){
                    return false;
                }

                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());
            counter--;
            return true;
        }

        return false;
    }

}
