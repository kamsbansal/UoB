package shop;

/**
 * Product are goods that are bought at a supermarket. We distinguish three
 * variables: name, price and quantity.
 *
 * @version 04-12-18
 * @author Kam Bansal
 */
public class Product {

	private String name;
	private double price;
	private int quantity;

	public static final String stringCurrency = "\u00A3";

	/**
	 * Product is a constructor for good bought at supermarket
	 * 
	 * @param name the name of the product
	 * @param the  price of the product
	 * @param the  quantity bought
	 */

	public Product(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @return the name of the product
	 */

	public String getName() {
		return name;
	}

	/**
	 * @return the price of the product
	 */

	public double getPrice() {
		return price;
	}

	/**
	 *
	 * @return the quantity of products bought
	 */

	public int getQuantity() {
		return quantity;
	}

	/**
	 * sets the name of the product
	 * 
	 * @param name of the product
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * sets the price of the product
	 * 
	 * @param price of the product
	 */

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * sets the quantity of the product
	 * 
	 * @param qunatityprice of the productSetter for quantity
	 */

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Method to get the Total Price of a good. Sum of Price times Quantity
	 * 
	 * @return
	 */

	public double getTotalPrice() {
		return getPrice() * getQuantity();

	}

	public String toString() {
		return String.format(" Quantity: %s, Price: %s, Name: %s ", getQuantity(), getPrice(), getName());
	}
}
