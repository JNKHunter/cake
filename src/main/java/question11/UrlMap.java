package question11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by John on 11/24/16.
 */
public class UrlMap {
    private HashMap<String, List<String>> visitedUrls;

    public UrlMap() {
        visitedUrls = new HashMap<String, List<String>>();
        visitedUrls.put("www", new ArrayList<>());
        visitedUrls.put("others", new ArrayList<>());
    }

    public boolean addUrl(String url){
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
