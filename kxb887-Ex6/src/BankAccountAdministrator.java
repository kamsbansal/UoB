import java.util.ArrayList;

public class BankAccountAdministrator extends BankAccountUser implements BankAccountAdministratorInterface {

	private ArrayList<BankAccountUser> bankAccountUsers;

	/**
	 * constructor
	 * 
	 * @param username
	 * @param password
	 */
	public BankAccountAdministrator(String username, String password) {
		super(username, password);
		bankAccountUsers = new ArrayList<BankAccountUser>();
	}

	public void login(String password) {
		if (checkPassword(password))
			setLoggedIn(true);

	}

	public void addUser(BankAccountUser user) {
		bankAccountUsers.add(user);

	}

	public void resetAccount(BankAccountUser bankAccountUser, String password) {
		if (loggedIn) {
			bankAccountUser.setPassword(password);
		}
		if (loggedIn && (bankAccountUser instanceof BankAccountStandardUser)) {
			((BankAccountStandardUser) bankAccountUser).setLoginAttempts(0);
		}
	}
}

//	@Override
// public void logout() {

///	}

// @Override
// public boolean passwordCorrect(String password) {
// return false;
//	}

// @Override
// public boolean getLoggedIn() {
// return false;
// }

//}
