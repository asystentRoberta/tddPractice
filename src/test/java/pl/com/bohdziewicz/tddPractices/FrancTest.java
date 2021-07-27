package pl.com.bohdziewicz.tddPractices;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FrancTest {

    @Test
    public void testFrancMultiplaction() {

        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality() {

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertTrue(new Franc(3).equals(new Franc(3)));
        assertFalse(new Franc(3).equals(new Franc(5)));
    }
}
