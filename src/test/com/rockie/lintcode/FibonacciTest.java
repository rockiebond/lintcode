package test.com.rockie.lintcode;

import com.rockie.lintcode.Fibonacci;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * Fibonacci Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>二月 22, 2016</pre>
 */
public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: fibonacci(int n)
     */
    @Test
    public void testFibonacci() throws Exception {
        assertEquals(0, this.fibonacci.fibonacci(1));
        assertEquals(1, this.fibonacci.fibonacci(2));
        assertEquals(1, this.fibonacci.fibonacci(3));
        assertEquals(2, this.fibonacci.fibonacci(4));
        assertEquals(34, this.fibonacci.fibonacci(10));
    }
}
