package question11;

/**
 * Created by John on 11/25/16.
 */
public class Trie {

    private TrieNode rootNode;
    private final char endOfWordMarker = '\0';

    public Trie() {
        this.rootNode = new TrieNode();
    }

    public boolean checkPresentAndAdd(String word){
        TrieNode currentNode = this.rootNode;
        boolean isNewWord = false;

        for(int i = 0; i < word.length(); i++){

            char character = word.charAt(i);

            if(!currentNode.hasChildNode(character)){
                isNewWord = true;
                currentNode.makeChildNode(character);
            }

            currentNode = currentNode.getChildNode(character);
        }

        if (!currentNode.hasChildNode(endOfWordMarker)){
            isNewWord = true;
            currentNode.makeChildNode(endOfWordMarker);
        }

        return isNewWord;

    }
}
