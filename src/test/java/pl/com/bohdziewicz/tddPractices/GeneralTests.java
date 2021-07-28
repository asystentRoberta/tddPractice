package pl.com.bohdziewicz.tddPractices;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneralTests {

    @Test
    public void testCurrency() {

        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testMultiplication() {

        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {

        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(3));
    }

    @Test
    public void testSimpleAddition(){
        Money reduced = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), reduced);
    }
}
