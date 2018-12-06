package shop;

/**
 * Multibuy product is a class to add discount to cart and extends class Product
 * 
 * @version 04-12-18
 * @author Kam Bansal
 */

public class MultiBuyProduct extends Product {

	private int minDiscountedQuantity;
	private int discountPercent;
	private double discountAmount;

	/**
	 * Constructor for Multibuy
	 * 
	 * @param name
	 * @param price
	 * @param quantity
	 * @param minDiscountedQuantity
	 * @param discountPercent
	 */
	public MultiBuyProduct(String name, double price, int quantity, int minDiscountedQuantity, int discountPercent) {

		super(name, price, quantity);
		this.discountPercent = discountPercent;
		this.minDiscountedQuantity = minDiscountedQuantity;
		this.discountAmount = 0;

	}

	/**
	 * Getter DiscountPercent
	 * 
	 * @return
	 */
	public int getDiscountPercent() {
		return this.discountPercent;
	}

	/**
	 * Getter minDiscountQuantity
	 * 
	 * @return
	 */

	public int getMinDiscountedQuantity() {
		return this.minDiscountedQuantity;
	}

	/**
	 * Getter discountAmount
	 * 
	 * @return
	 */

	public double getdiscountAmount() {
		return discountAmount;
	}

	/**
	 * Setter discountAmount
	 * 
	 * @param
	 */

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * Setter for discountPercent
	 */

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	/**
	 * Method getTotalPrice
	 */
	@Override
	public double getTotalPrice() {
//if quantity is equal to or great than minimum discount quantity
		if (this.getQuantity() >= this.getMinDiscountedQuantity()) {

			// then percentage is equal to discount percent divided by 100 (treat integer
			// 100 as double)
			double percentage = (this.discountPercent / 100d);

//discount amount is set as calculation of percentage x totalPrice (in superclass)			
			this.setDiscountAmount(percentage * super.getTotalPrice());
		}

		return super.getTotalPrice() - this.getdiscountAmount();

	}

	public static void main(String[] args) {

		MultiBuyProduct addedDiscount = new MultiBuyProduct("Melon", 20, 30, 10, 10);

		ShoppingCart cart = new ShoppingCart();
		cart.add(addedDiscount);

		System.out.println(cart.toString());

		// Product milk = new Product("Milk (1L) ", 1.12, 11);
		// Product bread = new Product("Bread ", 0.78, 2);

		// ShoppingCart cart = new ShoppingCart();

//		cart.add(milk);
		// cart.add(bread);

		// System.out.printf(cart.toString());
		// System.out.println("\t\t\t -----------------");
		// System.out.printf("\t\t\t\t TOTAL GBP " + "%.2f",
		// Math.abs(cart.getTotalPrice()));

	}

}
