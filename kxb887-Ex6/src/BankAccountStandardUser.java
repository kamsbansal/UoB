
public class BankAccountStandardUser extends BankAccountUser implements BankAccountStandardUserInterface {

	private BankAccount bankAccount;
	private int loginAttempts;

	/**
	 * constructor
	 * 
	 * @param username
	 * @param password
	 * @param bankAccount
	 */
	public BankAccountStandardUser(String username, String password, BankAccount bankAccount) {
		super(username, password);
		this.bankAccount = bankAccount;
		this.loginAttempts = 0;

	}

	/**
	 * getter
	 */

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	/**
	 * method for user to log in to internet by providing password. first checked
	 * whether account is still active (not too many failed attempts made. Then
	 * whether password provided is correct. If a correct login the number of login
	 * attempts is reset to 0. Else increased by 1.
	 */
	public void login(String password) {
		if (this.loginAttempts < 3) {
			if (this.checkPassword(password)) {
				this.loggedIn = true;
				this.loginAttempts = 0;
			} else {
				this.loginAttempts += 1;
			}
		}

	}

	public int getLoginAttempts() {
		return this.loginAttempts;
	}

	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;

	}

	public void resetLoginAttempts() {
		this.loginAttempts = 0;

	}

	public void transferMoney(BankAccount toAccount, long amount, String password) {
		if (loggedIn) {
			bankAccount.transferMoney(toAccount, amount, password);
		}
	}

	public void printBalance() {
		if (loggedIn) {
			this.bankAccount.printBalance();
		}
	}

	public void printStatement() {
		if (loggedIn) {
			this.bankAccount.printStatement();

		}
	}

}
