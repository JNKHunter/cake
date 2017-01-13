package question34;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by jhunter on 1/12/17.
 */
public class WordCloudTest {

    private WordCloud cloud;

    @Before
    public void setup() throws Exception{
        cloud = new WordCloud("The quick brown the jumps over the lazy dog. The.");
    }

    @Test
    public void testCloudCounter() throws Exception{
        Map<String, Integer> map = cloud.getWordMap();
        assertEquals((Integer)1, map.get("quick"));
    }
}