package fr.dauphine.ja.guedidihedi.td00;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test0IsPrime()
    {
        assertTrue(!PrimeCollection.isPrime(0));
    }
    @Test
    public void testTwoIsPrime()
    {
        assertTrue(PrimeCollection.isPrime(2));
    }
    @Test
    public void test9IsPrime()
    {
        assertTrue(!PrimeCollection.isPrime(9));
    }
}
