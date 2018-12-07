package shop;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

	private ShoppingCart shoppingCartUnderTest;

	@Before
	public void setUp() {
		Product Item1 = new Product("Coffee", 10, 10);
		Product Item2 = new Product("Salmon", 20, 50);
		Product Item3 = new Product("Cat Food", 5, 30);
		Product Item4 = new Product("Cat Food", 5, 50);
		shoppingCartUnderTest = new ShoppingCart();
		shoppingCartUnderTest.cart = new ArrayList<>(Arrays.asList());
		shoppingCartUnderTest.add(Item1);
		shoppingCartUnderTest.add(Item2);
		shoppingCartUnderTest.add(Item3);
		shoppingCartUnderTest.add(Item4);
	}

	@Test
	public void testTotalPrice() {
		final double expectedResult = 1500.0;

		final double result = shoppingCartUnderTest.getTotalPrice();

		assertEquals(expectedResult, result, 0.0001);
	}

	@Test
	public void testMain() {
		final String[] args = new String[] {};

		ShoppingCart.main(args);

	}
}
