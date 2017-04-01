package test.com.rockie.lintcode;

import com.rockie.lintcode.Anagram;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Anagram Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>二月 19, 2016</pre>
 */
public class AnagramTest {
    private Anagram anagram = new Anagram();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: anagram(String s, String t)
     */
    @Test
    public void testAnagram() throws Exception {
        boolean result = this.anagram.anagram("ab", "ba");
        assertEquals(true, result);
    }

    @Test
    public void testNoAnagram() {
        boolean result = this.anagram.anagram("ab", "aba");
        assertEquals(false, result);
    }
}
