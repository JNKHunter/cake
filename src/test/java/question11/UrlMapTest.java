package question11;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by John on 11/24/16.
 */
public class UrlMapTest {

    private UrlMap urls;
    private String testwww = "www.google.com";
    private String testNonwww = "instagram.com";

    @Before
    public void setUp() throws Exception {
        urls = new UrlMap();
    }

    @Test
    public void addWWWUrlReturnTrue() throws Exception {
        assertTrue(urls.addUrl(testwww));
    }

    @Test
    public void addNonWWWUrlReturnTrue() throws Exception {
        assertTrue(urls.addUrl(testNonwww));
    }

    @Test
    public void addWWWDuplicateUrlReturnFalse() throws Exception {
        urls.addUrl(testwww);
        assertFalse(urls.addUrl(testwww));
    }

    @Test
    public void addNonDuplicateUrlReturnFalse() throws Exception {
        urls.addUrl(testNonwww);
        assertFalse(urls.addUrl(testNonwww));
    }

}