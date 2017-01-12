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
    }

    private void generateMap(){
        String tmpString = "";
        char[] punctuation = {':', ';', ',', '.', '?', '!'};
        char curChar;

        for(int i = 0; i < textString.length(); i++){

            curChar = textString.charAt(i);

            for(int j = 0; j < punctuation.length; j++){
                if(curChar == punctuation[j]){
                    if(tmpString != ""){
                        wordMap.put(tmpString, wordMap.get(tmpString) + 1);
                        tmpString = "";
                    }
                }else{
                    tmpString = tmpString + curChar;
                }
            }


            //Check for space, comma, colon, semicolon. If any of these. Then we've reached the end of a word and we
            // should put it in the hash map

            //Strip any Check for punctuation. Single quote should be ok since it's part of a word
        }
    }

    public Map<String, Integer> getWordMap(){
        return wordMap;
    }
}
