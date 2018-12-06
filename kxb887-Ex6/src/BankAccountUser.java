/**
 * 
 * @author info
 *
 *         The abstract class BankAccountUser consists of the fields username,
 *         password, loggedIn
 *
 *         Class is abstract in order to prevent direct creation of objects.
 *         This can only happen in the subclasses
 */

public abstract class BankAccountUser implements BankAccountUserInterface {

	private String username;
	private String password;
	boolean loggedIn;

	/**
	 * Constructor
	 */

	public BankAccountUser(String username, String password) {
		this.username = username;
		this.password = password;
		this.loggedIn = false;
	}

	/**
	 * Getter
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Setter
	 * 
	 * @param username
	 */

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * login method why does this only work with boolean checkpassword here.. but
	 * should it be here? it is not in interface
	 */
	public boolean checkPassword(String password) {
		return this.getPassword().equals(password);
	}

	public void login(String password) {
		checkPassword(password);
	}

	/**
	 * logout
	 * 
	 */

	public void logout() {
		this.loggedIn = false;

	}

	/**
	 * getter for password
	 */

	public boolean passwordCorrect(String password) {
		if (this.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}

	}

	public String getPassword() {
		return password;
	}

	/**
	 * setter password
	 */

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * getter to check if user is logged in
	 */
	public boolean getLoggedIn() {
		return this.loggedIn;
	}

	/**
	 * setter for loggedIn
	 * 
	 */
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	/**
	 * 
	 * @return A string to string representation of user
	 */
	public String toString() {
		return username + " " + password;

	}

}
