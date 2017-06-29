/**
 * Created by John on 6/28/17.
 */
public class HashTable {

    private Node[] keys;

    public HashTable(int length) {
        keys = new Node[length];
    }

    public void put(String key, String value) {
        int position = hash(key);
        if(keys[position] == null){
            keys[position] = new Node(value);
        } else {
            Node curNode = keys[position];
            while(curNode.next != null) {
                curNode = curNode.next;
            }

            Node newNode = new Node(value);
            curNode.next = newNode;
        }
    }

    private int hash(String s) {
        int sum = 0;

        for(Integer i = 0; i < s.length(); i++) {
            sum += (int)s.charAt(i) * (1<<i);
        }

        return sum % keys.length;
    }

    private class Node {
        public String value;
        public Node next;

        public Node(String value) {
            this.value = value;
        }
    }

}
