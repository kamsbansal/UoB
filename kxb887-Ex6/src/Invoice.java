/**
 * 
 * @author Kam Bansal
 * @version 16.11.2018
 * 
 *          Invoice implements Measurable, that is, we have to give an
 *          implementation for the methods getValue. This is done by returning
 *          the get Value, which here is the account number, sort code and
 *          amount of the invoice.
 *
 */
public class Invoice implements Measurable {

	private String accountNumber;
	private String sortCode;
	private double amount;

	/**
	 * An Invoice object is created by this constructor.
	 * 
	 * @param accountNumber The account number associated with the invoice.
	 * @param sort          code The sort code associated with the invoice.
	 * @param amount        amount to be paid
	 */

	public Invoice(String accountNumber, String sortCode, double amount) {
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.amount = amount;
	}

	/**
	 * getter for accountNumber
	 * 
	 * @return The account number associated with the invoice
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Setter for accounNumber
	 * 
	 * @param accountNumber The new account number of the invoice
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * getter for sortCode
	 * 
	 * @return The sort code associated with the invoice
	 */
	public String getSortCode() {
		return sortCode;
	}

	/**
	 * Setter sortCode
	 * 
	 * @param sortCode The new sort code
	 */
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	/**
	 * Getter for amount
	 * 
	 * @return The amount of the invoice
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Setter Amount
	 * 
	 * @param The new amount of the invoice
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * The toString() method to print the invoice.
	 * 
	 * @return A printable String for the invoice.
	 */
	public String toString() {
		return "This invoice is for" + "\n" + "\n" + "Account Number: " + accountNumber + "\n" + "Sort code: "
				+ sortCode + "\n" + "Amount: \u00A3" + amount;

	}

	public static void main(String[] args) {
		Invoice brand = new Invoice("01255687", "56-42-45", 5450.25);
		System.out.println(brand);
	}

	@Override
	public double getValue() {
		return getAmount();
	}

}
