package sample;

import junit.framework.TestCase;
import java.util.concurrent.TimeoutException;

public class UtilsTest extends TestCase {

    public void testComputeFactorial() {
        System.out.println("* UtilsJUnit3Test: testComputeFactorial()");
        assertEquals(120, Utils.computeFactorial(5));
        assertEquals(1, Utils.computeFactorial(0));
    }

    public void testComputeFactorialException() {
        System.out.println("* UtilsJUnit3Test: testComputeFactorialException()");
        try {
            Utils.computeFactorial(-5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Test passed
        }
    }

    public void testConcatWords() {
        System.out.println("* UtilsJUnit3Test: testConcatWords()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    public void testNormalizeWord() {
        System.out.println("* UtilsJUnit3Test: testNormalizeWord()");
        assertEquals("Malmö", Utils.normalizeWord("Malm\u0308"));
    }

    public void testWithTimeout() throws InterruptedException, TimeoutException {
        System.out.println("* UtilsJUnit3Test: testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());

        Thread testThread = new Thread() {
            public void run() {
                System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            }
        };

        testThread.start();
        Thread.sleep(1000);
        testThread.interrupt();

        if (testThread.isInterrupted()) {
            throw new TimeoutException("Test took too long to complete");
        }
    }
}
