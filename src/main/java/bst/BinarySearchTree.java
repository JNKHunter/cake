package bst;

/**
 * Created by John on 6/29/17.
 */
public class BinarySearchTree {
    private Node root;

    public void put(Integer key, Integer val){

    }

    public Integer get(Integer key){
        Node x = root;
        while( x != null) {
            if(key.compareTo(x.getKey()) > 0) {
                x = x.getRight();
            }

            else if(key.compareTo(x.getKey()) < 0) {
                x = x.getLeft();
            }

            else {
                return x.getVal();
            }
        }
        return null;
    }

    public void delete(Integer key){

    }
     public Iterable<Integer> iterator(){
         return null;
     }
}
