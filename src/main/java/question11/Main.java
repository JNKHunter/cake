package question11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by John on 11/24/16.
 */
public class Main {



    public static void main(String[] args) {

        //UrlMap urls = new UrlMap();

        //System.out.println(urls.addUrl("www.google.com"));
        //System.out.println(urls.addUrl("www.google.com"));

        Trie trie = new Trie();

        trie.checkPresentAndAdd("www.google.com");
        trie.checkPresentAndAdd("reddit.com");

    }
}
