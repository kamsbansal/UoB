import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Ex3PublicTests {

	private BankAccountAdministrator root, deputy;
	private Customer customerMark, customerKam, customerBoon;
	private BankAccount bankAccountMark, bankAccountKam, bankAccountBoon;
	private BankAccountStandardUser mark, kam, boon;

	@Before
	public void setUp() {
		root = new BankAccountAdministrator("Zack", "keptLockerUser");
		deputy = new BankAccountAdministrator("Craig", "depUser");
		customerMark = new Customer("Mark", "m", "Bham", "0121");
		customerKam = new Customer("Kam", "f", "Bham", "0121");
		customerBoon = new Customer("Boon", "x", "Bham", "0121");
		bankAccountMark = new BankAccount(customerMark, "tonite");
		bankAccountKam = new BankAccount(customerKam, "peppe");
		bankAccountBoon = new BankAccount(customerBoon, "cherry");
		mark = new BankAccountStandardUser("Mark", "toniteUser", bankAccountMark);
		kam = new BankAccountStandardUser("Kam", "peppeUser", bankAccountKam);
		boon = new BankAccountStandardUser("Boon", "cherryUser", bankAccountBoon);
	}

	// Mark logs in successfully and transfers
	// some money to Kam's bank account.
	@Test
	public void test1() {
		mark.login("toniteUser");

		// expected number of failed login attempts is 0
		int expectedLoginAttempts = 0;
		int actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertTrue(mark.getLoggedIn());

		// transfer fails because of insufficient funds
		mark.transferMoney(bankAccountKam, 200, "tonite");

		double expectedBalance = 100;
		double actualBalance = kam.getBankAccount().getBalance();

		assertEquals(expectedBalance, actualBalance, 0.00001);

		// transfer succeeds
		mark.transferMoney(bankAccountKam, 50, "tonite");
		double expectedBalanceMark = 50;
		double actualBalanceMark = mark.getBankAccount().getBalance();
		assertEquals(expectedBalanceMark, actualBalanceMark, 0.00001);
		double expectedBalanceKam = 150;
		double actualBalanceKam = kam.getBankAccount().getBalance();
		assertEquals(expectedBalanceKam, actualBalanceKam, 0.00001);
	}

	// Kam makes 1 failed login attempt,
	// logs in using the correct password
	// and logs out. Then Kam tries to transfer some
	// money to Boon's bank account but forgets the password
	@Test
	public void test2() {
		kam.login("peppeuser");

		int expectedLoginAttempts = 1;
		int actualLoginAttempts = kam.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);

		assertFalse(kam.getLoggedIn());

		kam.login("peppeUser");
		expectedLoginAttempts = 0;
		actualLoginAttempts = kam.getLoginAttempts();
		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertTrue(kam.getLoggedIn());

		kam.logout();

		assertFalse(kam.getLoggedIn());

		kam.setPassword("linseeedUser");
		kam.transferMoney(bankAccountBoon, 20, "linseed");

		double expectedBalance = 100;
		double actualBalance = boon.getBankAccount().getBalance();

		assertEquals(expectedBalance, actualBalance, 0.00001);

	}

	// Boon makes 2 failed login attempts and
	// then logs in using the correct password
	@Test
	public void test3() {

		// First failed login attempt
		boon.login("cheryUser");

		int expectedLoginAttempts = 1;
		int actualLoginAttempts = boon.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);

		assertFalse(boon.getLoggedIn());

		// Second failed login attempt
		boon.login("chherruser");
		expectedLoginAttempts = 2;
		actualLoginAttempts = boon.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(boon.getLoggedIn());

		// Third attempt is successful
		boon.login("cherryUser");

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertTrue(boon.getLoggedIn());

	}

	// Mark makes 4 failed login attempts and
	// calls admin. Admin logs in successfully
	// and then resets Kam's password and Kam's login attempts to 0.
	@Test
	public void test4() {

		// First failed login attempt
		mark.login("tonightUser");

		int expectedLoginAttempts = 1;
		int actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);

		assertFalse(mark.getLoggedIn());

		// Second failed login attempt
		mark.login("toniteUssr");
		expectedLoginAttempts = 2;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Third failed login attempt
		mark.login("tooniteuser");
		expectedLoginAttempts = 3;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Fourth failed login attempt
		mark.login("TonightUser");
		// Failed login attempts remain 3
		expectedLoginAttempts = 3;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Administrator resets john's password
		root.login("keptLockerUser");
		root.addUser(mark);
		root.resetAccount(mark, "dayandnite");

		// Mark logs in successfully using the
		// new password
		mark.login("dayandnite");

		expectedLoginAttempts = 0;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertTrue(mark.getLoggedIn());

	}

	// Mark makes 4 failed login attempts and
	// calls admin. Admin forgets to log in and tries
	// to reset Mark's password.
	@Test
	public void test5() {

		// First failed login attempt
		mark.login("wehatUser");

		int expectedLoginAttempts = 1;
		int actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);

		assertFalse(mark.getLoggedIn());

		// Second failed login attempt
		mark.login("wheatuser");
		expectedLoginAttempts = 2;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Third failed login attempt
		mark.login("wheatuser");
		expectedLoginAttempts = 3;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Fourth failed login attempt
		mark.login("wheatuser");
		// Failed login attempts remain 3
		expectedLoginAttempts = 3;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Administrator tries to reset mark's password
		// without logging in
		root.addUser(mark);
		root.resetAccount(mark, "wheatUser1");

		// John tries to log in again
		mark.login("wheatUser1");

		// login attempts still 3
		expectedLoginAttempts = 3;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());
	}

	// Kam makes 4 failed login attempts and
	// calls Admin. Admin calls in deputy
	// to reset Kam's password.
	@Test
	public void test6() {

		// First failed login attempt
		kam.login("wehatUser");

		int expectedLoginAttempts = 1;
		int actualLoginAttempts = kam.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);

		assertFalse(kam.getLoggedIn());

		// Second failed login attempt
		kam.login("wheatuser");
		expectedLoginAttempts = 2;
		actualLoginAttempts = kam.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(kam.getLoggedIn());

		// Third failed login attempt
		kam.login("wheatuser");
		expectedLoginAttempts = 3;
		actualLoginAttempts = kam.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(kam.getLoggedIn());

		// Fourth failed login attempt
		kam.login("wheatuser");
		// Failed login attempts remain 3
		expectedLoginAttempts = 3;
		actualLoginAttempts = kam.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(kam.getLoggedIn());

		// Administrator resets Kam's password
		deputy.login("depUser");
		deputy.addUser(kam);
		deputy.resetAccount(kam, "rogerUser1");

		// Kam logs in successfully using the
		// new password
		kam.login("rogerUser1");

		expectedLoginAttempts = 0;
		actualLoginAttempts = kam.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertTrue(kam.getLoggedIn());

		kam.logout();
		assertFalse(kam.getLoggedIn());
	}

	// Boon makes 4 failed login attempts and
	// calls admin. Admin calls in deputy
	// to reset Mark's password. But deputy fails to log in
	// and tries to reset password.
	@Test
	public void test7() {

		// First failed login attempt
		boon.login("wehatUser");

		int expectedLoginAttempts = 1;
		int actualLoginAttempts = boon.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);

		assertFalse(boon.getLoggedIn());

		// Second failed login attempt
		boon.login("wheatuser");
		expectedLoginAttempts = 2;
		actualLoginAttempts = boon.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(boon.getLoggedIn());

		// Third failed login attempt
		boon.login("wheatuser");
		expectedLoginAttempts = 3;
		actualLoginAttempts = boon.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(boon.getLoggedIn());

		// Fourth failed login attempt
		boon.login("wheatuser");
		// Failed login attempts remain 3
		expectedLoginAttempts = 3;
		actualLoginAttempts = boon.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(boon.getLoggedIn());

		// Deputy tries to reset Boon's password
		// without logging in
		deputy.addUser(boon);
		deputy.resetAccount(boon, "cherryUser1");

		// Boon tries to log in again
		boon.login("cherryUser1");

		// login attempts still 3
		expectedLoginAttempts = 3;
		actualLoginAttempts = boon.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(boon.getLoggedIn());

	}

	// Mark tries to transfer money to boon. Makes 4 failed login attempts,
	// Calls Admin. Admin resets password logs in using the correct password
	// and logs out. Then Mark logs in and makes a transfer to Boon.
	@Test
	public void test8() {
		// First failed login attempt
		mark.login("2niteUser");

		int expectedLoginAttempts = 1;
		int actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);

		assertFalse(mark.getLoggedIn());

		// Second failed login attempt
		mark.login("tonniteuser");
		expectedLoginAttempts = 2;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Third failed login attempt
		mark.login("toniteuser");
		expectedLoginAttempts = 3;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Fourth failed login attempt
		mark.login("ToniteUSer");
		// Failed login attempts remain 3
		expectedLoginAttempts = 3;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertFalse(mark.getLoggedIn());

		// Administrator resets Mark's password
		root.login("keptLockerUser");
		root.addUser(mark);
		root.resetAccount(mark, "toniteUser1");

		// Mark logs in successfully using the
		// new password
		mark.login("toniteUser1");

		expectedLoginAttempts = 0;
		actualLoginAttempts = mark.getLoginAttempts();

		assertEquals(expectedLoginAttempts, actualLoginAttempts);
		assertTrue(mark.getLoggedIn());

		mark.transferMoney(bankAccountBoon, 30, "tonite");
		double expectedBalanceMark = 70;
		double actualBalanceMark = mark.getBankAccount().getBalance();
		assertEquals(expectedBalanceMark, actualBalanceMark, 0.00001);
		double expectedBalanceBoon = 130;
		double actualBalanceBoon = boon.getBankAccount().getBalance();
		assertEquals(expectedBalanceBoon, actualBalanceBoon, 0.00001);
	}
}
