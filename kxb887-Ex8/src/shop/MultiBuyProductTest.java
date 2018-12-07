package shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiBuyProductTest {

    private String name;
    private double price;
    private int quantity;
    private int minDiscountedQuantity;
    private int discountPercent;

    private MultiBuyProduct multiBuyProductUnderTest;

    @Before
    public void setUp() {
        name = "Apples";
        price = 5;
        quantity = 10;
        minDiscountedQuantity = 9;
        discountPercent = 50;
        multiBuyProductUnderTest = new MultiBuyProduct(name, price, quantity, minDiscountedQuantity, discountPercent);
    }

    @Test
    public void testGetTotalPrice() {

        final double expectedResult = 25.0;

        final double result = multiBuyProductUnderTest.getTotalPrice();


        assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    public void testMain() {

        final double expectedQuantity = 10.0;

        final double quantity = multiBuyProductUnderTest.getQuantity();


        assertEquals(expectedQuantity, quantity, 0.0001);


    }
}
