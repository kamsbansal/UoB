package shop;

import java.util.ArrayList;

/**
 * Shopping Cart is a class for creating a simple cart of shopping from specific
 * products. We distinguish an array cart that will hold the products.
 *
 * @version 04-12-18
 * @author Kam Bansal
 */

public class ShoppingCart {

	private ArrayList<Product> cart;

	public ShoppingCart() {

		this.cart = new ArrayList<Product>();

	}

	/*
	 * getter for shopping cart
	 */

	public ArrayList<Product> getCart() {
		return this.cart;

	}

	/*
	 * Setter for shopping cart
	 */

	public void setProducts(ArrayList<Product> cart) {
		this.cart = cart;

	}

	/*
	 * Method to add products to a basket. If product has the same name and price it
	 * will not be added multiple times. Instead the quantity will be adjusted
	 * 
	 * @param p
	 */

	public void add(Product p) {
		for (int i = 0; i < cart.size(); i++) {

			if (p.getName().equals(cart.get(i).getName()) && p.getPrice() == cart.get(i).getPrice()) { // if name and
																										// price match
																										// product in
																										// cart
				cart.get(i).setQuantity(cart.get(i).getQuantity() + p.getQuantity()); // have the quantity double
				return;
			}
		}
		cart.add(p);
	}

	/*
	 * String toString method
	 */

	public String toString() {
		if (cart.isEmpty()) {
			return "There are currently no items in the cart";
		}

		String toString = "";
		for (Product p : cart) {
			toString += String.format("%2d %-10s %-5s %-18s %-4s %5s \n", p.getQuantity(), " *  GBP \t", p.getPrice(),
					p.getName(), "= GBP ", (p.getQuantity() * p.getPrice()));

		}
		return toString;
	}

	public double getTotalPrice() {
		double totalPrice = 0; // initialise the total price variable

		for (Product p : cart) { // for loop of all products in the cart

			totalPrice = totalPrice + p.getTotalPrice(); // go through the products in the cart, using for loop
		}
		return totalPrice;
	}

	public static void main(String[] args) {

		Product milk = new Product("Milk (1L) ", 1.12, 1);
		Product milk2 = new Product("Milk (1L) ", 1.12, 1);
		Product bread = new Product("Bread ", 0.78, 2);
		Product salmon_steak = new Product("Salmon Steak ", 5.43, 2);
		Product fries = new Product("Fries ", 1.53, 1);
		Product apples = new Product("Apples ", 0.49, 4);

		ShoppingCart cart = new ShoppingCart();

		cart.add(milk);
		cart.add(milk2);
		cart.add(bread);
		cart.add(salmon_steak);
		cart.add(fries);
		cart.add(apples);

		System.out.printf(cart.toString());
		System.out.println("\t\t\t                  -----------------");
		System.out.printf("\t\t\t\t       TOTAL GBP  " + "%.2f", Math.abs(cart.getTotalPrice()));

	}

}
