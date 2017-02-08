package question34;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jhunter on 1/12/17.
 */
public class WordCloud {

    private Map<String, Integer> wordMap;
    private String textString;

    public WordCloud(String textString) {
        this.textString = textString;
        wordMap = new HashMap<>();
        generateMap();
    }

    private void generateMap(){
        String tmpString = "";
        char[] standardPunc = {':', ';', ',', '.', '?', '!', ' '};
        char curChar;

        for(int i = 0; i < textString.length(); i++){

            curChar = textString.charAt(i);

            if(!Character.isLetter(curChar) && curChar != '\'' && curChar != '-' && curChar != ','){
                if(tmpString != ""){
                    if(wordMap.containsKey(tmpString.toLowerCase())){
                        wordMap.put(tmpString.toLowerCase(), wordMap.get(tmpString.toLowerCase()) + 1);
                    }else{
                        wordMap.put(tmpString.toLowerCase(), 1);
                    }

                    tmpString = "";
                }
            }else{
                tmpString = tmpString + curChar;
            }
        }
    }

    public Map<String, Integer> getWordMap(){
        return wordMap;
    }
}
