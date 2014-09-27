package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Money;
import src.Franc;

public class MoneyExampleTest {

	@Test
	public void testDollarMultiplication() {
		Money five = Money.Dollar(5);
		Money result = five.times(2);
		assertEquals(Money.Dollar(10), result);
		result = five.times(3);
		assertEquals(Money.Dollar(15), result);
		
	}
	@Test
	public void testDollarsEquality(){
		assertTrue(Money.Dollar(5).equals(Money.Dollar(5)));
		assertFalse(Money.Dollar(5).equals(Money.Dollar(6)));
		assertTrue(Money.Franc(5).equals(Money.Franc(5)));
		assertFalse(Franc.Franc(5).equals(Money.Franc(6)));
		assertFalse(Money.Dollar(5).equals(Money.Franc(5)));
	}

	@Test
	public void testFrancMultiplication() {
		Money five = Money.Franc(5);
		Money result = five.times(2);
		assertEquals(Money.Franc(10), result);
		result = five.times(3);
		assertEquals(Money.Franc(15), result);
		
	}
	/*@Test
	public void testAddCHFWithDollars(){
		Dollar five = Money.Dollar(5);
		Dollar result = five.add(new CHF(10));
		assertEqualDollars(Money.Dollar(10), result);
	}
*/
	private void assertEqualDollars(Money expected, Money actual) {
		assertEquals(expected.toString(), actual.toString());
	}

}
