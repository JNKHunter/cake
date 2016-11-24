package question11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by John on 11/24/16.
 */
public class Main {

    private static HashMap<String, List<String>> visitedUrls;

    public static void main(String[] args) {

        visitedUrls = new HashMap<String, List<String>>();
        visitedUrls.put("www", new ArrayList<>());
        visitedUrls.put("others", new ArrayList<>());

        System.out.println(addUrl("www.google.com"));
        System.out.println(addUrl("www.google.com"));

    }

    public static boolean addUrl(String url){
        if(url.startsWith("www")){
            String truncated = url.substring(3);
            if(!visitedUrls.get("www").contains(truncated)){
                visitedUrls.get("www").add(truncated);
                return true;
            }
        }else{
            if(!visitedUrls.get("others").contains(url)){
                visitedUrls.get("others").add(url);
                return true;
            }
        }
        return false;
    }
}
