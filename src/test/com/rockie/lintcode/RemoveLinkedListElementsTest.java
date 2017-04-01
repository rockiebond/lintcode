package test.com.rockie.lintcode;

import com.rockie.lintcode.RemoveLinkedListElements;
import com.rockie.lintcode.model.ListNode;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * RemoveLinkedListElements Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>二月 23, 2016</pre>
 */
public class RemoveLinkedListElementsTest {
    RemoveLinkedListElements obj = new RemoveLinkedListElements();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: removeElements(ListNode head, int val)
     */
    @Test
    public void testRemoveElements() throws Exception {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        assertEquals(null, this.obj.removeElements(node, 1));

        node = new ListNode(7);
        assertEquals(null, this.obj.removeElements(node, 7));


        node = new ListNode(5);
        node.next = new ListNode(6);
        assertEquals(node, this.obj.removeElements(node, 6));
    }


} 
