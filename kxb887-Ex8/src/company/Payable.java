package company;

/**
 * @author
 * @version
 *
 * 
 */

public interface Payable {
	/**
	 * @return The amount of money that has to be paid.
	 */
	public double paymentAmount();

	/**
	 * @return The day of the month when the payment is due.
	 */
	int dueDate();

}
