package pl.com.bohdziewicz.tddPractices;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class FrancTest {

    @Test
    public void testFrancMultiplaction() {

        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(3).equals(Money.dollar(5)));
        assertNotEquals(Money.franc(5), Money.dollar(5));

    }
}
