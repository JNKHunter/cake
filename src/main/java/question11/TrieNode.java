package question11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by John on 11/25/16.
 */
public class TrieNode {
    private Map<Character, TrieNode> nodeChildren;

    public TrieNode() {
        this.nodeChildren = new HashMap<>();
    }

    public boolean hasChildNode(char character){
        return this.nodeChildren.containsKey(character);
    }

    public void makeChildNode(char character){
        this.nodeChildren.put(character, new TrieNode());
    }

    public TrieNode getChildNode(char character){
        return this.nodeChildren.get(character);
    }
}
