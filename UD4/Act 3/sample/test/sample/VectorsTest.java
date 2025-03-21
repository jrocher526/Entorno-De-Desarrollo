package sample;

import junit.framework.TestCase;

public class VectorsTest extends TestCase {

    public void testEqual() {
        System.out.println("* VectorsJUnit3Test: testEqual()");
        assertTrue(Vectors.equal(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertFalse(Vectors.equal(new int[]{1, 2, 3}, new int[]{1, 2, 4}));
    }

    public void testScalarMultiplication() {
        System.out.println("* VectorsJUnit3Test: testScalarMultiplication()");
        assertEquals(14, Vectors.scalarMultiplication(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertEquals(0, Vectors.scalarMultiplication(new int[]{1, -1}, new int[]{1, 1}));
    }
}
