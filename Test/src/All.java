
** method for printing one-dimensional array of int **

public static void print(int[] a) {
    System.out.print("[");
    for (int i = 0; i < a.length -1; i++) {
        System.out.print(a[i] + ", ");
    }
    System.out.println(a[a.length-1] + "]");
}

/*
 *  A main method to test the conditional operator.
 */
public static void main(String[] args) {
    int[] arr = {5, -3, 0, 7, -12, -11, -20, 4};
    int[] result = new int[arr.length];
    int[] result1 = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 0) {
            result[i] = arr[i] ;
        } else {
            result[i] = -arr[i];
        }
    }

    // A more concise way of doing the initialization using the conditional.
    for (int i = 0; i < arr.length; i++) {
        result1[i] = arr[i] >=0 ? arr[i] : -arr[i];
    }

    print(arr);
    print(result);
    print(result1);
}
}
****************************************************************
**multiplication table **

public static int[][] multiplicationTable(int n) {
  int[][] multi = new int[n][n];
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      multi[i][j] = i * j;
    }
  }
  return multi;
}

/**
 * Prints out a two-dimensional array (with width up to 3 digits for a single
 * number).
 *
 * @param a The array to be printed.
 */
public static void printArray(int[][] a) {
  for (int[] element : a) {
    for (int el : element) {
      System.out.printf("%4d", el);
    }
    System.out.println();
  }
}

/*
 * A main method to run the program up to 12x12.
 */
public static void main(String[] args) {
  printArray(multiplicationTable(15));
}

}
********************************************************************

/** BankAccount is a class for a very simple bank account created
 *  from a bank account and the name of the account holder.
 *  We distinguish three field variable:
 *  <pre>
 *   accountNumber, an int to uniquely find an account
 *   accountName, the name (or names) of the account holder(s), and
 *   balance, how much money is in the account.
 *  </pre>
 *  @author   Manfred Kerber
 *  @version  2017-10-04
 */
public class BankAccount{
    private int     accountNumber;
    private String  accountName;
    private int     balance;

    /** BankAccount is a constructor  for a very simple bank account created
     *  @param  accountNumber is the account number as int
     *  @param  accountName the account name as String
     */
    public BankAccount(int     accountNumber,
		       String  accountName){
        this.accountNumber      = accountNumber;
        this.accountName        = accountName;
        this.balance            = 0;
    }

    /* Now we write methods to get the parts of a BankAccount,
     * so called accessor methods.
     */

    /**
     *  @return the account number of a BankAccount as int
     */
    public int getAccountNumber(){
        return accountNumber;
    }

    /**
     *  @return the accountName as a String
     */
    public String getAccountName(){
	return accountName;
    }

    /**
     *  @return the balance of a BankAccount
     */
    public int getBalance(){
        return balance;
    }

    /** toString defines how to print a BankAccount
     *
     *  @return  the print type of an account
     */
    public String toString(){
	return "Account number: " + accountNumber +
            " Account name: "  + accountName   +
            " Balance: "       + balance;
    }

    /* Now we write methods to set the parts of a bank account,
     * so called setters.
     */

    /**
     *  sets the account number of a BankAccount
     * @param accountNumber for the changed account number
     */
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     *  sets the balance of a BankAccount
     *  @param balance the new balance on the account
     */
    public void setBalance(int balance){
        this.balance = balance;
    }

    /**
     *  this method checks whether the BankAccount is equal to a
     *  second BankAccount
     *  return true if the current BankAccount (*this*) is equal
     *         to the BankAccount it is compared to, that is,
     *         if it agrees with it in number, name, balance.
     *  @param a The second BankAccount.
     *  @return true if and only if the this bankaccount is equal to the
     *  bankaccount a wrt account number, account name, and balance.
     *  NOTE: equality is a tricky concept!
     */
    public boolean equals(BankAccount a){
        return
            (this.getAccountNumber() == a.getAccountNumber()) &&
            (this.getAccountName().equals(a.getAccountName())) &&
            (this.getBalance() == a.getBalance());
    }

    /** the amount will be taken from the balance
     *  @param  amount The amount to be withdrawn.
     */
    public void withdraw(int amount){
	setBalance(getBalance() - amount);
    }

    /** the amount will be added the balance
     *  @param amount The amount to be paid in.
     */
    public void payIn(int amount){
	setBalance(getBalance() + amount);
    }
}
****
/**  This class is to test the BankAccount class and its methods.
 *   We create some objects of class BankAccount and
 *   get some parts back.
 *   @version 2017-10-04
 *   @author Manfred Kerber
 */
public class BankAccountMain{

    public static void main(String[] args) {
	BankAccount manfredBankAccount =  new BankAccount(1, "Manfred");
	// This creates account number 1 with an
        // initial balance of pounds 0.

	System.out.println(manfredBankAccount);

        manfredBankAccount.withdraw(200);
	System.out.println(manfredBankAccount);

        manfredBankAccount.payIn(100);
	System.out.println(manfredBankAccount);

    }
}
*****
/** DateMain class is trying out Dates as defined in the Date.java class
 *  @author   Manfred Kerber
 *  @version  2018-08-20
 */
public class DateMain {
    public static void main(String[] args) {
	Date lectureDate =
           new Date(10, "October", 2018);

        Date endOfTerm =
	   new Date(14, "December", 2018);

        System.out.println("The month of today's lecture is "
                            + lectureDate.getMonth() + ".");

	//        System.out.println("The day of today's lecture is "
        //                    + lectureDate.day + ".");

        System.out.println("The year of today's lecture is "
                            + lectureDate.getYear() + ".");

        System.out.println("The weekday of today's lecture is "
                            + lectureDate.weekDay() + ".");


        System.out.println("The last month of the autumn term is "
                            + endOfTerm.getMonth() + ".");

        System.out.println("The autumn term ends still in the year "
                            + endOfTerm.getYear() + ".");

        System.out.println("The last day of the term is "
                            + endOfTerm.weekDay() + ".");

	System.out.println(lectureDate);
	System.out.println(endOfTerm);

        lectureDate.setDay(11);
	System.out.println(lectureDate);

    }
}
****************
/** Date is a class for the representation of dates in the form "3 October 2012"
 *  @author   Manfred Kerber
 *  @version  2017-10-04
 */
public class Dater{
    private int    day;
    private String month;
    private int    year;
    private String weekDay; // should not be a field variable

    /**
     * This constructor creates a date from the three parts: day,
     * month, and year, which are an int, a String, and an int,
     * respectively.
     * @param day The day of the month in a date.
     * @param month The month as a String, e.g. "October".
     * @param year The year such as 2017.
     */
    public Date (int    day,
                 String month,
                 int    year){
        this.day      = day;
        this.month    = month;
        this.year     = year;
        weekDay       = "unkown";
    }

    /* Now we write methods to get the parts of a Date,
     * so called accessor methods.
     */

    /**
     *  @return The day of a Date.
     */
    public int getDay(){
        return day;
    }

    /**
     *  @return The month of a Date.
     */
    public String getMonth(){
        return month;
    }

    /**
     *  @return The year of a Date .
     */
    public int getYear(){
        return year;
    }

    /**
     *  @return The weekDay of a Date
     */
    public String weekDay(){
        return weekDay;
    }

    /**
     *  @return The print format of a Date, e.g.,
     *          European style or American style
     */
    public String toString(){
	return day + " " + month + " " + year;   // European way
	//return month + " " + day + ", " + year;   // American way
    }

    /* Now we write methods to set the parts of a Date,
     * so called setters.
     */

    /**
     *  @param day the day is set to newDay
     */
    public void setDay(int day){
        this.day = day;
    }

    /**
     *  @param month the month is set to newMonth
     */
    public void setMonth(String month){
        this.month = month;
    }

    /**
     *  @param year the year is set to newYear
     */
    public void setYear(int year){
        this.year = year;
    }
}
*************
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  This file contains 5 JUnit tests for demonstrating assertEquals,
 *  assertFalse, and asserTrue.
 *
 *  Note that the class does not contain a main method, that is, after
 *  compilation (by javac) you CANNOT run it by invoking "java JUnitExample",
 *  but you have to run it by
 *  "java org.junit.runner.JUnitCore JUnitExample".
 *
 *  @author Manfred Kerber
 *  @version 2015-10-06
 */

public class JUnitExample {

    @Test
        public void assertEqualsTest1() {
        assertEquals("failure in assertEqualsTest1: " +
                     " expected string not equal given string", "text",
                     "te"+ "xt");
    }

    @Test
        public void assertEqualsTestInt() {
        assertEquals("failure in assertEqualsTestInt: " +
                     " expected 4 == 2 * 2", 4, 2 * 2);
    }

    @Test
        public void assertEqualsTestSqrt() {
        assertEquals("failure in assertEqualsSqrt: " +
                     " expected sqrt(5) * sqrt(5) ~= 5", 5,
                     Math.sqrt(5) * Math.sqrt(5), 0.00001);
    }

    @Test
        public void assertEqualsTest2() {
        assertEquals("failure in assertEqualsTest2: " +
                     " expected string not equal given string", 2.0, 2.1, 0.11);
    }

    @Test
        public void assertFalseTest() {
        assertFalse("failure in assertFalseTest: " +
                    " expected false but got true", 3 == 4);
    }

    @Test
      public void assertTrueTest() {
        assertTrue("failure in assertTrueTest: " +
                   "expected true but got false", 2 < 5);
    }
}

*****************
Write a class Patient with the ﬁeld variables name, id, address, phoneNumber all of type String. Generate a constructor, getters, setters, and a toString method following the Source tab in Eclipse. Add an equals methods.
/**
 *   Class to store patient data with the fields name, id, address,
 *   phoneNumber all of type String.
 *   @author Manfred Kerber
 *   @version   2016-10-07
 */

public class Patient {
    private String name;
    private String id;
    private String address;
    private String phoneNumber;


    /**
     *   Constructor reuses all four field variables as parameters
     *   @param name The name of the patient.
     *   @param id The id number of the patient.
     *   @param address The address of the patient.
     *   @param phoneNumber The telephone number of the patient.
     */
    public Patient(String name, String id, String address, String phoneNumber) {
        super();
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    /**
     *   getter for the name
     *   @return The name of the patient.
     */
    public String getName() {
        return name;
    }

    /**
     *   @param name The new name of the patient.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     *   getter for the id
     *   @return The id of the patient.
     */
    public String getId() {
        return id;
    }


    /**
     *   @param id The new id of the patient.
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     *   getter for the address
     *   @return The address of the patient.
     */
    public String getAddress() {
        return address;
    }


    /**
     *   @param address The new address of the patient.
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     *   getter for the phone number
     *   @return The phone number of the patient.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     *   @param phoneNumber The new phone number of the patient.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     *   toString method
     *   @return The patient data in a readable format
     */
    @Override
    public String toString() {
        return name + " (" + id + ")\n" + address + " (Tel:" + phoneNumber + ")";
    }

    /**
     *   equals method
     *   @param p A second patient to compare to.
     *   @return true if and only if the this object corresponds to
     *   the argument in all components.
     */
    public boolean equals(Patient p) {
        return this.getName().equals(p.getName()) &&
            this.getId().equals(p.getId()) &&
            this.getAddress().equals(p.getAddress()) &&
            this.getPhoneNumber().equals(p.getPhoneNumber());
    }

    public static void main(String[] args) {
    	Patient p1 = new Patient("John Smith", "123", "SoCS", "0121414");
    	Patient p2 = new Patient("Mary Miller", "124", "SoCS", "0121414");
    	System.out.println(p1);
    	System.out.println(p2);
    	System.out.println(p1.equals(p1));
    	System.out.println(p1.equals(p2));
    }
}
***
import java.util.ArrayList;

/** BankAccount is a class for a very simple bank account created
 *  from a bank account and the name of the account holder.
 *  @author   Manfred Kerber
 *  @version  13 October 2015
 */
public class BankAccount{
    private int     accountNumber;
    private String  accountName;
    private Amount   balance;
    // private ArrayList<Transaction> statement;

    /** BankAccount is a constructor  for a very simple bank account created
     *  @param  accountNumber is the account number as int
     *  @param  accountName the account name as String
     */
    public BankAccount(int accountNumber, String  accountName){
        this.accountNumber      = accountNumber;
        this.accountName        = accountName;
        this.balance            = new Amount(0,0);
        // this.statement = new ArrayList<Transaction>();
    }

    /* Now we write methods to get the parts of a BankAccount,
     * so called accessor methods.
     */

    /**
     *  @return the account number of a BankAccount as int
     */
    public int getAccountNumber(){
     return accountNumber;
    }

    /**
     *  @return the accountName as a String
     */
    public String getAccountName(){
	return accountName;
    }

    /**
     *  @return the balance of a BankAccount
     */
    public Amount getBalance(){
     return balance;
    }

    /** toString defines how to print a BankAccount
     *
     *  @return  the print type of an account
     */
    public String toString(){
	return "Account number: " + accountNumber +
  	       " Account name: "  + accountName   +
               " Balance: "       + balance;
    }

    /* Now we write methods to set the parts of a bank account,
     * so called setters.
     */

    /**
     *  sets the account number of a BankAccount
     * @param newAccountNumber for the changed account number
     */
    public void setAccountNumber(int newAccountNumber) {
        accountNumber = newAccountNumber;
    }

    /**
     *  sets the balance of a BankAccount
     *  @param  newBalance the new balance on the account
     */
    public void setBalance(Amount newBalance){
        balance = newBalance;
    }

    /** the amount will be added to the balance
     *  @param  amount the amount to be paid in
     */
    public void payin(Amount amount){
	setBalance(getBalance().add(amount));
    }

    /** the amount will be taken from the balance
     *  @param  amount the amount to be withdrawn
     */
    public void withdraw(Amount amount){
	if (this.getBalance().biggerOrGreater(amount)) {
	    setBalance(getBalance().subtract(amount));
	}
	else System.out.println("Insufficient funds");
    }
}
**********************************************
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Some tests for the add method in the Amount class.
 */
public class AmountTest {
    private Amount a = new Amount(3,14);
    private Amount b = new Amount(2,15);
    private Amount c = a.add(b);

    @Test public void addTest1(){
	assertEquals(5, c.getPounds());
    }

    @Test public void addTest2(){
	assertEquals(29, c.getPence());
    }

    @Test public void addTest3(){
	assertEquals(529, c.getFullpence());
    }

    @Test public void addTest4(){
	assertTrue(c.equals(new Amount(5,29)));
    }
}
****
/**
 * With this class we want to demonstrate some problems with double.
 * In particular, we argue that double is not a good type for
 * implementing the amount in a bank account
 * @author mmk
 * @version 2013-10-15
 */
public class DoubleMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double amount = 124.16;
        double withdraw = 11.48;
        amount = amount - withdraw;

        System.out.println("New amount " + amount);
    }
}
****
port java.util.ArrayList;

/** ArrayList as a generalization of arrays with no fixed size.
 *  We create an empty ArrayList and different elements to it.
 *  @author   Manfred Kerber
 *  @version  20 August 2018
 */
public class ArrayListMain {

    /**
     *  The following method prints an ArrayList of type String.
     *  @param items The ArrayList to be printed.
     */
    public static void print(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++){
            System.out.printf("%s ", items.get(i));}
        System.out.println();
    }

    public static void main(String[] args) {
	ArrayList<String> items = new ArrayList<String>();
	items.add("this");
	items.add("is");
	items.add("an");
	items.add("even");
	items.add("longer");
	items.add("longer");
	items.add("list");
        print(items);
    }
}
*******************************
/**
 * In this file introduce examples of 1-dimensional and 2-dimensional
 * arrays, how to initialize them and how to iterate over their
 * elements.
 * @author Manfred Kerber
 * @version 2015-10-13
 */

public class ArrayMain{
    /**
     *  @param a A one-dimensional array to be printed.
     *  Using standard for loop.
     */
    public static void print(int[] a){
	for (int i=0; i < a.length; i++){ //i.e. in the example from 0..14
	    System.out.print(a[i] + " ");
	}
        System.out.println();
    }

    /**
     *  @param a A one-dimensional array to be printed.
     *  Using for loop over array.
     */
    public static void printAlternative(int[] a){
	for (int element : a) {
	    System.out.print(element + " ");
	}
	System.out.println();
    }


    /**
     *  @param a A two-dimensional array to be printed.
     *  Using two standard for loops.
     */
    public static void print(int[][] a){
    	for (int i=0; i<a.length; i++) {
	    for (int j=0; j<a[0].length; j++){
		System.out.printf("%4d ",a[i][j]);
	    }
	    System.out.println();
	}
	System.out.println();
    }

    /**
     *  @param a A two-dimensional array to be printed.
     *  Using two for loop over array.
     */
    public static void printAlternative(int[][] a){
	for (int[]  element : a){
	    for (int el : element){
		System.out.printf("%4d ",el);
	    }
	    System.out.println();
	}
	System.out.println("\n");
    }

    public static void main(String[] args) {

	int length = 15;
	int[] a = new int[length];
	System.out.println("Initial values:");
        print(a);

	System.out.println("Square number values, standard for-loop:");
	for (int i=0; i < length; i++){
	    a[i] = i*i;
	}
        print(a);
        printAlternative(a);

	System.out.println("Initialization for a one-dimensional array");
	int [] b = {2, 5, 24, 6};

	print(b);


////////////////////////////////////////////////////////////////////////////////

	System.out.println("Initialization for a two-dimensional array");
	int [][] d = {{2,   3,  4},
                      {5,   6,  7},
                      {24, 25, 26},
	              {6,   7,  8}};
	System.out.println("standard for-loops:");
        print(d);
	System.out.println("simplified for-loops:");
        printAlternative(d);


        length = 20;
        int width  = 20;
	System.out.println("Multiplication Table");
	int[][] multi = new int[length][width];
	for (int i=0; i < length; i++){
	    for (int j=0; j< width; j++){
		multi[i][j] = i*j;
	    }
	}
        print(multi);
    }
}
************************************
import java.util.ArrayList;

/** BankAccount is a class for a very simple bank account created
 *  from a bank account and the name of the account holder.
 *  @author   Manfred Kerber
 *  @version  13 October 2015
 */
public class BankAccount{
    private int     accountNumber;
    private String  accountName;
    private Amount   balance;
    // private ArrayList<Transaction> statement;

    /** BankAccount is a constructor  for a very simple bank account created
     *  @param  accountNumber is the account number as int
     *  @param  accountName the account name as String
     */
    public BankAccount(int accountNumber, String  accountName){
        this.accountNumber      = accountNumber;
        this.accountName        = accountName;
        this.balance            = new Amount(0,0);
        // this.statement = new ArrayList<Transaction>();
    }

    /* Now we write methods to get the parts of a BankAccount,
     * so called accessor methods.
     */

    /**
     *  @return the account number of a BankAccount as int
     */
    public int getAccountNumber(){
     return accountNumber;
    }

    /**
     *  @return the accountName as a String
     */
    public String getAccountName(){
	return accountName;
    }

    /**
     *  @return the balance of a BankAccount
     */
    public Amount getBalance(){
     return balance;
    }

    /** toString defines how to print a BankAccount
     *
     *  @return  the print type of an account
     */
    public String toString(){
	return "Account number: " + accountNumber +
  	       " Account name: "  + accountName   +
               " Balance: "       + balance;
    }

    /* Now we write methods to set the parts of a bank account,
     * so called setters.
     */

    /**
     *  sets the account number of a BankAccount
     * @param newAccountNumber for the changed account number
     */
    public void setAccountNumber(int newAccountNumber) {
        accountNumber = newAccountNumber;
    }

    /**
     *  sets the balance of a BankAccount
     *  @param  newBalance the new balance on the account
     */
    public void setBalance(Amount newBalance){
        balance = newBalance;
    }

    /** the amount will be added to the balance
     *  @param  amount the amount to be paid in
     */
    public void payin(Amount amount){
	setBalance(getBalance().add(amount));
    }

    /** the amount will be taken from the balance
     *  @param  amount the amount to be withdrawn
     */
    public void withdraw(Amount amount){
	if (this.getBalance().biggerOrGreater(amount)) {
	    setBalance(getBalance().subtract(amount));
	}
	else System.out.println("Insufficient funds");
    }
}
*******************************************************
/**  This class is to test the BankAccount class and its methods.
 *   We create some objects of class BankAccount and
 *   get some parts back.
 */
public class BankAccountMain{
    public static void main(String[] args) {
	BankAccount manfredBankAccount =  new BankAccount(1, "Manfred");
	// This creates account number 1 and account name "Manfred"
        // with an initial balance of pounds 0.

	System.out.println(manfredBankAccount);
        System.out.println();

	Amount manfredsPayIn = new Amount(430,65);
	System.out.println("Pay in " + manfredsPayIn);
        manfredBankAccount.payin(manfredsPayIn);
	System.out.println(manfredBankAccount);
        System.out.println();

	Amount manfredsWithdrawal = new Amount(4,35);
	System.out.println("Withdraw " + manfredsWithdrawal);
        manfredBankAccount.withdraw(manfredsWithdrawal);
	System.out.println(manfredBankAccount);
        System.out.println();

	Amount manfredsWithdrawal2 = new Amount(444,35);
	System.out.println("Withdraw " + manfredsWithdrawal2);
        manfredBankAccount.withdraw(manfredsWithdrawal2);
	System.out.println(manfredBankAccount);
    }
}
**************************************************************
public class ConditionalMain{
    /* if has the structure if (<bool>) {<command>*}
     *   or in case of a single command if (<bool>)<command>
     *
     * The command(s) are/is only executed if the boolean expression bool
     * evaluates to true.
     *
     * if else in an if (<cond>) {<commands>*} else {<commands>*} construct
     *   first the condition <cond> is evaluated. If it is true the commands
     *   following it will be executed, else the ones following the else.
     *
     *  Note this program needs one argument to run, ie., call it eg. as
     *  java ConditionalTest evening
     *
     *  @version 2015-10-13
     *  @author Manfred Kerber
     */

    public static void main(String[] args) {
 	int i = -5;
	if (i < 0){
            i = -i;
        }
	System.out.println(i);

	double x = -2.5;
	if (x >= 0){
            x = Math.sqrt(x);
        } else {
            x = Math.sqrt(-x);
        }
	System.out.println(x);

	if (x == 0) {
            System.out.println(x);
        } else {
            System.out.println(1/x);
        }

	/* Test for equality on String type is .equals, not == */
	String str = args[0];
	if (str.equals("morning"))
	    System.out.println("Good morning, have a lovely day.");
	else if (str.equals("noon"))
	    System.out.println("Enjoy your lunch.");
	else if (str.equals("afternoon"))
	    System.out.println("Good afternoon, see you soon.");
	else if (str.equals("evening"))
	    System.out.println("See you tomorrow.");
	else
	    System.out.println("Oops. I don't understand \"" + str + "\".");
    }
}
*****************************************************************************
/**
 * With this class we want to demonstrate some problems with double.
 * In particular, we argue that double is not a good type for
 * implementing the amount in a bank account
 * @author mmk
 * @version 2013-10-15
 */
public class DoubleMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double amount = 124.16;
        double withdraw = 11.48;
        amount = amount - withdraw;

        System.out.println("New amount " + amount);
    }
}
*****************************************************************************
/*
 *
 * A for loop is similar to a while loop, however, in the round brackets
 * we declare and initialize an iteration variable, separate by a semicolon the
 * termination condition and again by a semicolon the update expression for the
 * iteration variable.
 *
 * Again in order to understand non-trivial for loops we need to give an
 * invariant, that is, a boolean expression which is true before the loop
 * is entered and is true again after each execution of the body in
 * full. That is, it is also true if and when the loop terminates.
 *
 * In order to guarantee the termination of a for loop we consider the
 * iteration variable and make sure that it is firstly bounded (from
 * below or above) and secondly that it is either decreased or increased
 * (resp.) by at least 1 by each execution of the loop.
 *
 * Careful, better test for <= or >= than for == or !=. Take also care
 * that if you take a bound from below (above) that the expression is
 * actually decreasing (increasing, resp.).
 *
 * @version 2015-10-13
 * @author Manfred Kerber
 */
****************************************************************************

/*
 *
 * Example of a for loop which prints numbers from 0 to 7.
 *
 * INVARIANT:   only trivial invariant: true
 * TERMINATION: the variable i is initialized to 0 and increased in
 *  each loop by 1 and will eventually be bigger than the upper bound 7
 *
 */

public class ForMain{
    public static void main(String[] args){

	int n = 7;

	System.out.println("for (int i = 0 ; i <=n ; i++)");
	for (int i = 1 ; i <=n ; i++){
		System.out.print(i + " ");
	    }
	System.out.println();
    }
}
**********************************************************************
/*
 * Write a loop that sums up the first n number of type int, that is,
 *   that computes 0+1+2+3+4+ ...+ (n-1)+n. Test this for n = 100.
 */

public class ForWhileMain{
    public static void main(String[] args)
    {

	// A for loop
	int n = 100;
	int sum = 0;

	for (int i = 0 ; i <=n ; i++){
            sum = sum+i;
        }
	System.out.println("The sum 0+1+2+ ... +" + n + " is equal to " + sum + ".");


	// A while loop
        sum = 0;
        int i=0;
        while (i<=n){
	    sum = sum+i;
	    i= i+1;
	}
        System.out.println("The sum 0+1+2+ ... +" + n + " is equal to " + sum + ".");
    }
}
*****************************************************************************************
/** INVARIANT: gcd(a,b) == gcd(x,y)
 *
 *  TERMINATION: either x or y is decreased in each run of the loop, x and
 *  y will always be positive (assumed we start with positive a and b).
 *
 *  RESULT: if x = y then gcd(a,b) == gcd(x+y/2,x+y/2) == x
 *
 * // Example adapted from a lecture by Dijkstra //
 * @author Manfred Kerber
 * @version 2013-10-22
 */
public class GcdLcmMain {
    //    /*
    public static void main(String[] args) {
	int a,b,x,y;
        // Integer.parseInt transforms an integer into a string,
        // e.g. "123" --> 123.
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	x = Math.abs(a);
	y = Math.abs(b);
	while (x>y | y>x) {
	    // System.out.println("x: " + x + " y: " + y);
	    if (x>y){
		x = x - y;
	    }
	    else if (y>x) {
		y = y - x;
	    }
	}
	System.out.println("gcd("+a+","+b+")=="+(x+y)/2);
    }
}

//*/


/*

  INVARIANT: gcd(a,b) == gcd(x,y) && 2*a*b == x * v + y * u
  TERMINATION: either x or y is decreased in each run of the loop, x and
           y will always be positive (assumed we start with positive a and b).

  RESULT: if x = y then gcd(a,b) == (x+y)/2 == x == y.
          Hence (u+v)/2 == a*b/gcd(a,b),
          hence (u+v)/2 == lcm(a,b).

	  // Example adapted from a lecture by Dijkstra //
*/

/*
    public static void main(String[] args) {
	int a,b,x,y,u,v;
        // Integer.parseInt transforms an integer into a string,
        // e.g. "123" --> 123.
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
        // Math.abs is used in order to allow negative arguments as well.
	x = Math.abs(a); y = Math.abs(b);
	u = Math.abs(a); v = Math.abs(b);

	while (x>y | y>x) {
	    System.out.println("x: "+x+" y: "+y+" u: "+u+" v: "+v+
			       " x*v+y*u: "+(x*v+y*u));

		if (x>y) {
		    x = x - y; u = u + v;
		}
		else if (y>x) {
		    y = y - x; v = v + u;
		}
	}
	System.out.println("x: "+x+" y: "+y+" u: "+u+" v: "+v+
                           " x*v+y*u: "+(x*v+y*u));
	System.out.println("gcd("+a+","+b+")=="+(x+y)/2);
	System.out.println("lcm("+a+","+b+")=="+(u+v)/2);
    }
}

*/
************************************************************************************
import java.util.Date;
/*
 * Java goes with a minimal set of classes and methods. However, it is
 * also a language which has considerably grown. New packages have
 * been created and can be used by importing them as with the import
 * command above.
 */

public class PrintfMain {
/* printf allows printing in a flexible way. It takes the following
    conversions: (taken from Horstmann, Cay, 2008, Core Java, p. 66)


    char type                                          example
  ------------------------------------------------------------
    d    Decimal Integer                               159
    x    Hexadecimal Integer                           9f
    o    Octal Integer                                 237
    f    Fixed-point floating point                    15.9
    e    exponential floating point                    1.59e+01
    g    general floating point (shorter of e and f)
    a    Hexadecimal floating point                    0x1.fccdp3
    s    String                                        Hello World
    c    Character                                     H
    h    Hash code                                     42628b2
    tx   Date and time                                 see below
    %    Percent sign                                  %
    n    Line separator

 In addition you can specify flags

    flag   purpose                                           example
  ---------------------------------------------------------------------
    +      Prints signs for positive and negative numbers    +3333.33
    space  Adds a space before positive numbers                3333.33
    #      Adds leading zeroes                               003333.33
    -      Left-justifies field                              3333.33
    (      Encloses negative numbers in parantheses          (3333.33)
    ,      Adds group separators                              3,333.33
    #      For format f always includes a decimal point       3333.
    #      For format x or o adds 0x or 0 as prefix           0xc012a
    $      Specifies the index of the argument to be          159 9F
           formatted; e.g., %1$d %1$x prints the first
           argument in decimal and hexadecimal
    <      Formats the same value as the previous             159 9F
           specification; for example %d %<x prints
           the same number in decimal and hexadecimal


   Date and Time Conversion Characters


   char    type                                               example
 -----------------------------------------------------------------------
   c       complete date and time                  Wed Oct 28 11:31:59 GMT 2009
   F       ISO 8601 date                                      2008-10-28
   D       US formatted date (month/day/year)                 10/28/2009
   T       24-hour time                                       11:31:59
   r       12-hour time                                       11:31:59 AM
   R       24-hour time no seconds                            11:31
   Y       4-digit year with leading zeroes                   2009
   y       last 2 digits of year with leading zeroes          09
   C       first 2 digits of year with leading zeroes         20
   B       full month name                                    October
   b or h  abbreviated month name                             Oct
   m       2-digit month (with leading zeroes)                10
   d       2-digit day (with leading zeroes)                  28
   e       2-digit day (without leading zeroes)               28
   A       full weekday name                                  Wednesday
   a       abbreviated weekday name                           Wed
   j       3-digit day of year (with leading zeroes 001-366)  301
   H       2-digit hour (with leading zeroes) 00-23           11
   k       2-digit hour (without leading zeroes) 0-23         11
   I       2-digit hour (with leading zeroes) 01-12           11
   l       2-digit hour (without leading zeroes) 1-12         11
   M       2-digit minutes (with leading zeroes)              31
   S       2-digit seconds (with leading zeroes)              59
   L       3-digit milliseconds (with leading zeroes)         124
   N       9-digit nanoseconds (with leading zeroes)          124000000
// P       uppercase morning or afternoon marker              PM               // ERROR?
   p       lowercase morning or afternoon marker              pm
   z       RFC 822 numberic offset from GMT                   +0000
   Z       time zone                                          GMT
   s       seconds since 1970-01-01 00:00:00 GMT              1256714968
   Q       milliseconds since 1970-01-01 00:00:00 GMT         1256714968586

 */





    public static void main(String[] args) {
      System.out.print("System.out.printf(\"%5d\",1)             ===>");System.out.printf("%5d\n",1);
      System.out.print("System.out.printf(\"%5d\",12)            ===>");System.out.printf("%5d\n",12);
      System.out.print("System.out.printf(\"%5d\",123)           ===>");System.out.printf("%5d\n",123);
      System.out.print("System.out.printf(\"%5d\",1234)          ===>");System.out.printf("%5d\n",1234);
      System.out.print("System.out.printf(\"%5d\",12345)         ===>");System.out.printf("%5d\n",12345);
      System.out.print("System.out.printf(\"%5d\",123456)        ===>");System.out.printf("%5d\n",123456);
      System.out.print("System.out.printf(\"%5x\",42)            ===>");System.out.printf("%x\n",42);
      System.out.print("System.out.printf(\"%5o\",42)            ===>");System.out.printf("%o\n",42);
      System.out.print("System.out.printf(\"%5+d\",42)           ===>");System.out.printf("%+d\n",42);
      System.out.print("System.out.printf(\"%5+d\",-42)          ===>");System.out.printf("%+d\n",-42);
      System.out.print("System.out.printf(\"%5 d\",42)           ===>");System.out.printf("% d\n",42);
      System.out.print("System.out.printf(\"%5 d\",-42)          ===>");System.out.printf("% d\n\n",-42);

      System.out.print("System.out.printf(\"%7.5f\",Math.PI)     ===>");System.out.printf("%7.5f\n",Math.PI);
      System.out.print("System.out.printf(\"%8.5f\",Math.PI)     ===>");System.out.printf("%8.5f\n",Math.PI);
      System.out.print("System.out.printf(\"%9.5f\",Math.PI)     ===>");System.out.printf("%9.5f\n",Math.PI);
      System.out.print("System.out.printf(\"%10.6f\",Math.PI)    ===>");System.out.printf("%10.6f\n",Math.PI);
      System.out.print("System.out.printf(\"%7.2f\",Math.PI)     ===>");System.out.printf("%7.2f\n",Math.PI);
      System.out.print("System.out.printf(\"%a\",Math.PI)        ===>");System.out.printf("%a\n\n",Math.PI);
      System.out.print("System.out.printf(\"%s\",\"Hello World\")  ===>");System.out.printf("%s\n","Hello World");
      System.out.print("System.out.printf(\"%20s\",\"Hello World\")===>");System.out.printf("%20s\n","Hello World");
      System.out.print("System.out.printf(\"%2s\",\"Hello World\") ===>");System.out.printf("%2s\n","Hello World");
      System.out.print("System.out.printf(\"%n\")                ===>");System.out.printf("%n");





      System.out.println("-------- DATE AND TIME ------------");
      Date currentDate = new Date();

      System.out.print("System.out.printf(\"%tc\",currentDate)   ===>");System.out.printf("%tc\n",currentDate);
      System.out.print("System.out.printf(\"%tF\",currentDate)   ===>");System.out.printf("%tF\n",currentDate);
      System.out.print("System.out.printf(\"%tD\",currentDate)   ===>");System.out.printf("%tD\n",currentDate);
      System.out.print("System.out.printf(\"%tT\",currentDate)   ===>");System.out.printf("%tT\n",currentDate);
      System.out.print("System.out.printf(\"%tr\",currentDate)   ===>");System.out.printf("%tr\n",currentDate);
      System.out.print("System.out.printf(\"%tR\",currentDate)   ===>");System.out.printf("%tR\n",currentDate);
      System.out.print("System.out.printf(\"%tY\",currentDate)   ===>");System.out.printf("%tY\n",currentDate);
      System.out.print("System.out.printf(\"%ty\",currentDate)   ===>");System.out.printf("%ty\n",currentDate);
      System.out.print("System.out.printf(\"%tC\",currentDate)   ===>");System.out.printf("%tC\n",currentDate);
      System.out.print("System.out.printf(\"%tB\",currentDate)   ===>");System.out.printf("%tB\n",currentDate);
      System.out.print("System.out.printf(\"%tb\",currentDate)   ===>");System.out.printf("%tb\n",currentDate);
      System.out.print("System.out.printf(\"%tm\",currentDate)   ===>");System.out.printf("%tm\n",currentDate);
      System.out.print("System.out.printf(\"%td\",currentDate)   ===>");System.out.printf("%td\n",currentDate);
      System.out.print("System.out.printf(\"%te\",currentDate)   ===>");System.out.printf("%te\n",currentDate);
      System.out.print("System.out.printf(\"%tA\",currentDate)   ===>");System.out.printf("%tA\n",currentDate);
      System.out.print("System.out.printf(\"%ta\",currentDate)   ===>");System.out.printf("%ta\n",currentDate);
      System.out.print("System.out.printf(\"%tj\",currentDate)   ===>");System.out.printf("%tj\n",currentDate);
      System.out.print("System.out.printf(\"%tH\",currentDate)   ===>");System.out.printf("%tH\n",currentDate);
      System.out.print("System.out.printf(\"%tk\",currentDate)   ===>");System.out.printf("%tk\n",currentDate);
      System.out.print("System.out.printf(\"%tI\",currentDate)   ===>");System.out.printf("%tI\n",currentDate);
      System.out.print("System.out.printf(\"%tl\",currentDate)   ===>");System.out.printf("%tl\n",currentDate);
      System.out.print("System.out.printf(\"%tI\",currentDate)   ===>");System.out.printf("%tI\n",currentDate);
      System.out.print("System.out.printf(\"%tM\",currentDate)   ===>");System.out.printf("%tM\n",currentDate);
      System.out.print("System.out.printf(\"%tS\",currentDate)   ===>");System.out.printf("%tS\n",currentDate);
      System.out.print("System.out.printf(\"%tL\",currentDate)   ===>");System.out.printf("%tL\n",currentDate);
      System.out.print("System.out.printf(\"%tN\",currentDate)   ===>");System.out.printf("%tN\n",currentDate);
      System.out.print("System.out.printf(\"%tp\",currentDate)   ===>");System.out.printf("%tp\n",currentDate);
      System.out.print("System.out.printf(\"%tz\",currentDate)   ===>");System.out.printf("%tz\n",currentDate);
      System.out.print("System.out.printf(\"%tZ\",currentDate)   ===>");System.out.printf("%tZ\n",currentDate);
      System.out.print("System.out.printf(\"%ts\",currentDate)   ===>");System.out.printf("%ts\n",currentDate);
      System.out.print("System.out.printf(\"%tQ\",currentDate)   ===>");System.out.printf("%tQ\n",currentDate);

      System.out.println();

    }
}
************************************************************************************
public class StringMain{
    /*
     *  s.substring(n,m) with take the substring from the n-th
     *  character inclusively to the m-th character exclusively Note,
     *  we start counting from 0.
     */

    public static void main(String[] args){
 	String s;

	s = "Hello, Java\u2122";
	System.out.println("s.substring(0,4) --> " + s.substring(0,4));
        System.out.println("Text".equals("Te"+"xt"));
        System.out.println(s.substring(0,4) == "He"+"ll");
        System.out.println(s.substring(0,4).equals("He"+"ll"));


    }
}
**********************************************************************************************
public class SwitchMain {
    public static void main(String[] args) {
	/* switch provides a convenient way to select between different
         *   integer values and char
         * <pre>
	 * the syntax is
	 * switch(var){
	 *  case value1: ... break;
	 *  case value2: ... break;
	 *  ...
	 * default: ... break;
	 * }
	 * </pre>
	 * If the default is missing and none of the cases occurs then
	 * the switch statement does nothing.
	 */

	int input = Integer.parseInt(args[0]);
	String output = "";

	System.out.println("You have entered " + input + ".");

	switch (input){
	    case 1:
		System.out.println("Please enter your credit card details now.");
		output = "credit card";
		break;
	    case 2:
		System.out. println("Please enter your username and password. Then press enter.");
		output = "login";
		break;
	    case 3:
		System.out.println("You have forgotten your password. A new one will be sent to you by email. Please change it when you log in again.");
		output = "email";
		break;
	    case 4:
		System.out.println("You abort the transaction. Your basket will be emptied.");
		output = "abort";
		break;
	    case 5:
		System.out.println("Congratulations: you won a prize");
		break;
	    default:
		System.out.println("We will store your data until you call in again.");
		output = "no choice";
		break;
	    }

	System.out.println(output);
    }
}
***********************************************************************************
import java.util.Date;
import java.util.*;

/**
 *
 * @author Manfred Kerber
 * @version 2015-10-15
 *
 * We define a transaction in a bank account which consists of the
 * parts transactionType such as "pay in" or "withdrawal", the balance
 * before the transaction, the amount of the transaction, the amount
 * after the transaction and a timestamp that gives the date and time
 * of the transaction. For this we use the GregorianCalendar class.
 *
 * For the transaction we have just a constructor and a toString method.
 */

public class Transaction {
    private String transactionType;
    private Amount oldBalance;
    private Amount change;
    private Amount newBalance;
    private String timeStamp;

    /**
     *  @param transactionType Currently either payin or withdraw.
     *  @param oldBalance The balance before the transaction.
     *  @param change The amount of the transaction.
     *  @param newBalance The balance after the transaction.
     */
    public Transaction(String transactionType, Amount oldBalance, Amount change,
				Amount newBalance) {
	GregorianCalendar date = new GregorianCalendar();
	int year, month, day, hour, minute, second;
	year = date.get(Calendar.YEAR);
	month = date.get(Calendar.MONTH);
	day = date.get(Calendar.DAY_OF_MONTH);
	hour = date.get(Calendar.HOUR_OF_DAY);
	minute = date.get(Calendar.MINUTE);
	second = date.get(Calendar.SECOND);

	this.transactionType = transactionType;
	this.oldBalance = oldBalance;
	this.change = change;
	this.newBalance = newBalance;
	this.timeStamp = year + "-" + month + "-" +
	    day + " " + hour + ":" + minute + ":" + second;
    }

    /**
     *  @return A string representation of the transaction.
     */
    public String toString() {
	return transactionType + ": oldBalance: " + oldBalance + " " +
	     " with " + change +
	    " result newBalance: " + newBalance +
	    " executed @ " + this.timeStamp;
    }

    public static void main(String[] args) {
        Transaction t1 = new Transaction("payin", new Amount(200,0),
                                         new Amount(20,0), new Amount(220,0));
        Transaction t2 = new Transaction("withdrawal", new Amount(220,0),
                                         new Amount(50,0), new Amount(170,0));

        System.out.println(t1);
        System.out.println(t2);
    }
}
***********************************************************************************
public class TypeCastingMain {
    /*
     * Some types can be converted into each other.
     * Some examples are given in the following.
     */

    public static void main(String[] args){
	byte b;
	short s;
	int i;
	long l;

	float f;
	double d;

	char c;

 	boolean bool;

	b = 4;
	s = b;
	i = s;
	l = i;

	System.out.println("b: " + b + ". s: " + s + ". i: " + i + ". l: " + l + ".");
	System.out.println("**************************************************");

	l = Long.MAX_VALUE / 48;
	i = (int) l;
	s = (short) i;
	b = (byte) s;

	System.out.println("b: " + b + ". s: " + s + ". i: " + i + ". l: " + l + ".");
	System.out.println("**************************************************");

	// The following does not work.
	//        l = 5;
	//        i = l;

	f = (float) i;
	System.out.println("f: " + f + ". i: " + i + ".");

	d = 123.856778;
	i = (int) d;
	System.out.println("d: " + d + ". i: " + i + ".");
	System.out.println("**************************************************");

	i = 123;
	c = (char) i;
	System.out.println("i: " + i + ". c: " + c + ".");
	System.out.println("**************************************************");

	c = 'A';
	i = (int) c;
	System.out.println("i: " + i + ". c: " + c + ".");
	System.out.println("**************************************************");
    }
}
************************************************************************************
/**
 *
 * In a while loop we distinguish the condition (included in round
 * brackets) and the body of the loop (included in curly brackets). If
 * the condition is true the body is executed repeatedly until the
 * condition is false after executing the body in full.
 *
 * Loops are difficult for several reasons. Firstly, it may be difficult
 * to understand what they do, secondly, loops are a source of potential
 * non-termination.
 *
 * In order to understand non-trivial loops we need to give a so-called
 * invariant. An invariant is a boolean expression which is true before
 * the loop is entered and is true again after each execution of the body
 * in full. That is, it is also true if and when the loop terminates.
 *
 * In order to guarantee the termination of a loop we typically consider
 * an integer expression which is firstly bounded (from below or above)
 * and secondly which is either decreased or increased (resp.) by at
 * least 1 by each execution of the loop.
 *
 * Careful, better test for "less than" or "greater than" than for
 * "equal". Take also care that if you take a bound from below (above)
 * that the expression is actually decreasing (increasing, resp.).
 *
 * @version 2015-10-13
 * @author Manfred Kerber
 *
 */
public class WhileMain{

    /*
     * Example of a while loop which prints numbers from 1 to 7.
     *
     * INVARIANT:   only trivial invariant: true
     * TERMINATION: the variable i is initialized to 0 and increased in
     *  each loop by 1 and will eventually be bigger than the upper bound 7
     *
     */
    public static void main(String[] args){
	int i = 0 ;
	while (i <  7) {
            // i = i+1;
            System.out.print(i + " ");
        }
	System.out.println();
    }
}
***********************************************************************************
Exercise 1: (Basic, 30%) Write a method public static int max(int[] a) that computes for a non-empty array a of type int[] the maximal value. For instance, the method should get for the following arrays the following values: a max {1,2,3} 3 {1,5,3} 5 {7,4,3} 7 {-1,-2,-3} -1 {-5} -5
/**
 *  The class contains the static method max which computes the
 *  maximum of a non-empty one-dimensional array of type int[].
 *
 *  @version 2018-10-11
 *  @author Manfred Kerber
 */
public class Max {

    /**
     *  The method computes the maximum of a non-empty one-dimensional
     *  array of type int[].
     *  @param a An arbitrary non-empty array of type int[].
     *  @return The maximal value of all the values in a.
     */
    public static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /*
     *  A main method to test the method for a few values.
     */
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(max(a));
        int[] b = {1,5,3};
        System.out.println(max(b));
        int[] c = {7,4,3};
        System.out.println(max(c));
        int[] d = {-1,-2,-3};
        System.out.println(max(d));
        int[] e = {-5};
        System.out.println(max(e));
    }
}
**********************************************************************************
Exercise 2: (Medium, 30%) An array of type int[][] is called rectangular if all its elements are arrays of the same length. For instance, int[][] a = {{1,2,3},
                                                                                                                                                        {1,3,2},
                                                                                                                                                        {2,1,3},
                                                                                                                                                        {2,3,1},
                                                                                                                                                        {3,1,2},
                                                                                                                                                        {3,2,1}}; is rectangular.

                                                                                                                                                        int[][] a = {{1},
                                                                                                                                                                    {1,2},
                                                                                                                                                                    {1,2,3},
                                                                                                                                                                    {2,1},
                                                                                                                                                                    {1,2},
                                                                                                                                                                    {3,2,1}}; is not rectangular.
      Write a method public static boolean rectangular(int[][] a) that returns true if the non-empty array a is rectangular and false if it is not.

      /**
       *  The class contains the static method rectangular which checks for
       *  a non-empty array of type int[][] whether it is rectangular, that
       *  is, whether all its rows have the same length.
       *
       *  @version 2018-10-11
       *  @author Manfred Kerber
       */
      public class Rectangular {

          /**
           *  The method checks for a non-empty array of type int[][]
           *  whether it is rectangular, that is, whether all its rows have
           *  the same length.
           *  @param a A non-empty array of type int[][].
           *  @return true if all rows have the same length, false if the
           *  lengths of the rows differ.
           */
          public static boolean rectangular(int[][] a) {

              // We compare all lengths to the length of row number 0.
              int lengthFirstRow = a[0].length;
              /* We check for each row (except row zero) that its length is
               * the same as the length of row zero. If it is not we
               * immediately return false and the method stops. If no such
               * row is found, true will be returned after the loop
               * terminates.
               */
              for (int i = 1; i < a.length; i++) {
                  if (a[i].length != lengthFirstRow) {
                      return false;
                  }
              }
              return true;
          }

          /*
           *  Main method to test the method on the two examples given in
           *  the worksheet.
           */
          public static void main(String[] args) {
              int[][] a = {{1,2,3},
                           {1,3,2},
                           {2,1,3},
                           {2,3,1},
                           {3,1,2},
                           {3,2,1}};

              int[][] b = {{1},
                           {1,2},
                           {1,2,3},
                           {2,1},
                           {1,2},
                           {3,2,1}};

              System.out.println(rectangular(a));
              System.out.println(rectangular(b));
          }
      }
***********************************************************************************
When you type cal 2018 in the command line in Linux it will give you an overview of the year as displayed to the right. Write a method public static String cal(int year, int firstDay, boolean leapYear) which produces with the input cal(2018, 1, false)exactlythisString. The 1 in the example is to indicate that the year starts with a Monday (Su, Mo, Tu, We, Th, Fr, Sa corresponding to 0, 1, 2, 3, 4, 5, 6, respectively). false means that 2018 is not a leap year, that is, February has 28 days (unlike 2020, e.g., which is a leap year and February has 29 days). Note that the indentations have to exactly match, that is, for instance for the month October in the example the Fridays 5, 12, 19, and 26 have to be aligned to the right.
/**
 *  The class contains a static method that produces a year overview
 *  for any given year, assumed it is given with which day of the week
 *  the year starts and furthermore it is given whether the year is a
 *  leap year, that is, February has 29 days rather than the usual 28
 *  days. [These two pieces of information could be computed as well,
 *  but that is not done in this exercise.]
 *
 *  @version 2018-10-12
 *  @author Manfred Kerber
 */
public class Cal {

    /*
     *  LENGTHS_OF_MONTHS is an array containing the standard lengths of the 12 months of the year.
     */
    private static final int[] LENGTHS_OF_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /*
     *  monthString is a two-dimensional array with 12 rows (one for
     *  each month) and in each column we have 6 entries, one for each
     *  of the potentially 6 (partial) weeks of a month.
     *
     * E.g. for 2018 it will contain for September row 8 a
     * one-dimensional array with the following 6 strings:
     * <pre>
     * {"                   1",
     *  " 2  3  4  5  6  7  8",
     *  " 9 10 11 12 13 14 15",
     *  "16 17 18 19 20 21 22",
     *  "23 24 25 26 27 28 29",
     *  "30                  "}
     * </pre>
     * If the month needs only 4 or 5 strings, the corresponding remaining strings will contain just
     * empty spaces.
     * The array is initialized in the method cal.
     */
    private static String[][] monthString = new String[12][6];

    /*
     *  The string array m contains the headers for the 4 blocks in
     *  the calendary overview.
     */
    private static final String[] m = {
               "      January               February               March      " + "\n",
        "\n" + "       April                  May                   June      " + "\n",
        "\n" + "        July                 August              September    " + "\n",
        "\n" + "      October               November              December    " + "\n"
    };

    /*
     *  The string weekDays contains the days of the week used in each
     *  of the 4 blocks in the calendary overview.
     */
    private static final String weekDays = "Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa  " +
        "Su Mo Tu We Th Fr Sa\n";

    /**
     * The method creates an array with 6 strings representing the days in a month.
     * E.g. for 2018 it will contain for September the
     * one-dimensional array with the following 6 strings:
     * <pre>
     * {"                   1",
     *  " 2  3  4  5  6  7  8",
     *  " 9 10 11 12 13 14 15",
     *  "16 17 18 19 20 21 22",
     *  "23 24 25 26 27 28 29",
     *  "30                  "}
     * </pre>
     * @param year The year for which the monthly overview is to be produced.
     * @param month The month for which the monthly overview is to be produced.
     * @param firstDay The first day of the month (with 0 for Su, 1 for Mo, 2 for Tu and so on).
     * @param leapYear If true the year is a leap year and February has 29 days, else it has 28 days.
     * @return A one-dimensional array containing the days per (partial week) for up to 6 partial weeks.
     */
    public static String[] month(int year, int month, int firstDay, boolean leapYear) {
        /* length contains the length of the month. For February of a
         * leap year it is 29, else it is looked up in the
         * LENGTHS_OF_MONTHS array.
         */
        int length;
        if (leapYear && month == 1) {
            length = 29;
        } else {
            length = LENGTHS_OF_MONTHS[month];
        }

        /*
         *  We create a String array for holding the up to 6 (partial)
         *  weeks of the month.
         */
        String[] result = new String[6];

        // The String line will contain the entry for a particular week.
        String line = "";

        // This is the counter for the line number in the result array.
        int lineCounter = 0;

        /*
         *  For each month there will be 7*6 entries. Starting with
         *  counter 0, ending with 41.
         */
        int counter = 0;
        /*  Before we add an entry for the first of the month, we have
         *  to (potentially) fill the initial entries with empty
         *  spaces. This is done with the first while loop.
         */
        while (counter < firstDay) {
            counter++;
            line += "   ";
        }
        // the first day to be added is: 1.
        int day = 1;

        /*
         *  For each remaining entry in the table we add one day to
         *  the string per entry. Whenever the counter is divisible by
         *  7, a particular line is full and we add it as the next
         *  entry to the result array. Then we start a new line by
         *  re-initializing the line to the empty string.  Note, in
         *  the loop the day and the counter are increased by 1 each
         *  time.
         */
        while (counter < 42) {
            counter++;
            /* We do not add the day directly, but it is normalized by
             * the dayString method. Furthermore, for days greater
             * than the number of days in a month, the corresponding
             * number is NOT added, but only empty spaces.
             */
            line += dayString(day, length);
            day++;
            if (counter % 7 == 0) {
                result[lineCounter] = line + " ";
                line = "";
                lineCounter++;
            }
        }
        return result;
    }

    /**
     *   The method converts the days (from 1 up to maxDay) in a
     *   standardized form to strings. For numbers greater than the
     *   maxDay only empty spaces are returned.
     *   @param day The day (as day of the months) given as an int to
     *   be displayed in the calander.
     *   @param maxDay The maximal day which is to be displayed. This
     *   is depending on the month 28, 29, 30, or 31.
     *   @return The day as a string followed by an empty space and
     *   for one-digit days also preceeded by an empty space. If the
     *   number in day is bigger than maxDay a string with 4 empty
     *   spaces will be returned.
     */
    public static String dayString(int day, int maxDay) {
        if (day < 10) {
            return " " + day + " ";
        } else if (day <= maxDay) {
            return "" + day + " ";
        } else {
            return "   ";
        }
    }

    /**
     *  The method produces a year overview for any given year,
     *  assumed it is given with which day of the week the year starts
     *  and furthermore it is given whether the year is a leap year,
     *  that is, February has 29 days rather than the usual 28
     *  days.
     *  @param year The year for which the overview is to be produced.
     *  @param firstDay The first day of the year given as 0 for Su, 1
     *  for Mo, 2 for Tu, 3 for We, 4 for Th, 5 for Fr, and 6 for Sa.
     *  @param leapYear true if the year is a leap year (that is,
     *  February has 29 days) and false else.
     *  @return On overview of the year, similar to the Linux cal
     *  command.
     */
    public static String cal(int year, int firstDay, boolean leapYear) {
        // We add the year to the top of the string.
        String result = "                            " + year + "\n";

        /*
         *  We represent the months and their weeks in the
         *  two-dimensional array monthString.  For each of the 12
         *  months we represent each of the 6 partial weeks.
         */
        for (int month = 0; month < 12; month++) {
            /* We use an auxilliary variable to avoid recomputing the
             * array for the month.
             */
            String[] aux = month(year, month,
                                 firstDay(year, firstDay, month, leapYear),
                                 leapYear);
            for (int week = 0; week < 6; week++) {
                monthString[month][week] = aux[week];
            }
        }
        /* For each of the 4 blocks we add the information (3 months
         * each block).
         */
        for (int i = 0; i < 4; i++) {
            result += addThreeMonths(i);
        }
        return result;
    }

    /**
     *   The method produces the overview for three months which are
     *   displayed next to each other.
     *   @param beginning This is 0 for the first block (consisting of
     *   January, February, and March); 1 for the second block, and so
     *   on.
     *   @return A string giving an overview of the corresponding
     *   three months.
     */
    public static String addThreeMonths(int beginning) {
        /*
         *  The result starts with the names of the months and the
         *  header of all week days repeated three times.
         */
        String result = m[beginning] + weekDays;
        /*
         *  Week by week we add the information of the three
         *  months. That is, in the double loop, we iterate first by
         *  the weeks and then by the three months under consideration
         *  and add the corresponding information from the monthString
         *  array to the result.
         */
        for (int week = 0; week < 6; week++) {
            for (int month = beginning * 3; month < beginning * 3 + 3; month++) {
                result += monthString[month][week];
            }
            // At the end of a week, a newline is added.
            result += "\n";
        }
        return result;
    }

    /**
     *  The method computes the first day of a month. 0 for Su, 1 for
     *  Mo, 2 for Tu, 3 for We, 4 for Th, 5 for Fr, and 6 for Sa.
     *  @param year The year for which the first day of the month is
     *  to be computed.
     *  @param firstDay The first day of the corresponding year.
     *  @param month The month whose first day is to be computed.
     *  @param leapYear true if the year is a leap year (that is,
     *  February has 29 days), false else.
     *  @return The first day of the month as 0 for Su, 1 for Mo, 2
     *  for Tu, 3 for We, 4 for Th, 5 for Fr, and 6 for Sa.
     */
    public static int firstDay(int year, int firstDay,
                               int month, boolean leapYear) {
        /*
         *  The method first adds up the first day of the year and the
         *  number of days in all months preceeding the month under
         *  consideration.
         */
        int day = firstDay;
        for (int i = 0; i < month; i++) {
            if (leapYear && i == 1) {
                day += 29;
            } else {
                day += LENGTHS_OF_MONTHS[i];
            }
        }
        /* The day of the week with which the month start is the value
         * modulo 7 (the number of days in a week).
         */
        return day % 7;
    }

    /*
     *  A main method to test the cal method for 2018 with 2018
     *  starting with a Monday, represented by 1, and not being a leap
     *  year.
     */
    public static void main(String[] args) {
        System.out.println(cal(2018, 1, false));
        System.out.println("*************************************************************************");
        System.out.println(cal(2020, 3, true));
    }
}
************************************************************************************************************

Exercise 4: (Debugging, 10%) You have the task to evaluate the following pieces of code consisting ﬁrst of a class BankAccount.java and second of a JUnit test ﬁle BankAccountJUnit.java. The tests contain two tests for the toString() method. They should both pass, but one of them fails. Write the improved code with an assessment of the original code as a comment at the start.
BankAccount.java
/** BankAccount is a class for a very simple bank account created from * the name of the account holder. We distinguish two field * variables: accountName and balance. * @author Manfred Kerber * @version 2018-10-11 */
/** BankAccount is a class for a very simple bank account created from
 *  the name of the account holder.  We distinguish two field
 *  variables: accountName and balance.
 *  @author   Manfred Kerber
 *  @version  2018-10-11
 */
public class BankAccount{
    private String  accountName;
    private double  balance;

    /** BankAccount is a constructor  for a very simple bank account created
     *  @param  accountName the account name as String
     */
    public BankAccount(String accountName){
        this.accountName = accountName;
        this.balance     = 0;
    }

    /**
     *  @return the accountName as a String
     */
    public String getAccountName(){
        return accountName;
    }

    /**
     *  @return the balance of a BankAccount
     */
    public double getBalance(){
        return balance;
    }

    /**
     *  sets the balance of a BankAccount
     *  @param balance the new balance on the account
     */
    public void setBalance(double balance){
        this.balance = balance;
    }

    /** the amount will be taken from the balance
     *  @param  amount The amount to be withdrawn.
     */
    public void withdraw(double amount){
        setBalance(getBalance() - amount);
    }

    /** the amount will be added the balance
     *  @param amount The amount to be paid in.
     */
    public void payIn(double amount){
        setBalance(getBalance() + amount);
    }

    /** toString defines how to print a BankAccount
     *  @return  the print type of an account
     */
    public String toString(){
        return "Account name: "  + accountName   +
               " Balance: "       + balance;
    }
}
******************************************************************************
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *  The problem with testing the toString method is that the string
 *  produced contains numbers of type double and the numbers are
 *  computed only up to a certain precision. In order to get these
 *  tests right the expected and computed strings need to split into
 *  two parts, those containing the parts that do not contain the
 *  balance and those that consist just of the balance. The strings
 *  that do not contain the balance must agree exactly and the strings
 *  that consist of the numbers must be converted to numbers and these
 *  must agree within a small tolerance. To this purpose we write two
 *  methods approximatelyEqual and stringWithBalanceEqual. We change
 *  then the tests so that they test the strings are approximately
 *  equal.
 *  @author Manfred Kerber
 *  @version 2018-10-11
 */
public class BankAccountJUnit {

    /**
     *  The methods determines for two numbers of type double whether
     *  they are approximately equal, that is, within a distance of
     *  0.0000001.
     *  @param x The first number to be tested to be equal within a
     *  small distance.
     *  @param y The second number to be tested to be equal within a
     *  small distance.
     *  @return true if the two numbers are with the distance of
     *  0.0000001 and false otherwise.
     */
    public static boolean approximatelyEqual(double x, double y) {
        return Math.abs(x - y) < 0.0000001;
    }

    /**
     *  The methods determines whether two strings containing the
     *  balance of a BankAccount are approximately equal, that is, the
     *  strings must first contain the string "Balance: " exactly one,
     *  second, the strings must be equal with everything that preceed
     *  the sub-string "Balance: ", and third, the double numbers
     *  corresponding to the strings following the sub-string
     *  "Balance: ", must agree within a distance of 0.0000001.
     *  @param expected The expected string that should be generated
     *  by the toString() method.
     *  @param computed The string resulting from the toString() method.
     *  @return true if the two strings agree up to a difference of at
     *  most 0.0000001 in the balance, and false otherwise.
     */
    public static boolean stringWithBalanceApproximatelyEqual(String expected, String computed) {
        String[] stringsExpected = expected.split("Balance: ");
        String[] stringsComputed = computed.split("Balance: ");
        return stringsExpected.length == 2  &&
            stringsComputed.length == 2 &&
            stringsExpected[0].equals(stringsComputed[0]) &&
            approximatelyEqual(Double.parseDouble(stringsExpected[1]),
                               Double.parseDouble(stringsComputed[1]));
    }

    private BankAccount manfred;
    @Before
    public void initObjects() {
        manfred = new BankAccount("Manfred");
        manfred.payIn(28.23);
    }

    @Test
    public void assertEqualsTest1() {
        assertTrue("failure in method toString: " +
                     " expected string not equal given string",
                   stringWithBalanceApproximatelyEqual("Account name: " +
                                          "Manfred Balance: 28.23",
                                          manfred.toString()));
    }
    @Test
    public void assertEqualsTest2() {
        manfred.withdraw(0.99);
        assertTrue("failure in method toString: " +
                     " expected string not equal given string",
                   stringWithBalanceApproximatelyEqual("Account name: " +
                                          "Manfred Balance: 27.24",
                                          manfred.toString()));
    }
}
************************************************************************************
. 1l means that a bottle contains a minimum of 1 litre estimated. EU regulations (see http://en.wikipedia.org/wiki/Estimated_sign) specify the maximal negative tolerance for these estimates. For instance, an item marked 50ml must contain at least 45.5ml. The permitted tolerances are:
nominal quantity in ml maximal negative error 5-50 9% 50-100 4.5 ml 100-200 4.5% 200-300 9 ml 300-500 3% 500-1000 15 ml 1000-10000 1.5%
Write a class Estimate by expanding the method stub that can be found in the ﬁle Estimate.java in the lab3.zip handout on Canvas. Test your program with the JUnit Test ﬁle provided: junit EstimateTest Note in test driven development you write ﬁrst the tests and then reﬁne the program until all tests pass

/**
 *  The main idea is to compute the relative and absolute error, and then
 *  have a case analysis. The first case is that the nominal quantity is
 *  less than 5ml or more than 10000ml. In these cases the nominal
 *  quantity is not in the range of the definition of \u212E.  Else the
 *  program checks whether for a nominal amount in a particular case the
 *  corresponding maximal negative absolute or relative error is within
 *  the bounds. If it is a corresponding positive answer is given. If not,
 *  a corresponding negative answer is given.
 *
 *  @author Manfred Kerber
 *  @version 2014-10-06 last changed 2016-10-19
 */

public class Estimate {
    public static boolean estimateInBounds(double actual, double nominal) {
    	double absShortFall = nominal - actual;
    	double relShortFall = absShortFall / nominal;
    	if (absShortFall <= 0) {
            return true;
    	} else if (5 < nominal && nominal <= 50 && relShortFall <= 0.09) {
            return true;
    	} else if (50 < nominal && nominal <= 100 && absShortFall <= 4.5) {
            return true;
    	} else if (100 < nominal && nominal <= 200 && relShortFall <= 0.045) {
            return true;
        } else if (200 < nominal && nominal <= 300 && absShortFall <= 9) {
            return true;
        } else if (300 < nominal && nominal <= 500 && relShortFall <= 0.03) {
            return true;
        } else if (500 < nominal && nominal <= 1000 && absShortFall <= 15) {
            return true;
        } else if (1000 < nominal && nominal <= 10000 && relShortFall <= 0.015) {
            return true;
        } else
            return false;
    }






    /*
     *  In this implementation the different cases that lead to true are put together
     */
    public static boolean estimateInBoundsAlt(double actual, double nominal) {
    	double absShortFall = nominal - actual;
    	double relShortFall = absShortFall / nominal;
     	if (absShortFall <= 0                                             ||
            (5 < nominal    && nominal <= 50    && relShortFall <= 0.09)  ||
            (50 < nominal   && nominal <= 100   && absShortFall <= 4.5)   ||
            (100 < nominal  && nominal <= 200   && relShortFall <= 0.045) ||
            (200 < nominal  && nominal <= 300   && absShortFall <= 9)     ||
            (300 < nominal  && nominal <= 500   && relShortFall <= 0.03)  ||
            (500 < nominal  && nominal <= 1000  && absShortFall <= 15)    ||
            (1000 < nominal && nominal <= 10000 && relShortFall <= 0.015)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * The previous method is further simplified by reducing if (condition) true else false to condition.
     */
    public static boolean estimateInBoundsWithoutIf(double actual, double nominal) {
    	double absShortFall = nominal - actual;
    	double relShortFall = absShortFall / nominal;
    	return   absShortFall <= 0                                        ||
            (5 < nominal    && nominal <= 50    && relShortFall <= 0.09)  ||
            (50 < nominal   && nominal <= 100   && absShortFall <= 4.5)   ||
            (100 < nominal  && nominal <= 200   && relShortFall <= 0.045) ||
            (200 < nominal  && nominal <= 300   && absShortFall <= 9)     ||
            (300 < nominal  && nominal <= 500   && relShortFall <= 0.03)  ||
            (500 < nominal  && nominal <= 1000  && absShortFall <= 15)    ||
            (1000 < nominal && nominal <= 10000 && relShortFall <= 0.015);
    }
}
*************************************************************************************
/**
 *  The main idea is to compute the relative and absolute error, and then
 *  have a case analysis. The first case is that the nominal quantity is
 *  less than 5ml or more than 10000ml. In these cases the nominal
 *  quantity is not in the range of the definition of \u212E.  Else the
 *  program checks whether for a nominal amount in a particular case the
 *  corresponding maximal negative absolute or relative error is within
 *  the bounds. If it is a corresponding positive answer is given. If not,
 *  a corresponding negative answer is given.
 *
 *  @author Manfred Kerber
 *  @version 2015-10-15
 */

public class Estimate {
    /**
     *  @param actual The actual amount of liquid in the container.
     *  @param nominal The amount of liquid that should be in the container.
     *  @return true if the the actual amount of liquid is within the
     *  definition of estimate at least approximately the nominal
     *  amount, false else.
     *
     *  Note this method is a stub which always returns true. A proper
     *  implementation is still missing.
     */
    public static boolean estimateInBounds(double actual, double nominal) {
    	double absShortFall = nominal - actual;
    	double relShortFall = absShortFall / nominal;
        return true;
  }
}
*************************************************************************************
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  This file contains 15 JUnit tests for testing the estimateInBounds
 *  static method as defined in the Estimate.java class.
 *  The tests are written before the Estimate.java class is written, which
 *  initially is only a stub and always returns false, that is, initially
 *  all the tests which start with assertTrue will fail.
 *
 *  Note that the class does not contain a main method, that is, after
 *  compilation (by javac) you CANNOT run it by invoking "java EstimateTest",
 *  but you have to run it by
 *  "java org.junit.runner.JUnitCore EstimateTest".
 *
 *  @author Manfred Kerber
 *  @version 2015-10-15
 */

public class EstimateTest {
    @Test public void estimateTest1() {
       	assertTrue(Estimate.estimateInBounds(10.3, 11.0));     // yes
    }
    @Test public void estimateTest2() {
	assertFalse(Estimate.estimateInBounds(10.0,11.0));        // no
    }
    @Test public void estimateTest3() {
        assertTrue(Estimate.estimateInBounds(55.5, 60.0));     // yes
    }
    @Test public void estimateTest4() {
        assertFalse(Estimate.estimateInBounds(55.0, 60.0));     // no
    }
    @Test public void estimateTest5() {
        assertTrue(Estimate.estimateInBounds(109.0, 110.0));     // yes
    }
    @Test public void estimateTest6() {
        assertFalse(Estimate.estimateInBounds(100.0, 110.0));   // no
    }
    @Test public void estimateTest7() {
        assertTrue(Estimate.estimateInBounds(210.0, 219.0));   // yes
    }
    @Test public void estimateTest8() {
        assertFalse(Estimate.estimateInBounds(210.0, 220.0));   // no
    }
    @Test public void estimateTest9() {
        assertTrue(Estimate.estimateInBounds(310.0, 319.0));   // yes
    }
    @Test public void estimateTest10(){
        assertFalse(Estimate.estimateInBounds(310.0, 320.0));   // no
    }
    @Test public void estimateTest11(){
        assertTrue(Estimate.estimateInBounds(510.0, 325.0));   // yes
    }
    @Test public void estimateTest12(){
        assertFalse(Estimate.estimateInBounds(510.0, 530.0));   // no
    }
    @Test public void estimateTest13() {
        assertTrue(Estimate.estimateInBounds(1000.0, 1001.0)); // yes
    }
    @Test public void estimateTest14() {
        assertFalse(Estimate.estimateInBounds(1000.0, 1016.0)); // no
    }
    @Test public void estimateTest15() {
        assertTrue(Estimate.estimateInBounds(100000.0, 100000.0)); // not in range
    }
}
*************************************************************************************
/**
 *  This class is used to write a method that lists the first n odd numbers
 *  @version 2016-10-19
 *  @author  Manfred Kerber
 */

public class SumOdd {

    /**
     *  Method to return the sum of the first n odd number.
     *  @param n The number of values to be summed up.
     *  @return The sum of the first n odd numbers.
     */
	   public static int sumOdd(int n) {
		   int sum = 0;
                   /* The loop invariant is that sum is equal to the
                    * sum of the first i odd numbers and that i is
                    * less equal n.
                    */
		   for(int i = 0; i < n; i++) {
			   sum += 2 * i + 1 ;
		   }
		   return sum;
	   }

	   public static void main(String[] args) {
		   System.out.println(sumOdd(3));
		   System.out.println(sumOdd(100));
	   }
}
***************************************************************************************
import static org.junit.Assert.*;

import org.junit.Test;
/**
 *  Some tests for summing up the first n odd numbers with borderline
 *  cases 0, 1 as well as 2 and 3 with results 0, 1, 4, and 9,
 *  respectively.
 */
public class SumOddTest {

	@Test
	public void sumOddTest1() {
		assertEquals("failure in sumOddTest", 0,
				SumOdd.sumOdd(0));
	}
	@Test
	public void sumOddTest2() {
		assertEquals("failure in sumOddTest", 1,
				SumOdd.sumOdd(1));
	}
	@Test
	public void sumOddTest3() {
		assertEquals("failure in sumOddTest", 4,
				SumOdd.sumOdd(2));
	}

	@Test
	public void sumOddTest4() {
		assertEquals("failure in sumOddTest", 9,
				SumOdd.sumOdd(3));
	}
}
***********************************************************************************
Exercise 1: (Basic, 30%) The area A of a circle is computed by π times the radius squared. Write a Java method public static double areaCircle(double radius) that takes in as argument the radius and returns the area of the corresponding circle. Furthermore write a main method and try out your method for the values 0, 5, and 10. (Hint: Use Math.PI and compute radius2 as radius∗radius.
**  The variable A and r are declared as double and A is computed
 *   from r as Math.PI * r * r and printed suitably.  The program
 *   is test with r = 5.
 *   @author Manfred Kerber, Joseph Gardiner
 *   @version 2015-09-29, last changed 2018-08-31
 */
public class Circle {

    /**
     *  The methods computes the area of a circle.
     *  @param radius The radius of the circle.
     *  @return The area of the circle with radius r.
     */
    public static double areaCircle(double radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
    	double r;
        r= 0;
        System.out.println("The area of a circle with radius " +
                           r + " is " + areaCircle(r) + ".");
        r= 5;
        System.out.println("The area of a circle with radius " +
                           r + " is " + areaCircle(r) + ".");
        r= 10;
        System.out.println("The area of a circle with radius " +
                           r + " is " + areaCircle(r) + ".");
    }
}
************************************************************************************
Write a Java method public static double imperialToKg(double ton, double hundredweight, double quarter, double stone, double pound, double ounce, double drachm, double grain) that converts masses given in the imperial system into kilograms. Make use of the following conversions:
1 ton 2240 pounds 1 hundredweight 112 pounds 1 quarter 28 pounds 1 stone 14 pounds 1 ounce 1/16 pounds 1 drachm 1/256 pounds 1 grain 1/7000 pounds 1 pound 0.45359237 kilograms
(b) Write a main method and test your program by computing a person’s weight in kg corresponding to 11 stones and 6 pounds. (The result should be approximately 72.5747792 kg.)
**
 * First the relationships are stored in public static final variables:
 * <pre>
 * 1 ton           ~   2240 pounds
 * 1 hundredweight ~    112 pounds
 * 1 quarter       ~     28 pounds
 * 1 stone         ~     14 pounds
 * 1 ounce         ~   1/16 pounds
 * 1 drachm        ~  1/256 pounds
 * 1 grain         ~ 1/7000 pounds
 * 1 pound         ~ 0.45359237 kilograms
 * </pre>
 *
 * @author Manfred Kerber
 * @version 2018-08-31
 */
public class Conversion {

    /**
     * 1 ton           ~   2240 pounds
     */
    public static final int poundsPerTon = 2240;

    /**
     * 1 hundredweight ~    112 pounds
     */
    public static final int poundsPerHundredweight = 112;

    /**
     * 1 quarter       ~     28 pounds
     */
    public static final int poundsPerQuarter = 28;

    /**
     * 1 stone         ~     14 pounds
     */
    public static final int poundsPerStone = 14;

    /**
     * 1 ounce         ~   1/16 pounds
     */
    public static final double poundsPerOunce = 1.0/16.0;

    /**
     * 1 drachm        ~  1/256 pounds
     */
    public static final double poundsPerDrachm = 1.0/256.0;

    /**
     * 1 grain         ~ 1/7000 pounds
     */
    public static final double poundsPerGrain = 1.0/7000.0;

    /**
     * 1 pound         ~ 0.45359237 kilograms
     */
    public static final double kgPerPound = 0.45359237;

    /**
     * The method converts the different imperial measures into kilograms.
     *
     * @param ton The ton part of the mass.
     * @param hundredweight The hundredweight part of the mass.
     * @param quarter The quarter part of the mass.
     * @param stone The stone part of the mass.
     * @param pound The pound part of the mass.
     * @param ounce The ounce part of the mass.
     * @param drachm The drachm part of the mass.
     * @param grain The grain part of the mass.
     * @return The mass in kilograms.
     */
    public static double imperial2Kg(double ton, double hundredweight,
                                     double quarter, double stone, double pound,
                                     double ounce, double drachm, double grain){
        double massInPounds =
            ton * poundsPerTon + hundredweight * poundsPerHundredweight
            + quarter * poundsPerQuarter + stone * poundsPerStone + pound
            + ounce * poundsPerOunce + drachm * poundsPerDrachm
            + grain * poundsPerGrain;
        return massInPounds * kgPerPound;
    }

    public static void main(String[] args) {

        int stones = 11;
        int pounds = 6;
        System.out.println("A person with " + stones + " stones and " + pounds
                           + " pounds has a weight corresponding to "
                           + imperial2Kg(0,0,0,stones, pounds,0,0,0)
                           + " kilograms.");
    }
}
**********************************************************************************
Exercise 3: (Advanced, 30%)
(a) Assume we represent the time such as 11:49 by two variables hours and minutes, that is, hours = 11; and minutes = 49;. Write a Java method public static int timeToAngle(int hours, int minutes) that computes the angle between the hour hand and the minute hand on a traditional analogue clock. Angles should be measured counterclockwise from hour to minute hand. The result should be rounded and normalized so that it is an int between 0 and 359 (inclusively). For instance the angles at 3:00 and 9:00 hours should be 90◦ and 270◦, respectively:
(Hint: 1 minute ' 6◦, 1 hour ' 30◦. Start from 12 o’clock.) Note that your program must be able to compute the output for arbitrary inputs, in which hours may take values from 0 through 24 and minutes from 0 to 60. Furthermore, note that the hour hand moves also when the minute hand moves, for instance, at 0:20 the hour hand will have moved
by 10◦. Do not forget to write comments which explain why your program is correct. Use only concepts introduced in the lecture so far (that is, no loops and no conditionals). Test your program for the following times: 9:00, 3:00, 18:00, 1:00, 2:30, and 4:41 (with results 270◦, 90◦, 180◦, 30◦, 255◦, and 255◦, respectively).

/**
 * A minute has 60 seconds, that is, the proportion of seconds divided by 60.0
 * will give the corresponding minutes. Likewise an hour has 60 minutes, that
 * is, the minutes divided by 60.0 gives parts of an hour.
 *
 * Hours may be given as integers in more than 12, hence we take the remainder
 * after division by 12. This makes sense only for an integer, hence must be
 * done before we update the hours.
 *
 * In 360 degrees go 12 hours, that is, 30 degrees per hour for the hours hand.
 * In 360 degrees go 60 minutes, that is, 6 degrees per minute for the minute
 * hand.
 *
 * The angle computed is the hours hand minus the minute hand, rounded. Since
 * this may have any integer value between -360 and +360, we add 360 and take
 * the remainder by division by 360 as result.
 *
 * @author Manfred Kerber
 * @version 2018-08-31
 */
public class Clock {

    /**
     * Computes the angle between the hour and minute hand for a given time.
     *
     * @param hours   The hours of the given time.
     * @param minutes The minutes of the given time.
     * @return Angle between the hour and minute hands.
     */
    public static int angle(int hours, int minutes) {
        hours = hours % 12;

        double minuteHandAngle = 6 * minutes;
        // Ensures the angle takes into account the movement of the hour hand
        double hourHandAngle = 30 * (hours + (minutes / 60.0));
        return (int) (Math.round(hourHandAngle - minuteHandAngle + 360) % 360);
    }

    /**
     * Computes the angle between the hour and minute hand for a given time.
     *
     * @param hours   The hours of the given time.
     * @param minutes The minutes of the given time.
     * @param seconds The seconds of the given time.
     * @return Angle between the hour and minute hands.
     */
    public static int angle(double hours, double minutes, double seconds) {
        hours = hours % 12;

        double minuteHandAngle = 6 * (minutes + seconds/60.0);
        // Ensures the angle takes into account the movement of the hour hand
        double hourHandAngle = 30 * (hours + (minutes / 60.0 + seconds/3600.0));
        return (int) (Math.round(hourHandAngle - minuteHandAngle + 360) % 360);
    }

    /**
     * Returns a string with the hour, minutes, and the angle between the given hour and minute values
     *
     * @param hours   The hours of the given time.
     * @param minutes The minutes of the given time.
     * @return A string with the hour, minutes, and the angle between the hour and minute hands.
     */
    public static String angleToString(int hours, int minutes) {
        return "At " + hours + " hours and " + minutes
            + " minutes, the angle between hour and minute hand is " + angle(hours, minutes)
            + " degrees";
    }

    /**
     * Returns a string with the hour, minutes, and the angle between the given hour and minute values
     *
     * @param hours   The hours of the given time.
     * @param minutes The minutes of the given time.
     * @param seconds The seconds of the given time.
     * @return A string with the hour, minutes, and the angle between the hour and minute hands.
     */
    public static String angleToString(int hours, int minutes, double seconds) {
        return "At " + hours + " hours " + minutes
            + " minutes, and " + seconds + " seconds, the angle between hour and minute hand is " + angle(hours, minutes, seconds)
            + " degrees";
    }

    public static void main(String[] args) {

        System.out.println(angleToString(9,0));
        System.out.println(angleToString(3,0));
        System.out.println(angleToString(18,0));
        System.out.println(angleToString(1,0));
        System.out.println(angleToString(2,30));
        System.out.println(angleToString(4,41));
        System.out.println(angleToString(0,0,20));
        System.out.println(angleToString(13,5,27.272727272727));
    }
}
************************************************************************************
Extend your program so that a third variable seconds takes the corresponding seconds. The program should still compute the angle between the hour hand and the minute hand. Test it for 0:00:20 and 13:05:27.272727272727 (with results 358◦and 0◦, respectively).
(see above)
************************************************************************************
Exercise 4: (Debugging, 10%) You have the task to evaluate the following piece of code which has problems. Submit the improved code with an assessment of the original code as a comment at the start.
public class Swap { /** * swaps i and j * @param i 1st variable. * @param j 2nd variable. */ public static void swap(int i, int j) { i = j; j = i; }
public static void main(String[] args) { int i = 2; int k = 6; System.out.println("Original i: " + i + " k: " + k); swap(i,k); System.out.println("After swapping i: " + i + " k: " + k);

/**
 *  There are several problems with this code:
 *  <pre>

 *  1. The documentation is quite insufficient, since it does not say
 *  precisely what it is supposed to do. What should it mean "swaps i
 *  and j", the values of i and j? Also to describe i and j as first
 *  and second variable tells the reader of the code nothing.
 *
 *  2. The method swap does not do anything useful, since the value of
 *  the local variable i is reassigned to the value of j and then the
 *  value of j is reassigned to the (new) value of i. That is,
 *  locally, on a call swap(2,6), the local variables i and j will
 *  both have the value 6 after the call. This has, however, no
 *  consequence for any value of other variables (that is, for
 *  variables other than the two variables local to the swap method).
 *
 *  3. The code is actually not swapping the values. In order to do
 *  this, it is necessary to introduce an auxiliary variable. E.g.
 *  int aux = i;
 *  i = j;
 *  j = aux;
 *  </pre>
 */

public class Swap {
    public static void main(String[] args) {
        int i = 2;
        int k = 6;
        System.out.println("Original       i: " + i + " k: " + k);
        int aux = i;
        i = k;
        k = aux;
        System.out.println("After swapping i: " + i + " k: " + k);
    }
}
************************************************************************************
Exercise 1: (Basic, 30%) Deﬁne a class Book and a constructor to create it. A book should be constructed from the three ﬁeld variables title, year, and isbn of types String, int, and String, respectively. Implement getter methods • public String getTitle(), • public int getYear(), • public String getIsbn(), and a setter method • public void setTitle(String title) that sets the title to title. Furthermore write a • public String toString() method that is used for printing objects of class Book in a user friendly way. (Note, the toString() method in this exercise WILL NOT BE tested, that is, you have ﬂexibility how to write it.) Note that you have always to comment and test your programs appropriately, not just for this exercise and not just for this worksheet. We will not write this to the exercises in future

**
 *   The class Book can be used to store data about books. A Book
 *   consists of three components, a title, a year, and its
 *   isbn. Correspondingly, we have three field variables.
 *   @version 2018-08-31
 *   @author  Manfred Kerber
 */
public class Book{

    private String title;
    private int year;
    private String isbn;

    /**
     *  The constructor Book assigns the three field variables
     *  to the values of its three parameters.
     *  @param title The title of the book.
     *  @param year The year when the book came out.
     *  @param isbn The isbn of the book.
     */
    public Book(String title, int year , String isbn){
        this.title = title;
        this.year   = year;
        this.isbn = isbn;
    }

    /**
     *  The getter getTitle returns the title of the book.
     *  @return The title of the book.
     */
    public String getTitle(){
        return title;
    }

    /**
     *  The getter getYear returns the year in which the book came out.
     *  @return The year in which the book came out.
     */
    public int getYear(){
        return year;
    }

    /**
     *  The getter getIsbn returns the isbn of the book.
     *  @return The isbn of the book.
     */
    public String getIsbn(){
        return isbn;
    }

    /**
     *  The setter setTitle changes the value of the title;
     *  @param title The new title of the book.
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     *  The method returns a String for displaying objects in a
     *  user-friendly way.
     *  @return A String representation of the object.
     */
    public String toString(){
        return this.getTitle() + " (" + this.getYear() + ", ISBN: " +
            this.getIsbn() + ")";
    }

    /*
     * Main method for some tests.
     */
    public static void main(String[] args) {
        Book java = new Book("Java", 2010, "0-13-136483-9");
        Book coreJava = new Book("Core Java", 2008, "0-13-235476-4");

        System.out.println(java);
        System.out.println(coreJava);

        java.setTitle("Java - How to Program");
        System.out.println(java);
    }
}
**************************************************************************************************
Exercise 2: (Medium, 30%) Assume that a BankAccount has three ﬁelds private int accountNumber, private int balance, and private int setupFee. You are supposed to write a constructor • public BankAccount(int accountNumber, int initialDeposit, int setupFee), • getters for all three ﬁelds, and • a setter for the balance. Furthermore write a • toString() method that is used for printing objects of class BankAccount in a user friendly way. (Again, the toString() method in this exercise WILL NOT BE tested.) The initial deposit is the amount of money that the customer pays in when they open their account. The setup fee is charged to the account upon construction. For instance, assume you create an account with account number 54 by BankAccount marysBankAccount = new BankAccount(54, 100, 20); This means that after paying in £ 100 and being charged £ 20 for the setup of the account, Mary’s account will have a balance of £ 80.

** BankAccount is a class for a very simple bank account created with
 *  the three fields accountNumber, balance, and setupFee of types
 *  int, int, and int. We provide a constructor of signature
 *  public BankAccount(int accountNumber, int initialDeposit, int setupFee),
 *  getters for all three fields, and a setter for the balance;
 *  furthermore a toString() method.
 *
 *  The initial deposit is the amount of money that the customer pays in
 *  when they open their account.  The setup fee is charged to the
 *  account upon construction.
 *
 *  @author   Manfred Kerber
 *  @version  2018-10-09
 */
public class BankAccount{
    private int     accountNumber;
    private int     balance;
    private int     setupFee;

    /** BankAccount is a constructor for a very simple bank account created.
     *  @param  accountNumber The account number of the new bankaccount.
     *  @param  initialDeposit The amount payed in on opening the account.
     *  @param  setupFee The fee charged for opening the account.
     */
    public BankAccount(int     accountNumber,
		       int     initialDeposit,
                       int     setupFee){
        this.accountNumber      = accountNumber;
        this.balance            = initialDeposit - setupFee;
        this.setupFee           = setupFee;
    }

    /* Now we write methods to get the parts of a BankAccount,
     * so called accessor methods.
     */

    /**
     *  Getter for the account number.
     *  @return The account number of a BankAccount.
     */
    public int getAccountNumber(){
        return accountNumber;
    }

    /**
     *  Getter for the balance.
     *  @return The balance of a BankAccount
     */
    public int getBalance(){
        return balance;
    }

    /**
     *  Getter for the setup fee.
     *  @return The fee to set up the account on construction.
     */
    public int getSetupFee(){
	return setupFee;
    }

    /**
     *  Setter for the balance.
     *  @param balance The new updated balance of the bank account.
     */
    public void setBalance(int balance){
        this.balance = balance;
    }

    /**
     *  toString defines how to print a BankAccount
     *
     *  @return  the print type of an account
     */
    public String toString(){
	return "Account " + accountNumber +
               " has a balance of \u00A3"       + balance +
            " (setup fee: \u00A3"    + setupFee + ")";
    }

    /*
     *  main method to test the class.
     */
    public static void main(String[] args) {
        BankAccount marysBankAccount = new BankAccount(54, 100, 20);
        System.out.println(marysBankAccount);
    }
}
************************************************************************************
Exercise 3: (Advanced, 30%) Write a class Employee. Each employee is represented by their name, their monthlyGrossSalary, and their taxRate (as a percentage) of types String, double and double, respectively. Write a class with • a constructor, • getters, • setters, and a • toString() method (which should return a String as speciﬁed in the example below). Note that the naming of constructors, getters, and setter must follow the strict naming convention. Furthermore write two methods: • public double getMonthlyNetSalary(), which computes for an Employee object their monthly net salary. • public void increaseSalary(double rate), which increases the monthly salary by the rate (as a percentage) given in the argument. That is, with a rate of 3 the monthly salary will be increased by 3 per cent. For example, let us assume an employee Employee john = new Employee("John", 2400, 20);. System.out.println(john); should give us: "John has a monthly gross salary of £2400, a taxrate of 20%, and a monthly net salary of £1920." After calling john.increaseSalary(1), John’s monthly salary is increased by one per cent and will be £2424 rather than £2400. Note, in order to display the pound symbol you should NOT use the pound symbol on the keyboard, but the corresponding unicode symbol, that is, \u00A3.

**
 *  We represent in the Employee class an employee by name, monthly gross
 *  salary, and the tax rate which they have to pay. In
 *  addition to constructor, getters and setters, and the toString
 *  method, we implement a method that computes the monthly net salary.
 *
 *  @version 2018-10-09
 *  @author Manfred Kerber
 */

public class Employee {

    private String name;
    private double monthlyGrossSalary;
    private double taxRate;

    /**
     *  Constructor to set values to the field variables
     *  @param name The employee's name.
     *  @param monthlyGrossSalary The employee's monthly gross salary.
     *  @param taxRate The rate under which the employee has to pay
     *  tax as a percentage.
     */
    public Employee(String name, double monthlyGrossSalary, double taxRate){
        this.name = name;
        this.monthlyGrossSalary = monthlyGrossSalary;
        this.taxRate = taxRate;
    }

    /**
     *  Getter for the name.
     *  @return The name of the employee.
     */
    public String getName(){
        return name;
    }

    /**
     *  Getter for the monthly gross salary.
     *  @return The monthly gross salary.
     */
    public double getMonthlyGrossSalary(){
        return monthlyGrossSalary;
    }

    /**
     *  Getter for the tax rate under which the employee has to pay tax.
     *  @return The tax rate as a percentage.
      */
    public double getTaxRate(){
        return taxRate;
    }

    /**
     *  setter to change the name of an employee.
     *  @param name The new name of the employee.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *  setter to change the monthlyGrossSalary of an employee.
     *  @param monthlyGrossSalary The new monthly gross salary of the employee.
     */
    public void setMonthlyGrossSalary(double monthlyGrossSalary){
        this.monthlyGrossSalary = monthlyGrossSalary;
    }

    /**
     *  setter to change the tax rate of an employee (as a percentage).
     *  @param taxRate The new tax rate of the employee as a percentage.
     */
    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }

    /**
     *  Method to return the monthly net salary.
     *  @return The monthly net salary of the employee.
     */
    public double getMonthlyNetSalary(){
        return getMonthlyGrossSalary() * (1 - getTaxRate()/100.0);
    }

    /**
     *  Method to increase the net salary by a rate given as percentage.
     *  @param rate The rate by which the gross salary is increased as
     *  a percentage.
     */
    public void increaseSalary(double rate){
        setMonthlyGrossSalary(getMonthlyGrossSalary() * (1 + rate/100.0));
    }

    /**
     *  Return a String for displaying objects in a human friendly way.
     *  @return A String representation of the object.
     */
    public String toString(){
        return getName() + " has a monthly gross salary of \u00A3" +
            getMonthlyGrossSalary() + ", a taxrate of " +
            getTaxRate() + "%, and a monthly net salary of \u00A3" +
            getMonthlyNetSalary() + ".";
    }

    /*
     * Main method for some tests.
     */
    public static void main(String[] args) {

        Employee john = new Employee("John", 2400, 20);
        Employee mary = new Employee("Mary", 5000, 40);

        System.out.println(john);
        // System.out.println(mary);
        System.out.println("John's net salary: " + john.getMonthlyNetSalary());
        // System.out.println("Mary's net salary: " + mary.getMonthlyNetSalary());
        john.increaseSalary(1);
        System.out.println(john);
    }
}
*****************************************************************************************
Exercise 4: (Debugging, 10%) You have the task to evaluate the following piece of code which has problems. Submit the improved code with an assessment of the original code as a comment at the start.
/**
 *
 *  The core problem is that the field variables are not independent
 *  but area is redundant, since the area follows from width and
 *  height as their product. For instance, it does not make sense to
 *  generate a rectangle with width 2, height 3, and area 10, since
 *  the area follows from with and height as the product, that is, 6
 *  in the example.
 *
 *  Also it is suspicious that in the original comment the area is
 *  specified as the product of width and height, but this is not
 *  reflected in the code, that is, nowhere is any computation width
 *  times height in the original code.
 *
 *  The easiest fix is to get rid of the area as a field variable, the
 *  corresponding setter, and change the getter to a method that
 *  return the product of width and height.<br>
 *
 *  [Sometimes, in particular when computation is time consuming, data
 *  is kept redundantly. This is dangerous and great care has to be
 *  taken that no inconsistencies are introduced. In this case, the
 *  constructor would still take only height and width as
 *  arguments:
 *  <pre>
 *   public Rectangle(double width, double height) {
 *       this.width  = width;
 *       this.height = height;
 *       this.area   = width * height;
 *   }
 *  </pre>
 *
 *  Likewise the setter for the area needs to be deleted, since
 *  updating the area would require a change in width or height, but
 *  there is no unique way of doing this. Furthermore the setter for
 *  width and height need to be changed to update the area as well. We
 *  show the new setter for width:
 *
 *  <pre>
 *    public void setWidth(double width) {
 *      this.width = width;
 *      this.area  = width * getHeight();
 *  }
 *  </pre>
 *
 *  We define a rectangle by the three field variables width, height,
 *  and area, each of type double. Furthermore, we write getters and
 *  setters for the three fields as well as a toString method. We test
 *  it in a main method.
 *
 *  @version 2018-09-01
 *  @author Manfred Kerber
 */

public class Rectangle {

    private double width;
    private double height;

    /**
     *  A rectangle is specified by width and height.
     *  <pre>
     *                 width
     *  +--------------------------------------+
     *  |                                      |
     *  |                                      |
     *  |       area = width * height          |  height
     *  |                                      |
     *  |                                      |
     *  +--------------------------------------+
     *  </pre>
     *  @param width The width of the rectangle.
     *  @param height The height of the rectangle.
     */
    public Rectangle(double width, double height) {
        this.width  = width;
        this.height = height;
    }

    /**
     *  Getter for the width.
     *  @return The width of the rectangle is returned.
     */
    public double getWidth() {
        return width;
    }

    /**
     *  Getter for the height.
     *  @return The height of the rectangle is returned.
     */
    public double getHeight() {
        return height;
    }

    /**
     *  Method to compute the area.
     *  @return The area of the rectangle is returned.
     */
    public double getArea() {
        return getWidth() * getHeight();
    }

    /**
     *  Setter for the width. The width of the rectangle is updated.
     *  @param width The new width of the updated rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     *  Setter for the height. The height of the rectangle is updated.
     *  @param height The new height of the updated rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return A human readable description of the rectangle in form
     *     of the three field variables specifying it.
     */
    public String toString() {
        return "The rectangle has a width of " + getWidth() +
            ", a height of " + getHeight() +
            ", and an area of " + getArea() + ".";
    }

    /*
     *  main method with a test of the setHeight setter and the
     *  toString method.
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4);
        System.out.println(r);
        r.setHeight(5);
        System.out.println(r);
    }
}
*************************************************************************************
/**
 * Assertions are used to establish that properties we are certain
 * that they hold at a particular point in the program actually do
 * hold. If the assertion does not hold then an exception will be
 * raised -- assumed the compiler is correspondingly configured (by
 * the -ea option in `Run Configurations' and `(x)= Arguments' under
 * `VM Arguments' in Eclipse). This way, programs can be debugged,
 * however, they will not raise an exception when the program has
 * actually to perform.
 *
 * @version 2017-10-18
 * @author Manfred Kerber
 *
 */
public class AssertExample {

    public static void main(String[] args) {
        int x = -5;
        // Assumed we execute x = Math.abs(x) then the value of x must
        // be greater than or equal to 0.  If, however, we forget the
        // assert command will raise an exception.
        x = Math.abs(x);
        assert x >= 0;
        System.out.println(Math.sqrt(x));
    }
}
************************************************************************************
import java.util.ArrayList;

/**
 *  For simplicity we assume here that the balance is represented
 *  in Pounds and that only full pounds are used.
 *  @author Manfred Kerber
 *  @version 2015-10-20
 */
public class BankAccount{
    private Customer customer;
    private String password;
    private long balance;
    private ArrayList<Transaction> statement;

    public static final String stringCurrency = "\u00A3";

    /**
     * This constructor creates a bank account from the
     * three parts, customer, accountNumber and password.
     * @param customer The customer according to the Customer class.
     * @param password A string to represent the password. Obviously in a real system
     * we would never store a password in its plain form, but would use a safe way as
     * described on http://docs.oracle.com/javase/7/docs/api/java/security/MessageDigest.html, e.g.
     */
    public BankAccount (Customer customer, String password){
    this.customer = customer;
    this.password = password;
    this.balance = 0;
    this.statement = new ArrayList<Transaction>();
    }

    /**
     * Getter method to return the balance.
     * @return The balance of the BankAccount.
     */
    public long getBalance(){
     return balance;
    }

    /**
     * Getter method to return the customer.
     * @return The customer of the BankAccount.
     */
    public Customer getCustomer(){
     return customer;
    }

    /**
     * Getter method to return the password. As a minimal protection mechanism we make the getter private.
     * @return The password of the BankAccount.
     */
    private String getPassword(){
     return password;
    }

    /**
     * Method to compare the password with a given password.
     * @param  password The password to which the password of the this object is compared.
     * @return true if the password of the BankAccount agrees with the argument, false else.
     */
    public boolean checkPassword(String password){
        return this.getPassword().equals(password);
    }


    /**
     * Getter method to return the statement.
     * @return The current statement of the BankAccount.
     */
    public ArrayList<Transaction> getStatement() {
        return statement;
    }


    /**
     * Adds the amount to the current balance
     * and adds the transaction to the statement
     * @param amount The amount being deposited.
     */
    public void deposit(long amount){
        setBalance(getBalance() + amount);
        this.getStatement().add(new Transaction(amount,(byte) 2, getBalance()));
    }

    /**
     *  Setter for the amount. Particularly well
     *  suited for fraud if made public rather than private.
     *  @param amount The new amount in the balance.
     */
    private void setBalance(long amount){
	balance = amount;
    }

    /**
     *  Setter for the password, declared private to prevent unauthorized access.
     *  @param password The new password for the account.
     */
    private void setPassword(String password){
	this.password = password;
    }

    /** withdraws amount from the current balance add transaction to
     *  the statement if there are sufficient funds and the password is
     *  correct.  Otherwise an appropriate error message is printed.
     *  @param amount The amount to be withdrawn.
     *  @param password The password to access the account.
     */
    public void withdraw(long amount, String password){
	if (this.getPassword().equals(password) && balance >= amount) {
	    setBalance(getBalance() - amount);
	    this.getStatement().add(new Transaction(amount,(byte) 3, getBalance()));
	    }
	else if (this.getPassword().equals(password)) {
	    printInsufficientFunds(amount);
        }
        else {
            printWrongPassword();
        }
    }

    /**
     * Changes the password from old to new
     * if the old password is correct,
     * else an error message is printed.
     * @param oldPassword The current password.
     * @param newPassword The future password.
     */
    public void changePassword(String oldPassword, String newPassword){
	if (oldPassword.equals(this.getPassword())){
	    setPassword(newPassword);
        } else {
            printWrongPassword();
        }
    }

    /**
     * Transfers an amount of money from the this account to the
     * toAccount assumed the password is correct and the this account
     * has sufficient money, else an error message is printed.
     * @param toAccount The account to which the money is to be transferred.
     * @param amount The amount of money to be transferred.
     * @param password The password of the this account.
     */
    public void transferMoney(BankAccount toAccount,long amount, String password) {
	if (this.getPassword().equals(password) && (balance >= amount)) {
            setBalance(getBalance() - amount);
            toAccount.setBalance(toAccount.getBalance() + amount);
            this.getStatement().add(new Transaction(amount, (byte) 4, getBalance()));
            toAccount.getStatement().add(new Transaction(amount, (byte) 5, toAccount.getBalance()));
        } else if (this.getPassword().equals(password)) {
            printInsufficientFunds(amount);
        } else {
            printWrongPassword();
        }
    }
    /**
     * @return The name of the customer
     */
    public String toString(){
        return this.getCustomer().toString();
    }

    /*****************************************************************
     * Print functions. By keeping these separate from the actual    *
     * program it is easy to adjust them, for instance, for a        *
     * different language.                                           *
     *****************************************************************/

    /**
     *  Prints that a deposit was successful
     *  @param amount The amount that is deposited.
     */
    public void printDepositSuccessful(long amount){
	System.out.printf("The deposit of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that a withdrawal was successful
     *  @param amount The amount that is withdrawn.
     */
    public void printWithdrawSuccessful(long amount){
	System.out.printf("The withdrawal of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that a transfer was successful.
     *  @param amount The amount that is transferred.
     */
    public void printTransferSuccessful(long amount){
	System.out.printf("The transfer of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that the funds are insufficient for a transaction.
     *  @param amount The amount that was to be transferred.
     */
    public void printInsufficientFunds(long amount){
	System.out.printf("The funds of %s %d for %s are insufficient "
                          + "for this transaction.\n",
                          stringCurrency,this.getBalance(),this.getCustomer().getName());
    }

    /**
     *  Prints that a password change was successful.
     */
    public void printPasswordChangeSuccessful(){
	System.out.printf("Change of password for %s was successful.\n",
			  this.getCustomer().getName());
    }

    /**
     *  Prints that a password has not been recognized.
     */
    public void printWrongPassword(){
	System.out.println("The password you entered was not recognized.\n");
    }

    /**
     *  A method to print the balance of a bank account.
     */
    public void printBalance(){
	System.out.printf("The balance of %s is %s %d.\n",
			  this.getCustomer().getName(), stringCurrency, balance);
    }

    /**
     *  A method to print a statement of a bank account.
     */
    public void printStatement() {
        System.out.println(this);
    	for (int i = 0; i < statement.size(); i++) {
            System.out.println(statement.get(i));
    	}
    }
    /*****************************************************************
     * END of print functions. Separate the output from the actual   *
     * program                                                       *
     *****************************************************************/
}
import java.util.*;
import java.util.regex.Pattern;

/** This is a preliminary version of the BankAccounts class, however,
 * with a user interface. It is in several ways deficient.
 *
 * One deficiency is that passwords are stored as plaintext. In any
 * system that is taking security seriously this would never
 * happen. Typically they are not stored at all, but only a hashvalue
 * of the password is stored. If the password is re-entered, the
 * hashvalue is computed and this value is compared to the stored
 * hashvalue.
 *
 * [In a true system one would have to able to save the results to a
 *  file. One would make use of a database and use a Graphical User
 *  Interface.]
 * @version 2017-10-16
 * @author Manfred Kerber
 */
public class BankAccountInteractive {
    //Some patterns for input as static final variables.
    //Pattern for choice of input: either 1, 2, or 3
    public static final Pattern p123 = Pattern.compile("[123]");
    //Pattern for choice of input: either 1, 2, 3, 4, or 5
    public static final Pattern p123456 = Pattern.compile("[123456]");
    //Any sequence letter, digit, or _ (at least one sign)
    public static final Pattern pLetterDigit_ = Pattern.compile("[a-zA-Z0-9_]+");
    //A one letter sequence consisting of either "m", "f", or "x"
    public static final Pattern pGender = Pattern.compile("[mfx]");
    //Any sequence of digits (at least one sign)
    public static final Pattern pNumber = Pattern.compile("[0-9]+");

    private ArrayList<BankAccount> allBankAccounts;
    //An ArrayList in which all bankAccounts are kept.

    /**
     *  On creation of a new BankAccountUserInterface a new arrayList
     */
    public BankAccountInteractive(){
         allBankAccounts = new ArrayList<BankAccount>();

         //System.in is like System.out, however, for input and not for output.
         Scanner s = new Scanner(System.in);
         //can take value 1 (access existing account) 2 (create new account), or 3 (quit)
         byte topChoice = 1; // not 3, else immediate termination.

         while (topChoice != 3) {
             System.out.println("Please enter:\n"+
                                "1 if you want to access an existing account\n"+
                                "2 if you want to create a new account\n"+
                                "3 if you want to quit");
             try {topChoice = (byte) Integer.parseInt(s.next(p123));
                 switch(topChoice) {
                 case 1:  bankAccountExistingAccount(s);         break;
                 case 2:  bankAccountNewAccount(s);              break;
                 case 3:  System.out.println("quit");            break;
                 default: System.out.println("no such choice");  break;
                 }
             }
             /* Any input different from 1, 2, or 3 will be rejected
              * by an InputMismatchException and caught here.  Since
              * the scanner s will be exited, a new one has to be
              * created, otherwise we run into an endless loop.
              */
             catch (InputMismatchException e2) {
                 System.out.println("Unexpected input.");
                 s = new Scanner(System.in);
             }
         }
    }

    /**
     *  In this method an existing account is accessed, 5 different options are given:
     *  <pre>
     *  1 = check balance
     *  2 = make a deposit
     *  3 = make a withdrawal
     *  4 = make a transfer
     *  5 = quit
     *  </pre>
     *
     *  First the account number and the password are read in. It
     *  is important to check that the accountNumber is in the
     *  appropriate range. Likewise for a money transfer.
     *  @param s The scanner from which the input is read.
     *
     */
    public void bankAccountExistingAccount(Scanner s) {
	int accountNumber;
	System.out.println("Please enter the account number of " +
			   "the account you want to access");
	byte        exChoice;
	boolean     exChoiceBool;
	String      password;
	long        amount;
	int         toAccountNumber;
	BankAccount toAccount;
	accountNumber = Integer.parseInt(s.next());
	if (0<= accountNumber && accountNumber < allBankAccounts.size()) {
	    BankAccount currentAccount = allBankAccounts.get(accountNumber);
	    System.out.println("Please enter the password.");
	    password = s.next();
	    if (currentAccount.checkPassword(password)) {
		exChoiceBool = true;
		while (exChoiceBool) {
		    System.out.println("Please enter:\n"+
				       "1 if you want to check the balance\n"+
				       "2 if you want to make a deposit\n"+
				       "3 if you want to make a withdrawal\n"+
				       "4 if you want to transfer money\n"+
				       "5 if you want a statement\n"+
				       "6 if you want to quit");
                    // The input must be one of 1,2,3,4,5,6
                    try {exChoice = (byte) Integer.parseInt(s.next(p123456));
                        switch(exChoice) {
                        case 1: System.out.println("check");
                            System.out.println("The current balance is: "
                                               + currentAccount.getBalance());
                            break;
                        case 2: System.out.println("deposit");
                            System.out.println("How much is to be paid in? (Enter only if you have got the money already).");
                            amount = (long) Integer.parseInt(s.next());
                            currentAccount.deposit(amount);
                            break;
                        case 3: System.out.println("withdrawal");
                            System.out.println("How much is to be withdrawn?");
                            amount = (long) Integer.parseInt(s.next());
                            currentAccount.withdraw(amount,password);
                            break;
                        case 4: System.out.println("quit");
                            System.out.println("How much is to be transferred?");
                            amount = (long) Integer.parseInt(s.next());
                            System.out.println("To which bank account?");
                            toAccountNumber = Integer.parseInt(s.next());
                            if (0 <= toAccountNumber && toAccountNumber < allBankAccounts.size()) {
                                toAccount = allBankAccounts.get(toAccountNumber);
                                currentAccount.transferMoney(toAccount, amount, password);
                            } else {
                                System.out.println("Account not found.");
                            }
                            break;
                        case 5: System.out.println("Statement:");
                            currentAccount.printStatement();
                            break;
                        case 6: System.out.println("quit");
                            exChoiceBool = false;
                            break;
                        default: System.out.println("error in switch BankAccountUserInterfaceExAccount");
                            break;
		    	}
                    }
		    catch (InputMismatchException e2) {
		    	System.out.println("oops wrong input for account");
                        s = new Scanner(System.in);
		    }
		}
	    } else {
		currentAccount.printWrongPassword();
	    }
	} else {
	    System.out.println("Account does not exist");
	}
    }


    /**
     *  In this method a new account is created. The information for
     *  this needs to be inputted in form of customerName, customerGender,
     *  customerAddress, customerPhone, and password. All these are of
     *  type String, however, the first two and the last must match
     *  [a-zA-Z0-9_]+, the customerPhone must match [0-9]+.
     *
     *  Any created account will go as next element into the
     *  allBankAccounts array.
     *
     *  @param s The scanner from which the input is read.
     *
     */
    public void bankAccountNewAccount(Scanner s){
 	String customerName;
        String customerGender;
	String customerAddress;
	String customerPhone;
	String password;

	System.out.println("Please enter the name of the account holder");
	customerName = s.next(pLetterDigit_);

        System.out.println("Please enter the gender of the account holder: either \"m\", \"f\", or \"x\"");
	customerGender = s.next(pGender);

        System.out.println("Please enter the address of the account holder");
	customerAddress = s.next(pLetterDigit_);

        System.out.println("Please enter the phone number of the account holder");
	customerPhone = s.next(pNumber);

	Customer currentCustomer =
	    new  Customer(customerName, customerGender, customerAddress, customerPhone);

	System.out.println("Please enter the password for the new account");
	password = s.next(pLetterDigit_);

	System.out.println("The account number of the new account is " +
			   allBankAccounts.size());

	BankAccount currentBankAccount =
	    new BankAccount(currentCustomer, password);
	allBankAccounts.add(currentBankAccount);
    }

}
***************************************************************************************
/**
 * Class with main method to start the interactive BankAccount system.
 */
public class BankAccountMain {
    public static void main(String[] args){
        new BankAccountInteractive();
    }
    ********************************************************************************
    import java.util.*;
    import java.util.regex.Pattern;

    /** This is a preliminary version of the BankAccounts class, however,
     * with a user interface. It is in several ways deficient.
     *
     * One deficiency is that passwords are stored as plaintext. In any
     * system that is taking security seriously this would never
     * happen. Typically they are not stored at all, but only a hashvalue
     * of the password is stored. If the password is re-entered, the
     * hashvalue is computed and this value is compared to the stored
     * hashvalue.
     *
     * [In a true system one would have to able to save the results to a
     *  file. One would make use of a database and use a Graphical User
     *  Interface.]
     * @version 2015-10-20
     * @author Manfred Kerber
     */
    public class BankAccounts {
        //Some patterns for input as static final variables.
        //Pattern for choice of input: either 1, 2, or 3
        public static final Pattern p123 = Pattern.compile("[123]");
        //Pattern for choice of input: either 1, 2, 3, 4, or 5
        public static final Pattern p123456 = Pattern.compile("[123456]");
        //Any sequence letter, digit, or _ (at least one sign)
        public static final Pattern pLetterDigit_ = Pattern.compile("[a-zA-Z0-9_]+");
        //Any sequence of digits (at least one sign)
        public static final Pattern pNumber = Pattern.compile("[0-9]+");

        private ArrayList<BankAccount> allBankAccounts;
        //An ArrayList in which all bankAccounts are kept.

        /**
         *  On creation of a new BankAccountUserInterface a new arrayList
         */
        public BankAccounts(){
             allBankAccounts = new ArrayList<BankAccount>();

             //System.in is like System.out, however, for input and not for output.
             Scanner s = new Scanner(System.in);
             //can take value 1 (access existing account) 2 (create new account), or 3 (quit)
             byte topChoice = 1; // not 3, else immediate termination.

             while (topChoice != 3) {
                 System.out.println("Please enter:\n"+
                                    "1 if you want to access an existing account\n"+
                                    "2 if you want to create a new account\n"+
                                    "3 if you want to quit");
                 try {topChoice = (byte) Integer.parseInt(s.next(p123));
                     switch(topChoice) {
                     case 1:  bankAccountExistingAccount(s);         break;
                     case 2:  bankAccountNewAccount(s);              break;
                     case 3:  System.out.println("quit");            break;
                     default: System.out.println("no such choice");  break;
                     }
                 }
                 /* Any input different from 1, 2, or 3 will be rejected
                  * by an InputMismatchException and caught here.  Since
                  * the scanner s will be exited, a new one has to be
                  * created, otherwise we run into an endless loop.
                  */
                 catch (InputMismatchException e2) {
                     System.out.println("Unexpected input.");
                     s = new Scanner(System.in);
                 }
             }
        }

        /**
         *  In this method an existing account is accessed, 5 different options are given:
         *  <pre>
         *  1 = check balance
         *  2 = make a deposit
         *  3 = make a withdrawal
         *  4 = make a transfer
         *  5 = quit
         *  </pre>
         *
         *  First the account number and the password are read in. It
         *  is important to check that the accountNumber is in the
         *  appropriate range. Likewise for a money transfer.
         *  @param s The scanner from which the input is read.
         *
         */
        public void bankAccountExistingAccount(Scanner s) {
    	int accountNumber;
    	System.out.println("Please enter the account number of " +
    			   "the account you want to access");
    	byte        exChoice;
    	boolean     exChoiceBool;
    	String      password;
    	long        amount;
    	int         toAccountNumber;
    	BankAccount toAccount;
    	accountNumber = Integer.parseInt(s.next());
    	if (0<= accountNumber && accountNumber < allBankAccounts.size()) {
    	    BankAccount currentAccount = allBankAccounts.get(accountNumber);
    	    System.out.println("Please enter the password.");
    	    password = s.next();
    	    if (currentAccount.checkPassword(password)) {
    		exChoiceBool = true;
    		while (exChoiceBool) {
    		    System.out.println("Please enter:\n"+
    				       "1 if you want to check the balance\n"+
    				       "2 if you want to make a deposit\n"+
    				       "3 if you want to make a withdrawal\n"+
    				       "4 if you want to transfer money\n"+
    				       "5 if you want a statement\n"+
    				       "6 if you want to quit");
                        // The input must be one of 1,2,3,4,5,6
                        try {exChoice = (byte) Integer.parseInt(s.next(p123456));
                            switch(exChoice) {
                            case 1: System.out.println("check");
                                System.out.println("The current balance is: "
                                                   + currentAccount.getBalance());
                                break;
                            case 2: System.out.println("deposit");
                                System.out.println("How much is to be paid in? (Enter only if you have got the money already).");
                                amount = (long) Integer.parseInt(s.next());
                                currentAccount.deposit(amount);
                                break;
                            case 3: System.out.println("withdrawal");
                                System.out.println("How much is to be withdrawn?");
                                amount = (long) Integer.parseInt(s.next());
                                currentAccount.withdraw(amount,password);
                                break;
                            case 4: System.out.println("quit");
                                System.out.println("How much is to be transferred?");
                                amount = (long) Integer.parseInt(s.next());
                                System.out.println("To which bank account?");
                                toAccountNumber = Integer.parseInt(s.next());
                                if (0 <= toAccountNumber && toAccountNumber < allBankAccounts.size()) {
                                    toAccount = allBankAccounts.get(toAccountNumber);
                                    currentAccount.transferMoney(toAccount, amount, password);
                                } else {
                                    System.out.println("Account not found.");
                                }
                                break;
                            case 5: System.out.println("Statement:");
                                currentAccount.printStatement();
                                break;
                            case 6: System.out.println("quit");
                                exChoiceBool = false;
                                break;
                            default: System.out.println("error in switch BankAccountUserInterfaceExAccount");
                                break;
    		    	}
                        }
    		    catch (InputMismatchException e2) {
    		    	System.out.println("oops wrong input for account");
                            s = new Scanner(System.in);
    		    }
    		}
    	    } else {
    		currentAccount.printWrongPassword();
    	    }
    	} else {
    	    System.out.println("Account does not exist");
    	}
        }


        /**
         *  In this method a new account is created. The information for
         *  this needs to be inputted in form of customerName, customerGender,
         *  customerAddress, customerPhone, and password. All these are of
         *  type String, however, the first two and the last must match
         *  [a-zA-Z0-9_]+, the customerPhone must match [0-9]+.
         *
         *  Any created account will go as next element into the
         *  allBankAccounts array.
         *
         *  @param s The scanner from which the input is read.
         *
         */
        public void bankAccountNewAccount(Scanner s){
     	String customerName;
            String customerGender;
    	String customerAddress;
    	String customerPhone;
    	String password;

    	System.out.println("Please enter the name of the account holder");
    	customerName = s.next(pLetterDigit_);

            System.out.println("Please enter the gender of the account holder: either \"m\", \"f\", or \"x\"");
    	customerGender = s.next(pLetterDigit_);

            System.out.println("Please enter the address of the account holder");
    	customerAddress = s.next(pLetterDigit_);

            System.out.println("Please enter the phone number of the account holder");
    	customerPhone = s.next(pNumber);

    	Customer currentCustomer =
    	    new  Customer(customerName, customerGender, customerAddress, customerPhone);

    	System.out.println("Please enter the password for the new account");
    	password = s.next(pLetterDigit_);

    	System.out.println("The account number of the new account is " +
    			   allBankAccounts.size());

    	BankAccount currentBankAccount =
    	    new BankAccount(currentCustomer, password);
    	allBankAccounts.add(currentBankAccount);
        }

        public static void main(String[] args){
            new BankAccounts();
        }
    }
*(*******************************************************************************
/**
 *  A Customer is characterized by the fields name, address, and telephoneNumber all of type String.
 *  @version 2015-10-20
 *  @author Manfred Kerber
 */

public class Customer{

    private String name;
    private String gender;
    private String address;
    private String telephoneNumber;

    /** Constructor for a Customer
     *
     *  @param name The name of the customer.
     *  @param gender The gender of the customer.
     *  @param address The address of the customer.
     *  @param telephoneNumber The phone number of the customer.
     */
    public Customer (String name, String gender, String address, String telephoneNumber){
        if (gender.equals("m") ||
            gender.equals("f") ||
            gender.equals("x")){

            this.name = name;
            this.gender = gender;
            this.address = address;
            this.telephoneNumber = telephoneNumber;
        } else {
            throw new IllegalArgumentException("Gender must be \"m\", \"f\", or \"x\"");
        }
    }

    /**
     * Getter for the name.
     * @return The name of the Customer.
     */
    public String getName(){
        return name;
    }

    /**
     * Getter for the gender.
     * @return The gender of the Customer.
     */
    public String getGender(){
        return gender;
    }

    /**
     * Getter for the address.
     * @return The address of the Customer.
     */
    public String getAddress(){
        return address;
    }

    /**
     * Getter for the telephone number.
     * @return The telephoneNumber of the Customer.
     */
    public String getTelephoneNumber(){
        return telephoneNumber;
    }

    /**
     *  @return Either "Mr.", "Ms.", or "" depending on gender.
     */
    public String salutation(){
        if (this.getGender().equals("m")) {
            return "Mr.";
        } else if (this.getGender().equals("f")) {
            return "Ms.";
        } else {
            return "";
        }
    }

    /**
     * toString method for printing
     * @return The Customer represented as a String.
     */
    public String toString() {
        return salutation() +  getName() + " @" +
            getAddress() + "(Tel: " + getTelephoneNumber() + ")";
    }
}
************************************************************************************
/**
 *  The main idea is to compute the relative and absolute error, and then
 *  have a case analysis. The first case is that the nominal quantity is
 *  less than 5ml or more than 10000ml. In these cases the nominal
 *  quantity is not in the range of the definition of \u212E.  Else the
 *  program checks whether for a nominal amount in a particular case the
 *  corresponding maximal negative absolute or relative error is within
 *  the bounds. If it is a corresponding positive answer is given. If not,
 *  a corresponding negative answer is given.
 *
 *  @author Manfred Kerber
 *  @version 2017-10-18
 */

public class Estimate {
    /**
     *  @param actual The actual amount of liquid in the container.
     *  @param nominal The amount of liquid that should be in the container.
     *  @return true if the the actual amount of liquid is within the
     *  definition of estimate at least approximately the nominal
     *  amount, false else.
     */
    public static boolean estimateInBounds(double actual, double nominal) {
    	double absShortFall = nominal - actual;
    	double relShortFall = absShortFall / nominal;

        return (nominal < 5 || nominal > 10000 ||
            (5 < nominal    && nominal <= 50 && relShortFall <= 0.09)||
            (50 < nominal   && nominal <= 100 && absShortFall <= 4.5)||
            (100 < nominal  && nominal <= 200 && relShortFall <= 0.045)||
            (200 < nominal  && nominal <= 300 && absShortFall <= 9)||
            (300 < nominal  && nominal <= 500 && relShortFall <= 0.03)||
            (500 < nominal  && nominal <= 1000 && absShortFall <= 15)||
            (1000 < nominal && nominal <= 10000 && relShortFall <= 0.015));
    }
}
**************************************************************************************
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  This file contains 15 JUnit tests for testing the estimateInBounds
 *  static method as defined in the Estimate.java class.
 *  The tests are written before the Estimate.java class is written, which
 *  initially is only a stub and always returns false, that is, initially
 *  all the tests which start with assertTrue will fail.
 *
 *  Note that the class does not contain a main method, that is, after
 *  compilation (by javac) you CANNOT run it by invoking "java EstimateTest",
 *  but you have to run it by
 *  "java org.junit.runner.JUnitCore EstimateTest".
 *
 *  @author Manfred Kerber
 *  @version 2015-10-15
 */

public class EstimateTest {
    @Test public void estimateTest1() {
       	assertTrue(Estimate.estimateInBounds(10.3, 11.0));     // yes
    }
    @Test public void estimateTest2() {
	assertFalse(Estimate.estimateInBounds(10.0,11.0));        // no
    }
    @Test public void estimateTest3() {
        assertTrue(Estimate.estimateInBounds(55.5, 60.0));     // yes
    }
    @Test public void estimateTest4() {
        assertFalse(Estimate.estimateInBounds(55.0, 60.0));     // no
    }
    @Test public void estimateTest5() {
        assertTrue(Estimate.estimateInBounds(109.0, 110.0));     // yes
    }
    @Test public void estimateTest6() {
        assertFalse(Estimate.estimateInBounds(100.0, 110.0));   // no
    }
    @Test public void estimateTest7() {
        assertTrue(Estimate.estimateInBounds(210.0, 219.0));   // yes
    }
    @Test public void estimateTest8() {
        assertFalse(Estimate.estimateInBounds(210.0, 220.0));   // no
    }
    @Test public void estimateTest9() {
        assertTrue(Estimate.estimateInBounds(310.0, 319.0));   // yes
    }
    @Test public void estimateTest10(){
        assertFalse(Estimate.estimateInBounds(310.0, 320.0));   // no
    }
    @Test public void estimateTest11(){
        assertTrue(Estimate.estimateInBounds(510.0, 325.0));   // yes
    }
    @Test public void estimateTest12(){
        assertFalse(Estimate.estimateInBounds(510.0, 530.0));   // no
    }
    @Test public void estimateTest13() {
        assertTrue(Estimate.estimateInBounds(1000.0, 1001.0)); // yes
    }
    @Test public void estimateTest14() {
        assertFalse(Estimate.estimateInBounds(1000.0, 1016.0)); // no
    }
    @Test public void estimateTest15() {
        assertTrue(Estimate.estimateInBounds(100000.0, 100000.0)); // not in range
    }
}
**************************************************************************************
/**
 *  The main idea is to compute the relative and absolute error, and then
 *  have a case analysis. The first case is that the nominal quantity is
 *  less than 5ml or more than 10000ml. In these cases the nominal
 *  quantity is not in the range of the definition of \u212E.  Else the
 *  program checks whether for a nominal amount in a particular case the
 *  corresponding maximal negative absolute or relative error is within
 *  the bounds. If it is a corresponding positive answer is given. If not,
 *  a corresponding negative answer is given.
 *
 *  Unlike in the previous version, we properly take care of the
 *  situation now when a nominal value is outside the domain of the
 *  definition, that is, when the nominal value is below 5ml and above
 *  10000ml an exception is thrown.
 *
 *  Note that the main method expects two arguments, the nominal and the actual.
 *
 *  @author Manfred Kerber
 *  @version 2017-10-18
 */
public class EstimateThrow {

    /**
     *  The method checks whether the actual value is within the error
     *  bounds given by the estimates definition. For nominal values
     *  below 5 and above 10000 an IllegalArgumentException is thrown.
     *
     *  @param actual The actual content of a container.
     *  @param nominal The nominal content of a container.
     *  @return true if the actual content is within the error bounds.
     */
    public static boolean estimateInBounds(double actual, double nominal) {
        double absShortFall = nominal - actual;
        double relShortFall = absShortFall / nominal;
        if (nominal < 5 || nominal > 10000) {
            throw new IllegalArgumentException();
        } else
            return
                (absShortFall <= 0                                            ||
                 (5 < nominal    && nominal <= 50    && relShortFall <= 0.09)  ||
                 (50 < nominal   && nominal <= 100   && absShortFall <= 4.5)   ||
                 (100 < nominal  && nominal <= 200   && relShortFall <= 0.045) ||
                 (200 < nominal  && nominal <= 300   && absShortFall <= 9)     ||
                 (300 < nominal  && nominal <= 500   && relShortFall <= 0.03)  ||
                 (500 < nominal  && nominal <= 1000  && absShortFall <= 15)    ||
                 (1000 < nominal && nominal <= 10000 && relShortFall <= 0.015));
    }

    /*
     *  Two integer values are expected as input.
     */
    public static void main(String[] args) {
        double actual = Double.parseDouble(args[0]);
        double nominal = Double.parseDouble(args[1]);
        System.out.println(estimateInBounds(actual,nominal));
    }
}
**********************************************************************************
**
 *  The class shows some examples how to catch different exceptions
 *  that can occur when the user is asked to enter to integers so that
 *  the second is not zero.
 *
 *  @version 2015-10-20
 *  @author Manfred Kerber
 */
public class Exceptions{

    public static void main(String[] args) {
        int a,b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            System.out.println(a/b);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops, two arguments required");
        }
        catch (ArithmeticException e) {
            System.out.println("oops, do not divide by 0");
        }
        catch(NumberFormatException e) {
            System.out.println("You need to provide two integers");
        }
        finally {
            System.out.println("Many thanks for using this service.");
        }
    }
}
***********************************************************************************
import java.io.*;
import java.net.URL;

/**
 * Just as with reading a file from the harddrive as seen in the class
 * ReadFromFileTest.java, it is also possible to read in a file via
 * the internet from a given URL such as that of the Canvas page of our
 * module in the example below.
 *
 * @version 2016-10-19
 * @author Manfred Kerber
 */
public class Html {
    public static void main(String[] args){
        String s = "https://birmingham.instructure.com/courses/31154";
        String readString;
        try {
            URL url = new URL(s);
            BufferedReader in =
                new BufferedReader(new
                                   InputStreamReader(url.openStream()));
            BufferedWriter out =
                new BufferedWriter(new FileWriter("test1.html"));
            int counter = 0;
            while ((readString = in.readLine()) != null) {
                System.out.println(readString);
                counter++;
                out.write(counter + " " + readString + "\n");
            }

            in.close();
            out.close();
        }
        catch (IOException e) {
            System.out.println("no access to URL: " + s);
        }
    }
}
**********************************************************************************
import java.io.*;
import java.util.Scanner;

/**
 *  The class creates an image in form of a greyscale image which is
 *  read in from a file. It contains a method to crop the left upper
 *  half of the picture and write it out again.
 *
 *  @version 2018-08-20
 *  @author Manfred Kerber
 */
public class PGMImage{
    private int width;
    private int height;
    private int maxShade;
    private String typeOfFile;
    private short[][] pixels;

    /**
     *  @param filename The name of a file that contains an image in
     *  pgm format of type P2.
     *
     */
    public PGMImage(String filename) {
        // try since the file may not exist.
        try {
            // we read from the scanner s which is linked to the file filename.
            Scanner s = new Scanner(new File(filename));

            /* The field variables are assigned by reading in from a
               file. The file should start with something like
               P2
               150 176
               255

               where P2 is the file type, 150 the width of the image, 176
               the height, and 255 the maximal grey value. Then follow
               150*176 grey values between 0 and 255.
            */

            // We read the initial element that is in our case "P2"
            typeOfFile = s.next();
            // Next we read the width, the height, and the maxShade.
            width = s.nextInt();
            height = s.nextInt();
            maxShade = s.nextInt();
            //We initialize and read in the different pixels.
            pixels = new short[height][width];
            for (int i=0; i<height; i++){
                for (int j=0; j<width; j++) {
                    pixels[i][j] = s.nextShort();
                }
            }
        }
        catch (IOException e){
            //If the file is not found, an error message is printed,
            //and an empty image is created.
            System.out.println("File not found.");

            typeOfFile = "P2";
            width = 0;
            height = 0;
            maxShade = 0;
            pixels = new short[width][height];
        }
    }

    /**
     *  @return The width of the image.
     */
    public int getWidth(){
        return width;
    }

    /**
     *  @return The height of the image.
     */
    public int getHeight(){
        return height;
    }

    /**
     *  @return The maximal grey value of the image.
     */
    public int getMaxShade(){
        return maxShade;
    }

    /**
     *  @return The file type of the image.
     */
    public String getTypeOfFile(){
        return typeOfFile;
    }

    /**
     *  @return The matrix representing the pixels of the image.
     */
    public short[][] getPixels(){
        return pixels;
    }


    /**
     *  The method crops the left upper half of an image.
     *  @param filename The filename of the file in which the cropped
     *  image should be saved.
     */
    public void crop (String filename){
	try {
	    BufferedWriter out =
		new BufferedWriter(new FileWriter(filename));
	    // We write the file type to out.
	    out.write(getTypeOfFile() + "\n");

	    // We write the dimensions to out.
	    out.write((getWidth()/2) + " " + (getHeight()/2) +"\n");

	    // We write maximal number.
	    out.write(getMaxShade() + "\n");

	    byte counter = 0;
	    for (int i=0; i<getHeight()/2; i++){
		for (int j=0; j<getWidth()/2; j++){
		    out.write(getPixels()[i][j] + " ");
		    counter++;
		    if (counter == 15){
                        out.write("\n");
                        counter = 0;
                    }
		}
	    }
	    out.write("\n");
	    // We close the file.
	    out.close();
	}
	catch (IOException e){
            //Errors are caught.
            System.out.println("File not found.");
        }
    }


    /*
     * An example.
     */
    public static void main(String[] args) {
        PGMImage cs = new PGMImage("ComputerScience.pgm");
        cs.crop("ComputerScienceCrop.pgm");
    }
}
**************************************************************************************
import java.io.*;

/** There are different ways how to read in from and write out to
 * files. One way is via BufferedReader and BufferedWriter. We declare
 * a BufferedReader in, linked to the file test1.in, and a
 * BufferedWriter out, linked to test1.out. We read from in by
 * readLine() until the end of the buffer, print out the strings and
 * write them with out.write to the test1.out file.  Don't forget to
 * close the buffers, in particular when writing, since otherwise not
 * everything may be written to the file.
 *
 * The exception handling kicks in if the files are not found, or not
 * readable/writable.
 *
 * @version 2016-10-19
 * @author Manfred Kerber
 *
 */
public class ReadFromFileTest{
    public static void main(String[] args) {
        try {
            String readString;

            BufferedReader in =
                new BufferedReader(new FileReader("test1.in"));

            BufferedWriter out =
                new BufferedWriter(new FileWriter("test1.out"));
            int counter = 0;
            while ((readString = in.readLine()) != null) {
                System.out.println(readString);
                counter++;
                out.write(counter + " " + readString + "\n");
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}
***********************************************************************************
import java.util.*;

/**
 *  A Transaction is characterized by the fields amount, the transaction type
 *  <pre>
 * 2: deposit
 * 3: withdrawal
 * 4: transfer from
 * 5: transfer to
 * </pre>
 * the balance and the date of the transaction.
 *
 *  @version 2015-10-20
 *  @author Manfred Kerber
 */
public class Transaction {
   private long amount;
   private byte transactionType;
   private long balance;
   private String date;

    /** A constructor for a transaction. A time stamp is automatically added.
     *  @param amount The amount of the transaction.
     *  @param transactionType 2 for deposit, 3 for withdrawal, 4 for transfer from,  5 for transfer to.
     *  @param balance The balance after the transaction has been carried out.
     */
    public Transaction(long amount, byte transactionType, long balance) {
	this.amount = amount;
	this.transactionType = transactionType;
	this.balance = balance;
	this.date = new Date().toString();
	}

    /** Getter for amount.
     *  @return The amount of the transaction.
     */
    public long getAmount() {
	return amount;
    }

    /** Setter for amount.
     *  @param amount The new amount.
     */
    public void setAmount(long amount) {
	this.amount = amount;
    }

    /** Getter for the transactionType.
     *  @return The amount of the transaction.
     */
    public byte getTransactionType() {
	return transactionType;
    }

    /** Setter for amount.
     *  @param transactionType The new transaction type.
     */
    public void setTransactionType(byte transactionType) {
	this.transactionType = transactionType;
    }

    /** A toString method for printing a transaction.
     *  @return A readable form of the transaction.
     */
    public String toString() {
	String transactionTypePrint;
        switch (this.getTransactionType()) {
        case 2:  transactionTypePrint = " has been payed in.";  	           break;
        case 3:  transactionTypePrint = " has been withdrawn";                     break;
        case 4:  transactionTypePrint = " has been transfered to another account.";break;
        case 5:  transactionTypePrint = " has been transfered into this account."; break;
        default: transactionTypePrint = " unknown transaction.";                   break;
        }
	return "On " + date + " the amount of " + amount +
            transactionTypePrint + " Balance: " + balance;
    }
}
***************************************************************************************************
Assume again the Date class from week 2. It allows to create dates such as Date today = new Date(26, "October", 2018) but also dates that do not make sense such as Date nonsense = new Date(35, "Monday", 2018).
(a) Write a method public static boolean admissible(int day, String month, int year) that returns true if and only if the year is greater than 0, the month is one of the twelve Strings "January", ..., "December", and the day is a number between (inclusively) 1 and the maximal number of days in the particular month. Particularly diﬃcult is the month February, which may have 28 or 29 days, depending on whether the year is a leap year. For all years (greater than or equal to 1), a leap year is a year that is divisible by 4, exceptions are years that are divisible by 100 but not divisible by 400. (b) Use the method admissible from above to change the constructor and the setters so that the arguments are only accepted if they are admissible, otherwise an exception is to be thrown.

/**
 *   The Date class here is used to pick up on the simpler Date class
 *   from week 2 in order to show how we can restrict the creation of
 *   dates to admissible dates. To this end we write a method
 *   admissible which checks whether inputs of the constructor form a
 *   valid date. If not on constuction an IllegalArgumentException is
 *   thrown. Note that we have not dealt with the setters here, they
 *   would need corresponding checks.
 *
 *   @version 2018-10-21
 *   @author Manfred Kerber
 */
public class Date {

    /**
     * Three field variables for day, month, and year of types int,
     * String and int, respectively.
     */
    private int day;
    private String month;
    private int year;

    /**
     *  @param day The input of a day such as 21 as an int.
     *  @param month The input of a month such as "October" as a String.
     *  @param year The input of a year such as 2016 as an int.
     *  @return true if the day, the month, and the year are all admissible
     *  THIS IS A METHOD STUB. THE METHOD NEEDS STILL TO BE WRITTEN!
     */
    public static boolean admissible(int day, String month, int year) {
        return true;
    }

    public String toString() {
        return this.day + " " + this.month + " " + this.year;
    }

    /**
     *  @param day The input of a day such as 21 as an int.
     *  @param month The input of a month such as "October" as a String.
     *  @param year The input of a year such as 2018 as an int.
     *  Note that the constructor throws an IllegalArgumentException if
     *  the date to be constructed would be not admissible.
     */
    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static void main(String[] args) {
        Date d1 = new Date(26, "October", 2018);
        System.out.println(d1);
        Date d2 = new Date(32, "October", 2018);
        System.out.println(d2);
        Date d3 = new Date(20, "Friday", 2018);
        System.out.println(d3);
    }
}
*************************************************************************************
import java.util.*;

/**
 *  A Transaction is characterized by the fields amount, the transaction type
 *  <pre>
 * 2: deposit
 * 3: withdrawal
 * 4: transfer from
 * 5: transfer to
 * </pre>
 * the balance and the date of the transaction.
 *
 *  @version 2015-10-20
 *  @author Manfred Kerber
 */
public class Transaction {
   private long amount;
   private byte transactionType;
   private long balance;
   private String date;

    /** A constructor for a transaction. A time stamp is automatically added.
     *  @param amount The amount of the transaction.
     *  @param transactionType 2 for deposit, 3 for withdrawal, 4 for transfer from,  5 for transfer to.
     *  @param balance The balance after the transaction has been carried out.
     */
    public Transaction(long amount, byte transactionType, long balance) {
	this.amount = amount;
	this.transactionType = transactionType;
	this.balance = balance;
	this.date = new Date().toString();
	}

    /** Getter for amount.
     *  @return The amount of the transaction.
     */
    public long getAmount() {
	return amount;
    }

    /** Setter for amount.
     *  @param amount The new amount.
     */
    public void setAmount(long amount) {
	this.amount = amount;
    }

    /** Getter for the transactionType.
     *  @return The amount of the transaction.
     */
    public byte getTransactionType() {
	return transactionType;
    }

    /** Setter for amount.
     *  @param transactionType The new transaction type.
     */
    public void setTransactionType(byte transactionType) {
	this.transactionType = transactionType;
    }

    /** A toString method for printing a transaction.
     *  @return A readable form of the transaction.
     */
    public String toString() {
	String transactionTypePrint;
        switch (this.getTransactionType()) {
        case 2:  transactionTypePrint = " has been payed in.";  	           break;
        case 3:  transactionTypePrint = " has been withdrawn";                     break;
        case 4:  transactionTypePrint = " has been transfered to another account.";break;
        case 5:  transactionTypePrint = " has been transfered into this account."; break;
        default: transactionTypePrint = " unknown transaction.";                   break;
        }
	return "On " + date + " the amount of " + amount +
            transactionTypePrint + " Balance: " + balance;
    }
}
************************************************************************************
Exercise 1:(Basic, 30%) Insertionsort(formoredetailssee,e.g.,https://en.wikipedia.org/wiki/ Insertion_sort) is a simple sorting algorithm which sorts arrays from the start by going once through the array so that the initial part of the array is sorted and the rest of the array contains the elements that need still to be dealt with. The current element is put into its correct place in the sorted part and the elements following it are moved one up to make room for it. For instance, with the bar indicating the separation of the sorted part and the elements to be considered, and * denoting the most recent element inserted, we get: [ 4, 3, 6, 1, 9, 2] -> [ 4*|,3, 6, 1, 9, 2] 4 put in its place -> [ 3*, 4,| 6, 1, 9, 2] 3 put in its place -> [ 3, 4, 6*|,1, 9, 2] 6 put in its place -> [ 1*, 3, 4, 6|, 9, 2] 1 put in its place -> [ 1, 3, 4, 6, 9*|,2] 9 put in its place -> [ 1, 2*, 3, 4, 6, 9|] 2 put in its place Thealgorithmterminateswhenthesecondpartofthearrayisempty. GiveaJavaimplementationofinsertionsortusingloops,public static int[] insertionSort(int[] numbers),inaclassInsertionSort. NOTE: Since any sorting algorithm would pass the tests which we will provide, there will be an inspection by your tutor of whether you actually implemented insertionSort. You will get marks only for an implementation of insertionSort.

**
 * The class is used to implement the insertion sort algorithm.
 * @author Manfred Kerber
 * @version 2018-10-18
 *
 */
public class InsertionSort {

    /**
     *  Insertion sort algorithm as stated in the literature (see
     *  e.g., Wikipedia at <a
     *  href="https://en.wikipedia.org/wiki/Insertion_sort">
     *  https://en.wikipedia.org/wiki/Insertion_sort</a>).
     *  @param numbers The array takes an (unsorted) array of integers.
     *  @return The same numbers as in the parameter, but in ascending order.
     */
    public static int[] insertionSort(int[] numbers) {
        int tmp;    // a temporary variable to store values for swapping
        /* The loop invariant for the outer loop is that the first i
         * elements will have been sorted. In the first round, element
         * 0 will be in the correct order (since there is only one
         * element in it), in the next round elements 0 and 1 will be
         * in the correct order, since the element 1 will have been
         * inserted in its correct position, and so on. All the
         * remaining elements are in the order they were in the array
         * originally.
         */
        for (int i = 0; i < numbers.length; i++){
            int j = i;
            /* The loop invariant for the inner loop is that room is
             * made for the element to be inserted by swapping
             * elements from the j-th element downwards with the next
             * left neighbour until the right position is found where
             * the i-th element should go. Once this is found, the
             * loop terminates, since all elements in the initial part
             * of the array are in their correct position.
             */

            while (j > 0 && numbers[j-1] > numbers[j]) {
                   tmp = numbers[j];
                   numbers[j] = numbers[j-1];
                   numbers[j-1] = tmp;
                   j--;
            }
        }
        return numbers;
    }

    /**
     * @param numbers An array of integers
     * The method prints the array in a readable format.
     */
    public static void printArray(int[] numbers) {
        int length = numbers.length;
        System.out.print("[");
        /* Loop invariant: elements up to i are printed with following comma
         * excluding the last element since it is not followed by a comma.
         */
        for (int i = 0; i < length-1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        /* The last element is printed (if it exists).
         */
        if (length > 0) {
            System.out.print(numbers[length-1]);
        }
        System.out.println("]");
    }

    /* Main method with one initial test.
     */
    public static void main(String[] args) {
        int[] test1 = {6,3,4,2,2,1,3,1};
        printArray(test1);
        insertionSort(test1);
        printArray(test1);
        int[] test2 = {};
        printArray(test2);
        insertionSort(test2);
        printArray(test2);
    }
}
**********************************************************************************
Exercise 2: (Medium, 30%) Implement a class Student with the ﬁeld variables private String registrationNumber and private int[] marks. The mark array has a size of 14. Its elements represent (in this order) 8 assessed worksheets (worth 2, 2, 2, 2, 1, 1, 1, and 1 percent of the total module mark, respectively),4in-classtests(worth2,2,1,and3percentofthetotalmodulemark),ateamproject(worth 10 percent of the total module mark), and an examination result (worth 70 percent of the total module mark). Write a constructor, setters, getters, and a toString() method. Furthermore write a method that allows one to set a single assignment mark, public void setAssignmentMark(int assignmentNumber, int mark), where the assignmentNumber is to be a number between 1 and 14, representing the 14 component marks in the order presented above, each given out of 100. Also, write a method public double totalMark() that computes the total mark of a student, rounded to one decimal place. If a mark of -1 has been entered for one piece of assessment, then this is to mean that the student has been granted for this piece of assessment extenuating circumstances and that the mark should be discarded from the computation of the total mark. If marks with a total weight of more than 50 percent of the total mark have been waived, then the returned total mark should be -1. Finally, write a method public boolean passed() that returns true if the total mark of the student is greater than or equal to 50 and false otherwise. In the case of a total mark of -1, the method passed() should throw an IllegalArgumentException. For instance, with the entries corresponding to int[] samsMarks = {50, 60, 65, 60, 65, 70, 55, 66, 60, 73, 65, 45, 68, 54};, int[] billysMarks = {50, 60, -1, 60, 65, 70, 55, 66, 60, 73, 65, 45, 68, 54};, Student sam = new Student("1111111", samsMarks);, and Student billy = new Student("1111112", billysMarks); sam.totalMark()shouldresultin56.5;billy.totalMark()in56.3;sam.passed()andbilly.passed() should both result in true.
**
 *  The class contains a method totalMark() that determines the total
 *  mark from a number of component marks that come with a particular
 *  weight each. In case that a student was excused for a particular
 *  assignment (indicated by a -1 entry) the corresponding assignment
 *  is taken out of the computation of the total mark. However, if
 *  more than half of the marks have been waived, a total mark of -1
 *  is returned in order to indicate that the mark cannot be
 *  determined. Correspondingly there is a method passed() that
 *  determines whether a student has passed, that is, has a total mark
 *  of at least 50. (In case that the total mark cannot be determined,
 *  an IllegalArgumentException is thrown.)
 *
 *  @version 2018-10-18
 *  @author Manfred Kerber
 */

public class Student {

    private String registrationNumber;
    private int[] marks;
    //Static constant for the weights of the assignments
    public static final int[] weights = {2,2,2,2,1,1,1,1,2,2,1,3,10,70};

    /**
     *  The constructor initializes the fields
     *  @param registrationNumber The registration number of the student.
     *  @param marks The array contain the 14 component marks.
     */
    public Student(String registrationNumber, int[] marks) {
        this.registrationNumber = registrationNumber;
        this.marks = marks;
    }

    /**
     *  Getter for the registrationNumber.
     *  @return The registration number of the student.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     *  Getter for the marks.
     *  @return The marks of the student.
     */
    public int[] getMarks() {
        return marks;
    }

    /**
     *  Setter for the registrationNumber.
     *  @param registrationNumber The new registration number of the student.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     *  Setter for the marks.
     *  @param marks The new marks array of the student.
     */
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    /**
     *  Setter for a single mark.
     *  @param assignmentNumber The number of the assignment as a
     *  number between 1 and 14.
     *  @param mark The new mark for the assignment with the given
     *  assignmentNumber.
     */
    public void setAssignmentMark(int assignmentNumber, int mark) {
        this.getMarks()[assignmentNumber-1] = mark;
    }

    /**
     *  Method to compute the total module mark of a student.
     *  @return The total mark for a student is computed from the 14
     *  component marks that come with a particular weight each
     *  (weighted average) and returned. The total number is rounded
     *  to one digit after the decimal point. In case that a student
     *  was excused for a particular assignment (indicated by a -1
     *  entry) the corresponding assignment is taken out of the
     *  computation of the total mark. However, if more than half of
     *  the marks (measured by weight) have been waived, a total mark
     *  of -1 is returned in order to indicate that the mark cannot be
     *  determined.
     */
    public double totalMark() {
        int marksAchieved = 0;
        int totalWeight = 0;
        /* The method iterates over all component marks and if one is
         * not waived (that is, not -1) then it is multiplied by its
         * weight and added to the total of marks achieved;
         * furthermore the weight is added to the totalWeight in this
         * case.
         */
        for (int i = 0; i < weights.length; i++) {
            if (getMarks()[i] !=-1) {
                marksAchieved += getMarks()[i] * weights[i];
                totalWeight += weights[i];
            }
        }
        /* If the weight of all marks going into the computation is
         * below 50, a -1 is returned to indicate that the total mark
         * cannot be determined.
         */
        if (totalWeight < 50) {
            return -1;
        } else {
            /* The total mark is computed as the marks achieved
             * divided by the total weight. In order to round the
             * number to one decimal after the decimal point the
             * number is first multiplied by 10, then rounded, and
             * finally divided by 10 again.
             */
            return Math.round(marksAchieved * 10.0/totalWeight)/10.0;
        }
    }

    /**
     *  Method to compute whether a student has passed the module.
     *  @return true if the student has a mark of at least 50, false
     *  else.
     *  @exception IllegalArgumentException if the student has not
     *  attempted at least 50% of the assignements measured by their
     *  weights.
     */
    public boolean passed() {
        if (totalMark() == -1) {
            throw new IllegalArgumentException();
        }
        return totalMark() >= 50;
    }

    /**
     *  toString method for a student object.
     *  @return A human readable String for a student object
     *  containing the registration number, the component mark, the
     *  total mark, and an indication of whether the student has
     *  passed or failed the module.
     */
    public String toString() {
        String result = getRegistrationNumber();
        // Each component mark is added to the result
        for (int el : getMarks()) {
            result += " " + el;
        }
        result += " Total: " + totalMark();
        // Possible exception from method passed caught.
        try {
            if (passed()) {
                return result + " PASSED";
            } else {
                return result + " FAILED";
            }
        }
        catch (IllegalArgumentException e){
            return result +
                " Insufficient info for determining whether passed.";
        }
    }

    /*
     * Main method for initial tests.
     */
    public static void main(String[] args) {
        int[] tonysMarks = {50,50,50,50,50,50,50,50,50,50,50,50,-1,100};
        Student tony = new Student("1111110", tonysMarks);
        System.out.println(tony);

        int[] samsMarks = {50,60,65,60,65,70,55,66,60,73,65,45,68,54};
        Student sam = new Student("1111111", samsMarks);
        System.out.println(sam);

        int[] billysMarks = {50,60,-1,60,65,70,55,66,60,73,65,45,68,54};
        Student billy = new Student("1111112", billysMarks);
        System.out.println(billy);

        int[] tobysMarks = {100,100,100,100,100,100,100,100,100,100,100,100,100,25};
        Student toby = new Student("1111113", tobysMarks);
        System.out.println(toby);

        int[] eddysMarks = {50,60,-1,60,65,70,55,66,60,73,65,45,68,-1};
        Student eddy = new Student("1111114", eddysMarks);
        System.out.println(eddy);
    }
}

**************************************************************************************
Exercise 3: (Advanced, 30%) In the lecture we have seen how grey value pictures given in form of a P2 type PGM (Portable GrayMap) image of a given width and height can be represented by a two-dimensional array of type short[][] image = new short[height][width], in which each entry in the array is a grey value between 0 and 255, inclusively. Similarly, coloured pictures are represented in PPM (Portable PixMap) format of type P3. The PPM ﬁle contains for each pixel 3 values, the RGB values (each between 0 and 255, inclusively) for the colours red, green, and blue separately. The corresponding image can then be represented by a three-dimensional array of type short[][][] image = new short[height][width][colour], in which the three values for the three colours are stored in indices 0, 1, and 2 in the third dimension corresponding to the three colours red, green, and blue, respectively. Write a class PPMImage with the ﬁve ﬁeld variables private int width; private int height; private int maxShade; private String typeOfFile; // here: "P3" private short[][][] pixels; aconstructorpublic PPMImage(String filename),gettersandsetters,andamethodpublic short[][] makeGrey(String filename) which returns an array of type short[][] of suitable size containing the corresponding grey values so that each grey value is the rounded average of the corresponding three colour values. Ifthefilenameisnottheemptystringthemethodshouldalsosavetheimageinthecorresponding ﬁle as a PGM image.
import java.io.*;
import java.util.Scanner;

/**
 *  The class creates an image in form of a greyscale image which is
 *  read in from a file. It contains a method to crop the left upper
 *  half of the picture and write it out again.
 *
 *  @version 2018-08-24
 *  @author Manfred Kerber
 */
public class PGMImage{
    private int width;
    private int height;
    private int maxShade;
    private String typeOfFile;
    private short[][] pixels;

    /**
     *  @param filename The name of a file that contains an image in
     *  pgm format of type P2.
     *
     */
    public PGMImage(String filename) {
        // try since the file may not exist.
        try {
            // we read from the scanner s which is linked to the file filename.
            Scanner s = new Scanner(new File(filename));

            /* The field variables are assigned by reading in from a
               file. The file should start with something like
               P2
               150 176
               255

               where P2 is the file type, 150 the width of the image, 176
               the height, and 255 the maximal grey value. Then follow
               150*176 grey values between 0 and 255.
            */

            // We read the initial element that is in our case "P2"
            typeOfFile = s.next();
            // Next we read the width, the height, and the maxShade.
            width = s.nextInt();
            height = s.nextInt();
            maxShade = s.nextInt();
            //We initialize and read in the different pixels.
            pixels = new short[height][width];
            for (int i=0; i<height; i++){
                for (int j=0; j<width; j++) {
                    pixels[i][j] = s.nextShort();
                }
            }
        }
        catch (IOException e){
            //If the file is not found, an error message is printed,
            //and an empty image is created.
            System.out.println("File not found.");

            typeOfFile = "P2";
            width = 0;
            height = 0;
            maxShade = 0;
            pixels = new short[width][height];
        }
    }

    /**
     *  @return The width of the image.
     */
    public int getWidth(){
        return width;
    }

    /**
     *  @return The height of the image.
     */
    public int getHeight(){
        return height;
    }

    /**
     *  @return The maximal grey value of the image.
     */
    public int getMaxShade(){
        return maxShade;
    }

    /**
     *  @return The file type of the image.
     */
    public String getTypeOfFile(){
        return typeOfFile;
    }

    /**
     *  @return The matrix representing the pixels of the image.
     */
    public short[][] getPixels(){
        return pixels;
    }


    /**
     *  The method crops the left upper half of an image.
     *  @param filename The filename of the file in which the cropped
     *  image should be saved.
     */
    public void crop (String filename){
	try {
	    BufferedWriter out =
		new BufferedWriter(new FileWriter(filename));
	    // We write the file type to out.
	    out.write(getTypeOfFile() + "\n");

	    // We write the dimensions to out.
	    out.write((getWidth()/2) + " " + (getHeight()/2) +"\n");

	    // We write maximal number.
	    out.write(getMaxShade() + "\n");

	    byte counter = 0;
	    for (int i=0; i<getHeight()/2; i++){
		for (int j=0; j<getWidth()/2; j++){
		    out.write(getPixels()[i][j] + " ");
		    counter++;
		    if (counter == 15){
                        out.write("\n");
                        counter = 0;
                    }
		}
	    }
	    out.write("\n");
	    // We close the file.
	    out.close();
	}
	catch (IOException e){
            //Errors are caught.
            System.out.println("File not found.");
        }
    }

    /**
     *  The method inverts the grey scale in a picture so that dark
     *  goes to bright and vice versa
     *  @param filename The filename of the file in which the inverted
     *  image should be saved.
     */
    public void invert (String filename){
	try {
	    BufferedWriter out =
		new BufferedWriter(new FileWriter(filename));
	    // We write the file type to out.
	    out.write(getTypeOfFile() + "\n");

	    // We write the dimensions to out.
	    out.write((getWidth()) + " " + (getHeight()) +"\n");

	    // We write maximal number.
	    out.write(getMaxShade() + "\n");

	    byte counter = 0;
	    for (int i=0; i<getHeight(); i++){
		for (int j=0; j<getWidth(); j++){
		    out.write((255-getPixels()[i][j]) + " ");
		    counter++;
		    if (counter == 15){
                        out.write("\n");
                        counter = 0;
                    }
		}
	    }
	    out.write("\n");
	    // We close the file.
	    out.close();
	}
	catch (IOException e){
            //Errors are caught.
            System.out.println("File not found.");
        }
    }

    /**
     *  The method inverts the grey scale in a picture so that dark
     *  goes to bright and vice versa
     *  @param filename The filename of the file in which the inverted
     *  image should be saved.
     */
    public void writeMatrix (String filename){
	try {
	    BufferedWriter out =
		new BufferedWriter(new FileWriter(filename));
	    byte counter = 0;
            out.write("{ ");
	    for (int i=0; i<getHeight()-1; i++){
                out.write("{ ");
		for (int j=0; j<getWidth()-1; j++){
		    out.write(getPixels()[i][j] + ", ");
		}
                out.write(getPixels()[i][getWidth()-1] + "} ,\n ");
	    }
            out.write("{ ");
            for (int j=0; j<getWidth()-1; j++){
                out.write(getPixels()[getHeight()-1][j] + ", ");
            }
            out.write(getPixels()[getHeight()-1][getWidth()-1] + "}};\n ");
	    // We close the file.
	    out.close();
	}
	catch (IOException e){
            //Errors are caught.
            System.out.println("File not found.");
        }
    }


    /*
     * An example.
     */
    public static void main(String[] args) {
        PGMImage cs = new PGMImage("ComputerScienceSmall.pgm");
        //cs.crop("ComputerScienceCrop.pgm");
        //cs.invert("ComputerScienceInvert.pgm");
        cs.writeMatrix("ComputerScienceSmallGrey.matrix");
    }
}

import java.io.*;
import java.util.Scanner;

/**
 *  The class creates an image in form of a colour PPM image which is
 *  read in from a file. It contains a method to create a
 *  corresponding PGM image and writes it to a file, at the same time
 *  the method return a corresponding short[][] array.
 *
 *  @version 2018-10-19
 *  @author Manfred Kerber
 */
public class PPMImage{
    private int width;
    private int height;
    private int maxShade;
    private String typeOfFile;
    private short[][][] pixels;

    /**
     *  @param filename The name of a file that contains an image in
     *  pgm format of type P3.
     *
     */
    public PPMImage(String filename) {
        // try since the file may not exist.
        try {
            // we read from the scanner s which is linked to the file filename.
            Scanner s = new Scanner(new File(filename));

            /* The field variables are assigned by reading in from a
               file. The file should start with something like
               P3
               150 176
               255

               where P3 is the file type, 150 the width of the image, 176
               the height, and 255 the maximal value of all entries. Then follow
               3*150*176 values between 0 and 255.
            */

            /* We read the initial element that is in our case it
             * should be "P3" As a possible improvement of the method,
             * we could terminate the method abruptly if it does not
             * read "P3".
             */
            typeOfFile = s.next();
            // Next we read the width, the height, and the maxShade.
            width = s.nextInt();
            height = s.nextInt();
            maxShade = s.nextInt();
            /* We initialize and read-in the different pixels into the
             * pixels array
             */
            pixels = new short[height][width][3];
            // We read every row.
            for (int row=0; row<height; row++){
                // In each row we read the pixels for each column.
                for (int column=0; column<width; column++) {
                    /* For each pixel we read the three values for the
                     * three colours.
                     */
                    for (int colour=0; colour<3; colour++){
                        pixels[row][column][colour] = s.nextShort();
                    }
                }
            }
        }
        catch (IOException e){
            //If the file is not found, an error message is printed,
            //and an empty image is created.
            System.out.println("File not found.");

            typeOfFile = "P3";
            width = 0;
            height = 0;
            maxShade = 0;
            pixels = new short[width][height][3];
        }
    }

    /**
     *  Getter for the width.
     *  @return The width of the image.
     */
    public int getWidth(){
        return width;
    }

    /**
     *  Getter for the height.
     *  @return The height of the image.
     */
    public int getHeight(){
        return height;
    }

    /**
     *  Getter for the maxShade.
     *  @return The maximal pixel value of the image.
     */
    public int getMaxShade(){
        return maxShade;
    }

    /**
     *  Getter for the file type.
     *  @return The file type of the image.
     */
    public String getTypeOfFile(){
        return typeOfFile;
    }

    /**
     *  Getter for the pixel array.
     *  @return The matrix representing the three values for each
     *  pixels of the image.
     */
    public short[][][] getPixels(){
        return pixels;
    }

    /**
     *  The method creates a PGM image from the colour image and
     *  writes it to a file if the corresponding parameter is not the
     *  empty string.
     *  @param filename The filename of the file in which the PGM
     *  image should be saved. No file is saved if the string is the
     *  empty string.
     *  @return The two-dimensional array corresponding to the PGM image.
     */
    public short[][] makeGrey (String filename){
        /* A two-dimensional greyMatrix corresponding to the
         * three-dimensional colour matrix is generated.  It is first
         * created with the same height and width as the colour
         * matrix.
         */
        short[][] greyMatrix = new short[getHeight()][getWidth()];
        /* Set all elements in the greyMatrix by iterating over all
         * rows and columns. The outer loop iterates over the rows.
         */
        for (int row=0; row<getHeight(); row++){
            // The inner loop iterates over the column.
            for (int column=0; column<getWidth(); column++){
                /* Next we read the three colour values corresponding
                 * to the pixel at position [row][column].
                 */
                short[] rgb = getPixels()[row][column];
                /* totalGrey is the sum of the three colour values
                 * used to compute the rounded average. Note that we
                 * do not use a short for the value but int, since the
                 * sum of three positive short values may fall outside
                 * the range of positive short values.
                 */
                int totalGrey = 0;
                // Add up the three colour values.
                for (int colour = 0; colour < 3; colour++) {
                    totalGrey += rgb[colour];
                }
                /* Pixel value as the rounded average of the colour
                 * values, converted to short.
                 */
                greyMatrix[row][column] = (short) Math.round(totalGrey/3.0);
            }
        }

        /* If the file name is the empty string, return the greyMatrix.
         */
        if (filename.equals("")) {
            return greyMatrix;
        /* If the file name is not the empty string, write a PGM pixel
         * to the file specified and in addition return the
         * greyMatrix.
         */
        } else {
            /* Since there may be problems with writing out the file
             * we have to catch potential related exceptions.
             */
            try {
                BufferedWriter out =
                    new BufferedWriter(new FileWriter(filename));
                // We write the file type to out.
                out.write("P2\n");

                // We write the dimensions to out.
                out.write((getWidth()) + " " + (getHeight()) +"\n");

                // We write maximal number.
                out.write(getMaxShade() + "\n");

                // counter used to add new lines to the file every 15 pixels
                int counter = 0;
                // Iterate over each row
                for (int row=0; row<getHeight(); row++){
                // Iterate over each column
                    for (int column=0; column<getWidth(); column++){
                        /* Write the corresponding values of the
                         * greyMatrix to the file plus a separating
                         * empty space.
                         */
                        out.write(greyMatrix[row][column] + " ");
                        counter++;
                        // Every 15 pixels add a newline and reset the counter.
                        if (counter == 15){
                            out.write("\n");
                            counter = 0;
                        }
                    }
                }
                // Add a final newline.
                out.write("\n");
                // We close the file.
                out.close();
                return greyMatrix;
            }
           //Errors are caught.
            catch (IOException e){
                System.out.println("File not found.");
                return new short[0][0];
            }
        }
    }

    /*
     * A main method to test two examples.
     */
    public static void main(String[] args) {
        PPMImage csSmall = new PPMImage("ComputerScienceSmall.ppm");
        csSmall.makeGrey("ComputerScienceSmall.pgm");
        PPMImage csBig = new PPMImage("ComputerScienceBig.ppm");
        csBig.makeGrey("ComputerScienceBig.pgm");
    }
}
************************************************************************************
Exercise 4:(Debugging, 10%) InaclassMeasurement.java, assumeamethod, public static int measurement(), that returns a measurement of an instrument. As values only 1 or 2 are returned. If the instrument malfunctions the method throws an IllegalArgumentException. This can be simulated, for instance, by the following method:
public static int measurement() { int res = (int) (Math.random() * 3); if (res == 0) { throw new IllegalArgumentException(); } else { return res; } }
You want to call the method n times and store the results in an array, int[] result = new int[n]. If the instrument has malfunctioned you want store a value of -1. This is supposed to be done by the following method, but it does not work properly.
public static int[] measurementSeries(int n) { int[] result = new int[n]; for (int i = 0; i < n; i++) { if (measurement() == -1) { result[i] = -1; throw new IllegalArgumentException(); } else { result[i] = measurement(); } } return result; }
• What are the problems? Write your answer at the top of the ﬁle as part of the JavaDoc comment. • How can the problems be resolved? Change the code accordingly.
/**
 *  The major flaw with the original code is that the method
 *  measurementSeries should NOT THROW any exception, but CATCH the
 *  exceptions thrown by the measurement method. Also the condition
 *  measurement() == -1 in the first if expression makes no sense,
 *  since the measurement method never returns -1, that is, it can
 *  never be true.
 ***********************************************************************
 *
 *  The class firstly simulates a measurement performed by an
 *  instrument and that can take on two different values, 1 and 2. The
 *  instrument may also malfunction. We perform a series of
 *  measurments and store the values in the an array and print this
 *  out.
 *
 *  @version 2018-10-18
 *  @author Manfred Kerber
 */
public class Measurement {

    /**
     *  The method is used to simulate an instrument that randomly
     *  return either 1 or 2, or malfunctions.
     *  @return The method returns randomly either 1 or 2.
     *  @exception IllegalArgumentException if the instrument
     *  malfunctions. This is simulated only and done when a random
     *  number of 0 is created (out of numbers 0, 1, or 2).
     */
    public static int measurement() {
        //Create a random integer of either 0, 1, or 2.
        int res = (int) (Math.random() * 3);
        if (res == 0) {
            throw new IllegalArgumentException();
        } else {
            return res;
        }
    }

    /**
     *  The method stores the result of n measurements in an array and
     *  return this.
     *  @param n The number of measurements.
     *  @return An array with the result of n measurements being
     *  either 1 or 2. If the measurement failed, a -1 is stored in
     *  the array.
     */
    public static int[] measurementSeries(int n) {
        int[] result = new int[n];
        //In a loop n measurements are performed.
        for (int i = 0; i < n; i++) {
            /* If the measurement method throws an exception then this
             * exception is caught and the corresponding value in the
             * result array is set to -1. Else the result itself is
             * recorded in the result array.
             */
            try {
                result[i] = measurement();
            }
            catch (IllegalArgumentException e){
                result[i] = -1;
            }
        }
        return result;
    }

    /**
     *  Print out the elements of a one-dimensional integer array,
     *  separated by empty spaces.
     *  @param a A one-dimensional int array.
     */
    public static void printArray(int[] a) {
        for (int el : a) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    /*
     * Main method to test the program with 10 measurements.
     */
    public static void main(String[] args) {
        printArray(measurementSeries(10));
    }
}
************************************************************************************
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *  A class in which the gross salaries of a group of people are given
 *  in form of an ArrayList and we want to compute the average net
 *  salary after taxes have been applied.
 *  @version 2018-08-20
 *  @author Manfred Kerber
 */
public class AverageNetSalary {

    /**
     *  @param a An ArrayList of gross salaries.
     *  @param tax A function from Double to Double to compute the tax
     *  due for a particular salary.
     *  @return The corresponding average net salary.
     */
    public static Double netAverage(ArrayList<Double> a, Function<Double,Double> tax) {
        double average = 0;
        for (Double gross : a) {
            average += gross - tax.apply(gross);
        }
        return average/a.size();
    }

    /**
     *  Functions can also be bound to variables such as the following three.
     *  The tax is constant at 20 percent.
     */
    public static Function<Double,Double> tax0 =
        x -> {return 0.2*x;};

    /**
     *  The tax is a step function, up to an income of 30000 it is 20
     *  percent, for higher incomes it is 30 percent.
     */
    public static Function<Double,Double> tax1 =
        x -> {return (x <= 30000) ? 0.2*x : 0.3*x;};

    /**
     *  The tax is computed to the current income tax rules of the UK:
     *  up to a threshold of GBP 11850 the income is tax free;
     *  anything above up to 34500 will be taxed at 20%, income above
     *  34500 up to 150000 is taxed at 40%, and income above that at
     *  45%.
     */
    public static Function<Double,Double> tax2 =
        x -> {
        if (x <= 11850){
            return 0.0;
        }
        else if (x <= 34500){
            return 0.2 * (x - 11850.0);
        }
        else if (x <= 150000){
            return 0.4 * (x - 34500.0) + 0.2 * 34500.0;
        }
        else { // x > 150000
            return 0.45 * (x - 150000.0) + 0.4 * (150000.0 - 34500.0) + 0.2 * 34500.0;
        }
    };


    public static void main(String[] args) {
        ArrayList<Double> salaries0 =
            new ArrayList<Double>(Arrays.asList(10000.0, 20000.0, 15000.0));
        System.out.println(salaries0);
        System.out.println(netAverage(salaries0,tax0));
        System.out.println(netAverage(salaries0,tax1));
        System.out.println(netAverage(salaries0,tax2));
        ArrayList<Double> salaries1 =
            new ArrayList<Double>(Arrays.asList(10000.0, 30000.0, 40000.0, 2000000.0));
        System.out.println("\n"+salaries1);
        System.out.println(netAverage(salaries1,tax0));
        System.out.println(netAverage(salaries1,tax1));
        System.out.println(netAverage(salaries1,tax2));
        ArrayList<Double> salaries2 =
            new ArrayList<Double>(Arrays.asList(4000000.0, 2000000.0));
        System.out.println("\n"+salaries2);
        System.out.println(netAverage(salaries2,tax0));
        System.out.println(netAverage(salaries2,tax1));
        System.out.println(netAverage(salaries2,tax2));
    }
}
**********************************************************************************
import java.util.ArrayList;

    /**
     *  For simplicity we assume here that the balance is represented
     *  in Pounds and that only full pounds are used.
     *  @author Manfred Kerber
     *  @version 2017-10-24
     */
public class BankAccount{
    private Customer customer;
    private String password;
    private long balance;
    private ArrayList<Transaction> statement;

    public static final String stringCurrency = "\u00A3";

    /**
     * This constructor creates a bank account from the
     * three parts, customer, accountNumber and password.
     * @param customer The customer according to the Customer class.
     * @param password A string to represent the password. Obviously in a real system
     * we would never store a password in its plain form, but would use a safe way as
     * described on http://docs.oracle.com/javase/8/docs/api/java/security/MessageDigest.html, e.g.
     */
    public BankAccount (Customer customer, String password){
    this.customer = customer;
    this.password = password;
    this.balance = 0;
    this.statement = new ArrayList<Transaction>();
    }

    /**
     * Getter method to return the balance.
     * @return The balance of the BankAccount.
     */
    public long getBalance(){
     return balance;
    }

    /**
     * Getter method to return the customer.
     * @return The customer of the BankAccount.
     */
    public Customer getCustomer(){
     return customer;
    }

    /**
     * Getter method to return the password. As a minimal protection mechanism we make the getter private.
     * @return The password of the BankAccount.
     */
    private String getPassword(){
     return password;
    }

    /**
     * Method to compare the password with a given password.
     * @param  password The password to which the password of the this object is compared.
     * @return true if the password of the BankAccount agrees with the argument, false else.
     */
    public boolean checkPassword(String password){
        return this.getPassword().equals(password);
    }


    /**
     * Getter method to return the statement.
     * @return The current statement of the BankAccount.
     */
    public ArrayList<Transaction> getStatement() {
        return statement;
    }


    /**
     * Adds the amount to the current balance
     * and adds the transaction to the statement
     * @param amount The amount being deposited.
     */
    public void deposit(long amount){
        setBalance(getBalance() + amount);
        this.getStatement().add(new Transaction(amount,(byte) 2, getBalance()));
    }

    /**
     *  Setter for the amount. Particularly well
     *  suited for fraud if made public rather than private.
     *  @param amount The new amount in the balance.
     */
    private void setBalance(long amount){
	balance = amount;
    }

    /**
     *  Setter for the password, declared private to prevent unauthorized access.
     *  @param password The new password for the account.
     */
    private void setPassword(String password){
	this.password = password;
    }

    /** withdraws amount from the current balance add transaction to
     *  the statement if there are sufficient funds and the password is
     *  correct.  Otherwise an appropriate error message is printed.
     *  @param amount The amount to be withdrawn.
     *  @param password The password to access the account.
     */
    public void withdraw(long amount, String password){
	if (this.getPassword().equals(password) && balance >= amount) {
	    setBalance(getBalance() - amount);
	    this.getStatement().add(new Transaction(amount,(byte) 3, getBalance()));
	    }
	else if (this.getPassword().equals(password)) {
	    printInsufficientFunds(amount);
        }
        else {
            printWrongPassword();
        }
    }

    /**
     * Changes the password from old to new
     * if the old password is correct,
     * else an error message is printed.
     * @param oldPassword The current password.
     * @param newPassword The future password.
     */
    public void changePassword(String oldPassword, String newPassword){
	if (oldPassword.equals(this.getPassword())){
	    setPassword(newPassword);
        } else {
            printWrongPassword();
        }
    }

    /**
     * Transfers an amount of money from the this account to the
     * toAccount assumed the password is correct and the this account
     * has sufficient money, else an error message is printed.
     * @param toAccount The account to which the money is to be transferred.
     * @param amount The amount of money to be transferred.
     * @param password The password of the this account.
     */
    public void transferMoney(BankAccount toAccount,long amount, String password) {
	if (this.getPassword().equals(password) && (balance >= amount)) {
            setBalance(getBalance() - amount);
            toAccount.setBalance(toAccount.getBalance() + amount);
            this.getStatement().add(new Transaction(amount, (byte) 4, getBalance()));
            toAccount.getStatement().add(new Transaction(amount, (byte) 5, toAccount.getBalance()));
        } else if (this.getPassword().equals(password)) {
            printInsufficientFunds(amount);
        } else {
            printWrongPassword();
        }
    }
    /**
     * @return The name of the customer
     */
    public String toString(){
        return this.getCustomer().toString();
    }

    /*****************************************************************
     * Print functions. By keeping these separate from the actual    *
     * program it is easy to adjust them, for instance, for a        *
     * different language.                                           *
     *****************************************************************/

    /**
     *  Prints that a deposit was successful
     *  @param amount The amount that is deposited.
     */
    public void printDepositSuccessful(long amount){
	System.out.printf("The deposit of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that a withdrawal was successful
     *  @param amount The amount that is withdrawn.
     */
    public void printWithdrawSuccessful(long amount){
	System.out.printf("The withdrawal of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that a transfer was successful.
     *  @param amount The amount that is transferred.
     */
    public void printTransferSuccessful(long amount){
	System.out.printf("The transfer of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that the funds are insufficient for a transaction.
     *  @param amount The amount that was to be transferred.
     */
    public void printInsufficientFunds(long amount){
	System.out.printf("The funds of %s %d for %s are insufficient "
                          + "for this transaction.\n",
                          stringCurrency,this.getBalance(),this.getCustomer().getName());
    }

    /**
     *  Prints that a password change was successful.
     */
    public void printPasswordChangeSuccessful(){
	System.out.printf("Change of password for %s was successful.\n",
			  this.getCustomer().getName());
    }

    /**
     *  Prints that a password has not been recognized.
     */
    public void printWrongPassword(){
	System.out.println("The password you entered was not recognized.\n");
    }

    /**
     *  A method to print the balance of a bank account.
     */
    public void printBalance(){
	System.out.printf("The balance of %s is %s %d.\n",
			  this.getCustomer().getName(), stringCurrency, balance);
    }

    /**
     *  A method to print a statement of a bank account.
     */
    public void printStatement() {
        System.out.println(this);
    	for (int i = 0; i < statement.size(); i++) {
            System.out.println(statement.get(i));
    	}
    }
    /*****************************************************************
     * END of print functions. Separate the output from the actual   *
     * program                                                       *
     *****************************************************************/
}
*************************************************************************************
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/** JUnit tests for BankAccount.java
 * Some tests about gender and password for the BankAccount example
 * @author  Manfred Kerber
 * @version 2016-10-25
 */

public class BankAccountTest {
    private Customer john, mary, sam;
    private BankAccount bankAccountJohn, bankAccountMary, bankAccountSam;

    @Before
    public void setUp() {
        john = new Customer ("John Smith", "M", "CS", "01214144789");
        mary = new Customer ("Mary Jones", "F", "CS", "01214144788");
        sam = new Customer ("Sam Smith", "X", "CS", "01214144787");
        bankAccountJohn = new BankAccount(john, "sesameJohn");
        bankAccountMary = new BankAccount(mary, "sesameMary");
        bankAccountSam = new BankAccount(sam, "sesameSam");
    }

    @Test
    public void test1() {
        assertEquals("Error in getGender()", "M", john.getGender());
        assertEquals("Error in getGender()", "F", mary.getGender());
        assertEquals("Error in getGender()", "X", sam.getGender());

        assertTrue("Error in checkPassword()", bankAccountJohn.checkPassword("sesameJohn"));
        assertFalse("Error in checkPassword()", bankAccountJohn.checkPassword("sesameMary"));
    }

@Rule public ExpectedException exception =
             ExpectedException.none();
    @Test public void test2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Gender must be \"M\", \"F\", or \"X\"");
        Customer acme = new Customer ("ACME", "NN", "CS", "01214144789");
    }
}
**************************************************************************************
**
 *  @author Manfred Kerber
 *  @version 2015-10-27
 *
 *  This class implements the interface Payable. Since in the
 *  interface we have two methods in order to be an implementation of
 *  Payable, this class must give implementations of the two methods
 *  in the interface Payable.java.
 */

public class Company implements Payable {

    private String name;
    private String url;
    private double revenue;

    /**
     *  Constructor for the Company class
     *  @param name The company name.
     *  @param url  The url for the company's web site.
     *  @param revenue The annual revenue of the company.
     */
    public Company(String name, String url, double revenue) {
        this.name = name;
        this.url  = url;
        this.revenue = revenue;
    }

    /**
     *  Getter for the name.
     *  @return  The name of the company.
     */
    public String getName() {
        return name;
    }

    /**
     *  Getter for the url.
     *  @return  The url for the company's web site.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     *  Getter for the revenue.
     *  @return  The revenue for the company's web site.
     */
    public double getRevenue() {
        return this.revenue;
    }

    /**
     *  Setter for the name of the company.
     *  @param name The new name of the company.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *  The usual toString method for printing relevant information about the company.
     *  @return A string representing the company.
     */
    public String toString() {
        return name + " @: " + url;
    }

    /**
     *  An extended toString method for printing relevant information
     *  about the company with more information if verbose is true.
     *  @param verbose A flag to indicate of whether extended information is requested.
     *  @return A string representing the company in more detail if verbose is true.
     */
    public String toString(boolean verbose) {
        if (verbose) {
            return toString() + " revenue: " + revenue;
        } else {
            return toString();
        }
    }

    /**
     *  An equals method.
     *  @param company A company to compare the object to.
     *  @return true if the companies agree in name, url, and revenue (the last, up to a small number), false else.
     */
    public boolean equals(Company company) {
        return this.getName().equals(company.getName()) &&
            this.getUrl().equals(company.getUrl()) &&
            Math.abs(this.getRevenue() - company.getRevenue()) < 0.001;
    }

    /**
     *  A fee that the company has to pay for a particular service (such as accountancy).
     *  @return payable fee.
     */
    public double fee() {
        if (this.getRevenue() <= 500000) {
            return 2000.0;
        } else if (this.getRevenue() <= 1000000) {
            return 0.005 * this.getRevenue();
        } else {
            return 0.004 * this.getRevenue();
        }
    }


    /**
     *  The payment amount is the fee that the company has to pay.
     *  @return payable fee.
     */
    public int paymentAmount() {
        return (int) fee();
    };

    /**
     *  The due date be always the mid of the month.
     *  @return payable fee.
     */
    public int dueDate() {
        return 15;
    };

    /**
     *  Assume the charges for an array of companies has to be cleared
     *  by a bank.
     *  @param companies An array of different companies.
     *  @return The accumulated fee to be paid.
     */
    public static double charges(Company[] companies) {
        double sum = 0;
        for (Company company : companies){
            sum += company.fee();
        }
        return sum;
    }

    /*
     * A main method for testing
     */
    public static void main(String[] args) {

        Company c0 = new Company("a", "http://a", 2000000);
        Company c1 = new Company("b", "http://b", 20);
        Company c2 = new Company("c", "http://c", 700000);

        Company[] companies = {c0, c1, c2};

        System.out.println(c0.equals(c0));
        System.out.println(c0.equals(c1));
        System.out.println(c0);
        System.out.println(c0.toString(true));
        System.out.println(charges(companies));

    }
}
************************************************************************************
/**
 *  @author Manfred Kerber
 *  @version 2015-10-27
 *
 * The following example is adapted from [Deitel and Deitel, 2010, Java
 * - How to program, 8th edition, p. 427]. The interface provides only
 * skeleton of a class, that is, here, that there are two methods
 * which take no arguments and give back an int each, the amount to be
 * paid, and the day of the month when it has to be paid. Obviously a
 * calling methods needs to know no more. However, in order to run the
 * methods we need implementations.
 */

public interface Payable {
    /**
     *  @return The amount of money that has to be paid.
     */
    int paymentAmount();
    /**
     *  @return The day of the month when the payment is due.
     */
    int dueDate();
    **********************************************************************************
    /**
     *  A Customer is characterized by the fields name, address, and
     *  telephoneNumber all of type String.
     *  @version 2017-10-24
     *  @author Manfred Kerber
     */

    public class Customer{

        private String name;
        private String gender;
        private String address;
        private String telephoneNumber;

        /** Constructor for a Customer
         *
         *  @param name The name of the customer.
         *  @param gender The gender of the customer, which must be either
         *  "M", "F", or "X". For any other value an exception is thrown.
         *  @param address The address of the customer.
         *  @param telephoneNumber The phone number of the customer.
         */
        public Customer (String name, String gender, String address, String telephoneNumber) {
            if (gender.equals("M") ||
                gender.equals("F") ||
                gender.equals("X")){

                this.name = name;
                this.gender = gender;
                this.address = address;
                this.telephoneNumber = telephoneNumber;
            } else {
                throw new IllegalArgumentException("Gender must be \"M\", \"F\", or \"X\"");
            }
        }

        /**
         * Getter for the name.
         * @return The name of the Customer.
         */
        public String getName(){
            return name;
        }

        /**
         * Getter for the gender.
         * @return The gender of the Customer.
         */
        public String getGender(){
            return gender;
        }

        /**
         * Getter for the address.
         * @return The address of the Customer.
         */
        public String getAddress(){
            return address;
        }

        /**
         * Getter for the telephone number.
         * @return The telephoneNumber of the Customer.
         */
        public String getTelephoneNumber(){
            return telephoneNumber;
        }

        /**
         *  @return Either "Mr.", "Ms.", or "" depending on gender.
         */
        public String salutation(){
            if (this.getGender().equals("M")) {
                return "Mr.";
            } else if (this.getGender().equals("F")) {
                return "Ms.";
            } else {
                return "";
            }
        }

        /**
         * toString method for printing
         * @return The Customer represented as a String.
         */
        public String toString() {
            return salutation() +  getName() + " @" +
                getAddress() + "(Tel: " + getTelephoneNumber() + ")";
        }
    }
************************************************************************************
/**
 *  Employee implements Payable, that is, we have to give
 *  an implementation of the methods getPaymentAmount() and dueDate().
 *  Likewise since Employee also implements Holiday we have to
 *  give an implementation of getHolidays().
 *
 *  @version 2015-10-27
 *  @author  Manfred Kerber
 */
public class Employee implements Payable, Holiday {
    private static int generalDaysOfHolidays = 30;

    private String firstName;
    private String lastName;
    private String nI;
    private int salary;
    private int dayOfPayment;
    private int daysOfHolidays;

    /**
     *  A constructor for the Employee class.
     *  @param firstName The first name of the employee.
     *  @param lastName The last name of the employee.
     *  @param nI The national insurance number of the employee.
     *  @param salary The monthly salary of the employee.
     *  @param dayOfPayment The day of the month when the salary is paid.
     */
    public Employee(String firstName, String lastName, String nI,
                    int salary, int dayOfPayment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nI = nI;
        this.salary = salary;
        this.dayOfPayment = dayOfPayment;
        this.daysOfHolidays = generalDaysOfHolidays;
    }

    /**
     *  getter for first name.
     *  @return The first name of the employee.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *  getter for last name.
     *  @return The last name of the employee.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *  getter for the salary.
     *  @return The salary of the employee.
     */
    public int getSalary() {
        return salary;
    }

    /**
     *  getter for the national insurance number nI.
     *  @return The national insurance number of the employee.
     */
    public String getnI() {
        return nI;
    }

    /**
     *  getter for the day of payment
     *  @return The day when the salary is due.
     */
    public int getDayOfPayment() {
        return dayOfPayment;
    }

    /**
     *  getter for the number of holidays.
     *  @return The number of holidays the employee still has.
     */
    public int getDaysOfHolidays() {
        return daysOfHolidays;
    }

    /**
     *  setter for the number of holidays.
     *  @param daysOfHolidays The new number of holidays the employee still has.
     */
    public void setDaysOfHolidays(int daysOfHolidays) {
        this.daysOfHolidays = daysOfHolidays;
    }

    /**
     *  setter for the day of payment.
     *  @param dayOfPayment The new day of the month when the salary
     *  has to be paid.
     */
    public void setDayOfPayment(int dayOfPayment) {
        this.dayOfPayment = dayOfPayment;
    }

    /**
     *  setter for the salary.
     *  @param salary The new monthly salary of the employee.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *  Implementation of the payment amount, needed since the class
     *  implements the Payable interface.
     *  @return The payment amount which corresponds to the monthly
     *  salary.
     */
    public int paymentAmount() {
        return getSalary();
    }

    /**
     *  Implementation of the due date by which the salary needs to be
     *  paid, needed since the class implements the Payable interface.
     *  @return The due date when the monthly salary is to be paid.
     */
    public int dueDate() {
        return getDayOfPayment();
    }

    /**
     *  The toString() method to display Employee objects.
     */
    public String toString() {
        return String.format(" Name: %s, First Name: %s, NI: %s ",
                             getLastName(),
                             getFirstName(),
                             getnI());
    }
}
*************************************************************************************
import java.util.function.Function;

/**
 *  A simple class to demonstrate how to define and use functions
 *  (also called lambda expressions)
 *  @version 2017-10-24
 *  @author Manfred Kerber
 */
public class FunMain {

    /**
     *  @param f A function from int to int for which the values
     *  between 0 and n are to be computed and printed.
     *  @param n The maximal value to be printed.
     */
    public static void printN(Function<Integer,Integer> f, int n) {
        for (int i = 0; i <= n; i++){
            System.out.printf("%3d ", f.apply(i));
        }
        System.out.println();
    }

    /**
     *  Functions can also be bound to variables such as in this example.
     */
    public static final Function<Integer,Integer> f0 =
        x -> {return x * x + x - 7;};
    public static void main(String[] args) {
        System.out.print("x -> {return x;}             ");
        printN(x -> {return x;}, 10);
        System.out.print("x -> {return x * x;}         ");
        printN(x -> {return x * x;}, 10);
        System.out.print("x -> {return x + 1;}         ");
        printN(x -> {return x + 1;}, 10);
        System.out.print("x -> {return x * x + x - 7;} ");
        printN(f0, 10);
    }
}
************************************************************************************
**
 *  @author Manfred Kerber
 *  @version 2015-10-27
 *
 * The interface provides only skeleton of a class, that is, here,
 * that there is a method which take no arguments and give back an
 * int, the daysOfHolidays that somebody still has available to take.
 */
public interface Holiday {
    /**
     *  @return The number of days of holidays that somebody still has.
     */
   int getDaysOfHolidays();
}
*************************************************************************************
import java.util.ArrayList;
/**
 *  This class is to test the Holiday interface. In the main method an
 *  ArrayList of Holiday is created and the total number of holidays
 *  of the employees in this ArrayList is computed
 *
 *  @version 2016-10-25
 *  @author Manfred Kerber
 */
public class HolidayMain{
    /*
     * main method with an example
     */
    public static void main(String[] args) {
        int total = 0;

        ArrayList<Holiday> employees = new ArrayList<Holiday>();

        Employee john = new Employee("John", "Smith", "AA112312", 1999, 22);
        employees.add(john);
        Employee mary = new Employee("Smith", "Mary", "AB 12346 C", 1200, 20);
        employees.add(mary);
        mary.setDaysOfHolidays(25);

        for (Holiday employee : employees){
            total += employee.getDaysOfHolidays();
            System.out.println("*"+ employee);
            System.out.println(" has days of holidays left:" +
                               employee.getDaysOfHolidays());
        }
        System.out.println("The workforce has in total " + total +
                           " days of holidays left.");
    }
}
***********************************************************************************
/**
 *  Invoice implements Payable, that is, we have to give an
 * implementation for the methods PaymentAmount() and
 * dueDate(). That's done in the first case by returning the number of
 * items times the cost per item, in the second case by returning the
 * due date.
 *
 *  @author Manfred Kerber
 *  @version 2015-10-27
 */
public class Invoice implements Payable {
	private int pricePerItem;
	private int quantity;
	private String description;
	private String idNumber;
	private int dueDate;

    /**
     *  An Invoice object is created by this constructor.
     *  @param pricePerItem The price that a single item costs.
     *  @param quantity The number of items that have been shipped.
     *  @param description A verbal description of the item.
     *  @param idNumber A unique identifier of the item.
     *  @param dueDate A time (for simplicity represented as a number)
     *  by which the invoice has to be paid.
     */
    public Invoice(int pricePerItem, int quantity, String description,
                   String idNumber, int dueDate) {
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
        this.description = description;
        this.idNumber = idNumber;
        this.dueDate = dueDate;
    }

    /**
     *  getter for the dueDate.
     *  @return The due date by when the invoice must be paid.
     */
    public int getDueDate() {
        return dueDate;
    }

    /**
     *  This is doing exactly the same as the getDueDate
     *  getter. However, we have to provide this method, since the
     *  Invoice class implements the Payable interface, hence we need
     *  an explicit implementation for dueDate().
     *  @return The due date by when the invoice must be paid.
     */
    public int dueDate() {
        return getDueDate();
    }

    /**
     *  setter for the dueDate.
     *  @param dueDate The new due date by when the invoice must be paid.
     */
    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    /**
     *  getter for pricePerItem.
     *  @return The price that must be paid for a single item.
     */
    public int getPricePerItem() {
        return pricePerItem;
    }

    /**
     *  setter for the pricePerItem.
     *  @param pricePerItem The new price per item.
     */
    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    /**
     *  getter for quantity.
     *  @return The quantity of items that the invoice is about.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *  setter for the quantity.
     *  @param quantity The new quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *  getter for description.
     *  @return The description of the item that the invoice is about.
     */
    public String getDescription() {
        return description;
    }

    /**
     *  setter for description.
     *  @param description The new description of the item that the
     *  invoice is about.
     */
	public void setDescription(String description) {
		this.description = description;
	}

    /**
     *  getter for idNumber.
     *  @return The idNumber of the item that the invoice is about.
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     *  setter for idNumber.
     *  @param idNumber The new idNumber of the item that the
     *  invoice is about.
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     *  The toString() method to print the invoice.
     *  @return A printable String for the invoice.
     */
    public String toString() {
        return "Invoice for " + description +
            " (id=" + idNumber
            + ") " + quantity +
            " item(s) at a price of " + pricePerItem +  " per piece.\n" +
            "due at " + this.getDueDate();
    }

    /**
     *  The paymentAmount() method computes the payment to be done as
     *  the price times the items.
     *  @return The price to be paid as product of price per item
     *  times number of items.
     */
    public int paymentAmount(){
        return (this.getPricePerItem() * this.getQuantity());
    }
}
*************************************************************************************
import java.util.ArrayList;
/**
 *  This class is to test the Payable interface. In the main method an
 *  ArrayList of Holiday is created and the total number of holidays
 *  of the employees in this ArrayList is computed
 *
 *  @version 2015-10-27
 *  @author Manfred Kerber
 */
public class PayableMain {
    /*
     * main method with an example
     */
    public static void main(String[] args) {
        int total = 0;
        // Payable will contain two invoices and two employees
        ArrayList<Payable> payableObjects = new ArrayList<Payable>();

        payableObjects.add(new Invoice(29,6,"printer cartridge","222333", 15));
        payableObjects.add(new Invoice(3, 20, "1000 sheet of a4 paper", "234567", 15));
        payableObjects.add(new Employee("John", "Smith", "AA112312", 1999, 22));

        Company c0 = new Company("a", "http://a", 2000000);
        payableObjects.add(c0);
        Employee mary = new Employee("Smith", "Mary", "AB 12346 C", 1800, 15);
        payableObjects.add(mary);

        for (Payable currentPayable : payableObjects){
            total += currentPayable.paymentAmount();
            System.out.println("*"+ currentPayable);
            System.out.println("TO PAY:" +
                               currentPayable.paymentAmount());
        }
        System.out.println("THE TOTAL EXPENDITURE IN THE" +
                           " CURRENT PERIOD IS: " + total);
    }
}
**********************************************************************************
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *  In this class we look at the three related methods
 *  Math.round(double value), Math.floor(double value),
 *  Math.ceil(double value), which return a rounded long (that is, up
 *  to exclusively .5 the next smaller long is returned, from
 *  inclusively .5 the next larger long is returned. In case of
 *  Math.floor always the double is taken that corresponds to the next
 *  long number that is equal to or smaller than it. Likewise in case
 *  of Math.ceil the one that is bigger or equal to it.  We compute a
 *  number of examples making use of a function and an array in which
 *  we store the values we want to compute.
 *
 *  @version 2017-10-24
 *  @author  Manfred Kerber
 */
public class RoundMain{

    /**
     *  The function prints a String that corresponds to the
     *  application of the function f from Double to Long to the
     *  value. printForm is a readable form of the function.
     *  @param f The function for which the value is computed.
     *  @param printForm A written form of the function to display it
     *  symbolically.
     *  @param value The value to which the function is applied.
     */
    public static void printSingle(Function<Double,Long> f,
                                   String printForm,
                                   double value) {
        System.out.printf("%s%s%2.14f%s   %d \n", printForm,
                          "(", value, "):", f.apply(value));
    }

    /**
     *  The values for which the function value is computed are stored
     *  in an array of type double.
     */
    public static final double[] VALUES =
           {0.9, 1.0, 1.499999999, 1.5, 1.6, 1.7, 2.0, 2.5, 3.5, 4.5, 5.5,
            6.5, -1.7, -1.5, -1.3};

    /**
     *  Alternatively, the values for which the function values are
     *  computed are stored in an ArrayList of type
     *  Double. Alternatively, we can add values one at a time by
     *  something like VALUE_LIST.add{0.9};
     */
    public static ArrayList<Double> VALUE_LIST =
        new ArrayList<Double>(Arrays.asList(0.9, 1.0, 1.499999999, 1.5, 1.6,
                                            1.7, 2.0, 2.5, 3.5, 4.5, 5.5, 6.5,
                                            -1.7, -1.5, -1.3));

    /**
     *  The function prints a String that corresponds to the
     *  application of the function f from Double to Long to the
     *  value. printForm is a readable form of the function.
     *  @param f The function for which the values are computed.
     *  @param printForm A written form of the function to display it
     *  symbolically.
     *  @param values The values to which the function is applied.
     *  (If we replace the array by an ArrayList, we have to change
     *  the type from double[] to an ArrayList of type Double.
     */
    public static void printArray(Function<Double,Long> f,
                                  String printForm,
                                  ArrayList<Double> values) {
        for (Double value : values) {
            printSingle(f, printForm, value);
        }
    }

    /* main method to test printArray */
    public static void main(String[] args) {
        printArray((Double x) -> Math.round(x), "Math.round", VALUE_LIST);
        //        printArray((Double x) -> (long) Math.ceil(x), "(int) Math.ceil", VALUES);
        //printArray((Double x) -> (long) Math.floor(x), "(int) Math.floor", VALUES);
        /* We can replace all this now by one line.
        System.out.println("Math.round(0.9): " + Math.round(0.9));
        System.out.println("Math.round(1.0): " + Math.round(1.0));
        System.out.println("Math.round(1.499999999): " + Math.round(1.499999999));
        System.out.println("Math.round(1.5): " + Math.round(1.5));
        System.out.println("Math.round(1.6): " + Math.round(1.6));
        System.out.println("Math.round(1.7): " + Math.round(1.7));
        System.out.println("Math.round(2.0): " + Math.round(2.0));
        System.out.println("Math.round(2.5): " + Math.round(2.5));
        System.out.println("Math.round(3.5): " + Math.round(3.5));
        System.out.println("Math.round(4.5): " + Math.round(4.5));
        System.out.println("Math.round(5.5): " + Math.round(5.5));
        System.out.println("Math.round(6.5): " + Math.round(6.5));
        System.out.println("Math.round(-1.7): " + Math.round(-1.7));
        System.out.println("Math.round(-1.5): " + Math.round(-1.5));
        System.out.println("Math.round(-1.3): " + Math.round(-1.3));
        */
    }
}
*************************************************************************************
import java.util.*;

/**
 *  A Transaction is characterized by the fields amount, the transaction type
 *  <pre>
 * 2: deposit
 * 3: withdrawal
 * 4: transfer from
 * 5: transfer to
 * </pre>
 * the balance and the date of the transaction.
 *
 *  @version 2015-10-20
 *  @author Manfred Kerber
 */
public class Transaction {
   private long amount;
   private byte transactionType;
   private long balance;
   private String date;

    /** A constructor for a transaction. A time stamp is automatically added.
     *  @param amount The amount of the transaction.
     *  @param transactionType 2 for deposit, 3 for withdrawal, 4 for transfer from,  5 for transfer to.
     *  @param balance The balance after the transaction has been carried out.
     */
    public Transaction(long amount, byte transactionType, long balance) {
	this.amount = amount;
	this.transactionType = transactionType;
	this.balance = balance;
	this.date = new Date().toString();
	}

    /** Getter for amount.
     *  @return The amount of the transaction.
     */
    public long getAmount() {
	return amount;
    }

    /** Setter for amount.
     *  @param amount The new amount.
     */
    public void setAmount(long amount) {
	this.amount = amount;
    }

    /** Getter for the transactionType.
     *  @return The amount of the transaction.
     */
    public byte getTransactionType() {
	return transactionType;
    }

    /** Setter for amount.
     *  @param transactionType The new transaction type.
     */
    public void setTransactionType(byte transactionType) {
	this.transactionType = transactionType;
    }

    /** A toString method for printing a transaction.
     *  @return A readable form of the transaction.
     */
    public String toString() {
	String transactionTypePrint;
        switch (this.getTransactionType()) {
        case 2:  transactionTypePrint = " has been payed in.";  	           break;
        case 3:  transactionTypePrint = " has been withdrawn";                     break;
        case 4:  transactionTypePrint = " has been transfered to another account.";break;
        case 5:  transactionTypePrint = " has been transfered into this account."; break;
        default: transactionTypePrint = " unknown transaction.";                   break;
        }
	return "On " + date + " the amount of " + amount +
            transactionTypePrint + " Balance: " + balance;
    }
}
***************************************************************************************
Exercise 2: (Medium, 30%) Write in the main method below code that prints the ﬁrst 100 positive numbers that are divisible by 3 but not divisible by 12. public static void main(String[] args) {

public class Divisible {

    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (count < 100) {
            if ((i % 3) == 0 && (i % 12) !=0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
*********************************************************************************
Exercise 3: (Advanced, 30%) Aradiostationorganizesatelephonesurveyinordertodeterminethetopbookofalltime. Thelistenerscanchoosefroma(previouslydetermined)listof100booksgivenasanarray public static final String[] topOneHundred. Listeners can call in and make their choices by typing the last two digits according to the 100 possibilities (corresponding to the indices in the array topOneHundred): "00", "01", "02", ..., "99". Every choice made by a listener is added to an array list private static ArrayList<String> choices. Write a method public static String topChoice(ArrayList<String> choices) that returns the most popular book. In case that there are several books with the same number of votes all should be included in the String, separated by newlines (\n). [Hint: You may use the method Integer.parseInt(String str).]

import java.util.ArrayList;
public class Survey {

    public static final String[] topOneHundred = new String[100];

    private static ArrayList<String> choices = new ArrayList<String>();

    /**
     *  A random String of the form "ABC"
     *  @return A random String consisting of three characters in the
     *  range A-Z.
     */
    public static String randomName() {
        int r1 = (int) (26 * Math.random());
        int r2 = (int) (26 * Math.random());
        int r3 = (int) (26 * Math.random());
        int offset = (int) 'A';
        return ""+ (char) (offset + r1) +
                   (char) (offset + r2) +
                   (char) (offset + r3);
    }

    public static void randomSetting() {
        for (int i = 0; i < 100; i++) {
            topOneHundred[i] = randomName();
        }
    }

    public static void randomChoices(int n) {
        int r;
        for (int i = 0; i < n; i++) {
            r = (int) (100 * Math.random());
            if (r < 10) {
                choices.add("0" + r);
            } else {
                choices.add("" + r);
            }
        }
    }
    public static String topChoice(ArrayList<String> choices){
        int[] popularity = new int[100];
        for (String choice: choices) {
            popularity[Integer.parseInt(choice)]++;
        }
        int max = 0;
        String result = "";
        for (int i = 0; i < 100; i++) {
            if (popularity[i] > max) {
                result = topOneHundred[i];
                max = popularity[i];
            } else if (popularity[i] == max) {
                result += "\n" + topOneHundred[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        randomSetting();
        randomChoices(2000000);
        //System.out.println(choices);
        System.out.println(topChoice(choices));
    }
}
************************************************************************************
Exercise 1: (Basic, 30%) Let the BankAccount class from the examples of Week 2 be given (that is, a class with the three ﬁelds private int accountNumber, private String accountName, and private int balance and the corresponding constructor and getters and setters). Furthermore assume that the bank stores all the bank accounts in a variable allAccounts of type ArrayList<BankAccount>. Write a functionpublic static final Function<ArrayList<BankAccount>,Integer> totalAmountthatcomputes for an ArrayList<BankAccount> the total amount of money in all the bank accounts. For instance with the two bank accounts BankAccount mary = new BankAccount(1, "Mary"); with mary.payIn(100) and BankAccount john = new BankAccount(2, "John"); with john.payIn(99) and BankAccount[] array = {mary, john}; ArrayList<BankAccount> allAccounts = new ArrayList<BankAccount>(Arrays.asList(array)); the function call totalAmount.apply(allAccounts) should result in 199.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Function;

/** BankAccount is a class for a very simple bank account created
 *  from a bank account and the name of the account holder.
 *  We distinguish three field variable:
 *  <pre>
 *   accountNumber, an int to uniquely find an account
 *   accountName, the name (or names) of the account holder(s), and
 *   balance, how much money is in the account.
 *  </pre>
 *  @author   Manfred Kerber
 *  @version  2017-10-25
 */
public class BankAccount{
    private int     accountNumber;
    private String  accountName;
    private int     balance;

    /** BankAccount is a constructor  for a very simple bank account created
     *  @param  accountNumber is the account number as int
     *  @param  accountName the account name as String
     */
    public BankAccount(int     accountNumber,
		       String  accountName){
        this.accountNumber      = accountNumber;
        this.accountName        = accountName;
        this.balance            = 0;
    }

    /* Now we write methods to get the parts of a BankAccount,
     * so called accessor methods.
     */

    /**
     *  @return the account number of a BankAccount as int
     */
    public int getAccountNumber(){
        return accountNumber;
    }

    /**
     *  @return the accountName as a String
     */
    public String getAccountName(){
	return accountName;
    }

    /**
     *  @return the balance of a BankAccount
     */
    public int getBalance(){
        return balance;
    }

    /** toString defines how to print a BankAccount
     *
     *  @return  the print type of an account
     */
    public String toString(){
	return "Account number: " + accountNumber +
            " Account name: "  + accountName   +
            " Balance: "       + balance;
    }

    /* Now we write methods to set the parts of a bank account,
     * so called setters.
     */

    /**
     *  sets the account number of a BankAccount
     * @param accountNumber for the changed account number
     */
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     *  sets the balance of a BankAccount
     *  @param balance the new balance on the account
     */
    public void setBalance(int balance){
        this.balance = balance;
    }

    /**
     *  this method checks whether the BankAccount is equal to a
     *  second BankAccount
     *  return true if the current BankAccount (*this*) is equal
     *         to the BankAccount it is compared to, that is,
     *         if it agrees with it in number, name, balance.
     *  @param a The second BankAccount.
     *  @return true if and only if the this bankaccount is equal to the
     *  bankaccount a wrt account number, account name, and balance.
     *  NOTE: equality is a tricky concept!
     */
    public boolean equals(BankAccount a){
        return
            (this.getAccountNumber() == a.getAccountNumber()) &&
            (this.getAccountName().equals(a.getAccountName())) &&
            (this.getBalance() == a.getBalance());
    }

    /** the amount will be taken from the balance
     *  @param  amount The amount to be withdrawn.
     */
    public void withdraw(int amount){
	setBalance(getBalance() - amount);
    }

    /**
     *  The amount will be added to the balance
     *  @param amount The amount to be paid in.
     */
    public void payIn(int amount){
	setBalance(getBalance() + amount);
    }

    /**
     *  The function adds up all the balances of all the bank accounts.
     */
    public static final Function<ArrayList<BankAccount>,Integer> totalAmount =
        allAccounts -> {
        int sum = 0;
        for (BankAccount account : allAccounts) {
            sum += account.getBalance();
        }
        return sum;
    };

    /*
     *  main method to test the function for the given example.
     */
    public static void main(String[] args) {
        BankAccount mary = new BankAccount(1, "Mary");
        mary.payIn(100);
        BankAccount john = new BankAccount(2, "John");
        john.payIn(99);
        BankAccount[] array = {mary, john};
        ArrayList<BankAccount> allAccounts =
            new ArrayList<BankAccount>(Arrays.asList(array));
        System.out.println(totalAmount.apply(allAccounts));
    }
}
*************************************************************************************
Deﬁnite integration means to determine the area under a function f on a particular interval [a,b]. It can be numerically approximated by the combined area of a number n of rectangles of equal width and of heights determined by f. Concretely, the area is the sum of the n rectangles of width (b − a)/n where a rectangle i with 0 ≤ i < n has a height given by f(a+i·(b−a)/n). To the left you see an example with the function f being the square function and an approximation with 4 rectangles. That is, the area is approximated, with δ =(b−a)/4, by δ·f(a)+f(a+δ)+f(a+2·δ)+f(a+3·δ) With a bigger number of rectangles (e.g., n = 1000) you should get a better approximation.
y=x
2
x
y
a b
 approximation of area by 4 rectangles
Write in a class Integral a method public static double integral(Function<Double,Double> f, double a, double b, int n) that approximates the integral of an arbitrary function f on the interval [a, b] (with a <= b) by the sum of the areas of a positive number n of rectangles. Test your method with four functions: f(x) = x2, f(x) = sin(x), f(x) = ex, and f(x) = x3 + x2 + x +1 on the interval [0,1] with n = 1000. The results should approximately be 0.33283349999999995, 0.45927692033131423, 1.7174228307349666, and 2.0818337500000004, respectively.
import java.util.function.Function;

/**
 *  The class provides a method that computes an approximation of a
 *  definite integral of a function f on an interval [a,b].
 *
 *  @version 2018-10-25
 *  @author Manfred Kerber
 */
public class Integral{

    /**
     *  The method computes the approximation of a definite integral
     *  by the sum of the areas of n rectangles of the same width.
     *  @param f The function of which the integral is to be computed.
     *  @param a The left endpoint of the interval for which the area
     *  is to be determined.
     *  @param b The right endpoint of the interval for which the area
     *  is to be determined.
     *  @param n The number of rectangles used for the approximation.
     *  @exception IllegalArgumentException if the left endpoint is
     *  bigger than the right endpoint.
     *  @return An approximation of the definite integral of the
     *  function f on the interval [a,b] by n rectangles.
     */
    public static double integral(Function<Double,Double> f,
                                  double a, double b, int n) {
        if (a <= b) {
            // to accumulate the areas
            double sum = 0;
            // The width of a single rectangle.
            double delta = (b - a)/n;
            /*
             *  The sum accumlates (if multipled by the width of the
             *  areas) the area of all the rectangles considered so
             *  far, that is up to the number i.
             */
            for (int i = 0; i < n; i++) {
                sum += f.apply(a + i * delta);
            }
            /*
             * The combined area is computed by the width (the same
             * for all areas, namely delta) times the sum of all the
             * heights of the rectangles.
             */
            return delta * sum;
        } else { // b < a
            // IllegalArgumentException if b < a.
            throw new IllegalArgumentException("Left endpoint of interval "
                        + "not smaller than right endpoint.");
        }
    }

    /*
     *  Main method to test the method on four different functions.
     */

    public static void main(String[] args){
        Function<Double, Double> square = x -> {return x * x;};
        Function<Double, Double> sin = x    -> {return Math.sin(x);};
        Function<Double, Double> exp = x    -> {return Math.exp(x);};
        Function<Double, Double> poly = x   -> {return x*x*x + x*x + x +1;};

        double a = 0;
        double b = 1;
        int    n = 1000;

        System.out.println("area square: " + integral(square, a, b, n));
        System.out.println("area sin:    " + integral(sin,    a, b, n));
        System.out.println("area exp:    " + integral(exp,    a, b, n));
        System.out.println("area poly:   " + integral(poly,   a, b, n));
        System.out.println("area poly:   " + integral(poly,   b, a, n));
    }
}
*********************************************************************************
Assignment 5
Graphs can be used in diﬀerent ways, for instance, in order to describe thestreetsinaparticulararea. Seethefollowingexample(graphtotheleft,correspondingtwo-dimensional array, the so-called adjacency matrix, to the right):

Theadjacencymatrixcontainstheinformationofthelengthsofthedirectroutesbetweenanytwovertices. Obviously, the distance from a vertex to itself is 0. If two vertices are not directly connected we record this by a -1. Let an interface GraphInterface be given with the two method headers public boolean connected();, which is to compute whether a graph is connected, and public int totalLength();, which is to return the total length corresponding to the values in the graph. Give an implementation of the interface in a class Graph with the ﬁeld variables private int numberOfNodes and private int[][] adjacencyMatrix. In addition to the standard constructor, there should also be a constructor public Graph(String filename)thatreadsinaﬁlethatcontainsdata oftheformasdisplayedtotheright(theexamplerepresentsthe graph above). That is, the ﬁrst number deﬁnes the number of nodes in the graph, all other lines consist of the lines of integers corresponding to the adjacency matrix. 6 0 7 -1 6 3 18 7 0 -1 2 9 -1 -1 -1 0 24 15 1 6 2 24 0 -1 10 3 9 15 -1 0 -1 18 -1 1 10 -1 0 In order to determine whether a graph is connected you may use the algorithm described on https: //en.wikipedia.org/wiki/Connectivity_(graph_theory)#Computational_aspects: • Begin at any arbitrary node of the graph, G. • Proceed from that node using either depth-ﬁrst or breadth-ﬁrst search, counting all nodes reached. • Once the graph has been entirely traversed, if the number of nodes counted is equal to the number of nodes of G, the graph is connected; otherwise it is disconnected. Write a main method and check whether the graph above is connected (it is) and compute its total length (the answer should be 95).

import java.util.function.Function;

/**
 *  The class provides a method that computes an approximation of a
 *  definite integral of a function f on an interval [a,b].
 *
 *  @version 2018-10-25
 *  @author Manfred Kerber
 */
public class Integral{

    /**
     *  The method computes the approximation of a definite integral
     *  by the sum of the areas of n rectangles of the same width.
     *  @param f The function of which the integral is to be computed.
     *  @param a The left endpoint of the interval for which the area
     *  is to be determined.
     *  @param b The right endpoint of the interval for which the area
     *  is to be determined.
     *  @param n The number of rectangles used for the approximation.
     *  @exception IllegalArgumentException if the left endpoint is
     *  bigger than the right endpoint.
     *  @return An approximation of the definite integral of the
     *  function f on the interval [a,b] by n rectangles.
     */
    public static double integral(Function<Double,Double> f,
                                  double a, double b, int n) {
        if (a <= b) {
            // to accumulate the areas
            double sum = 0;
            // The width of a single rectangle.
            double delta = (b - a)/n;
            /*
             *  The sum accumlates (if multipled by the width of the
             *  areas) the area of all the rectangles considered so
             *  far, that is up to the number i.
             */
            for (int i = 0; i < n; i++) {
                sum += f.apply(a + i * delta);
            }
            /*
             * The combined area is computed by the width (the same
             * for all areas, namely delta) times the sum of all the
             * heights of the rectangles.
             */
            return delta * sum;
        } else { // b < a
            // IllegalArgumentException if b < a.
            throw new IllegalArgumentException("Left endpoint of interval "
                        + "not smaller than right endpoint.");
        }
    }

    /*
     *  Main method to test the method on four different functions.
     */

    public static void main(String[] args){
        Function<Double, Double> square = x -> {return x * x;};
        Function<Double, Double> sin = x    -> {return Math.sin(x);};
        Function<Double, Double> exp = x    -> {return Math.exp(x);};
        Function<Double, Double> poly = x   -> {return x*x*x + x*x + x +1;};

        double a = 0;
        double b = 1;
        int    n = 1000;

        System.out.println("area square: " + integral(square, a, b, n));
        System.out.println("area sin:    " + integral(sin,    a, b, n));
        System.out.println("area exp:    " + integral(exp,    a, b, n));
        System.out.println("area poly:   " + integral(poly,   a, b, n));
        System.out.println("area poly:   " + integral(poly,   b, a, n));
    }
}
*************************************************************************************
**
 *  The interface contains the head of two methods connected and
 *  totalLength.
 *
 *  @version 2018-10-25
 *  @author Manfred Kerber
 */

public interface GraphInterface {

    /**
     *  The method is to determine whether the given graph is
     *  connected, that is, whether it is in principle possible to
     *  walk from any vertex to any other vertix using the connections
     *  by the graph.
     *  @return true if any two vertices can be reached from each
     *  other.
     */
    public boolean connected();

    /**
     *  The method returns the total length represented by the graph,
     *  for instance, in the case of a road system the method would
     *  represent to total length of all the roads. Note that in the
     *  matrix every road is represented twice (e.g., as a road from
     *  vertex 0 to vertex 1 and as road from vertex 1 to vertex 0),
     *  but the length should be added once only. Also -1 is used to
     *  represent that a corresponding road does not exist, hence
     *  these values are not be included in the sum
     *  @return The sum of all the connections (excluding -1 and each
     *  counted only once).
     */
    public int totalLength();
}

***************************************************************************************

Exercise 4: (Debugging, 10%) Assumethatacompanystoresthesalariesoftheiremployeesfortheyear2018inanArrayList,ArrayList<int[]> a2018, of one-dimensional arrays of type int[]. That is, each entry in a2018 represents one employee as an array storing their monthly salaries for the 12 months of the year. For some statistics, the company needs to know the proportion of their employees that have an average monthly income that is more than double the average monthly income of all other employees. Write a methodpublic static double proportionOfHighEarners (ArrayList<int[]> a)thatcomputesthis ratio. If the company has no employees the method should throw an exception. You can assume that each employee has at least one non-zero salary. Note: When computing averages only incomes strictly greater than zero must be taken into account (in other words any 0s should be disregarded). This is attempted by the following code:

import java.util.Arrays;
import java.util.ArrayList;

/**
 *  The problem with the solution is that it compares the average
 *  non-zero salaries to the averaged doubled salary, but it should
 *  compare it to the averages doubled salary OF ALL OTHER employees
 *  (not all employees).
 *
 *  An employee is characterized by name and salaries, the latter an
 *  array of 12 elements, representing the 12 salaries in a year.
 *
 *  @version 2018-10-25
 *  @author Manfred Kerber
 */
public class Employee {
    private String name;
    private int[] salaries;


    /**
     *  @param name The name of the employee.
     *  @param salaries The 12 salaries in a year, represented in an array.
     */
    public Employee(String name, int[] salaries) {
        this.name = name;
        this.salaries = salaries;
    }

    /**
     *  Getter for the name
     *  @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     *  Getter for the salaries
     *  @return The array of the 12 salaries in a year of the employee.
     */
    public int[] getSalaries() {
        return salaries;
    }

    /**
     *  @return The average salary of the employee in which they do
     *  not have a zero salary, that is, when they were properly
     *  employed.
     */
    public double averageNonZero() {
        /*
         *  The total salary and the total number of months are computed
         */
        double sum = 0;
        int numberOfEntries = 0;
        /*
         *  We iterate over all salaries, add them up and count how
         *  many non-zero salaries there are.
         */
        for (int entry : getSalaries()) {
            if (entry != 0) {
                sum += entry;
                numberOfEntries += 1;
            }
        }
        //  We return the average of all the non-zero salaries.
        return sum/numberOfEntries;
    }

    /**
     *  @return The number of months with a non-zero salary
     */
    public int numberNonZero() {
        int sum = 0;
        // We iterate over all salaries, and count the non-zero salaries.
        for (int entry : getSalaries()) {
            if (entry != 0) {
                sum++;
            }
        }
        return sum;
    }

    /**
     *  The double of the average monthly salary is computed for an
     *  ArrayList of employees.
     *  @param employees All employees of the company.
     *  @return The double of their average monthly salaries (only
     *  proper salaries, that is, values not equal to zero are
     *  considered).
     */
    public static double doubleAverageMonthlySalary(ArrayList<Employee> employees) {
        if (employees.size() == 0) {
            throw new IllegalArgumentException("ArrayList must not be empty!");
        } else {
            double sum = 0;
            int numberOfEntries = 0;
            /*
             *  Add the salaries for all employees and count how many
             *  months the salaries are not equal to zero.
             */
            for (Employee employee : employees) {
                /*
                 *  Add up the salaries for each month.
                 */
                for (int monthlySalary : employee.getSalaries()) {
                    if (monthlySalary != 0) {
                        sum += monthlySalary;
                        numberOfEntries += 1;
                    }
                }
            }
            // Return double the average.
            return 2*sum/numberOfEntries;
        }
    }

    /**
     *  The number of all months of all employees when there is a
     *  non-zero salary is counted
     *  @param employees All employees of the company.
     *  @return The number of months of all employees when they have a
     *  non-zero salary.
     */
    public static int totalNumberNonZero(ArrayList<Employee> employees) {
        if (employees.size() == 0) {
            throw new IllegalArgumentException("ArrayList must not be empty!");
        } else {
            int numberOfEntries = 0;
            /*
             *  Add up for all employees and count how many
             *  months their salaries are not equal to zero.
             */
            for (Employee employee : employees) {
                /*
                 *  Interate over each month
                 */
                for (int monthlySalary : employee.getSalaries()) {
                    if (monthlySalary != 0) {
                        numberOfEntries++;
                    }
                }
            }
            return numberOfEntries;
        }
    }

    /**
     *  The proportion of employees in the workforce is returned who
     *  have an average salary of more than double the average salary
     *  of ALL THE OTHERS .
     *  @param employees The array list of all employees employed.
     *  @return The proportion of those employees in the workforce
     *  that earn more than double of all OTHER employees.
     */
    public static double proportionOfHighEarner(ArrayList<Employee> employees) {
        if (employees.size() == 0) {
            throw new IllegalArgumentException("ArrayList must not be empty!");
        } else {
            int counter = 0;
            /*
             * The overall doubled average is compared to the average
             * non-zero salaries of the OTHER employees.
             */
            double doubleOverallAverage = doubleAverageMonthlySalary(employees);
            int allMonths = totalNumberNonZero(employees);
            for (Employee employee : employees) {
                double singleAverage = employee.averageNonZero();
                int singleNonZero = employee.numberNonZero();
                /*
                 *  We take the one salary out of the computation by
                 *  subtracting from the total salary awarded to all
                 *  employees, that is,
                 *  allMonths*doubleOverallAverage/2, the total award
                 *  to the employee under consideration, then divide
                 *  the difference by the non-zero months of all other
                 *  (i.e., allMonths - singleNonZero). The final
                 *  result is multiplied by 2 in order to get double
                 *  the average.
                 */
                if (singleAverage >
                    2*(allMonths*doubleOverallAverage/2 -
                     singleNonZero*singleAverage)/(allMonths - singleNonZero)){
                    counter++;
                }
            }
            return ((double) counter) / employees.size();
        }
    }


    /*
     * Main method to test the proportionOfHighEarner method.
     */
    public static void main(String[] args) {
        Employee john = new Employee("John",
               new int[] {2000,2000,2000,2000,2000,2020,2020,2020,0,0,0,0});

        Employee mary = new Employee("Mary",
               new int[] {2200,2200,2200,2200,2200,2222,2222,2222,2222,2222,2222,2222});

        Employee boss = new Employee("Boss",
               new int[] {5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000});


        Employee[] array = {mary, john, boss};
        ArrayList<Employee> allEmployees =
            new ArrayList<Employee>(Arrays.asList(array));

        for (Employee emp : allEmployees) {
            System.out.println(emp.averageNonZero());
        }
        System.out.println(proportionOfHighEarner(allEmployees));
    }
}

**************************************************************************************
Exercise 1: (Basic, MSc: 30%, ICY: 40%) Write a class Vehicle with the two ﬁeld variables passengerNumber and maxSpeed both of type int with a standard constructor, getter(s), setter(s), and a toString method. Furthermore write a subclass Bus with the additional ﬁeld variable fuelConsumption of type double. The class should contain a constructor, getter(s) and setter(s), and a toString method. Make use of inheritance as far as possible.

**
 *  The class describes a vehicle characterized by the number of
 *  passengers it can transport and the maximal speed it goes in the
 *  two field variables passengerNumber and maxSpeed, both of type
 *  int.
 *
 *  @version 2018-11-04
 *  @author Manfred Kerber
 */

public class Vehicle {

    private int passengerNumber;
    private int maxSpeed;

    /**
     *  Constructor
     *  @param passengerNumber The number of passengers the vehicle
     *  can transport.
     *  @param maxSpeed The maximal speed the vehicle goes.
     */
    public Vehicle(int passengerNumber, int maxSpeed) {
        this.passengerNumber = passengerNumber;
        this.maxSpeed = maxSpeed;
    }

    /**
     *  Getter for passengerNumber
     *  @return The number of passengers the vehicle can transport.
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }

    /** Setter for passengerNumber
     *  @param passengerNumber The number of passengers the vehicle
     *  can transport.
     */
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    /**
     *  Getter for maxSpeed
     *  @return The maximal speed the vehicle goes.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     *  Setter for maxSpeed
     *  @param maxSpeed The maximal speed the vehicle goes.
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     *  toString method to get a readable form in print-outs of the objects.
     *  @return A human readable form of the objects.
     */
    public String toString() {
        return "The vehicle can transport " + getPassengerNumber() +
            " passengers and has a maximal speed of " +
            getMaxSpeed() + " km/h.";
    }
}
**********************************
/**
 *  The class describes a bus as a subclass of vehicle, characterized,
 *  in addition to vehicle, by the fuelConsumption of type double
 *  (given in km per litre).
 *
 *  @version 2018-11-04
 *  @author Manfred Kerber
 */

public class Bus extends Vehicle {

    double fuelConsumption; //km per litre

    /**
     *  Constructor
     *  @param passengerNumber The number of passengers the bus
     *  can transport.
     *  @param maxSpeed The maximal speed the bus goes.
     *  @param fuelConsumption The fuel consumption of the bus in km
     *  per litre.
     */
    public Bus(int passengerNumber, int maxSpeed, double fuelConsumption) {
        super(passengerNumber, maxSpeed);
        this.fuelConsumption = fuelConsumption;
    }

    /**
     *  Getter for fuelConsumption
     *  @return The fuel consumption of the bus in km per litre.
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     *  Setter for fuelConsumption
     *  @param fuelConsumption The fuel consumption of the bus in km
     *  per litre.
     */
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    /**
     *  toString method to get a readable form in print-outs of the objects.
     *  @return A human readable form of the objects.
     */
    public String toString() {
        return super.toString() + " It needs " + getFuelConsumption() +
            " km per litre.";
    }
}
******************************************
**
 *  A class containing a main method for initial tests of the classes
 *  Vehicle and Bus.
 *
 *  @version 2018-11-04
 *  @author Manfred Kerber
 */
public class Main {

    public static void main(String[] args) {
        Vehicle v = new Vehicle(3, 20);
        Bus b = new Bus(68, 90, 4.7);

        System.out.println(v);
        System.out.println(b);
    }

}
***********************************************
Exercise 2:(Medium, 30%) DeﬁneaninterfaceMeasurablewiththepublicmethodsignaturepublic double getValue(). Write a class Invoice that implements the interface Measurable to record an invoice by ﬁeld variables for the accountNumber, the sortCode, and the amount with types String, String, and double, respectively. Furthermore implement a class Patient that implements the interface Measurable. It deﬁnes a patient by ﬁeld variables name, age, and weight of types String, int, double, respectively. In a class Statistics write three methods public static double maximum(ArrayList<Measurable> elements), public static double average(ArrayList<Measurable> elements), and public static double standardDeviation(ArrayList<Measurable> elements), which return the maximum, the average, and the standard deviation of the corresponding elements in the array list. [Note, in order to determine the standard deviation you ﬁrst determine the average. Second, you square the diﬀerences between the elements and the average. Thirdly, you sum these squared diﬀerences up. Fourthly, this value is divided by the length of the array list minus one. Finally, the standard deviation is the square root (Math.sqrt) of this value. For details, see for instance, https://en.wikipedia.org/ wiki/Standard_deviation.]

import java.util.ArrayList;

/**
 *  The interface specifies the method double getValue on which the
 *  class Statistics can operate.
 *
 *  @version 2018-11-03
 *  @author Manfred Kerber
 */
public interface Measurable {

    /**
     *  The double getValue method provides a numerical value of
     *  objects that belong to a class that implements the interface
     *  Measurable. The Statistics class can then use these numerical
     *  values to analyze ArrayLists of such objects.
     *  @return A numerical value that is used for objects of the
     *  generalized type Measurable in the class Statistics.
     */
    public double getValue();
}
***********************************************************************************
import java.util.ArrayList;

/**
 *  The Invoice class implements the interface Measurable that is, it
 *  has to provide an implementation for the method int getValue().
 *  The three field variable correspond to the account number, the
 *  sort code, and the amount corresponding to an invoice.
 *
 *  @version 2018-11-03
 *  @author Manfred Kerber
 */
public class Invoice implements Measurable{

    private String accountNumber;
    private String sortCode;
    private double amount;

    /**
     *  A constructor for the class.
     *  @param accountNumber The number of the account to which the
     *  money is transfered.
     *  @param sortCode The sort code of the account to which the
     *  money is transfered.
     *  @param amount The amount that is to be transfered.
     */
    public Invoice(String accountNumber, String sortCode, double amount) {

        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.amount = amount;
    }

    /**
     *  getter for the amount.
     *  @return The amount transfered.
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     *  A method that implements the getValue method, required by the
     *  Measurable interface.
     *  @return The amount transfered.
     */
    public double getValue(){
        return this.amount;
    }

    /**
     *  A toString method for producing a human readable String of
     *  members of the class.
     *  @return A human readable String for an Invoice.
     */
    public String toString() {
        return accountNumber + " (sort: " + sortCode + ") amount: " + amount;
    }

    /*
     *  A main method for initial tests.
     */
    public static void main(String[] args) {
        Invoice nails = new Invoice("1234", "00-11-22", 10);
        Invoice hammer = new Invoice("1235", "00-11-22", 8);
        Invoice screws = new Invoice("1234", "11-00-22", 6);
        System.out.println(nails);
        ArrayList<Measurable> allInvoices = new ArrayList<Measurable>();
        allInvoices.add(nails);
        allInvoices.add(hammer);
        allInvoices.add(screws);
        System.out.println(Statistics.average(allInvoices));
        System.out.println(Statistics.maximum(allInvoices));
        System.out.println(Statistics.standardDeviation(allInvoices));
    }
}
***********************************************************************************
import java.util.ArrayList;

/**
 *  The Patient class implements the interface Measurable, that is, it
 *  has to provide an implementation for the method int getValue().
 *  The three field variable correspond to the name, age, and weight
 *  of a patient.
 *
 *  @version 2018-11-03
 *  @author Manfred Kerber
 */
public class Patient implements Measurable{

    private String name;
    private int age;
    private double weight;

    /**
     *  A constructor for the class.
     *  @param name The name of the patient.
     *  @param age The age of the patient.
     *  @param weight The weight of the patient.
     */
    public Patient(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     *  A getter for the weight
     *  @return The weight of the patient.
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     *  A method that implements the getValue method, required by the
     *  Measurable interface.
     *  @return The weight of the patient.
     */
    public double getValue(){
        return this.weight;
    }

    /**
     *  A toString method for producing a human readable String of
     *  members of the class.
     *  @return A human readable String for a Patient.
     */
    public String toString() {
        return name + " (" + age + " years old) weight: " + weight;
    }

    /*
     *  A main method for initial tests.
     */
    public static void main(String[] args) {
        Patient john = new Patient("John", 33, 80);
        Patient mary = new Patient("Mary", 28, 68);
        Patient sam = new Patient("Sam", 55, 60);
        System.out.println(john);
        ArrayList<Measurable> allPatients = new ArrayList<Measurable>();
        allPatients.add(john);
        allPatients.add(mary);
        allPatients.add(sam);
        System.out.println(Statistics.average(allPatients));
        System.out.println(Statistics.maximum(allPatients));
        System.out.println(Statistics.standardDeviation(allPatients));
    }
}
*************************************************************************************
import java.util.ArrayList;

/**
 *  The class contains three static methods to determine the maximum,
 *  the average, and the standard deviation of values given by the
 *  getValue() method for ArrayLists of generalized type Measurable.
 *
 *  @version 2018-11-03
 *  @author Manfred Kerber
 */

public class Statistics {

    /**
     *  @param elements The array list of elements in the generalized
     *  type Measurable.
     *  @return The maximal value of all the elements wrt the getValue
     *  method.
     *  @exception IllegalArgumentException if the ArrayList is
     *  empty.
     */
    public static double maximum(ArrayList<Measurable> elements){
        if (elements.size() == 0) {
            throw new IllegalArgumentException();
        } else {
            double max = elements.get(0).getValue();
            for (Measurable element : elements) {
                if (element.getValue() > max) {
                    max = element.getValue();
                }
            }
            return max;
        }
    }

    /**
     *  @param elements The array list of elements in the generalized
     *  type Measurable.
     *  @return The average value of all the elements wrt the getValue
     *  method.
     *  @exception IllegalArgumentException if the ArrayList is
     *  empty.
     */
    public static double average(ArrayList<Measurable> elements){
        if (elements.size() == 0) {
            throw new IllegalArgumentException();
        } else {
            double sum = 0;
            for (Measurable element: elements) {
                sum += element.getValue();
            }
            return sum/elements.size();
        }
    }

    /**
     *  @param elements The array list of elements in the generalized
     *  type Measurable.
     *  @return The standard deviation of all the elements wrt the getValue
     *  method.
     *  @exception IllegalArgumentException if the ArrayList is
     *  empty.
     */
    public static double standardDeviation(ArrayList<Measurable> elements){
        if (elements.size() == 0) {
            throw new IllegalArgumentException();
        } else {
            double average = average(elements);
            double sum = 0;
            for (Measurable element: elements) {
                sum += (element.getValue() - average) *
                       (element.getValue() - average);
            }
            return Math.sqrt(sum/(elements.size()-1));
        }
    }
}
************************************************************************************
Exercise 3:(Advanced,30%) Forthisexerciseyouaresupposedtowritethreeclasses(BankAccountUser, BankAccountStandardUser, and BankAccountAdministrator). The exact speciﬁcation is given in the form of three interfaces. You can ﬁnd these and a few classes on which you build up your work in a zip ﬁle on the Canvas page for the worksheet. Assume the classes Customer, Transaction, and BankAccount be given. You are supposed to write three classes to add a (non-interactive) implementation of a very rudimentary internet banking system: an abstractclassBankAccountUserandtwosubclassesBankAccountStandardUserandBankAccountAdministrator. TheclassBankAccountUserhasthreeﬁeldvariables: username,password,andloggedInoftypesString, String, and boolean, respectively. The methods required are speciﬁed in a corresponding interface BankAccountUserInterface which the class must implement. ThesubclassBankAccountStandardUserhastheﬁeldvariablesbankAccountandloginAttemptsoftypes BankAccountandint,respectively. ItshouldimplementtheinterfaceBankAccountStandardUserInterface. The subclass BankAccountAdministrator has the additional ﬁeld variable bankAccountUsers of type ArrayList<BankAccountUser>andhastoimplementtheinterfaceBankAccountAdministratorInterface. An administrator shall have the possibility to reset an account of a user by a method public void resetAccount(BankAccountUser bankAccountUser, String password). The method shall ﬁrst reset thepassword. Forstandardusers(andonlyforstandardusers)itshallalsoresetthecounterloginAttempts of failed login attempts to 0. For the latter, you may make use of bankAccountUser instanceof BankAccountStandardUser in order to check whether the variable bankAccountUser is in the class BankAccountStandardUser. If it is in the subclass it is still of type BankAccountUser, but it can be cast to a type BankAccountStandardUser using the standard type casting approach: (BankAccountStandardUser) bankAccountUser.

import java.util.ArrayList;

/**
 *  For simplicity we assume here that the balance is represented
 *  in Pounds and that only full pounds are used.
 *  @author Manfred Kerber
 *  @version 2018-11-04
 */
public class BankAccount{
    private Customer customer;
    private String password;
    private long balance;
    private ArrayList<Transaction> statement;

    public static final String stringCurrency = "\u00A3";

    /**
     * This constructor creates a bank account from the
     * three parts, customer, accountNumber and password.
     * @param customer The customer according to the Customer class.
     * @param password A string to represent the password. Obviously in a real system
     * we would never store a password in its plain form, but would use a safe way as
     * described on http://docs.oracle.com/javase/7/docs/api/java/security/MessageDigest.html, e.g.
     */
    public BankAccount (Customer customer, String password){
    this.customer = customer;
    this.password = password;
    this.balance = 100;
    this.statement = new ArrayList<Transaction>();
    }

    /**
     * Getter method to return the balance.
     * @return The balance of the BankAccount.
     */
    public long getBalance(){
     return balance;
    }

    /**
     * Getter method to return the customer.
     * @return The customer of the BankAccount.
     */
    public Customer getCustomer(){
     return customer;
    }

    /**
     * Getter method to return the password. As a minimal protection
     * mechanism we make the getter private.
     * @return The password of the BankAccount.
     */
    private String getPassword(){
     return password;
    }

    /**
     * Method to compare the password with a given password.
     * @param  password The password to which the password of the this object is compared.
     * @return true if the password of the BankAccount agrees with the argument, false else.
     */
    public boolean checkPassword(String password){
        return this.getPassword().equals(password);
    }


    /**
     * Getter method to return the statement.
     * @return The current statement of the BankAccount.
     */
    public ArrayList<Transaction> getStatement() {
        return statement;
    }


    /**
     * Adds the amount - if positive - to the current balance and adds
     * the transaction to the statement. For non-positive amounts the
     * action does nothing.
     * @param amount The amount being deposited.
     */
    public void deposit(long amount){
        if (amount > 0) {
            setBalance(getBalance() + amount);
            this.getStatement().add(new Transaction(amount,(byte) 1, getBalance()));
        }
    }

    /**
     *  Setter for the amount. Particularly well
     *  suited for fraud if made public rather than private.
     *  @param amount The new amount in the balance.
     */
    private void setBalance(long amount){
	balance = amount;
    }

    /**
     *  Setter for the password, declared private to prevent
     *  unauthorized access.
     *  @param password The new password for the account.
     */
    private void setPassword(String password){
	this.password = password;
    }

    /** withdraws amount from the current balance add transaction to
     *  the statement if there are sufficient funds and the password is
     *  correct.  Otherwise an appropriate error message is printed.
     *  @param amount The amount to be withdrawn.
     *  @param password The password to access the account.
     */
    public void withdraw(long amount, String password){
	if (this.getPassword().equals(password) && balance >= amount) {
	    setBalance(getBalance() - amount);
	    this.getStatement().add(new Transaction(amount,(byte) 2, getBalance()));
	    }
	else if (this.getPassword().equals(password)) {
	    printInsufficientFunds(amount);
        }
        else {
            printWrongPassword();
        }
    }

    /**
     * Changes the password from old to new
     * if the old password is correct,
     * else an error message is printed.
     * @param oldPassword The current password.
     * @param newPassword The future password.
     */
    public void changePassword(String oldPassword, String newPassword){
	if (oldPassword.equals(this.getPassword())){
	    setPassword(newPassword);
        } else {
            printWrongPassword();
        }
    }

    /**
     * Transfers an amount of money from the this account to the
     * toAccount assumed the password is correct and the this account
     * has sufficient money, else an error message is printed.
     * @param toAccount The account to which the money is to be transferred.
     * @param amount The amount of money to be transferred.
     * @param password The password of the this account.
     */
    public void transferMoney(BankAccount toAccount,long amount, String password) {
	if (this.getPassword().equals(password) && (balance >= amount)) {
            setBalance(getBalance() - amount);
            toAccount.setBalance(toAccount.getBalance() + amount);
            this.getStatement().add(new Transaction(amount, (byte) 3, getBalance()));
            toAccount.getStatement().add(new Transaction(amount, (byte) 4, toAccount.getBalance()));
        } else if (this.getPassword().equals(password)) {
            printInsufficientFunds(amount);
        } else {
            printWrongPassword();
        }
    }
    /**
     * @return The name of the customer
     */
    public String toString(){
        return this.getCustomer().toString();
    }

    /*****************************************************************
     * Print functions. By keeping these separate from the actual    *
     * program it is easy to adjust them, for instance, for a        *
     * different language.                                           *
     *****************************************************************/

    /**
     *  Prints that a deposit was successful
     *  @param amount The amount that is deposited.
     */
    public void printDepositSuccessful(long amount){
	System.out.printf("The deposit of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that a withdrawal was successful
     *  @param amount The amount that is withdrawn.
     */
    public void printWithdrawSuccessful(long amount){
	System.out.printf("The withdrawal of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that a transfer was successful.
     *  @param amount The amount that is transferred.
     */
    public void printTransferSuccessful(long amount){
	System.out.printf("The transfer of %s %d for %s was successful.\n",
                          stringCurrency,amount,this.getCustomer().getName());
    }

    /**
     *  Prints that the funds are insufficient for a transaction.
     *  @param amount The amount that was to be transferred.
     */
    public void printInsufficientFunds(long amount){
	System.out.printf("The funds of %s %d for %s are insufficient "
                          + "for this transaction.\n",
                          stringCurrency,this.getBalance(),this.getCustomer().getName());
    }

    /**
     *  Prints that a password change was successful.
     */
    public void printPasswordChangeSuccessful(){
	System.out.printf("Change of password for %s was successful.\n",
			  this.getCustomer().getName());
    }

    /**
     *  Prints that a password has not been recognized.
     */
    public void printWrongPassword(){
	System.out.println("The password you entered was not recognized.\n");
    }

    /**
     *  A method to print the balance of a bank account.
     */
    public void printBalance(){
	System.out.printf("The balance of %s is %s %d.\n",
			  this.getCustomer().getName(), stringCurrency, balance);
    }

    /**
     *  A method to print a statement of a bank account.
     */
    public void printStatement() {
        System.out.println(this);
    	for (int i = 0; i < statement.size(); i++) {
            System.out.println(statement.get(i));
    	}
    }
    /*****************************************************************
     * END of print functions. Separate the output from the actual   *
     * program                                                       *
     *****************************************************************/
}
************************************************************************************
/**
 *  The class is to represent an administrator user of internet
 *  banking and is a sub-class of the class BankAccountUser. It has
 *  the additional field variable bankAccountUsers in which the bank
 *  account users are stored who are in the responsibility of the
 *  administrator.
 *
 *  @version 2018-11-04
 *  @author Manfred Kerber
 */

import java.util.ArrayList;

public class BankAccountAdministrator extends BankAccountUser
    implements BankAccountAdministratorInterface {

    private ArrayList<BankAccountUser> bankAccountUsers;

    /**
     *  Constructor with call to the super-class.
     *  @param username The username of the administrator.
     *  @param password The password of the adminstrator.
     */
    public BankAccountAdministrator(String username, String password) {
        super(username, password);
        this.bankAccountUsers = new ArrayList<BankAccountUser>();
    }

    /**
     *  Method for an adminstrator to log by providing a password. It
     *  is checked whether the password provided is correct.
     *  @param password The password provided for the login; this is
     *  to be compared to the password stored on the system.
     */
    public void login(String password) {
        if (passwordCorrect(password)) {
            setLoggedIn(true);
        }
    }

    /**
     *  Add a user to the list of all users who are in the
     *  responsibility of the administrator.
     *  @param user The user to be added to the responsibility of the
     *  adminstrator.
     */
    public void addUser(BankAccountUser user){
        bankAccountUsers.add(user);
    }

    /**
     *  If an account can no longer be used, since either the user has
     *  forgotten their password or in case of a standard user has
     *  entered the password incorrectly too often the administrator
     *  can reset the account by setting a new password and resetting
     *  the number of failed login attempts to zero.
     *  @param bankAccountUser The bank account user for whom the
     *  account is to be reset.
     *  @param password The new password for the account that is to be
     *  reset.
     */
    public void resetAccount(BankAccountUser bankAccountUser, String password) {
        if (getLoggedIn() && bankAccountUsers.contains(bankAccountUser)) {
            bankAccountUser.setPassword(password);
            /* Note that the number of login attempts is reset ONLY IF
             * the bankAccountUser is a standard user. The reset
             * method also exists only in this class. For this reason
             * the variable bankAccountUser must be cast from the type
             * BankAccountUser to the type BankAccountStandardUser
             * first.
             */
            if (bankAccountUser instanceof BankAccountStandardUser){
                ((BankAccountStandardUser) bankAccountUser).resetLoginAttempts();
            }
        }
    }
}

************************************************************************************
/**
 *  The interface describes a class that is to represent an
 *  administrator user of internet banking and is to be a sub-class of
 *  the class BankAccountUser. It has to have the additional field
 *  variable bankAccountUsers in which the bank account users are
 *  stored who are in the responsibility of the administrator.
 *
 *  @version 2018-11-04
 *  @author Manfred Kerber
 */

public interface BankAccountAdministratorInterface {

    /**
     *  Method for an adminstrator to log by providing a password. It
     *  is checked whether the password provided is correct.
     *  @param password The password provided for the login; this is
     *  to be compared to the password stored on the system.
     */
    public void login(String password);

    /**
     *  Add a user to the list of all users who are in the
     *  responsibility of the administrator.
     *  @param user The user to be added to the responsibility of the
     *  adminstrator.
     */
    public void addUser(BankAccountUser user);

    /**
     *  If an account can no longer be used, since either the user has
     *  forgotten their password or in case of a standard user has
     *  entered the password incorrectly too often the administrator
     *  can reset the account by setting a new password and resetting
     *  the number of failed login attempts to zero.
     *  @param bankAccountUser The bank account user for whom the
     *  account is to be reset.
     *  @param password The new password for the account that is to be
     *  reset.
     */
    public void resetAccount(BankAccountUser bankAccountUser, String password);
}
************************************************************************************
/**
 *  The class is to a represent standard user of internet banking and
 *  is a sub-class of the class BankAccountUser. It has the additional
 *  field variables bankAccount - in which the associated BankAccount
 *  can be found - and a counter that counts failed login attempts
 *  before one succeeds. Standard users have only a fixed number of
 *  login attempts. After more than that number (stored in the static
 *  final variable MAXIMAL_LOGIN_ATTEMPTS) the accounts needs to be
 *  reset before further login attempts can be successful.
 *
 *  @version 2018-11-04
 *  @author Manfred Kerber
 */

public class BankAccountStandardUser extends BankAccountUser
    implements BankAccountStandardUserInterface {

    private BankAccount bankAccount;
    private int loginAttempts;

    public static final int MAXIMAL_LOGIN_ATTEMPTS = 3;

    /**
     *  Constructor with call to the super-class.
     *  @param username The username of the internet banking user
     *  @param password The password used for internet banking (not to
     *  be confused with the password of the account itself).
     *  @param bankAccount The bankAccount associated with the standard user.
     */
    public BankAccountStandardUser(String username, String password,
                           BankAccount bankAccount) {
        super(username, password);
        this.bankAccount = bankAccount;
        this.loginAttempts = 0;
    }

    /**
     *  Getter for the bankAccout.
     *  @return The bankAccount associated with the standard user.
     */
    public BankAccount getBankAccount(){
        return this.bankAccount;
    }

    /**
     *  Method for a user to log in to internet banking by providing a
     *  password. It is first checked whether the account is still
     *  active (that is, not too many failed login attempts were made
     *  in the past) and secondly whether the password provided is
     *  correct. In case of a correct login the number of login
     *  attempts is reset to 0, else increased by 1.
     *  @param password The password provided for the login; this is
     *  to be compared to the password stored on the system.
     */
    public void login(String password) {
        if (getLoginAttempts() < MAXIMAL_LOGIN_ATTEMPTS &&
            passwordCorrect(password)) {
            resetLoginAttempts();
            this.setLoggedIn(true);
            System.out.println("Login succeeded.");
        } else if (getLoginAttempts() < MAXIMAL_LOGIN_ATTEMPTS) {
            setLoginAttempts(getLoginAttempts() + 1);
            System.out.println("Login failed.");
        } else {
            System.out.println("Login failed. Contact admin.");
        }
    }

    /**
     *  Getter for the number of (failed) login attempts.
     *  @return The number of (failed) login attemps since last
     *  successful login or reset.
     */
    public int getLoginAttempts() {
        return loginAttempts;
    }

    /**
     *  setter for loginAttempts
     *  @param loginAttempts New value for the variable loginAttempts.
     */
    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    /**
     *  The method resets the number of (failed) login attempts to zero.
     */
    public void resetLoginAttempts() {
        loginAttempts = 0;
    }

    /**
     * The method transfers an amount of money from the this account
     * to the toAccount assumed that the user in logged in, the
     * password is correct (and that the account has sufficient
     * money), else an error message is printed. This is done by
     * calling the corresponding method in the BankAccount class
     * assumed the user is logged in.
     * @param toAccount The account to which the money is to be transferred.
     * @param amount The amount of money to be transferred.
     * @param password The password of the this account.
     */
    public void transferMoney(BankAccount toAccount, long amount,
                              String password) {
	if (getLoggedIn()){
            getBankAccount().transferMoney(toAccount, amount, password);
        } else {
            System.out.println("You need to login first.");
        }
    }

    /**
     * The method prints the balance assumed that the user is logged in,
     * else a corresponding message.
     */
    public void printBalance() {
	if (getLoggedIn()){
            System.out.println(getBankAccount().getBalance());
        } else {
            System.out.println("You need to login first.");
        }
    }

    /**
     * The method prints a statement if the user is logged in,
     * else a request to first log in is printed.
     */
    public void printStatement() {
	if (getLoggedIn()){
            getBankAccount().printStatement();
        } else {
            System.out.println("You need to login first.");
        }
    }
}
*************************************************************************************
/**
 *  The interface is to a description of a class to deal with a
 *  standard user of internet banking. The class is to be a sub-class
 *  of the class BankAccountUser. It is to have the additional field
 *  variables bankAccount - in which the associated BankAccount can be
 *  found - and a counter that counts failed login attempts before one
 *  succeeds. Standard users have only a fixed number of login
 *  attempts. After more than that number (stored in the static final
 *  variable MAXIMAL_LOGIN_ATTEMPTS, set to be 3) the accounts needs
 *  to be reset before further login attempts can be successful.
 *
 *  @version 2018-11-04
 *  @author Manfred Kerber
 */

public interface BankAccountStandardUserInterface {

    /**
     *  Getter for the bankAccout.
     *  @return The bankAccount associated with the standard user.
     */
    public BankAccount getBankAccount();

    /**
     *  Method for a user to log in to internet banking by providing a
     *  password. It is first checked whether the account is still
     *  active (that is, not too many failed login attempts were made
     *  in the past) and secondly whether the password provided is
     *  correct. In case of a correct login the number of login
     *  attempts is reset to 0, else increased by 1.
     *  @param password The password provided for the login; this is
     *  to be compared to the password stored on the system.
     */
    public void login(String password);

    /**
     *  Getter for the number of (failed) login attempts.
     *  @return The number of (failed) login attemps since last
     *  successful login or reset.
     */
    public int getLoginAttempts();

    /**
     *  setter for loginAttempts
     *  @param loginAttempts New value for the variable loginAttempts.
     */
    public void setLoginAttempts(int loginAttempts);

    /**
     *  The method resets the number of (failed) login attempts to zero.
     */
    public void resetLoginAttempts();

    /**
     * The method transfers an amount of money from the this account
     * to the toAccount assumed that the user in logged in, the
     * password is correct (and that the account has sufficient
     * money), else an error message is printed. This is done by
     * calling the corresponding method in the BankAccount class
     * assumed the user is logged in.
     * @param toAccount The account to which the money is to be transferred.
     * @param amount The amount of money to be transferred.
     * @param password The password of the this account.
     */
    public void transferMoney(BankAccount toAccount, long amount,
                              String password);

    /**
     * The method prints the balance assumed that the user is logged in,
     * else a corresponding message.
     */
    public void printBalance();

    /**
     * The method prints a statement if the user is logged in,
     * else a request to first log in is printed.
     */
    public void printStatement();
}
**************************************************************************************
**
 *  The BankAccountUser class is a rudimentary class to provide
 *  internet banking. The class itself is abstract, that is, objects
 *  cannot directly be constructed, but only via its sub-classes
 *  (BankAccountStandardUser and BankAccountAdministrator). Users are
 *  characterized by three fields, their username, their password, and
 *  a boolean variable that holds whether a user is logged in.
 *
 *  @version 2018-11-04
 *  @author  Manfred Kerber
 */

public abstract class BankAccountUser implements BankAccountUserInterface {

    private String username;
    private String password;
    private boolean loggedIn;

    /**
     *  Constructor, initially a user is NOT logged in and has no
     *  login attempts.
     *  @param username The username of the user using internet banking.
     *  @param password The internet password.
     */
    public BankAccountUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
    }

    /**
     *  We require in each sub-class the existence of a login method.
     *  @param password The password provided that will be compared to
     *  the password stored on the system, i.e., the value of the
     *  field variable.
     */
    public abstract void login(String password);

    /**
     *  The internet user is no longer logged in, indicated by the
     *  loggedIn variable set to false.
     */
    public void logout() {
        setLoggedIn(false);
    }

    /**
     * Getter method to return the password. As a minimal protection
     * mechanism we make the getter private.
     * @return The password of the BankAccount.
     */
    private String getPassword() {
        return password;
    }

    /**
     * The method checks whether a provided password is correct.
     * @param password A password string that is to be compared to the
     * stored password.
     * @return true if the provided password is equal to the stored
     * password, false else.
     */
    public boolean passwordCorrect(String password){
        return getPassword().equals(password);
    }

    /**
     *  Setter for the password.
     *  @param password The new password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *  Getter to check whether a user is logged in.
     *  @return true if the user is looged in, false else.
     */
    public boolean getLoggedIn() {
        return loggedIn;
    }

    /**
     *  setter for loggedIn
     *  @param loggedIn New value for the variable loggedIn
     */
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
}
***********************************************************************************
**
 *  The BankAccountUserInterface describes a class that is a
 *  rudimentary class to provide internet banking. The class itself is
 *  to be abstract, that is, objects cannot directly be constructed,
 *  but only via its sub-classes (BankAccountStandardUser and
 *  BankAccountAdministrator). Users are characterized by three
 *  fields, their username, their password, and a boolean variable
 *  that holds whether a user is logged in.
 *
 *  @version 2018-11-04
 *  @author  Manfred Kerber
 */

public interface BankAccountUserInterface {

    /**
     *  We require in each sub-class the existence of a login method.
     *  @param password The password provided that will be compared to
     *  the password stored on the system, i.e., the value of the
     *  field variable.
     */
    public void login(String password);

    /**
     *  The internet user is no longer logged in, indicated by the
     *  loggedIn variable set to false.
     */
    public void logout();

    /**
     * We want to make use of a getter method to return the
     * password. However, as a minimal protection mechanism we want to
     * make the getter private. As such we cannot specify it in the
     * interface, since it will not be accessible from the outside.
     */

    /**
     * The method checks whether a provided password is correct.
     * @param password A password string that is to be compared to the
     * stored password.
     * @return true if the provided password is equal to the stored
     * password, false else.
     */
    public boolean passwordCorrect(String password);

    /**
     *  Setter for the password.
     *  @param password The new password.
     */
    public void setPassword(String password);

    /**
     *  Getter to check whether a user is logged in.
     *  @return true if the user is looged in, false else.
     */
    public boolean getLoggedIn();

    /**
     *  setter for loggedIn
     *  @param loggedIn New value for the variable loggedIn
     */
    public void setLoggedIn(boolean loggedIn);
}
************************************************************************************
/**
 *  A Customer is characterized by the fields name, address, and telephoneNumber all of type String.
 *  @version 2015-10-20
 *  @author Manfred Kerber
 */

public class Customer{

    private String name;
    private String gender;
    private String address;
    private String telephoneNumber;

    /** Constructor for a Customer
     *
     *  @param name The name of the customer.
     *  @param gender The gender of the customer.
     *  @param address The address of the customer.
     *  @param telephoneNumber The phone number of the customer.
     */
    public Customer (String name, String gender, String address, String telephoneNumber){
        if (gender.equals("m") ||
            gender.equals("f") ||
            gender.equals("x")){

            this.name = name;
            this.gender = gender;
            this.address = address;
            this.telephoneNumber = telephoneNumber;
        } else {
            throw new IllegalArgumentException("Gender must be \"m\", \"f\", or \"x\"");
        }
    }

    /**
     * Getter for the name.
     * @return The name of the Customer.
     */
    public String getName(){
        return name;
    }

    /**
     * Getter for the gender.
     * @return The gender of the Customer.
     */
    public String getGender(){
        return gender;
    }

    /**
     * Getter for the address.
     * @return The address of the Customer.
     */
    public String getAddress(){
        return address;
    }

    /**
     * Getter for the telephone number.
     * @return The telephoneNumber of the Customer.
     */
    public String getTelephoneNumber(){
        return telephoneNumber;
    }

    /**
     *  @return Either "Mr.", "Ms.", or "" depending on gender.
     */
    public String salutation(){
        if (this.getGender().equals("m")) {
            return "Mr.";
        } else if (this.getGender().equals("f")) {
            return "Ms.";
        } else {
            return "";
        }
    }

    /**
     * toString method for printing
     * @return The Customer represented as a String.
     */
    public String toString() {
        return salutation() +  getName() + " @" +
            getAddress() + "(Tel: " + getTelephoneNumber() + ")";
    }
}
***********************************************************************************
import java.util.ArrayList;
/*
 *  A main method to make some initial tests.
 */
public class Main {
    public static void main(String[] args) {
        // We first create 5 users, 2 adminstrators and 3 standard users.
        BankAccountAdministrator root =
            new BankAccountAdministrator("Sam", "sesameUser");

        BankAccountAdministrator deputy =
            new BankAccountAdministrator("Tim", "poppyUser");

        Customer customerJohn = new Customer("John", "m", "Bham", "0121");
        BankAccount bankAccountJohn = new BankAccount(customerJohn, "wheat");
        BankAccountStandardUser john =
            new BankAccountStandardUser("John", "wheatUser", bankAccountJohn);

        Customer customerMary = new Customer("Mary", "f", "Bham", "0121");
        BankAccount bankAccountMary = new BankAccount(customerMary, "linseed");
        BankAccountStandardUser mary =
            new BankAccountStandardUser("Mary", "linseedUser", bankAccountMary);

        Customer customerTony = new Customer("Tony", "x", "Bham", "0121");
        BankAccount bankAccountTony = new BankAccount(customerTony, "corn");
        BankAccountStandardUser tony =
            new BankAccountStandardUser("Tony", "cornUser", bankAccountTony);

        ///////////////////////////////////////////////////////////////////
        root.addUser(deputy);
        root.addUser(john);
        root.addUser(mary);
        root.addUser(tony);
        deputy.addUser(root);

        root.login("sesameUser");
        System.out.println("root is logged in: " + root.getLoggedIn());

        System.out.println("TEST FAILED LOGIN AND RESET");
        john.login("barleyUser");
        john.login("barleyUser");
        john.login("barleyUser");
        john.login("barleyUser");
        root.resetAccount(john, "sunflowerSeedUser");
        root.resetAccount(deputy, "oatUser");
        System.out.println(john.getLoginAttempts());
        System.out.println(john.getLoggedIn());
        john.login("sunflowerSeedUser");
        System.out.println(john.getLoginAttempts());
        System.out.println(john.getLoggedIn());

        System.out.println("\n\n TRANSFER");
        john.transferMoney(bankAccountMary, 10, "wheat");
        john.logout();
        john.transferMoney(bankAccountTony, 10, "wheat");
        john.login("sunflowerSeedUser");
        john.transferMoney(bankAccountTony, 10, "wheat");
        john.printBalance();
        john.printStatement();

        System.out.println("\n\nCheck balance for Mary and Tony");
        mary.login("linseedUser");
        mary.printBalance();
        tony.printBalance();
    }
}
************************************************************************************
import java.util.*;

/**
 *  A Transaction is characterized by the fields amount, the transaction type
 *  <pre>
 * 1: deposit
 * 2: withdrawal
 * 3: transfer from
 * 4: transfer to
 * </pre>
 * the balance and the date of the transaction.
 *
 *  @version 2018-11-03
 *  @author Manfred Kerber
 */
public class Transaction {
   private long amount;
   private byte transactionType;
   private long balance;
   private String date;

    /** A constructor for a transaction. A time stamp is automatically added.
     *  @param amount The amount of the transaction.
     *  @param transactionType 1 for deposit, 2 for withdrawal, 3 for transfer from,  4 for transfer to.
     *  @param balance The balance after the transaction has been carried out.
     */
    public Transaction(long amount, byte transactionType, long balance) {
	this.amount = amount;
	this.transactionType = transactionType;
	this.balance = balance;
	this.date = new Date().toString();
	}

    /** Getter for amount.
     *  @return The amount of the transaction.
     */
    public long getAmount() {
	return amount;
    }

    /** Setter for amount.
     *  @param amount The new amount.
     */
    public void setAmount(long amount) {
	this.amount = amount;
    }

    /** Getter for the transactionType.
     *  @return The amount of the transaction.
     */
    public byte getTransactionType() {
	return transactionType;
    }

    /** Setter for amount.
     *  @param transactionType The new transaction type.
     */
    public void setTransactionType(byte transactionType) {
	this.transactionType = transactionType;
    }

    /** A toString method for printing a transaction.
     *  @return A readable form of the transaction.
     */
    public String toString() {
	String transactionTypePrint;
        switch (this.getTransactionType()) {
        case 1:  transactionTypePrint = " has been payed in.";  	           break;
        case 2:  transactionTypePrint = " has been withdrawn";                     break;
        case 3:  transactionTypePrint = " has been transfered to another account.";break;
        case 4:  transactionTypePrint = " has been transfered into this account."; break;
        default: transactionTypePrint = " unknown transaction.";                   break;
        }
	return "On " + date + " the amount of " + amount +
            transactionTypePrint + " Balance: " + balance;
    }
}
*************************************************************************************
**
 *
 * In the following we define again the BankAccount class
 * as we have seen it previously. A BankAccount consists of a
 * customer, a number (for the account number), a password, the
 * balance, and the currency.
 *
 * @author Manfred Kerber
 * @version 2017-11-07
 */
public class BankAccount {

    private Customer customer;
    private String number;
    private String password;
    private long balance;

    /**
     *  there is some unclarity here whether we actually
     * represent pounds or pence (or another currency),
     * a better solution would be to represent the balance
     * separately for full pounds and pence
     */
    private static String stringCurrency = "\u00A3";

    /**
     * This constructor creates a bank account from the
     * three parts, customer, accountNumber and password.
     * @param customer The customer of the BankAccount.
     * @param accountNumber The accountNumber of the BankAccount.
     * @param password The password to access the BankAccount.
     */
    public BankAccount (Customer customer,
			String accountNumber,
			String password) {
        this.customer = customer;
        this.number = accountNumber;
        this.password = password;
        this.balance = 0;
    }

    /**
     *  Getter for the balance
     *  @return The balance of the account.
     */
    public long getBalance(){
        return balance;
    }

    /**
     * Getter method to return the password. As a minimal protection
     * mechanism we make the getter private. It would be better to use
     * strong encryption to protect the password.
     * @return The password of the BankAccount.
     */
    private String getPassword(){
     return password;
    }

    /**
     * Method to compare the password with a given password.
     * @param password The password to which the password of the this
     * object is compared.
     * @return true if the password of the BankAccount agrees with the
     * argument, false else.
     */
    public boolean checkPassword(String password){
        return this.getPassword().equals(password);
    }

    /**
     *  Setter for the password, protected by making it private.
     *  @param password The new password for the account.
     */
    private void setPassword(String password){
	this.password = password;
    }

    /**
     *  Getter for the customer
     *  @return The customer of the account.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *  Getter for the account number
     *  @return The number of the account.
     */
    public String getNumber() {
        return number;
    }

    /**
     *  Method to return the currency universal to the class.
     *  @return The String of the currency.
     */
    public static String getStringCurrency() {
        return stringCurrency;
    }


    /**
     *  Setter for the balance. It allows to reset the balance in an
     *  account. Particularly well suited for fraud if made public
     *  rather than private. We need it public here, since if it were
     *  private we could not use it in any sub-class.
     *  @param amount The new amount in the account
     */
    public void setBalance(long amount) {
        balance = amount;
    }

    /**
     *   Method that adds amount to the current balance.
     *   @param amount The amount to be added to the current balance.
     */
    public void deposit(long amount) {
        setBalance(getBalance() + amount);
    }


    public void withdraw(long amount, String password) {
        if (checkPassword(password) && getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful, please pay out " + amount);
        } else {
            System.out.println("Withdrawal rejected. " +
                               "Insufficient funds or wrong password");
        }
    }














































    /**
     *  This method checks whether there are sufficient funds
     *  available to withdraw an amount from the current balance.  We
     *  introduce this method (rather than directly checking it in the
     *  withdraw method so that it can be overridden, but still the
     *  withdraw method and the transferMoney can be final.  Another
     *  advantage is the reuse in two methods and only one small
     *  method rather than two bigger methods are overridden.
     *  @param amount The amount to be withdrawn.
     *  @return true if and only if sufficient funds are available.
     */

    public boolean fundsAvailable(long amount) {
        return getBalance() >= amount;
    }

    /**
     *  This method is to withdraw an amount from the current balance
     *  if the password is correct and the balance will not fall below zero.
     *  @param amount The amount to be withdrawn.
     *  @param password The password of the account
     */
    /*        public final void withdraw(long amount, String password) {
        if (checkPassword(password) && fundsAvailable(amount)){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful, please pay out " + amount);
        } else {
            System.out.println("Withdrawal rejected. " +
                               "Insufficient funds or wrong password");
        }
    }
    */

    /**
     * Changes the password from old to new if the old password is
     * correct, an error message is printed else
     * @param oldPassword The current password
     * @param newPassword The updated password
     */
    public void changePassword(String oldPassword, String newPassword) {
        if (checkPassword(oldPassword)) {
            printPasswordChangeSuccessful();
            setPassword(newPassword);
        } else {
            printWrongPassword();
        }
    }

    /**
     *  returns the name of a BankAccount's holder
     *  @return The customer name
     */
    public String holder() {
        return customer.getCustomerName();
    }

    /**
     *  transferMoney transfers money from the current account to the
     *  toAccount if the password is correct and the amount not
     *  greater than the current balance.
     *  @param toAccount The account to which which the money is transferred.
     *  @param amount The amount to be transferred.
     *  @param password The password of the account.
     */
    public final void transferMoney(BankAccount toAccount,long amount,
                              String password){
        if (checkPassword(password) && fundsAvailable(amount)) {
            setBalance(getBalance() - amount);
            toAccount.deposit(amount);
        } else {
            System.out.println("Transfer rejected." +
                               "Insufficient funds or wrong password");
        }
    }

    /**
     * ***************************************************************
     * print functions. Separate the output from the actual program
     */

    /**
     *  prints the balance of a BankAccount
     */
    public void printBalance() {
        System.out.printf("The balance of %s is %s %d.\n",
                          customer.getCustomerName(), stringCurrency, balance);
    }

    /**
     *  prints that a deposit was successful.
     *  @param amount The amount deposited.
     */
    public void printDepositSuccessful(long amount) {
        /* prints that a deposit was successful
         */
        System.out.printf("The deposit of %s %d for %s was successful.\n",
                          stringCurrency,amount,customer.getCustomerName());
    }

    /**
     *  prints that a withdrawal was successful.
     *  @param amount The amount withdrawn.
     */
    public void printWithdrawSuccessful(long amount) {
        /* prints that a withdrawal was successful
         */
        System.out.printf("The withdrawal of %s %d for %s was successful.\n",
                          stringCurrency,amount,customer.getCustomerName());
    }

    /**
     *  prints that a transfer was successful.
     *  @param amount The amount transferred.
     */
    public void printTransferSuccessful(long amount) {
        /* prints that a withdrawal was successful
         */
        System.out.printf("The transfer of %s %d for %s was successful.\n",
                          stringCurrency,amount,customer.getCustomerName());
    }

    /**
     *  prints that a change of password was successful.
     */
    public void printPasswordChangeSuccessful() {
        /* prints that a password change was successful.
         */
        System.out.printf("Change of password for %s was successful.\n",
                          customer.getCustomerName());
    }

    /**
     *  prints that a change of password was unsuccessful.
     */
    public void printWrongPassword() {
        System.out.printf("The password you entered for %s was incorrect.\n",
                          customer.getCustomerName());
    }

    /**
     *  toString method for an account
     *  @return A String representation of the account
     */
    public String toString() {
        return "Account number: " + number +
            " balance:" + balance;
    }

    /*****************************************************************
     * END of print functions. Separate the output from the actual program
     */
}
****************************************************************************************
/**
 * Some tests for the BankAccount and BankAccountWithOverDraft
 * @version 2016-10-31
 * @author Manfred Kerber
 */

public class BankAccountMain {

	/*   This class is to test the BankAccountWithOverdraft
	 *   extension.  First we try the old test, then some new
	 *   ones. John has a standard account, Anne one with
	 *   Overdraft.
	 */
	public static void main(String[] args){
		Customer customerAnne =
				new  Customer("Anne", "5 Bull Ring", "0121 555555");
		Customer customerJohn =
				new  Customer("John", "5 Bull Ring", "0121 555555");
		BankAccount bAJohn =
				new BankAccount(customerJohn, "123456788",
						"sesame open");
                BankAccountWithOverdraft bAAnne =
                    new BankAccountWithOverdraft(customerAnne, "123456789",
                        "sesame open", 500);


		System.out.println("*** TESTS WITH JOHN'S BANKACCOUNT");

		System.out.println(bAJohn);

		bAJohn.deposit(100);
		bAJohn.withdraw(200,"sesame");
		bAJohn.withdraw(200,"sesame open");
		bAJohn.withdraw(50,"sesame open");
		System.out.println("John's balance: "); bAJohn.printBalance();
		bAJohn.withdraw(20,"sesame");
		bAJohn.changePassword("sesame","sesam");
		bAJohn.changePassword("sesame open","sesame closed");
		bAJohn.withdraw(10,"sesame open");
                bAJohn.withdraw(5,"sesame closed");

                bAJohn.printBalance();

                System.out.println("*** TESTS WITH ANNE'S BANKACCOUNT");

	        System.out.println(bAAnne);

		System.out.print("Anne's balance: "); bAAnne.printBalance();
                bAAnne.withdraw(100,"sesame open");
		System.out.print("Anne's balance: "); bAAnne.printBalance();
		System.out.print("Anne's overdraft limit is: "); System.out.println(bAAnne.getOverDraftLimit());

                System.out.println("Withdraw 1000 Anne "); bAAnne.withdraw(1000,"sesame open");
                System.out.println("Withdraw 50 Anne "); bAAnne.withdraw(50,"sesame");
                System.out.println("Deposit 150 Anne "); bAAnne.deposit(150);
                System.out.print("Anne's balance: "); bAAnne.printBalance();


	}
}

**************************************************************************************
**
 *  An extension of the BankAccount with the additional field variable
 *  overDraftLimit so that customers can withdraw (or transfer) money
 *  to bring the balance in the negative up to the overDraftLimit.
 *
 *  @version 2015-11-04
 *  @author Manfred Kerber
 */

public class BankAccountWithOverdraft extends BankAccount{

    private long overDraftLimit;

    /**
     * This constructor creates a bank account from the
     * three parts, customer, accountNumber and password.
     * @param customer The customer of the BankAccount.
     * @param accountNumber The accountNumber of the BankAccount.
     * @param password The password to access the BankAccount.
     * @param overDraftLimit The maximal amount to which the account
     * can go in debit.
     */
    public BankAccountWithOverdraft(Customer customer,
                                    String accountNumber,
                                    String password,
                                    long overDraftLimit) {
        // First, call the constructor of the superclass
        // by using the `super' construct in the correct order.
        super(customer, accountNumber, password);
        this.overDraftLimit = overDraftLimit;
    }

    /**
     *  Getter for the overDraftLimit
     *  @return The overDraftLimit of the account.
     */
    public long getOverDraftLimit() {
        return this.overDraftLimit;
    }

    @Override
    /*    public void withdraw(long amount, String password) {
        if (checkPassword(password) &&
            getBalance() + getOverDraftLimit() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful, please pay out " + amount);
        } else {
            System.out.println("Withdrawal rejected. " +
                               "Insufficient funds or wrong password");
        }
    }
    */

    public void withdraw(long amount, String password) {
    }































    /**
     *  This method checks whether there are sufficient funds
     *  available to withdraw an amount from the current balance.
     *  @param amount The amount to be withdrawn.
     *  @return true if and only if sufficient funds are available.
     */


    @Override
    public boolean fundsAvailable(long amount) {
        return getOverDraftLimit() + getBalance() >= amount;
    }


    /**
     *  toString method for an account with overdraft
     *  @return A String representation of the account
     */
    public String toString() {
        return super.toString() +
            " overdraft limit: " + getOverDraftLimit();
    }

}
*************************************************************************************
/** With this method we demonstrate the use of the conditional construct as in
 *  var = condition ? term1 : term2;
 *  @version 2018-08-21
 *  @author Manfred Kerber
 */
public class ConditionalMain {

    /**
     *  A method for printing out a one-dimensional array of int.
     *  @param a The array to be printed.
     */
    public static void print(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length -1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1] + "]");
    }

    /*
     *  A main method to test the conditional operator.
     */
    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 7, -12, -11, -20, 4};
        int[] result = new int[arr.length];
        int[] result1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[i] = arr[i] ;
            } else {
                result[i] = -arr[i];
            }
        }

        // A more concise way of doing the initialization using the conditional.
        for (int i = 0; i < arr.length; i++) {
            result1[i] = arr[i] >=0 ? arr[i] : -arr[i];
        }

        print(arr);
        print(result);
        print(result1);
    }
}
*************************************************************************************
**
 *  The class represents a bank customer by name, address, and
 *  telephone number.
 *  @version 2018-08-21
 *  @author Manfred Kerber
 */
public class Customer {

    private String customerName;
    private String address;
    private String telephoneNumber;

    /**
     *  Constructor for Customer setting the three field variables.
     *  @param customerName The name of the customer as a String.
     *  @param address The postal address of the customer.
     *  @param telephoneNumber A telephone number of the customer.
     */
    public Customer (String customerName, String address,
                     String telephoneNumber){
        this.customerName = customerName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    /**
     *  Getter for the name of a customer
     *  @return The name of the customer.
     */
    public String getCustomerName(){
        return customerName;
    }

    /**
     *  Getter for the address of a customer
     *  @return The address of the customer.
     */
    public String getAddress(){
        return address;
    }

    /**
     *  Getter for the telephone number of a customer
     *  @return The phone of the customer.
     */
    public String getTelephoneNumber(){
        return telephoneNumber;
    }
}
*************************************************************************************
import somePackage.A;
/**
 *   Example to demonstrate the difference between public, protected,
 *   default (package access), and private by comparing access:
 *   A a class,
 *   B a different class B in the same package,
 *   C a subclass of A in the same package,
 *   D a subclass of A in a different package, and
 *   E a different class in a different package.
 *
 *   Adapted from [Absolute Java, 4th Edition by Walter Savitch, 2010,
 *   p.481]
 *
 *   @version 2015-11-10
 *   @author Manfred Kerber
 */

public class D extends A {
    public void CPrint() {
        System.out.println(v1); //access
        System.out.println(v2); //access
        System.out.println(v3); //no access (different package), compiler error
        System.out.println(v4); //no access (private), compiler error
    }
}
*********************************************************************************
import somePackage.A;
/**
 *   Example to demonstrate the difference between public, protected,
 *   default (package access), and private by comparing access:
 *   A a class,
 *   B a different class B in the same package,
 *   C a subclass of A in the same package,
 *   D a subclass of A in a different package, and
 *   E a different class in a different package.
 *
 *   Adapted from [Absolute Java, 4th Edition by Walter Savitch, 2010,
 *   p.481]
 *
 *   @version 2015-11-10
 *   @author Manfred Kerber
 */

public class E {
    public void EPrint() {
        System.out.println(A.v1); //access
        System.out.println(A.v2); //no access (different package, no subclass), compiler error
        System.out.println(A.v3); //no access (different package), compiler error
        System.out.println(A.v4); //no access (private), compiler error
    }
}
**************************************************************************************
**
 *
 * @author Manfrred Kerber
 * @version 2017-11-07
 *
 * We revisit here the multiplication table from week 3
 * since we want to demonstrate the debugger in Eclipse.
 *
 */
public class Multiplication {
	/**
	 *
	 * @param n The size of a quadratic multiplication table
	 * so that the numbers are evaluated up to (n-1)x(n-1).
	 * @return The multiplication table as a two-dimensional array
	 * of size nxn.
	 */
	public static int[][] multiplicationTable(int n) {
	int[][] multi = new int[n][n];
	for (int i=0; i < n; i++){
	    for (int j=0; j< n; j++){
	        multi[i][j] = i*j;
	    }
	}
	return multi;
	}

	/**
	 *   Prints out a two-dimensional array (with width up to 3
	 *   digits for a single number).
	 *
	 * @param a The array to be printed.
	 */
	public static void printArray(int[][] a) {
		for (int[] element : a){
		    for (int el : element){
		        System.out.printf("%4d", el);
		    }
		    System.out.println();
		}
	}

	/*
	 *  A main method to run the program up to 12x12.
	 */
	public static void main(String[] args) {
		printArray(multiplicationTable(13));
	}

}
*************************************************************************************
package company;

/**
 *  @author Manfred Kerber
 *  @version 2016-11-08
 *
 * The following example is adapted from [Deitel and Deitel, 2010,
 * Java - How to program, 8th edition, p. 427]. The interface provides
 * only skeleton of a class, that is, here, that there are two methods
 * which take no arguments and give back an int each, the amount to be
 * paid, and the day of the month when it has to be paid. Obviously a
 * calling methods needs to know no more. However, in order to run the
 * methods we need implementations.  [In a real system we would have
 * further methods such as String getBankAccount() and String
 * getSortCode();]
 */

public interface Payable {
    /**
     *  @return The amount of money that has to be paid.
     */
    int paymentAmount();
    /**
     *  @return The day of the month when the payment is due.
     */
    int dueDate();
}
***************************************************************************************
package company;

import java.util.ArrayList;
/**
 *  This class is to test the Payable interface. In the main method an
 *  ArrayList of Payable is created and the total expenditure in this
 *  ArrayList is computed
 *
 *  @version 2016-11-08
 *  @author Manfred Kerber
 */
public class PayableMain {
    /*
     * main method with an example
     */
    public static void main(String[] args) {
        int total = 0;
        // Payable will contain two invoices and two employees
        ArrayList<Payable> payableObjects = new ArrayList<Payable>();

        payableObjects.add(new Invoice(29,6,"printer cartridge","222333", 15));
        payableObjects.add(new Invoice(3, 20, "1000 sheet of a4 paper", "234567", 15));
        payableObjects.add(new MonthlyEmployee("John", "Smith", "AA112312", 1999));

        HourlyEmployee mary = new HourlyEmployee("Smith", "Mary", "AB 12346 C", 13);
        mary.setWorkedHoursLastMonth(180);
        payableObjects.add(mary);

        for (Payable currentPayable : payableObjects){
            total += currentPayable.paymentAmount();
            System.out.println("*"+ currentPayable);
            System.out.println("TO PAY:" +
                               currentPayable.paymentAmount());
        }
        System.out.println("THE TOTAL EXPENDITURE IN THE" +
                           " CURRENT PERIOD IS: " + total);
    }
}
*************************************************************************************
package company;

/**
 *  Employee is an abstract class that implements Payable, that is, we
 *  have to give an implementation of the methods getPaymentAmount()
 *  and dueDate(). However, since Employee is an abstract class (unlike the
 *  corresponding class from week 5), it suffices to give abstract
 *  methods, we assume the dueDate() to be concrete (the 15th of every
 *  month), but the method getPaymentAmount() to be abstract, which
 *  would be determined differently for the sub-classes of hourly paid
 *  employees and monthly paid employees.  Likewise since Employee
 *  also implements Holiday we have to give an implementation of
 *  getHolidays(). In this case we choose to give a concrete
 *  implementation in the abstract class Employee.
 *
 *  @version 2016-11-08
 *  @author  Manfred Kerber
 */
public abstract class Employee implements Payable, Holiday {
    public static final int generalDaysOfHolidays = 30;
    public static final int generalPaymentDay = 15;

    private String firstName;
    private String lastName;
    private String nI;
    private int dayOfPayment;
    private int daysOfHolidays;

    /**
     *  A constructor for the Employee class.
     *  @param firstName The first name of the employee.
     *  @param lastName The last name of the employee.
     *  @param nI The national insurance number of the employee.
     */
    public Employee(String firstName, String lastName, String nI){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nI = nI;
        this.dayOfPayment = generalPaymentDay;
        this.daysOfHolidays = generalDaysOfHolidays;
    }

    /**
     *  getter for first name.
     *  @return The first name of the employee.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *  getter for last name.
     *  @return The last name of the employee.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *  getter for the national insurance number nI.
     *  @return The national insurance number of the employee.
     */
    public String getnI() {
        return nI;
    }

    /**
     *  getter for the day of payment
     *  @return The day when the salary is due.
     */
    public int getDayOfPayment() {
        return dayOfPayment;
    }

    /**
     *  getter for the number of holidays.
     *  @return The number of holidays the employee still has.
     */
    public int getDaysOfHolidays() {
        return daysOfHolidays;
    }

    /**
     *  setter for the number of holidays.
     *  @param daysOfHolidays The new number of holidays the employee still has.
     */
    public void setDaysOfHolidays(int daysOfHolidays) {
        this.daysOfHolidays = daysOfHolidays;
    }

    /**
     *  setter for the day of payment.
     *  @param dayOfPayment The new day of the month when the salary
     *  has to be paid.
     */
    public void setDayOfPayment(int dayOfPayment) {
        this.dayOfPayment = dayOfPayment;
    }

    /**
     *  The abstract method needs implementations in each concrete
     *  sub-class.
     *  @return The payment amount which corresponds to the salary.
     */
    public abstract int paymentAmount();

    /**
     *  Implementation of the due date by which the salary needs to be
     *  paid, needed since the class implements the Payable interface.
     *  @return The due date when the monthly salary is to be paid.
     */
    public int dueDate() {
        return getDayOfPayment();
    }

    /**
     *  The toString() method to display Employee objects.
     *  @return A human readable string of an Employee object.
     */
    public String toString() {
        return String.format(" Name: %s, First Name: %s, NI: %s ",
                             getLastName(),
                             getFirstName(),
                             getnI());
    }
}
**************************************************************************************
ackage company;

/**
 *  @author Manfred Kerber
 *  @version 2016-11-06
 *
 * The interface provides only the skeleton of a class, that is, here,
 * that there is a method which takes no arguments and gives back an
 * int, the daysOfHolidays that somebody still has available to take.
 */
public interface Holiday {
    /**
     *  @return The number of days of holidays that somebody still has.
     */
   int getDaysOfHolidays();
}
**************************************************************************************
package company;

import java.util.ArrayList;
/**
 *  This class is to test the Holiday interface. In the main method an
 *  ArrayList of Holiday is created and the total number of holidays
 *  of the employees in this ArrayList is computed
 *
 *  @version 2016-11-08
 *  @author Manfred Kerber
 */
public class HolidayMain{
    /*
     * main method with an example
     */
    public static void main(String[] args) {
        int total = 0;

        ArrayList<Holiday> employees = new ArrayList<Holiday>();

        Employee john = new MonthlyEmployee("John", "Smith", "AA112312", 1999);
        employees.add(john);
        Employee mary = new HourlyEmployee("Smith", "Mary", "AB 12346 C", 13);
        employees.add(mary);
        mary.setDaysOfHolidays(25);


        for (Holiday employee : employees){
            total += employee.getDaysOfHolidays();
            System.out.println("*"+ employee);
            System.out.println(" has days of holidays left:" +
                               employee.getDaysOfHolidays());
        }
        System.out.println("The workforce has in total " + total +
                           " days of holidays left.");
    }
}
*************************************************************************************
package company;

/**
 * Invoice implements Payable, that is, we have to give an
 * implementation for the methods PaymentAmount() and
 * dueDate(). That is done in the first case by returning the number of
 * items times the cost per item, in the second case by returning the
 * due date.
 *
 *  @author Manfred Kerber
 *  @version 2016-11-08
 */
public class Invoice implements Payable {
	private int pricePerItem;
	private int quantity;
	private String description;
	private String idNumber;
	private int dueDate;

    /**
     *  An Invoice object is created by this constructor.
     *  @param pricePerItem The price that a single item costs.
     *  @param quantity The number of items that have been shipped.
     *  @param description A verbal description of the item.
     *  @param idNumber A unique identifier of the item.
     *  @param dueDate A time (for simplicity represented as a number)
     *  by which the invoice has to be paid.
     */
    public Invoice(int pricePerItem, int quantity, String description,
                   String idNumber, int dueDate) {
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
        this.description = description;
        this.idNumber = idNumber;
        this.dueDate = dueDate;
    }

    /**
     *  getter for the dueDate.
     *  @return The due date by when the invoice must be paid.
     */
    public int getDueDate() {
        return dueDate;
    }

    /**
     *  This is doing exactly the same as the getDueDate
     *  getter. However, we have to provide this method, since the
     *  Invoice class implements the Payable interface, hence we need
     *  an explicit implementation for dueDate().
     *  @return The due date by when the invoice must be paid.
     */
    public int dueDate() {
        return getDueDate();
    }

    /**
     *  setter for the dueDate.
     *  @param dueDate The new due date by when the invoice must be paid.
     */
    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    /**
     *  getter for pricePerItem.
     *  @return The price that must be paid for a single item.
     */
    public int getPricePerItem() {
        return pricePerItem;
    }

    /**
     *  setter for the pricePerItem.
     *  @param pricePerItem The new price per item.
     */
    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    /**
     *  getter for quantity.
     *  @return The quantity of items that the invoice is about.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *  setter for the quantity.
     *  @param quantity The new quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *  getter for description.
     *  @return The description of the item that the invoice is about.
     */
    public String getDescription() {
        return description;
    }

    /**
     *  setter for description.
     *  @param description The new description of the item that the
     *  invoice is about.
     */
	public void setDescription(String description) {
		this.description = description;
	}

    /**
     *  getter for idNumber.
     *  @return The idNumber of the item that the invoice is about.
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     *  setter for idNumber.
     *  @param idNumber The new idNumber of the item that the
     *  invoice is about.
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     *  The toString() method to print the invoice.
     *  @return A printable String for the invoice.
     */
    public String toString() {
        return "Invoice for " + description +
            " (id=" + idNumber
            + ") " + quantity +
            " item(s) at a price of " + pricePerItem +  " per piece.\n" +
            "due at " + this.getDueDate();
    }

    /**
     *  The paymentAmount() method computes the payment to be done as
     *  the price times the items.
     *  @return The price to be paid as product of price per item
     *  times number of items.
     */
    public int paymentAmount(){
        return (this.getPricePerItem() * this.getQuantity());
    }
}
***************************************************************************************
package company;

/**
 *  This class is concrete and inherits from the abstract superclass
 *  Employee. We specialize the toString method by indicating the
 *  hourly salary.  Since in the superclass Employee the method
 *  getPaymentAmount() is abstract, we must give in the HourlyEmployee
 *  class an implementation for paymentAmount(). It returns the hourly
 *  salary times the number of hours worked in the last month.
 *
 *  @version 2016-11-08
 *  @author Manfred Kerber
 */

public class HourlyEmployee extends Employee {

    /**
     *  Additional field variable hourlySalary and
     *  workedHoursLastMonth (the latter initialized in the constructor to 0.
     */
    private int hourlySalary;
    private int workedHoursLastMonth;

    /**
     *  The constructor for an employee with an hourly salary has the
     *  three fields of an Employee plus the fields of the
     *  hourlySalary, which is set at construction, and
     *  workedHoursLastMonth, which is initialized to 0.
     *  @param firstName The first name of the employee.
     *  @param lastName The last name of the employee.
     *  @param nI The national insurance number of the employee.
     *  @param hourlySalary The hourly salary of the employee.
     */
    public HourlyEmployee(String firstName, String lastName,
                          String nI, int hourlySalary) {
        super(firstName, lastName, nI); // must be called first
        this.hourlySalary         = hourlySalary;
        this.workedHoursLastMonth = 0;
    }

    /**
     *  getter for hourlySalary.
     *  @return The hourly salary of the employee.
     */
    public int getHourlySalary() {
        return this.hourlySalary;
    }

    /**
     *  getter for workedHoursLastMonth.
     *  @return The number of hours the employee worked last month.
     */
    public int getWorkedHoursLastMonth() {
        return this.workedHoursLastMonth;
    }

    /**
     *  setter for hourlySalary.
     *  @param hourlySalary The new hourly salary of the employee.
     */
    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    /**
     *  setter for workedHoursLastMonth.
     *  @param workedHoursLastMonth The new number of hours the
     *  employee worked last month.
     */
    public void setWorkedHoursLastMonth(int workedHoursLastMonth) {
        this.workedHoursLastMonth = workedHoursLastMonth;
    }


    /**
     *  The toString() method to display HourlyEmployee objects. In
     *  addition to the details of an Employee, the hourly salary is
     *  displayed. Note that the "@Override" statement is
     *  optional. However, it is good practice to write it; in this
     *  case the compiler checks whether the method actually overrides
     *  some other, if not en error will occur.
     *  @return A human readable string of a MonthlyEmployee object.
     */
    @Override
    public String toString() {
        return String.format("%s,\n hourly salary: %d, worked hours: %d, total salary: %d",
                             super.toString(),
                             getHourlySalary(),
                             getWorkedHoursLastMonth(),
                             paymentAmount());
    }

    /**
     *   An implementation of the getPaymentAmount() method
     *   @return A hourly paid employee has to receive their monthly
     *   salary, which is computed as the hourly salary times the
     *   hours they worked.
     */
    public int paymentAmount() {
        return getHourlySalary() * getWorkedHoursLastMonth();
    }
}
************************************************************************************
package company;

/**
 *  This class is concrete and inherits from the abstract superclass
 *  Employee. We specialize the toString method by indicating the
 *  monthly salary.  Since in the superclass Employee the method
 *  getPaymentAmount() is abstract, we must give in the
 *  MonthlyEmployee class an implementation for paymentAmount(). It
 *  just returns the monthly salary.
 *
 *  @version 2016-11-08
 *  @author Manfred Kerber
 */

public class MonthlyEmployee extends Employee{
    /**
     *  Additional field variable monthlySalary.
     */
    private int monthlySalary;

    /**
     *  The constructor for an employee with a monthly salary has the
     *  three fields of an Employee plus the field of the
     *  monthlySalary, which is set at construction.
     *  @param firstName The first name of the employee.
     *  @param lastName The last name of the employee.
     *  @param nI The national insurance number of the employee.
     *  @param monthlySalary The monthly salary of the employee.
     */
    public MonthlyEmployee(String firstName, String lastName,
                           String nI, int monthlySalary) {
        super(firstName, lastName, nI); // must come first
        this.monthlySalary = monthlySalary;
    }

    /**
     *  getter for monthlySalary.
     *  @return The monthly salary of the employee.
     */
    public int getMonthlySalary() {
        return monthlySalary;
    }

    /**
     *  setter for monthlySalary.
     *  @param monthlySalary The new monthly salary of the employee.
     */
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     *  The toString() method to display MonthlyEmployee objects. In
     *  addition to the details of an Employee, the monthly salary is
     *  displayed.  Note that the "@Override" statement is
     *  optional. However, it is good practice to write it; in this
     *  case the compiler checks whether the method actually overrides
     *  some other, if not en error will occur.
     *  @return A human readable string of a MonthlyEmployee object.
     */
    @Override
    public String toString() {
        return "MonthlyEmployee [" + super.toString() +
            "monthlySalary=" + monthlySalary + "]";
    }

    /**
     *   An implementation of the getPaymentAmount() method
     *   @return A monthly paid employee has to receive their monthly
     *   salary, which is returned as the payment amount.
     */
    public int paymentAmount(){
        return getMonthlySalary();
    }
}
******************************************************************************************
package myTest;

/**
 *  If we try to compile A1 the compiler tries to also compile A2 and
 *  notices that A2 extends A1, that is, that the class hierarchy is
 *  cyclic and stops with a corresponding error.
 *
 *  @version 2015-11-10
 *  @author  Manfred Kerber
 */

public class A1 extends A2 {
}**********************************************************************************
package myTest;

/**
 *  If we try to compile A2 the compiler tries to also compile A1 and
 *  notices that A1 extends A2, that is, that the class hierarchy is
 *  cyclic and stops with a corresponding error.
 *
 *  @version 2015-11-10
 *  @author  Manfred Kerber
 */
public class A2 extends A1 {
}
****************************************************************************************
package myTest;
/**
 * @author Manfred Kerber
 * @version 2015/11/09
 * Example from Horstmann: Java Concepts p.293
 *
 * The example shows that introducing a new variable with the same
 * name in a constructor `shadows' the field variable and that
 * accordingly the corresponding field variable is not set.
 */

public class Coin {
    private int value;
    private String unit;

    /**
     *  @param val The value of the coin, e.g. 50 on a 50p coin.
     *  @param u The unit on the coin, e.g. "pence" for a 50p coin.
     *
     */
    public Coin(int val, String u) {
        value = val;
        /* The following line of code is wrong, since it
         * introduces a NEW variable with name unit which
         * shadows the field variable with name unit. Hence
         * the value of the NEW variable is set to u on
         * construction of a Coin object, but the field
         * variable unit remains uninitialized, hence will be
         * null. That is, this line should be deleted.
         * Lesson learned: superfluous variables are dangerous.
         */
        String unit = u;
        // The following line should replace the previous.
        //              unit = u;
    }

    /**
     *  @return A human readable String for a Coin object.
     */
    public String toString() {
        return "Value: " + value + " " + unit;
    }

    /*
     *  Main method to test the Coin class. We do not get the unit
     *  when printing, that is, not "2 pounds", but "2 null" in the
     *  example.
     */
    public static void main(String[] args) {
        Coin twoPounds = new Coin(2, "pounds");
        System.out.println(twoPounds);
    }
}
*************************************************************************************
ackage myTest;

/**
 *  The area of a rectangle is given by length * width. The area can
 *  be computed from the length and the width. Should we have three
 *  fields length, width, and area, when making use of the area often?
 *  That is very dangerous, since it introduces redundancy as shown in
 *  the example below. If not handled very carefully it can lead to
 *  incorrect result. Hence it should be avoided.
 *
 *  Compare Horstmann Java Concepts p.294
 *
 *
 *  @version 2016-11-08
 *  @author  Manfred Kerber
 */
public class Rectangle {
    /**
     * We have a redundant field variable area, which needs to be set
     * on construction
     */
    private double length;
    private double width;
    private double area;

    /**
     *  A rectangle is characterized by length, width, and area. Note
     *  that the last of the three is redundant.
     *  @param length The length of the rectangle.
     *  @param width The width of the rectangle.
     */
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    /**
     *  Getter for length.
     *  @return The length of the rectangle.
     */
    public double getLength() {
        return length;
    }

    /**
     *  Setter for length.
     *  @param length The new length of the rectangle.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     *  Getter for width.
     *  @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     *  Setter for width.
     *  @param width The new width of the rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     *  Getter for area.
     *  @return The area of the rectangle.
     */
    public double getArea() {
        return area;
    }

    /**
     *  Setter for area.
     *  @param area The new area of the rectangle.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     *  @return A human readable String for a Coin object.
     */
    public String toString() {
        return "A rectangle with length " + getLength() + " and width " + getWidth() + " has an area of " + getArea();
    }

    /*
     *  Main method to show how easy it is to introduce an
     *  inconsistency when we have redundant field variables. We could
     *  have a rectangle with side lengths 10 and 20 and an area of 5.
     *  A much superior way would be to have only two field variable,
     *  length and width, and to always determine the area by a method
     *  area();
     *
     *  If you really need redundant information you should consider
     *  to impose a suitable class invariant which guarantees that the
     *  different values cannot result in illegal values.
     */
    public static void main(String[] args) {
        Rectangle a = new Rectangle(10, 20);
        System.out.println(a);
        a.setArea(5);
        System.out.println(a);
    }
}
**************************************************************************************
ackage somePackage;
/**
 *   Example to demonstrate the difference between public, protected,
 *   default (package access), and private by comparing access:
 *   A a class,
 *   B a different class B in the same package,
 *   C a subclass of A in the same package,
 *   D a subclass of A in a different package, and
 *   E a different class in a different package.
 *
 *   Adapted from [Absolute Java, 4th Edition by Walter Savitch, 2010,
 *   p.481]
 *
 *   @version 2015-11-10
 *   @author Manfred Kerber
 */
public class A {
    public    static int v1 = 1;
    protected static int v2 = 2;
              static int v3 = 3;
    private   static int v4 = 4;

    public void APrint() {
        System.out.println(v1); //access
        System.out.println(v2); //access
        System.out.println(v3); //access
        System.out.println(v4); //access
    }
}
*************************************************************************************
package somePackage;
/**
 *   Example to demonstrate the difference between public, protected,
 *   default (package access), and private by comparing access:
 *   A a class,
 *   B a different class B in the same package,
 *   C a subclass of A in the same package,
 *   D a subclass of A in a different package, and
 *   E a different class in a different package.
 *
 *   Adapted from [Absolute Java, 4th Edition by Walter Savitch, 2010,
 *   p.481]
 *
 *   @version 2015-11-10
 *   @author Manfred Kerber
 */

public class B {
    public void BPrint() {
        System.out.println(A.v1); //access
        System.out.println(A.v2); //access
        System.out.println(A.v3); //access
        System.out.println(A.v4); //no access (private), compiler error
    }
}
************************************************************************************
package somePackage;
/**
 *   Example to demonstrate the difference between public, protected,
 *   default (package access), and private by comparing access:
 *   A a class,
 *   B a different class B in the same package,
 *   C a subclass of A in the same package,
 *   D a subclass of A in a different package, and
 *   E a different class in a different package.
 *
 *   Adapted from [Absolute Java, 4th Edition by Walter Savitch, 2010,
 *   p.481]
 *
 *   @version 2015-11-10
 *   @author Manfred Kerber
 */

public class C extends A {
    public void CPrint() {
        System.out.println(v1); //access
        System.out.println(v2); //access
        System.out.println(v3); //access
        System.out.println(v4); //no access (private), compiler error
    }
}
************************************************************************************
/**
 *  The Area interface contains one method head, namely the area.
 */

public interface Area {
    double area();
}
*************************************************************************************
/**
 *  The Circle class is a subclass of the Ellipse class. It does not
 *  contain any new field variables, but the values of the two field
 *  variables of the superclass are identical.
 *
 *  @version 2017-11-16
 *  @author Manfred Kerber
 */

public class Circle extends Ellipse {
    /**
     *  A Circle is constructed by constucting an Ellipse with equal
     *  radii (i.e., majorRadius = minorRadius).
     *  @param radius The radius of the Circle.
     */
    public Circle(double radius) {
        super(radius,radius);
    }

    /**
     *  A method that looks like a getter for the radius, the radius
     *  being equal to field variable majorRadius (and minorRadius).
     *  @return The radius of the Circle in cm.
     */
    public double getRadius() {
        return getMajorRadius();
    }

    /**
     *  A method to compute the circumference of a Circle.
     *  @return The circumference of the Circle in cm.
     */
    public double circumference() {
        return 2 * Math.PI * getRadius();
    }

    /*
     *  Main method for initial test.
     */
    public static void main(String[] args) {
        Circle a = new Circle(4.0);
        Circle b = new Circle(5.1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getRadius());
        System.out.println(b.getRadius());

    }
}
****************************************************************************************
**
 *  The class introduces complex numbers and the two basic operations
 *  of addition and multiplication. The two field variables are the
 *  realPart and the imaginaryPart of the complex number.
 *
 *  @version 2018-11-22
 *  @author Manfred Kerber
 */

public class Complex {

    /**
     *  field variable to represent the real part of the complex number.
     */
    private double realPart;
    /**
     *  field variable to represent the imaginary part of the complex number.
     */
    private double imaginaryPart;

    /**
     *  Standard constructor
     *  @param realPart The real part of the complex number.
     *  @param imaginaryPart The imaginary part of the complex number.
     */
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    /**
     *  getter for the realPart
     *  @return The real part of the complex number
     */
    public double getRealPart() {
        return realPart;
    }

    /**
     *  getter for the imaginaryPart
     *  @return The imaginary part of the complex number
     */
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    /**
     *  Method for adding a complex number to the complex number object.
     *  @param summand The complex number to be added the complex number object.
     *  @return The sum of the complex number object and the summand.
     */
    public Complex add(Complex summand) {
        return new Complex(this.getRealPart() + summand.getRealPart(),
                           this.getImaginaryPart() + summand.getImaginaryPart());
    }

    /**
     *  Method for multiplying a complex number with the complex number object.
     *  @param factor The complex number to be multiplied with the
     *  complex number object.
     *  @return The product of the complex number object and the
     *  factor.
     */
    public Complex multiply(Complex factor) {
        return new Complex(this.getRealPart() * factor.getRealPart() -
                           this.getImaginaryPart() * factor.getImaginaryPart(),
                           this.getRealPart() * factor.getImaginaryPart() +
                           this.getImaginaryPart() * factor.getRealPart());
    }

    /**
     *   Standard toString method.
     *   @return A human readable String to display the complex number.
     */
    public String toString() {
        return this.getRealPart() + " + i * " + this.getImaginaryPart();
    }

    /*
     *  main method for initial tests.
     */
    public static void main(String[] args) {
        Complex c1_0 = new Complex(1,0);
        Complex c0_1 = new Complex(0,1);
        Complex c1_2 = new Complex(1,2);
        Complex c3_4 = new Complex(3,4);
        Complex c2_5 = new Complex(2,5);
        Complex c11_8 = new Complex(11,8);
        Complex c_7_7 = new Complex(-7,7);

        System.out.println(c11_8.multiply(c_7_7));
        System.out.println(c1_0.multiply(c1_2));
        System.out.println(c0_1.multiply(c1_2));
        System.out.println(c3_4.add(c2_5));
    }
}
*********************************************************************************
/**
 *  The class contains mainly two methods, one to copy one-dimensional
 *  arrays, one to copy two-dimensional arrays.
 *
 *  @version 2018-11-20
 *  @author Manfred Kerber
 */

public class Copy {
    /**
     *  A method to print a one-dimensional array of double[].
     *  @param a An arbitrary array of type double[].
     */
    public static void print(double[] a) {
        /* The elements up to index i have been printed. */
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    /**
     *  A method to print a two-dimensional array of double[][].
     *  @param a An arbitrary array of type double[][].
     */
    public static void print(double[][] a) {
        /* The rows up to index i have been printed. */
        for (int i = 0; i < a.length; i++) {
            print(a[i]);
        }
        System.out.println();
    }

    /**
     *  A method to copy a one-dimensional array of double[].
     *  @param a An arbitrary array of type double[].
     *  @return An array with exactly the same elements.
     */
    public static double[] copy(double[] a) {
        double[] result = new double[a.length];
        /* The elements up to index i have been copied. */
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        return result;
    }

    /**
     *  A method to copy a two-dimensional array of double[][].
     *  @param a An arbitrary array of type double[][].
     *  @return An array with exactly the same elements.
     */
    public static double[][] copy(double[][] a) {
        double[][] result = new double[a.length][];
        /* The rows up to row i have been copied. */
        for (int i = 0; i < a.length; i++) {
            result[i] = copy(a[i]);
        }
        return result;
    }

    /*
     *  Main method for initial test.
     */
    public static void main(String[] args) {
        double[][] a = {{1.3, 2.5, 55},
                        {5.3, 1},
                        {2.0},
                        {1,2,3,4,5,6,7}};
        double [][] b = copy(a);
        double [][] c = a;
        a[1][1] = 2;
        print(a);
        System.out.println("--------------------------");
        print(b);
        System.out.println("--------------------------");
        print(c);
    }

}
************************************************************************************
**
 *   The class is used displays the lengths of Strings in
 *   form of dots (stars).
 *
 *   @author Manfred Kerber
 *   @version 2017-11-16
 */


public class Dots {

    /**
     *  The method writes the lengths of the strings in an array of
     *  type String[] into an array of type int[].
     *  @param strings An arbitrary array of type String[].
     *  @return An array of the same length with the lengths of the
     *  Strings in the original array as values.
     */
    public static int[] lengths(String[] strings) {
        int[] result = new int[strings.length];
        /* We iterate through the input array and set all the values
         * in the result array
         */
        for (int i = 0; i < strings.length; i++) {
            result[i] = strings[i].length();
        }
        return result;
    }

    /**
     *  The method computes the maximal element in an array of type
     *  int[].
     *  @param a An arbitrary array of type int[].
     *  @return The maximum of all the elements in the array if it
     *  exists (otherwise an IllegalArgumentException is thrown).
     */
    public static int max(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException();
        } else {
            int l = a.length;
            int result = a[0];
            // result stores the smallest value seen so far.
            for (int i = 1; i < l; i++) {
                if (result < a[i]) {
                    result = a[i];
                }
            }
            return result;
        }
    }

    /**
     *  The method prints the lengths of strings in an array bottom-up.
     *  @param strings An arbitrary array of type String[].
     */
    public static void printLengths(String[] strings) {
        printLengths(lengths(strings));
    }

    /**
     *  The method prints as many stars bottom-up as the int[] specifies.
     *  @param ints An arbitrary array of type int[].
     */
    public static void printLengths(int[] ints) {
        /*
         *  The outer loop determines line by line to print stars
         *  (top-down). That is after going one time through the loop
         *  all those stars are printed that correspond to the maximal
         *  value in ints. In the next round the second highest as
         *  well and so on until one star.
         */
        for (int i = max(ints); i > 0; i--) {
            /*
             *  In each row we print a star if in the corresponding
             *  column there should be one (i.e., if ints[j] is
             *  greater than or equal to i) and an empty space else.
             */
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // When we have reached the end of a row, we start a new one.
            System.out.println();
        }
    }

    /*
     *  Main method for initial test.
     */
    public static void main(String[] args) {
        String[] s1 = {"The", "cat", "sat", "on", "the", "mat"};
        printLengths(s1);
        System.out.println("------------------------");

        String[] s2 = {"All", "human", "beings", "are", "born", "free",
                       "and", "equal", "in", "dignity", "and", "rights",
                       "They", "are", "endowed", "with", "reason", "and",
                       "conscience", "and", "should", "act", "towards",
                       "one", "another", "in", "a", "spirit", "of",
                       "brotherhood", "Everyone", "is", "entitled", "to",
                       "all", "the", "rights", "and", "freedoms", "set",
                       "forth", "in", "this", "Declaration", "without",
                       "distinction", "of", "any", "kind", "such", "as",
                       "race", "colour", "sex", "language", "religion",
                       "political", "or", "other", "opinion", "national",
                       "or", "social", "origin", "property", "birth",
                       "or", "other", "status"};

        printLengths(s2);
        System.out.println("------------------------");
        int[] i = {3, 4, 1, 6, 9, 2, 6, 5};
        printLengths(i);
    }
}
***********************************************************************************
/**
 *  The Ellipse class implements the Area interface, that is, it
 *  provides an implementation for the area method.
 *
 *  @version 2017-11-16
 *  @author Manfred Kerber
 */
public class Ellipse implements Area {
    private double majorRadius;
    private double minorRadius;

    /**
     *  @param majorRadius The bigger radius of the Ellipse in cm.
     *  @param minorRadius The smaller radius of the Ellipse in cm.
     */
    public Ellipse(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    /**
     *  getter for the field variable majorRadius.
     *  @return The bigger radius of the Ellipse in cm.
     */
    public double getMajorRadius() {
        return majorRadius;
    }

    /**
     *  getter for the field variable minorRadius.
     *  @return The smaller radius of the Ellipse in cm.
     */
    public double getMinorRadius() {
        return majorRadius;
    }

    /**
     *  Standard toString method.
     *  @return The object in a human readable form.
     */
    public String toString() {
        return "The object has an area of " + area() + ".";
    }

    /**
     *  A method to compute the area of an Ellipse.
     *  @return The area of the Ellipse in cm^2.
     */
    public double area() {
        return Math.PI * getMajorRadius() * getMinorRadius();
    }
}
********************************************************************************
import java.util.*;

/**
 *  This class deal with magic squares. A magic square of size n
 *  should contain all numbers between 1 and n*n exacly once so that
 *  each row, each column, and each diagonal add up to the same
 *  number. (see Horstmann, Big Java, 4th edition p. 299.).
 *  E.g.
 *  <pre>
 *  {{16,  3,  2, 13},
 *   { 5, 10, 11,  8},
 *   { 9,  6,  7, 12},
 *   { 4, 15, 14,  1}}
 *  </pre>
 *  is a magic square of size 4.
 *
 *  The class contains a constructor, a static method readMagic to
 *  read in a magic square - first reading the size, then the numbers
 *  one by one and a method check that checks whether the conditions
 *  are satisfied.
 *
 *  @version 2018-11-20
 *  @author Manfred Kerber
 */
public class Magic {

    /**
     *  The size of the magic square.
     */
    private int size;
    /**
     *  The matrix representing the magic square
     */
    private int[][] square;

    /**
     *  Standard constructor
     *  @param size The size of the magic square.
     *  @param square The matrix representing the magic square.
     */
    public Magic(int size, int[][] square) {
        this.size = size;
        this.square = square;
    }

    /**
     *  getter for the square
     *  @return The two-dimensional matrix representing the square.
     */
    public int[][] getSquare() {
        return square;
    }

   /**
     *  A method to create a String to print a one-dimensional array of int[].
     *  @param a An arbitrary array of type int[].
     *  @return A String that can be printed to display the array.
     */
    public static String toString(int[] a) {
        String result = "";
        /* The elements up to index i have been added to the result. */
        for (int i = 0; i < a.length; i++) {
            result += (a[i] + "  ");
        }
        return result;
    }

    /**
     *  A method to create a String to print a two-dimensional array of int[][].
     *  @param a An arbitrary array of type int[][].
     *  @return A String that can be printed to display the array.
     */
    public static String toString(int[][] a) {
        String result = "";
        /* The rows up to index i have been added to the result. */
        for (int i = 0; i < a.length; i++) {
            result += toString(a[i]) + "\n";
        }
        return result;
    }

    /**
     *  Standard toString method for a magic square
     *  @return A string to display a magic square in a human readable
     *  form.
     */
    public String toString() {
        return toString(this.getSquare());
    }

    /**
     *  A method that reads in first the size n and then the n*n many
     *  elements of a magic square one by one.
     *  @return The magic square that was just read in.
     */
    public static Magic readMagic(){
        // Read elements via a scanner.
        Scanner s = new Scanner(System.in);
        // The elements read should be integers
        try {int size = Integer.parseInt(s.next());
            // create a matrix of corresponding size
            int[][] square = new int[size][size];
            // read elements one by one (one line after the other).
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    square[i][j] = Integer.parseInt(s.next());
                }
            }
            // return the corresponding magic square.
            return new Magic(size, square);
        }
        /*
         *  If no magic square is read, one with one element, 1, is returned.
         */
        catch (IllegalArgumentException e) {
            System.out.println("Oops");
            int[][] square = {{1}};
            return new Magic(1, square);
        }
    }

    /**
     *  Checks whether a magic square structure actually forms a magic
     *  square.  It would also be possible to not generate the object
     *  if the condition was not fulfilled.
     *
     *  @return true if the structure is a magic square, false else.
     */
    public boolean check() {
        int[][] square = getSquare();
        // emtpy squares satisfy the conditions.
        if (square.length == 0) {
            return true;
        } else {
            // The reference sum can be computed as the sum of the first row.
            /*int sum = 0;
            for (int i = 0; i < square.length; i++) {
                sum += square[0][i];
            }
            */
            // Alternatively, it can be computed as
            int sum = size * (size * size + 1) / 2;
            // Each row must sum up to sum
            return checkRows(square, sum) &&
                // Each column must sum up to sum
                checkColumns(square, sum) &&
                // Each diagonal must sum up to sum
                checkDiagonals(square, sum) &&
                // The elements must be unique and without gaps.
                checkUnique(square);
        }
    }

    /**
     *  Checks whether each row adds up to the given sum
     *
     *  @param square A matrix to be checked.
     *  @param sum Each row must add up to the given sum.
     *  @return true if each row adds up to sum, false else.
     */
    public static boolean checkRows(int[][] square, int sum) {
        int aux;
        for (int i = 0; i < square.length; i++) {
            aux = 0;
            for (int j = 0; j < square.length; j++) {
                aux += square[i][j];
            }
            /* if a sum (represented in aux) does not add up to sum
             * return false (after printing the row number).
             */
            if (aux != sum) {
                System.out.println("Wrong row " + (i+1));
                return false;
            }
        }
        // return true if there is no counterexample.
        return true;
    }

    /**
     *  Checks whether each column adds up to the given sum
     *
     *  @param square A matrix to be checked.
     *  @param sum Each column must add up to the given sum.
     *  @return true if each column adds up to sum, false else.
     */
    public static boolean checkColumns(int[][] square, int sum) {
        int aux;
        for (int j = 0; j < square.length; j++) {
            aux = 0;
            for (int i = 0; i < square.length; i++) {
                aux += square[i][j];
            }
            /* if a sum (represented in aux) does not add up to sum
             * return false (after printing the column number).
             */
            if (aux != sum) {
                System.out.println("Wrong column " + (j+1));
                return false;
            }
        }
        // return true if there is no counterexample.
        return true;
    }

    /**
     *  Checks whether each diagonal adds up to the given sum
     *
     *  @param square A matrix to be checked.
     *  @param sum Each diagonal must add up to the given sum.
     *  @return true if each column adds up to sum, false else.
     */
    public static boolean checkDiagonals(int[][] square, int sum) {
        // check primary diagonal
        int aux = 0;
        for (int i = 0; i < square.length; i++) {
            aux += square[i][i];
            }
        if (aux != sum) {
            System.out.println("Wrong primary diagonal.");
            return false;
        }
        // check secondary diagonal
        aux = 0;
        for (int i = 0; i < square.length; i++) {
            aux += square[i][square.length - 1 - i];
            }
        if (aux != sum) {
            System.out.println("Wrong secondary diagonal.");
            return false;
        }
        return true;
    }

    /**
     *  Checks whether the number 1, 2, 3, 4, ...., n*n-1, n*n all
     *  occur.  This is done by creating an array of type boolean
     *  called check which is initially false. Whenever a number is
     *  found it is set to true. If all its elements are then true the
     *  check passes, else a counterexample is printed and false is
     *  returned.
     *
     *  @param square A two-dimensional matrix to checked.
     *  @return true If all elements 1,2, 3, 4, ...., n*n-1, n*n
     *  occur. false else.
     */
    public static boolean checkUnique(int[][] square) {
        int length = square.length;
        boolean[] check = new boolean[length * length];
        /*
         *  Iterate over the whole array square and enter each number
         *  in the check array (mapped into the range 0,1,2,3, ...,
         *  n*n-2, n*n-1).
         *  If a number is read that is out of scope, false is returned.
         */
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (0 < square[i][j] && square[i][j] <= length * length) {
                    check[square[i][j]-1] = true;
                } else {
                    return false;
                }

            }
        }
        /*
         *  If a single element in the range was not read, this is
         *  printed and false is returned.
         */
        for (int i = 0; i < length*length; i++) {
            if (!check[i]) {
                System.out.println("Element " + (i+1) + " missing");
                return false;
            }
        }
        // If no counterexample is found, return true.
        return true;
    }

    /*
     *  main method to call the readMagic method as well as the check
     *  method.
     */
    public static void main(String[] args) {
        Magic m = readMagic();
        System.out.println(m);
        System.out.println(m.check());
        // System.out.println(checkUnique(m.getSquare()));
    }

}
**********************************************************************************
//import java.util.IllegalArgumentException;
/**
 *   The class contains a method compute the minimal element in a
 *   two-dimensional array of type double[][].
 *
 *   @author Manfred Kerber
 *   @version 2017-11-16
 */

public class Min {

    /**
     *  The method to compute the minimal element in an array of type
     *  double[][].  The code has the problem that an array may
     *  contain elements, but none in the first row that then it will throw an
     *  ArrayIndexOutOfBoundsException.
     *  @param a An arbitrary array of type double[][].
     *  @return The minimum of all the elements in the array.
     */
    public static double min(double[][] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("No elements in array provided to method min.");
        } else {
            double min = a[0][0];
            // Iteration over all rows
            for (double[] row : a) {
                // Iteration over all elements in a row.
                for (double el : row) {
                    if (el < min) {
                        min = el;
                    }
                }
            }
        return min;
        }
    }

    /**
     *  The method to compute the minimal element in an array of type double[][]
     *  @param a An arbitrary array of type double[][].
     *  @return The minimum of all the elements in the array.
     */
    public static double minImproved(double[][] a) {
        double min = Double.MAX_VALUE;
        boolean elementFound = false;
        /* Iteration over all rows to check whether there is a row
         * with an element. If yes, the element is taken as the
         * provisional minimum and the variable elementFound is set to
         * true. The loop is left immediately when such an element is
         * found.
         */
        for (double[] row : a) {
            if (row.length > 0) {
                min = row[0];
                elementFound = true;
                break;
            }
        }
        // If there is no element in the array an IllegalArgumentException is thrown.
        if (! elementFound) {
            throw new IllegalArgumentException("No elements in array provided to method min.");
        } else {
            // Iteration over all rows.
            for (double[] row : a) {
                /* Iteration over all elements in a row. min will be
                 * the minimal element seen so far (if seen any).
                 */
                for (double el : row) {
                    if (el < min) {
                        min = el;
                    }
                }
            }
            return min;
        }
    }


    /*
     *  Main method for initial test.
     */
    public static void main(String[] args) {

        double[][] a = {{2.2, 4.4, 6.6, 11.1, 3.3, 9.8, 0, -4.2},
                        {-3.2},
                        {1, 2, 3, 4, 5, 6, 7}};
        double[][] b = {{-4, -6, -1, -3, -9, -1, -4}};
        double[][] c = {{0, 1, 2}, {}};
        double[][] d = {{}, {-1, 1, 2}, {}};
        try {
        System.out.println(minImproved(a));
        System.out.println(minImproved(b));
        System.out.println(minImproved(c));
        System.out.println(minImproved(d));
        System.out.println("************************************");
        System.out.println(min(a));
        System.out.println(min(b));
        System.out.println(min(c));
        System.out.println(min(d));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Oops, no element found.");
        }
    }
}
*************************************************************************************
/**
 *  The Rectangle class implements the Area interface, that is, it
 *  provides an implementation for the area method. It contains
 *  another method, circumference as well as getters for the two
 *  fields length and width.
 *
 *  @version 2017-11-16
 *  @author Manfred Kerber
 */
public class Rectangle implements Area {
    private double length;
    private double width;

    /**
     *  @param length The length of the Rectangle in cm.
     *  @param width The width of the Rectangle in cm.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     *  getter for the field variable length.
     *  @return The length of the Rectangle in cm.
     */
    public double getLength() {
        return length;
    }

    /**
     *  getter for the field variable width.
     *  @return The width of the Rectangle in cm.
     */
    public double getWidth() {
        return width;
    }

    /**
     *  Standard toString method.
     *  @return The object in a human readable form.
     */
    public String toString() {
        return "The object has an area of " + area() +
            " and a circumference of " + circumference() + ".";
    }

    /**
     *  A method to compute the area of a Rectangle.
     *  @return The area of the Rectangle in cm^2.
     */
    public double area() {
        return getLength() * getWidth();
    }

    /**
     *  A method to compute the circumference of a Rectangle.
     *  @return The circumference of the Rectangle in cm.
     */
    public double circumference() {
        return 2 * (getLength() + getWidth());
    }

    /*
     *  Main method for initial test.
     */
    public static void main(String[] args) {
        Rectangle a = new Rectangle(4.0, 3.0);
        Rectangle b = new Rectangle(2.0, 2.0);

        System.out.println(a);
        System.out.println(b);
    }
}
*************************************************************************************
/**
 *   The class contains a method to reverse the content of an array of
 *   type int[]. No new array is created.
 *
 *   @author Manfred Kerber
 *   @version 2017-11-16
 */

public class Reverse {

    /**
     *  The method reverses the content of an array of type int[].
     *  @param a An arbitrary array of type int[].
     *  @return The same array with elements reversed, that is, the
     *  last element is swaped with element zero, and so on.
     */
    public static int[] reverse(int[] a) {
        int n = a.length;
        int aux;
        for (int i = 0; i < n/2; i++) {
            aux = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = aux;
        }
        return a;
    }


    /**
     *  A method to print a one-dimensional array of int[].
     *  @param a An arbitrary array of type int[].
     */
    public static void print(int[] a) {
        /* The elements up to index i have been printed. */
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    /*
     *  Main method for initial test.
     */
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 1, 3, 9, 0, -4};
        int[] b = {4, 6, 1, 3, 9, 0, -4};
        int[] aReversed = reverse(a);
        int[] bReversed = reverse(b);
        print(a);
        print(aReversed);
        print(b);
        print(bReversed);
    }
}
*************************************************************************************
**
 *  The Square class is a subclass of the Rectangle class. It does not
 *  contain any new field variables, but the values of the two field
 *  variables of the superclass are identical.
 *
 *  @version 2017-11-16
 *  @author Manfred Kerber
 */

public class Square extends Rectangle {
    /**
     *  A Square is constructed by constucting a Rectangle with equal
     *  sides (i.e., height = width).
     *  @param a The side length in the Square.
     */
    public Square(double a) {
        super(a,a);
    }

    /*
     *  Main method for initial test.
     */
    public static void main(String[] args) {
        Square a = new Square(4.0);
        Square b = new Square(5.1);

        System.out.println(a);
        System.out.println(b);
    }
}
***********************************************************************************
import java.util.ArrayList;
import java.io.*;

/**
 * This class contains the tutorial handout exercises of week 5.
 *
 * @authors Alexandros Evangelidis and Manfred Kerber
 * @version 30-10-2018
 */
public class Wk5 {

	/**
	 * This method initialises an ArrayList of integers, by adding one element at a
	 * time.
	 *
	 * @param n the length of the ArrayList.
	 * @return an ArrayList of integers.
	 */
	public static ArrayList<Integer> initialise1(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		return list;
	}

	/**
	 * This method initialises an ArrayList of integers by adding two elements at a
	 * time.
	 *
	 * @param n the length of the ArrayList.
	 * @return an ArrayList of integers.
	 */
	public static ArrayList<Integer> initialise2(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		for (int i = 0; i < n; i++) {
			list.add(i);
			list.add(i);
		}
		return list;
	}

	/**
	 * This method removes even numbers from an ArrayList of integers.
	 *
	 * @param list an ArrayList of integers.
	 */
	public static void removeEvenNumbers(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
				i--;
			}
		}
	}

	/**This method counts the size of file by counting
	 * the number of lines, words and characters, respectively.
	 *
	 * @param filename the name of a file.
	 * @return the number of lines, words and characters as part of a string.
	 */
	public static String countFileSize(String filename) {
		int charCounter = 0;
		int wordCounter = 0;
		int lineCounter = 0;
		int readChar;
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));
			while ((readChar = in.read()) != -1) {
				if ((char) readChar == '\n') {
					lineCounter++;
				}
				if ((char) readChar == ' ') {
					wordCounter++;
				}
				charCounter++;
			}
			in.close();
			return "Number of lines: " + lineCounter + "\nNumber of words: " + wordCounter + "\nNumber of characters: "
					+ charCounter + "\n";
		} catch (IOException e) {
			return "File not found.";
		}
	}


	/** This method counts the words of a given file.
	 *
	 * @param filename the name of a file in a string.
	 * @return the number of words as part of a string.
	 */
	public static String countFileWords(String filename) {
		int wordCounter = 0;
		String readString;
		String[] line;

		// try-with-resources
		try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
			while ((readString = in.readLine()) != null) {
				line = readString.split("\\s+");
				wordCounter += line.length;
			}
			return "\nNumber of words: " + wordCounter + "\n";
		} catch (IOException e) {
			return "File not found.";
		}
	}

	/**
	 * main method to test the class.
	 *
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list1 = initialise1(4);
		System.out.println(list1);
		removeEvenNumbers(list1);
		System.out.println(list1);

		ArrayList<Integer> list2 = initialise2(4);
		System.out.println(list2);
		removeEvenNumbers(list2);
		System.out.println(list2);

		System.out.println(countFileSize("DonQuixote.txt"));
		System.out.println(countFileWords("DonQuixote.txt"));
	}
}
******************************************************************************************
/**
 * This interface is part of the tutorial handout of week 6.
 *
 * @authors Alexandros Evangelidis and Manfred Kerber.
 * @version 02-11-2018
 */
public interface Measurable {

	public double getMeasure();
}
*************************************************************************************
/**
 * This class is part of the tutorial handout of week 6.
 *
 * @authors Alexandros Evangelidis and Manfred Kerber.
 * @version 02-11-2018
 */
public class BankAccount implements Measurable {

	private double balance;
	private int accountNumber;
	private String accountName;

	/**
	 * Constructor to be used in the Measurable class.
	 *
	 * @param balance the balance of an account.
	 */
	public BankAccount(double balance) {
		this.balance = balance;
	}

	/**
	 * Constructor to be used in the Fun class.
	 *
	 * @param accountNumber an account number.
	 * @param accountName   an account name.
	 * @param balance       an account balance.
	 */
	public BankAccount(int accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	/**
	 * @return the account number.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber a new account number to be set.
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the account name.
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName a new account name to be set.
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @param balance a new balance to be set.
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the balance of an account.
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * toString defines how to print a BankAccount.
	 *
	 * @return the print type of an account,
	 */
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", accountNumber=" + accountNumber + ", accountName=" + accountName
				+ "]";
	}

	@Override
	public double getMeasure() {
		return balance;
	}

}
***********************************************************************************************************
/**
 * This class is part of the tutorial handout of week 6.
 *
 * @authors Alexandros Evangelidis and Manfred Kerber.
 * @version 02-11-2018
 */
public class Statistics {

	/**
	 * This method computes the average area of an array of countries.
	 *
	 * @param countries an array of type Country.
	 * @return the average area.
	 */
	public static double areaAverage(Country[] countries) {
		double sum = 0;
		for (int i = 0; i < countries.length; i++) {
			sum += countries[i].getArea();
		}
		return sum / countries.length;
	}

	/**
	 * This method computes the average balance of an array of bank accounts.
	 *
	 * @param accounts an array of type BankAccount.
	 * @return the average balance.
	 */
	public static double balanceAverage(BankAccount[] bankAccounts) {
		double sum = 0;
		for (int i = 0; i < bankAccounts.length; i++) {
			sum += bankAccounts[i].getBalance();
		}
		return sum / bankAccounts.length;
	}

	/**
	 * This method computes the average measure of an array of measurable.
	 *
	 * @param measurable an array of type Measurable.
	 * @return the average measure.
	 */
	public static double average(Measurable[] measurable) {
		double sum = 0;
		for (int i = 0; i < measurable.length; i++) {
			sum += measurable[i].getMeasure();
		}
		return sum / measurable.length;
	}

	/**
	 * main method to test class.
	 */
	public static void main(String[] args) {

		// First compute the average of an array of
		// bank accounts using the getBalance() method.
		BankAccount bk1 = new BankAccount(1000);
		BankAccount bk2 = new BankAccount(2250);
		BankAccount bk3 = new BankAccount(3845);

		BankAccount[] bankAccountArray = { bk1, bk2, bk3 };

		System.out.println((balanceAverage(bankAccountArray)));

		// First compute the average of an array of
		// countries using the getArea() method.
		Country country1 = new Country(15679);
		Country country2 = new Country(25654);
		Country country3 = new Country(54865);

		Country[] countryArray = { country1, country2, country3 };

		System.out.println((areaAverage(countryArray)));

		// Then compute the average of an array of
		// type Measurable using the getMeasure() method.
		Measurable country4 = new Country(15679);
		Measurable country5 = new Country(54865);
		Measurable bk4 = new BankAccount(25654);
		Measurable bk5 = new BankAccount(54865);

		Measurable[] measurableArray = { country4, country5, bk4, bk5 };

		System.out.println(average(measurableArray));
	}

}
***********************************************************************************
/**
 * Country class part of the tutorial handout of week 6.
 *
 * @authors Alexandros Evangelidis and Manfred Kerber.
 * @version 02-11-2018
 */
public class Country implements Measurable {

	private double area;

	/**
	 * Constructor.
	 *
	 * @param area the area of a country.
	 */
	public Country(double area) {
		this.area = area;
	}

	/**
	 * @return the area of a country.
	 */
	public double getArea() {
		return area;
	}

	@Override
	public double getMeasure() {
		return area;
	}

}
***********************************************************************************
write out images for tutorial 7 (gold card)
Declare a class CreditCard with ﬁelds name, accountNumber, and amount of appropriate types together with a constructor, and a setter and a getter for amount. (The full class would contain other methods, but these are not of concern here.) A bank wants to oﬀer diﬀerent types of credit cards, also a GoldCard which has the additional ﬁeld fee. Write a class GoldCard with a constructor, in which the fee is subtracted from the amount on the creation of objects. Make use of inheritance to reuse the code from above. (The full class would contain methods, which are not of concern here.)

public class CreditCard {
private String name;
private String accountName;
private double amount;
}

pubic CreditCard(String name, String accountNumber, double amount){
this.name = name;
this.accountNmber = accountNumber;
this.amount = amount;
}

getter
setter

public class GoldCard extends CreditCard {
private double fee;

public GoldCard(String name, String accountNumber, double amount, double fee) {
super(name, accountNumber, amount - fee);

public static void main (String [] args);
CreditCard creditCard = new CredtiCard("Joe", "123412", 1000);
GoldCard goldCard = new GoldCard("Alto", "902134", 200, 100);
System.out.println(creditCard);
System.out.println(goldCard);
}
}
*****************************************************************
package company;

/**
 * @author Manfred Kerber
 * @version 2016-11-08
 *
 *          The following example is adapted from [Deitel and Deitel, 2010, Java
 *          - How to program, 8th edition, p. 427]. The interface provides only
 *          skeleton of a class, that is, here, that there are two methods which
 *          take no arguments and give back an int each, the amount to be paid,
 *          and the day of the month when it has to be paid. Obviously a calling
 *          methods needs to know no more. However, in order to run the methods
 *          we need implementations. [In a real system we would have further
 *          methods such as String getBankAccount() and String getSortCode();]
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
*********************************************************************************
package company;

/**
 * Employee is an abstract class that implements Payable, that is, we have to
 * give an implementation of the methods getPaymentAmount() and dueDate().
 * However, since Employee is an abstract class (unlike the corresponding class
 * from week 5), it suffices to give abstract methods, we assume the dueDate()
 * to be concrete (the 15th of every month), but the method getPaymentAmount()
 * to be abstract, which would be determined differently for the sub-classes of
 * hourly paid employees and monthly paid employees. Likewise since Employee
 * also implements Holiday we have to give an implementation of getHolidays().
 * In this case we choose to give a concrete implementation in the abstract
 * class Employee.
 *
 * @version 2016-11-08
 * @author Manfred Kerber
 */
public abstract class Employee implements Payable {
	public static final int generalDaysOfHolidays = 30;
	public static final int generalPaymentDay = 15;

	private String firstName;
	private String lastName;
	private String nI;
	private int dayOfPayment;
	private int daysOfHolidays;

	/**
	 * A constructor for the Employee class.
	 *
	 * @param firstName The first name of the employee.
	 * @param lastName  The last name of the employee.
	 * @param nI        The national insurance number of the employee.
	 */
	public Employee(String firstName, String lastName, String nI) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nI = nI;
		this.dayOfPayment = generalPaymentDay;
		this.daysOfHolidays = generalDaysOfHolidays;
	}

	/**
	 * getter for first name.
	 *
	 * @return The first name of the employee.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * getter for last name.
	 *
	 * @return The last name of the employee.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * getter for the national insurance number nI.
	 *
	 * @return The national insurance number of the employee.
	 */
	public String getnI() {
		return nI;
	}

	/**
	 * getter for the day of payment
	 *
	 * @return The day when the salary is due.
	 */
	public int getDayOfPayment() {
		return dayOfPayment;
	}

	/**
	 * getter for the number of holidays.
	 *
	 * @return The number of holidays the employee still has.
	 */
	public int getDaysOfHolidays() {
		return daysOfHolidays;
	}

	/**
	 * setter for the number of holidays.
	 *
	 * @param daysOfHolidays The new number of holidays the employee still has.
	 */
	public void setDaysOfHolidays(int daysOfHolidays) {
		this.daysOfHolidays = daysOfHolidays;
	}

	/**
	 * setter for the day of payment.
	 *
	 * @param dayOfPayment The new day of the month when the salary has to be paid.
	 */
	public void setDayOfPayment(int dayOfPayment) {
		this.dayOfPayment = dayOfPayment;
	}

	/**
	 * The abstract method needs implementations in each concrete sub-class.
	 *
	 * @return The payment amount which corresponds to the salary.
	 */
	public abstract double paymentAmount();

	/**
	 * The abstract method needs implementations in each concrete sub-class.
	 *
	 * @return The payment amount following an increase salary.
	 */

	public abstract void increaseSalary(double rate);

	/**
	 * Implementation of the due date by which the salary needs to be paid, needed
	 * since the class implements the Payable interface.
	 *
	 * @return The due date when the monthly salary is to be paid.
	 */
	public int dueDate() {
		return getDayOfPayment();
	}

	/**
	 * The toString() method to display Employee objects.
	 *
	 * @return A human readable string of an Employee object.
	 */
	public String toString() {
		return String.format(" Name: %s, First Name: %s, NI: %s ", getLastName(), getFirstName(), getnI());
	}

}
**********************************************************************************
package company;

/**
 * This class is concrete and inherits from the abstract superclass Employee. We
 * specialize the toString method by indicating the monthly salary. Since in the
 * superclass Employee the method getPaymentAmount() is abstract, we must give
 * in the MonthlyEmployee class an implementation for paymentAmount(). It just
 * returns the monthly salary.
 *
 * @version 2016-11-08
 * @author Manfred Kerber
 */

public class MonthlyEmployee extends Employee {
	/**
	 * Additional field variable monthlySalary.
	 */
	private double monthlySalary;

	/**
	 * The constructor for an employee with a monthly salary has the three fields of
	 * an Employee plus the field of the monthlySalary, which is set at
	 * construction.
	 *
	 * @param firstName     The first name of the employee.
	 * @param lastName      The last name of the employee.
	 * @param nI            The national insurance number of the employee.
	 * @param monthlySalary The monthly salary of the employee.
	 */
	public MonthlyEmployee(String firstName, String lastName, String nI, double monthlySalary) {
		super(firstName, lastName, nI); // must come first
		this.monthlySalary = monthlySalary;
	}

	/**
	 * getter for monthlySalary.
	 *
	 * @return The monthly salary of the employee.
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * setter for monthlySalary.
	 *
	 * @param monthlySalary The new monthly salary of the employee.
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	/**
	 * The toString() method to display MonthlyEmployee objects. In addition to the
	 * details of an Employee, the monthly salary is displayed. Note that the
	 * "@Override" statement is optional. However, it is good practice to write it;
	 * in this case the compiler checks whether the method actually overrides some
	 * other, if not en error will occur.
	 *
	 * @return A human readable string of a MonthlyEmployee object.
	 */
	@Override
	public String toString() {
		return "MonthlyEmployee [" + super.toString() + "monthlySalary=" + monthlySalary + "]";
	}

	/**
	 * An implementation of the getPaymentAmount() method
	 *
	 * @return A monthly paid employee has to receive their monthly salary, which is
	 *         returned as the payment amount.
	 */
	public double paymentAmount() {
		return getMonthlySalary();

	}

	public void increaseSalary(double rate) {
		setMonthlySalary(getMonthlySalary() + getMonthlySalary() * rate);
	}
}
************************************************************************************
package company;

/**
 * This class is concrete and inherits from the abstract superclass Employee. We
 * specialize the toString method by indicating the hourly salary. Since in the
 * superclass Employee the method getPaymentAmount() is abstract, we must give
 * in the HourlyEmployee class an implementation for paymentAmount(). It returns
 * the hourly salary times the number of hours worked in the last month.
 *
 * @version 2016-11-08
 * @author Manfred Kerber
 */

public class HourlyEmployee extends Employee {

	/**
	 * Additional field variable hourlySalary and workedHoursLastMonth (the latter
	 * initialized in the constructor to 0.
	 */
	private double hourlySalary;
	private int workedHoursLastMonth;

	/**
	 * The constructor for an employee with an hourly salary has the three fields of
	 * an Employee plus the fields of the hourlySalary, which is set at
	 * construction, and workedHoursLastMonth, which is initialized to 0.
	 *
	 * @param firstName    The first name of the employee.
	 * @param lastName     The last name of the employee.
	 * @param nI           The national insurance number of the employee.
	 * @param hourlySalary The hourly salary of the employee.
	 */
	public HourlyEmployee(String firstName, String lastName, String nI, double hourlySalary) {
		super(firstName, lastName, nI); // must be called first
		this.hourlySalary = hourlySalary;
		this.workedHoursLastMonth = 0;
	}

	/**
	 * getter for hourlySalary.
	 *
	 * @return The hourly salary of the employee.
	 */
	public double getHourlySalary() {
		return this.hourlySalary;
	}

	/**
	 * getter for workedHoursLastMonth.
	 *
	 * @return The number of hours the employee worked last month.
	 */
	public int getWorkedHoursLastMonth() {
		return this.workedHoursLastMonth;
	}

	/**
	 * setter for hourlySalary.
	 *
	 * @param hourlySalary The new hourly salary of the employee.
	 */
	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	/**
	 * setter for workedHoursLastMonth.
	 *
	 * @param workedHoursLastMonth The new number of hours the employee worked last
	 *                             month.
	 */
	public void setWorkedHoursLastMonth(int workedHoursLastMonth) {
		this.workedHoursLastMonth = workedHoursLastMonth;
	}

	/**
	 * The toString() method to display HourlyEmployee objects. In addition to the
	 * details of an Employee, the hourly salary is displayed. Note that the
	 * "@Override" statement is optional. However, it is good practice to write it;
	 * in this case the compiler checks whether the method actually overrides some
	 * other, if not en error will occur.
	 *
	 * @return A human readable string of a MonthlyEmployee object.
	 */
	@Override
	public String toString() {
		return String.format("%s,\n hourly salary: %d, worked hours: %d, total salary: %d", super.toString(),
				getHourlySalary(), getWorkedHoursLastMonth(), paymentAmount());
	}

	/**
	 * An implementation of the getPaymentAmount() method
	 *
	 * @return A hourly paid employee has to receive their monthly salary, which is
	 *         computed as the hourly salary times the hours they worked.
	 */
	public double paymentAmount() {
		return getHourlySalary() * getWorkedHoursLastMonth();
	}

	/*
	 * An implemntation of increaseSalary
	 */

	@Override
	public void increaseSalary(double rate) {
		setHourlySalary(getHourlySalary() + getHourlySalary() * rate);
	}

}
**************************************************************************************
package company;

/**
 * This class is concrete and inherits from the abstract superclass Employee. We
 * specialize the toString method by indicating the monthly salary. Since in the
 * superclass Employee the method getPaymentAmount() is abstract, we must give
 * in the MonthlyEmployee class an implementation for paymentAmount(). It just
 * returns the monthly salary.
 *
 * @version 2016-11-08
 * @author Manfred Kerber
 */

public class MonthlyEmployee extends Employee {
	/**
	 * Additional field variable monthlySalary.
	 */
	private double monthlySalary;

	/**
	 * The constructor for an employee with a monthly salary has the three fields of
	 * an Employee plus the field of the monthlySalary, which is set at
	 * construction.
	 *
	 * @param firstName     The first name of the employee.
	 * @param lastName      The last name of the employee.
	 * @param nI            The national insurance number of the employee.
	 * @param monthlySalary The monthly salary of the employee.
	 */
	public MonthlyEmployee(String firstName, String lastName, String nI, double monthlySalary) {
		super(firstName, lastName, nI); // must come first
		this.monthlySalary = monthlySalary;
	}

	/**
	 * getter for monthlySalary.
	 *
	 * @return The monthly salary of the employee.
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * setter for monthlySalary.
	 *
	 * @param monthlySalary The new monthly salary of the employee.
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	/**
	 * The toString() method to display MonthlyEmployee objects. In addition to the
	 * details of an Employee, the monthly salary is displayed. Note that the
	 * "@Override" statement is optional. However, it is good practice to write it;
	 * in this case the compiler checks whether the method actually overrides some
	 * other, if not en error will occur.
	 *
	 * @return A human readable string of a MonthlyEmployee object.
	 */
	@Override
	public String toString() {
		return "MonthlyEmployee [" + super.toString() + "monthlySalary=" + monthlySalary + "]";
	}

	/**
	 * An implementation of the getPaymentAmount() method
	 *
	 * @return A monthly paid employee has to receive their monthly salary, which is
	 *         returned as the payment amount.
	 */
	public double paymentAmount() {
		return getMonthlySalary();

	}

	public void increaseSalary(double rate) {
		setMonthlySalary(getMonthlySalary() + getMonthlySalary() * rate);
	}
}
***********************************************************************************
package company;

import java.util.ArrayList;

public abstract class Company {

	private ArrayList<Employee> employees;

	/**
	 * constructor creates what?? from the parts
	 *
	 * @param firstName
	 * @param lastName
	 * @param nI
	 */

	public Company() {

		this.employees = new ArrayList<Employee>();

	}

	/**
	 * Getter for Employees
	 */

	public ArrayList<Employee> getEmployees() {
		return this.employees;
	}

	/**
	 * Setter for Employees
	 */

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	/*
	 * Method for increasing salary
	 */

	public void increaseSalaries(double rate) {

		for (int i = 0; i < employees.size(); i++) {
			employees.get(i).increaseSalary(rate);

		}

	}
}
***********************************************************************************
package shop;

public class Product {

	private String name;
	private double price;
	private int quantity;

	/*
	 * constructor
	 */

	public Product(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/*
	 * getter for name
	 */

	public String getName() {
		return name;
	}

	/*
	 * getter for price
	 */

	public double getPrice() {
		return price;
	}

	/*
	 * getter for quantity
	 */

	public int getQuantity() {
		return quantity;
	}

	/*
	 * Setter for name
	 */

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * Setter for price
	 */

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * Setter for quantity
	 */

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return getPrice() * getQuantity();

	}
***********************************************************************************
A manufacturing company produces several types of goods. Each good goes with an orderCode, a price, and its availability (of types String, int, and boolean, respectively). Some goods are perishable, they go in addition with a bestBeforeDay in form of a single int standing for the day of the year until they are ﬁne. According to company policy such goods must not be shipped out after 14 days before the bestBeforeDay. For perishable goods you should write a method public boolean sellable() that checks whether the good can still be sold today. (Assume that a static method int today() is given that returns the day of the year for today. You may simulate this by a method that returns a value such as 311 for the 311th day of the year.) The customers of the company are to be represented in a Customer class, consisting of the ﬁeld variables name, address, and turnOver of types String, String, and int, respectively. Some customers have “goldStatus”, since they have a turnOver of more than £ 2000. They receive a 5% discount on all prices. Implement a method public double toPay(int price) which applies the discount to the price if appropriate. How do you represent this best? Is it advisable to have a subclass PerishableGood for perishable goods? Likewise is it advisable to have a subclass GoldStatus for gold status customers? Justify your design decisions in appropriate comments and implement a corresponding program in appropriate classes.
Goods are charaterized by an orderCode, a price, and their current
 *  availability
 *
 *  @version 2018-11-09
 *  @author Manfred Kerber
 */
public class Good {
    private String orderCode;
    private int price;
    private boolean availability;

    /**
     *  A constructor for the Good objects.
     *  @param orderCode A String as primary key to find the object.
     *  @param price The price of the good as an int.
     *  @param availability A boolean check whether at least one
     *  object can be shipped.
     */
    public Good(String orderCode, int price, boolean availability) {
        this.orderCode = orderCode;
        this.price = price;
        this.availability = availability;
    }

    /**
     *  A getter for the orderCode.
     *  @return The orderCode.
     */
    public String getOrderCode() {
        return orderCode;
    }
    /**
     *  A getter for the price.
     *  @return The price.
     */
    public int getPrice() {
        return price;
    }
    /**
     *  A getter for the availability.
     *  @return true if the object is available, false else.
     */
    public boolean getAvailability() {
        return availability;
    }
}
*********************************************************
/**
 *  Some goods are perishable as such. For this reason we represent
 *  them as a subclass of the Good class. Perishable goods come in
 *  addition to the good parameters with a bestBeforeDay field
 *  variable of type int.
 *
 *  @version 2018-11-09
 *  @author Manfred Kerber
 */

public class PerishableGood extends Good {

    /**
     *  This is a method stub only that would return the day of the year.
     *  @return It should return the current day of the year, but
     *  currently only returns always 257.
     */
    public static int today() {
        return 257;
    }

    private int bestBeforeDay;

    /**
     *  A constructor for the PerishableGood objects.
     *  @param orderCode A String as primary key to find the object.
     *  @param price The price of the good as an int.
     *  @param availability A boolean check whether at least one
     *  object can be shipped.
     *  @param bestBeforeDay The day of the year (between 1 and 365
     *  (or 366 in case of a leap year)) until when the good can be
     *  shipped.  The first three are set in the superclass by the
     *  super construct, the last sets the corresponding field
     *  variable.
     */
    public PerishableGood(String orderCode, int price,
                          boolean availability, int bestBeforeDay) {
        super(orderCode, price, availability);
        this.bestBeforeDay = bestBeforeDay;
    }

    /**
     *  A getter for the bestBeforeDay.
     *  @return The bestBeforeDay.
     */
    public int getBestBeforeDay() {
        return bestBeforeDay;
    }
    /**
     *  The method tells whether the good may still be shipped.
     *  @return true if the bestBeforeDay is at least 14 days before today.
     */
    public boolean sellable() {
        return (getBestBeforeDay() + 14) <= today();
    }

    /*
     *  A main method for an initial test.
     */
    public static void main(String[] args) {
        PerishableGood gPerish1 = new PerishableGood("a1", 20, true, 257);
        System.out.println(gPerish1.sellable());
        PerishableGood gPerish2 = new PerishableGood("a1", 20, true, 242);
        System.out.println(gPerish2.sellable());
    }
}
****************************************************************************************
**
 *  We model in the Customer class the goldStatus by a method and not
 *  a sub-class, since the property that a customer spends more than a
 *  particular threshold may change over time, hence it is not
 *  suitable for a subclass relationship, which cannot change.
 *
 *  @version 2018-11-09
 *  @author Manfred Kerber
 */
public class Customer {
    public static final double discount = 0.05;
    public static final int goldStatusThreshold = 2000;

    private String name;
    private String address;
    private int turnOver;

    /**
     *  A constructor for the Customer objects.
     *  @param name The name of the customer as String.
     *  @param address The address of the customer as a String.
     *  @param turnOver The amount of money the customer has spent
     *  during a particular period.
     */
    public Customer(String name, String address, int turnOver) {
        this.name = name;
        this.address = address;
        this.turnOver = turnOver;
    }

    /**
     *  Getter for name.
     *  @return The name of the Customer in form of a String.
     */
    public String getName(){
        return name;
    }

    /**
     *  Getter for adddress.
     *  @return The address of the Customer in form of a String.
     */
    public String getAddress(){
        return address;
    }

    /**
     *  Getter for turnOver.
     *  @return The turnOver of the Customer in form of an int.
     */
    public int getTurnOver(){
        return turnOver;
    }

    /**
     *  Setter for name.
     *  @param name The new name in form of a String.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *  Setter for address.
     *  @param address The new address in form of a String.
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     *  Setter for turnOver.
     *  @param turnOver The new turnOver in form of an int.
     */
    public void setTurnOver(int turnOver){
        this.turnOver = turnOver;
    }

    /**
     *   goldStatus should return true if the customer has a turn over
     *   of more than the gold status threshold.
     *   @return true if the customer has a turn over of more than the
     *   gold status threshold, false else
     */
    public boolean goldStatus() {
        return getTurnOver() > goldStatusThreshold;
    }

    /**
     *  For non gold-status customers it return the price as a double,
     *  for others with a discount applied.
     *
     *  @param price The original price of a good before any discount
     *  is applied.
     *  @return The original price as a double for non gold-status
     *  customers, the price with a discount applied for gold-status
     *  customers.
     */
    public double toPay(int price) {
        if (this.goldStatus()) {
            return price * (1-discount);
        } else {
            return price * 1.0;
        }
    }

    /*
     *  A main method for an initial test.
     */
    public static void main(String[] args) {
        Customer mary = new Customer("Mary", "CS", 4000);
        Customer john = new Customer("John", "CS", 1000);

        System.out.println(mary.toPay(100));
        System.out.println(john.toPay(100));
    }
}
***********************************************************************************
Exercise 2: (Medium, 30%) Assume you want to build a web crawler (an essential part in a web search engine), that is, an engine that starts with a particular web page and then collects web pages which can be reached from this start page by ﬁrst collecting all web pages that can be reached in a single step from the page. The ﬁrst step is to collect all these web pages. Write a class WebCrawler that contains astaticmethodpublic static ArrayList<String> collectUrls(String urlString)whichreadsthe pagerelatedtourlStringandreturnsanArrayListofalltheURLsthatcanbefoundonthecorresponding pageurlString(anemptylistiftheoriginalURLcannotbereached). [Youmaywriteauxiliarymethods.] As a starting point look at the Html class from the Wednesday lecture in Week 4. In order to ﬁnd URLs assume that they all have the structure <a href="http://www.cs.bham.ac.uk">Computer Science</a>. From such a String you should extract the String "http://www.cs.bham.ac.uk". In order to ﬁnd the URLs you can make use of the method public String[] split(String regex), see https://docs. oracle.com/javase/10/docs/api/java/lang/String.html#split(java.lang.String) for details. We provide a test ﬁle at http://cs.bham.ac.uk/˜mmk/teaching/java/test.html for which the method should return an ArrayList<String> corresponding to: ["http://www.cs.bham.ac.uk/", "http://www.eps.bham.ac.uk/", "http://www.bham.ac.uk", "https://canvas.bham.ac.uk/courses/31154"]. [A full web crawler would remove duplicates and then continue with the extraction of further URLs from these newly found web pages. We are not looking into this here.]
import java.io.*;
import java.net.URL;
import java.util.ArrayList;

/**
 * The class gives a start for a web crawler by reading a line by line
 * from a web page given by a URL and collecting all URLs on the page
 * in an ArrayList.
 *
 * @version 2018-11-09
 * @author Manfred Kerber
 */
public class WebCrawler {

    /**
     *  Auxiliary method to chop of a string from the end of a given string.
     *  @param string A string whose end is chopped off, e.g.
     *  "abc-de"
     *  @param chop The string after which everything is chopped off, e.g. "-"
     *  @return The reduced string, e.g. "abc"
     */
    public static String chopOff(String string, String chop) {
        String[] parts = string.split(chop);
        return parts[0];
    }

    /**
     *  Assume we have a string potentially containing URLs. We want
     *  to collect all URLs that we find in the string. The method
     *  looks for anything that starts with opening accute angle
     *  followed by "a href=\"". More sophisticated approaches are
     *  possible.
     *  @param string The string in which all URLs are to be found.
     *  @return The ArrayList of all URLs found in the string.
     */
    public static ArrayList<String> findUrls(String string) {
        ArrayList<String> result = new ArrayList<String>();
        String[] parts = string.split("<a href=\"");
        for (int i = 1; i < parts.length; i++) {
            if (parts.length > 1) {
                result.add(chopOff(parts[i], "\">"));
            }
        }
        return result;
    }

    /**
     *  @param urlString The string represents a URL, the corresponding
     *  web page is read and all URLs on it to be collected in an ArrayList.
     *  @return An ArrayList of all URLs found on the web page, the empty list
     *  if there are no URLs on it, or if the web page is not found.
     */
    public static ArrayList<String> collectUrls(String urlString) {
        String readString; // to read in a line
        // The result is initially empty.
        ArrayList<String> result = new ArrayList<String>();
        try {
            URL url = new URL(urlString);
            BufferedReader in =
                new BufferedReader(new
                                   InputStreamReader(url.openStream()));
            //Loop invariant: The result contains all URLs read so far.
            while ((readString = in.readLine()) != null) {
                result.addAll(findUrls(readString));
            }
            in.close();
        } catch (IOException e) {
            System.out.println("no access to URL: " + urlString);
        } finally {
            //The result is returned whether or not an exception has been caught.
            return result;
        }
    }

    //Test for the given URL.
    public static void main(String[] args){
        String s = "http://cs.bham.ac.uk/~mmk/teaching/java/test.html";
        System.out.println(collectUrls(s));
    }
}
*****************************************************************************************
Write a class ExamQuestion with ﬁeld variables private String questionText and private int maximalMark. Write a suitable constructor, getters/setters for the two ﬁeld variables, and a public String toString() method which return for a question with maximally 10 marks and a questionText of "What is 2 times 3?" the string "Question (Maximal mark: 10): What is 2 times 3?".
/**
 *  The class deals with an exam question consisting of the question
 *  itself in form of a String and a maximal mark as an int. It will
 *  come in three different forms (and possibly more), each in a
 *  sub-class.
 *  @version 2018-11-09
 *  @author Manfred Kerber
 */
public class ExamQuestion {

    private String question;
    private int maximalMark;

    /**
     *  Constructor to set the two field variables.
     *  @param question The exam question in form of a String.
     *  @param maximalMark The maximal mark in form of an int.
     */
    public ExamQuestion(String question, int maximalMark) {
        this.question = question;
        this.maximalMark = maximalMark;
    }

    /**
     *  Getter for question.
     *  @return The question in form of a String.
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     *  Getter for maximal mark.
     *  @return The  maximal mark in form of an int.
     */
    public int getMaximalMark() {
        return this.maximalMark;
    }

    /**
     *  Setter for question.
     *  @param question The new question in form of a String.
     */
    public void setQuestion(String question) {
                this.question = question;
    }

    /**
     *  Setter for maximal mark.
     *  @param maximalMark The new maximal mark in form of an int.
     */
    public void setMaximalMark(int maximalMark) {
        this.maximalMark = maximalMark;
    }

    /**
     *  toString method of exam questions.
     *  @return The question displayed as specified.
     */
    public String toString() {
        return "Question (Maximal mark: " + getMaximalMark() + ")\n" +
            getQuestion() + "\n";
    }
}
************************************************************************************
Write a subclass ExamQuestionNumeric of class ExamQuestion, in which the answer is supposed to be a numerical answer of type int. That is, the user would have to enter the correct answer; however, no user interface is required here. Writeamethodpublic int mark(int value)inthesubclassthatreturnsfullmarksiftheanswer is correct and 0 otherwise. Furthermore write a suitable public String toString() method, making use of inheritance as far as possible.
E.g. assume a question: ExamQuestionNumeric q1 = new ExamQuestionNumeric("2+3 = ?", 10, 5); where 10 is the maximal number of marks and 5 the correct answer. The toString() method should return: "Question (Maximal mark: 10): 2+3 = ? Correct answer is: 5" q1.mark(5) should return 10, and q1.mark(6) should return 0.
/**
 *  In addition to the field variables for ExamQuestion, the
 *  ExamQuestionNumeric provides an answer in form of an additional
 *  field variable, the correctAnswer which will be compared to the
 *  answer provided by the candidate.
 *
 *  @version 2018-11-09
 *  @author Manfred Kerber
 */
public class ExamQuestionNumeric extends ExamQuestion {

    private int correctAnswer;
    /**
     * In order to construct an object we need four parts, the
     * question, the maximal mark, the possible answers, and the
     * correct answer. The first two are handed through to the
     * superclass via the super construct, the other is used to
     * set the corresponding field variable.
     * @param question The exam question.
     * @param maximalMark The maximal possible mark.
     * @param correctAnswer The correct answer to the question.
     */
    public ExamQuestionNumeric(String question,
                               int maximalMark,
                               int correctAnswer) {
        super(question, maximalMark);
        this.correctAnswer = correctAnswer;
    }

    /**
     *  mark is to return the maximal points if the answer
     *  provided agrees with the model answer provided, else 0.
     *  @param answerProvided The answer the candidate provides.
     *  @return Full marks (i.e., maximalMark) if the answer provided
     *  is equal to the correct answer, 0 else.
     */
    public int mark(int answerProvided) {
        if (this.correctAnswer == answerProvided) {
            return this.getMaximalMark();
        } else {
            return 0;
        }
    }

    /**
     *  toString method of numeric exam questions.
     *  @return The question displayed as specified.
     */
    @Override
    public String toString() {
        return super.toString() + "Correct answer is: " + correctAnswer + "\n";
    }

    /*
     *  A main method to test with a simple example.
     */
    public static void main(String[] args) {
        ExamQuestionNumeric q2 =
            new ExamQuestionNumeric("2+3 = ?", 10, 5);
        System.out.println(q2);
        System.out.println(q2.mark(5));
        System.out.println(q2.mark(6));
    }
}
*************************************************************************************
 WriteasubclassExamQuestionSimpleChoiceofclassExamQuestion,inwhichthepossibleAnswers are an ArrayList<String>, that is, the answer is supposed to be a choice from the list and the correctAnswer is of type int, representing the position of the correct answer (start counting from 1, since that is what humans normally do). Writeamethodpublic int mark(int value)inthesubclassthatreturnsfullmarksiftheanswer is correct and 0 otherwise. Furthermore, write a suitable public String toString() method, making use of inheritance as far as possible. For instance, if the answer to “2+3” is to be tested, it may be possible to oﬀer the values 4, 5, 10, and 20 as possible answers to an ArrayList<String> with ArrayList<String> a = new ArrayList<String>(); and a.add("4"); a.add("5"); a.add("10"); a.add("20"); the right answer to the same question would be 2, (remember, we start counting the answers from 1 here). That is, with ExamQuestionSimpleChoice q2 = new ExamQuestionSimpleChoice("2+3 = ?", 10, a, 2); we should get from q2.toString(): "Question (Maximal mark: 10): 2+3 = ? Possible answers are: [4, 5, 10, 20] Correct answer position is: 2 q2.mark(2) should result in the full 10 marks and q2.mark(3) in 0 marks.
 import java.util.ArrayList;

/**
 *  In addition to the field variables for ExamQuestion, the
 *  ExamQuestionSimleChoice provides an answer in form of two
 *  additional field variables, the possibleAnswers in form of an
 *  ArrayList of String and the correctAnswer as the number of the
 *  element in the ArrayList (start counting from 1, we start counting
 *  from 1, since is a part that is to interface with a user who would
 *  typically start counting from 1).
 *
 *  @version 2018-11-09
 *  @author Manfred Kerber
 */
public class ExamQuestionSimpleChoice extends ExamQuestion {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;
    /**
     * In order to construct an object we need four parts, the
     * question, the maximal mark, the possible answers, and the
     * position of the correct answer. The first two are handed
     * through to the superclass via the super construct, the other
     * two are used to set the corresponding field variables.
     * @param question The exam question.
     * @param maximalMark The maximal possible mark.
     * @param possibleAnswers The array list of possible answers from
     * which the candidate has to choose one.
     * @param correctAnswer The correct answer from the possible
     * answers, counted from 1.
     */
    public ExamQuestionSimpleChoice(String question,
                                    int maximalMark,
                                    ArrayList<String> possibleAnswers,
                                    int correctAnswer) {
        super(question, maximalMark);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    /**
     *  mark is to return the maximal points if the answer
     *  provided agrees with the model answer provided, else 0.
     *  @param answerProvided The answer the candidate provides.
     *  @return Full marks (i.e., maximalMark) if the answer provided
     *  is equal to the correct answer, 0 else.
     */
    public int mark(int answerProvided) {
        if (this.correctAnswer == answerProvided) {
            return this.getMaximalMark();
        } else {
            return 0;
        }
    }


    /**
     *  toString method of numeric exam questions.
     *  @return The question displayed as specified.
     */
    @Override
    public String toString() {
        return super.toString() +
            "Possible answers are: " + possibleAnswers + "\n" +
            "Correct answer position is: " + correctAnswer + "\n";
    }

    /*
     *  A main method to test with a simple example.
     */
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("4"); a.add("5"); a.add("10"); a.add("20");
        ExamQuestionSimpleChoice q1 =
            new ExamQuestionSimpleChoice("2+3 = ?", 10, a, 2);
        System.out.println(q1);
        System.out.println(q1.mark(2));
        System.out.println(q1.mark(3));
    }
}
*************************************************************************************
 WriteasubclassExamQuestionMultipleChoiceofclassExamQuestion,inwhichthepossibleAnswers are an ArrayList<String>, that is, the answer is supposed to be a choice from the list and the correctAnswers is of type ArrayList<Integer>, representing the positions of the correct answers (start counting from 1, since that is what humans normally do). Write a method public int mark(ArrayList<Integer> answersProvided) in the subclass that computesthepointsbyscalingthediﬀerencebetweenthenumberofcorrectanswersandthenumber of incorrect answers to the maximal points and rounding the points to the next int (but not returning less than 0). Furthermore, write a suitable public String toString() method, making use of inheritance as far as possible. For instance, if the solutions to "x*x = 4" are to be found, it may be possible to oﬀer the values −2, 0, 2, and 3 as possible answers to an ArrayList<String> with ArrayList<String> possibleAnswers = new ArrayList<String>(); and possibleAnswers.add("-2"); possibleAnswers.add("0"); possibleAnswers.add("2"); possibleAnswers.add("3"); the correct answers to the same question would be represented in an ArrayList<Integer> with ArrayList<Integer> correctAnswers = new ArrayList<Integer>(); and correctAnswers.add(1); correctAnswers.add(3);. That is, with ExamQuestionMultipleChoice question = new ExamQuestionSimpleChoice("x*x = 4", 10,possibleAnswers, correctAnswers); we should get from question.mark(givenAnswers) with an ArrayList<Integer> givenAnswers as indicated the following marks: • [1,3] full marks, i.e., 10. • [1], [3], [1,2,3], or [1,3,4] half marks, i.e, 5. • in all other cases (e.g., [2], [1,2], or [1,2,3,4]) no marks, i.e., 0.
 import java.util.ArrayList;

/**
 *  In addition to the field variables for ExamQuestion, the
 *  ExamQuestionMultipleChoice provides an answer in form of two
 *  additional field variables, the possibleAnswers in form of an
 *  ArrayList of String and the numbers of the correctAnswers in form
 *  of an ArrayList of the numbers of the elements in the ArrayList of
 *  answers (start counting from 1, we start counting from 1, since is
 *  a part that is to interface with a user who would typically start
 *  counting from 1).
 *
 *  @version 2018-11-09
 *  @author Manfred Kerber
 */
public class ExamQuestionMultipleChoice extends ExamQuestion {

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;
    /**
     * In order to construct an object we need four parts, the
     * question, the maximal mark, the possible answers, and the
     * positions of the correct answer. The first two are handed
     * through to the superclass via the super construct, the other
     * two are used to set the corresponding field variables.
     * @param question The exam question.
     * @param maximalMark The maximal possible mark.
     * @param possibleAnswers The array list of possible answers from
     * which the candidate has to choose one.
     * @param correctAnswers The correct answers from the possible
     * answers, counted from 1.
     */
    public ExamQuestionMultipleChoice(String question,
                                      int maximalMark,
                                      ArrayList<String> possibleAnswers,
                                      ArrayList<Integer> correctAnswers) {
        super(question, maximalMark);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    /**
     *  mark computes the points by scaling the difference between
     *  the number of correct answers and the number of incorrect
     *  answers to the maximal points (but not returning less than
     *  0).
     *  @param answersProvided The answers the candidate provides.
     *  @return The maximum of the 0 and the number of correct minus
     *  the number of incorrect answers scaled to the full marks.
     */
    public int mark(ArrayList<Integer> answersProvided) {
        int difference = 0;
        /*
         *  Loop invariant: difference states how many more correct
         *  than incorrect answers have been seen so far.
         */
        for (int el : answersProvided) {
            if (correctAnswers.contains(el)) {
                difference++;
            } else {
                difference--;
            }
        }
        if (difference <= 0) {
            /* If the difference is less than or equal to 0, a mark of
             * 0 is returned.
             */
            return 0;
        } else {
            // For bigger differences the difference is scaled up and rounded.
            return (int) Math.round(((double) difference) /
                                    correctAnswers.size()
                                    * getMaximalMark());
        }
    }

    /**
     *  toString method of numeric exam questions.
     *  @return The question displayed as specified.
     */
    @Override
    public String toString() {
        return super.toString() +
            "Possible answers are: " + possibleAnswers + "\n" +
            "Correct answer positions are: " + correctAnswers + "\n";
    }

    /*
     *  A main method to test with a simple example.
     */
    public static void main(String[] args) {
        ArrayList<String> q = new ArrayList<String>();
        q.add("-2"); q.add("0"); q.add("2"); q.add("3");
        ArrayList<Integer> correct = new ArrayList<Integer>();
             correct.add(1); correct.add(3);
        ExamQuestionMultipleChoice q1 =
            new ExamQuestionMultipleChoice("x*x = 4", 10, q, correct);
        ArrayList<Integer> given1 = new ArrayList<Integer>();
             given1.add(2); given1.add(3);
        ArrayList<Integer> given2 = new ArrayList<Integer>();
             given2.add(1); given2.add(3);
        ArrayList<Integer> given3 = new ArrayList<Integer>();
             given3.add(1);
        ArrayList<Integer> given4 = new ArrayList<Integer>();
            given4.add(1); given4.add(3); given4.add(4);
        ArrayList<Integer> given5 = new ArrayList<Integer>();
            given5.add(1); given5.add(2); given5.add(3); given5.add(4);

        System.out.println(q1);
        System.out.println(q1.mark(given1));
        System.out.println(q1.mark(given2));
        System.out.println(q1.mark(given3));
        System.out.println(q1.mark(given4));
        System.out.println(q1.mark(given5));
    }
}
*************************************************************************************
Exercise 4:(Debugging, 10%) IntheCanvassectionoftheworksheetyouﬁndazipﬁlewithadirectoryEx4withclassestomodelasimpleclasshierarchyforaBankAccountandaBankAccountWithOverdraft. There is also a class containing a main method for initial tests of the two classes. There is a problem with the implementation, since the balance seems not to be always computed correctly. What is the problem? Fix it.
**
 *
 * In the following we define again the BankAccount class
 * as we have seen it previously. A BankAccount consists of a
 * customer, a number (for the account number), a password, the
 * balance, and the currency.
 *
 * @author Manfred Kerber
 * @version 2018-11-08
 */
public class BankAccount {

    private String customer;
    private String number;
    private String password;
    private long balance;

    /**
     * there is some unclarity here whether we actually
     * represent pounds or pence (or another currency),
     * a better solution would be to represent the balance
     * separately for full pounds and pence
     */
    public static final String stringCurrency = "\u00A3";

    /**
     * This constructor creates a bank account from the
     * three parts, customer, accountNumber and password.
     * @param customer The customer of the BankAccount.
     * @param accountNumber The accountNumber of the BankAccount.
     * @param password The password to access the BankAccount.
     */
    public BankAccount (String customer,
			String accountNumber,
			String password) {
        this.customer = customer;
        this.number = accountNumber;
        this.password = password;
        this.balance = 0;
    }

    /**
     *  Getter for the balance
     *  @return The balance of the account.
     */
    public long getBalance(){
        return balance;
    }

    /**
     * Getter method to return the password. As a minimal protection
     * mechanism we make the getter private. It would be better to use
     * strong encryption to protect the password.
     * @return The password of the BankAccount.
     */
    private String getPassword(){
     return password;
    }

    /**
     * Method to compare the password with a given password.
     * @param password The password to which the password of the this
     * object is compared.
     * @return true if the password of the BankAccount agrees with the
     * argument, false else.
     */
    public boolean checkPassword(String password){
        return this.getPassword().equals(password);
    }

    /**
     *  Setter for the password, protected by making it private.
     *  @param password The new password for the account.
     */
    private void setPassword(String password){
	this.password = password;
    }

    /**
     *  Getter for the customer
     *  @return The customer of the account.
     */
    public String getCustomer() {
        return customer;
    }

    /**
     *  Getter for the account number
     *  @return The number of the account.
     */
    public String getNumber() {
        return number;
    }

    /**
     *  Method to return the currency universal to the class.
     *  @return The String of the currency.
     */
    public static String getStringCurrency() {
        return stringCurrency;
    }


    /**
     *  Setter for the balance.
     *  Note, this method is declared private for security reasons.
     *  @param amount The new amount in the account
     */
    public void setBalance(long amount) {
        balance = amount;
    }

    /**
     *   Method that adds amount to the current balance.
     *   @param amount The amount to be added to the current balance.
     */
    public void deposit(long amount) {
        setBalance(getBalance() + amount);
    }

    /**
     *  This method is to withdraw an amount from the current balance
     *  if the password is correct and the balance will not fall below zero.
     *  @param amount The amount to be withdrawn.
     *  @param password The password of the account
     */
    public void withdraw(long amount, String password) {
        if (checkPassword(password) && getBalance() >= amount){
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal rejected. " +
                               "Insufficient funds or wrong password");
        }
    }

    /**
     * Changes the password from old to new if the old password is
     * correct, an error message is printed else
     * @param oldPassword The current password
     * @param newPassword The updated password
     */
    public void changePassword(String oldPassword, String newPassword) {
        if (checkPassword(oldPassword)) {
            printPasswordChangeSuccessful();
            setPassword(newPassword);
        } else {
            printWrongPassword();
        }
    }

    /**
     * ***************************************************************
     * print functions. Separate the output from the actual program
     */

    /**
     *  prints the balance of a BankAccount
     */
    public void printBalance() {
        System.out.printf("The balance in %s's account is %s%d.\n",
                          customer, stringCurrency, balance);
    }

    /**
     *  prints that a deposit was successful.
     *  @param amount The amount deposited.
     */
    public void printDepositSuccessful(long amount) {
        /* prints that a deposit was successful
         */
        System.out.printf("The deposit of %s%d for %s was successful.\n",
                          stringCurrency,amount,customer);
    }

    /**
     *  prints that a withdrawal was successful.
     *  @param amount The amount withdrawn.
     */
    public void printWithdrawSuccessful(long amount) {
        /* prints that a withdrawal was successful
         */
        System.out.printf("The withdrawal of %s%d for %s was successful.\n",
                          stringCurrency,amount,customer);
    }

    /**
     *  prints that a transfer was successful.
     *  @param amount The amount transferred.
     */
    public void printTransferSuccessful(long amount) {
        /* prints that a withdrawal was successful
         */
        System.out.printf("The transfer of %s %d for %s was successful.\n",
                          stringCurrency,amount,customer);
    }

    /**
     *  prints that a change of password was successful.
     */
    public void printPasswordChangeSuccessful() {
        /* prints that a password change was successful.
         */
        System.out.printf("Change of password for %s was successful.\n",
                          customer);
    }

    /**
     *  prints that a change of password was unsuccessful.
     */
    public void printWrongPassword() {
        System.out.printf("The password you entered for %s was incorrect.\n",
                          customer);
    }

    /**
     *  toString method for an account
     *  @return A String representation of the account
     */
    public String toString() {
        return customer + "'s Account number: " + number +
            " balance: " + stringCurrency + balance;
    }

    /*****************************************************************
     * END of print functions. Separate the output from the actual program
     */
}
*****************************************************************************************
/**
 *  The problem is that we introduce a second balance field variable
 *  and a corresponding gettter and setter. This messes up the
 *  structure and the wrong variable is updated when money is
 *  withdrawn. As a solution we get rid of the extra field variable
 *  and the corresponding getter and setter.  In this case, we need,
 *  however, to declare the setter for the balance as public.  There
 *  are more sophisticated possibilities which require splitting up
 *  the withdrawal method so that the setter for the balance does not
 *  need to be used again in the overridden methods.
 *
 *  An extension of the BankAccount with field variable overDraftLimit
 *  and balance. The customer can withdraw money if the overDraftLimit
 *  plus the balance remains non-negative.
 *
 *  @version 2018-11-08
 *  @author Manfred Kerber
 */

public class BankAccountWithOverdraft extends BankAccount{

    private long overDraftLimit;
    //    private long balance;

    /**
     * This constructor creates a bank account from the
     * three parts, customer, accountNumber and password.
     * @param customer The customer of the BankAccount.
     * @param accountNumber The accountNumber of the BankAccount.
     * @param password The password to access the BankAccount.
     * @param overDraftLimit The maximal amount to which the account
     * can go in debit.
     */
    public BankAccountWithOverdraft(String customer,
                                    String accountNumber,
                                    String password,
                                    long overDraftLimit) {
        // First, call the constructor of the superclass
        // by using the `super' construct in the correct order.
        super(customer, accountNumber, password);
        this.overDraftLimit = overDraftLimit;
        setBalance((long) 100);
    }

    /* public long getBalance() {
     *        return this.balance;
     }*/

    /**
     *  Getter for the overDraftLimit
     *  @return The overDraftLimit of the account.
     */
    public long getOverDraftLimit() {
        return this.overDraftLimit;
    }

    /* private void setBalance(long balance) {
     *      this.balance = balance;
     }*/

    /**
     *  Setter for the balance.
     *  Note, this method is declared private for security reasons.
     *  @param The new balance of the account.
     */
    private void setOverDraftLimit(long overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    /**
     *  withdraw is changed to that an amount can be withdrawn as long
     *  as the overDraftLimit and the balance combined are greater
     *  than or equal to the amount to be withdrawn.
     *  @param amount The amount to be withdrawn.
     *  @param password The password of the account.
     */
    @Override
    public void withdraw(long amount, String password) {
        if (checkPassword(password) &&
            getOverDraftLimit() + getBalance() >= amount){
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal rejected. " +
                               "Insufficient funds or wrong password");
        }
    }

    /**
     *  toString method for an account with overdraft
     *  @return A String representation of the account
     */
    @Override
    public String toString() {
        return super.toString() +
            " overdraft limit: " + stringCurrency + getOverDraftLimit();
    }
}
***********************************************************************************************************
**
 * Some tests for the BankAccount and BankAccountWithOverDraft
 * @version 2018-11-08
 * @author Manfred Kerber
 */

public class BankAccountMain {

	/*   This class is to test the BankAccountWithOverdraft
	 *   extension. There are, however, problems, the numbers seem
	 *   not to be processed correctly.
	 */
	public static void main(String[] args){
                BankAccountWithOverdraft samsBankaccount =
                    new BankAccountWithOverdraft("Sam", "123456789",
                        "sesame open", 500);

                System.out.println("*** TESTS WITH SAM'S BANKACCOUNT");
                System.out.print("samBankaccount: ");  System.out.println(samsBankaccount);
		System.out.print("Balance: "); samsBankaccount.printBalance();
                System.out.print("Withdraw 100: "); samsBankaccount.withdraw(100,"sesame open");
		System.out.print("Balance: "); samsBankaccount.printBalance();
                System.out.print("Deposit 800: "); samsBankaccount.deposit(800);
		System.out.print("Balance: "); samsBankaccount.printBalance();
                System.out.print("Withdraw 100: "); samsBankaccount.withdraw(100,"sesame open");
		System.out.print("Balance: "); samsBankaccount.printBalance();
	}
}

***************************************************************************
JavaFX - Minimal javaseimport javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;

/**
 *  This is a minimal example how to start a new window.
 *  We define a colour for it and give it a title.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_application.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  The stage (that is, the window) is very simple, it contains a
 *  scene with a scene graph consisting only of an empty root.
 *  It has a size of horizontally 600 and vertically 300 pixels.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class Minimal extends Application{

    @Override
    /**
     *  The method starts the graphics for a particular window.
     *  The constructor for the scene takes as arguments
     *  a scene graph, the width (in pixels), and the height (in pixels).
     *  @param stage The window to be displayed.
     */
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);
        // Scene scene = new Scene(root);

        stage.setTitle("Minimal");
        stage.setScene(scene);
        scene.setFill(Color.RED);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
***************************************
DrawLine.java: A stage with a straight line
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;

/**
 *  This is an example how to display a straigh line with the
 *  two end points (x1,y1) and (x2,y2) with the constructor
 *  Line(x1,y1, x2,y2).
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_application.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawLine extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object
        Line line = new Line(100,150, 500,180);

        /* Alternatively, create an empty line by
         *  Line line = new Line();
         * and then set the 4 values:
         *  line.setStartX(100.0);
         *  line.setStartY(150.0);
         *  line.setEndX(500.0);
         *  line.setEndY(180.0);
         */

        // Create a Group (scene graph) with the line as single element.
        Group root = new Group(line);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Line");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application. If not present, start
     *  will be executed.
     */
    /*    public static void main(String[] args) {
     *   launch(args);
     *}
     */
}
*******************************
DrawPolyline.java: A stage with a single polyline
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polyline;

/**
 *  This is an example display how to display a polyline with the
 *  points (x0,y0), (x1,y1), ..., and (xn,yn) using constructors
 *  Polyline(x0,y0, x1,y1), Polyline(x0,y0, x1,y1, x2,y2), and so on.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_2d_shapes.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawPolyline extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object
        Polyline polyline = new Polyline(210,10, 10,210, 410,210);

        /* Alternatively, create an empty polyline by
         *  Polyline polyline = new Polyline();
         * and then add the 3 points:
         *  polyline.getPoints().addAll(new Double[]{
         *  210.0,10.0,
         *  10.0,210.0,
         *  410.0,210.0);
         */

        // Create a Group (scene graph) with the line as single element.
        Group root = new Group(polyline);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Polyline");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
**************************************
DrawSimplePolygon.java: A stage with a single polygon
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;

/**
 *  This is an example display how to display a polygon with the
 *  points (x0,y0), (x1,y1), ..., and (xn,yn) using constructors
 *  Polygon(x0,y0, x1,y1), Polygon(x0,y0, x1,y1, x2,y2), and so on.
 *  The main difference between a polygon and a polyline is that the
 *  polygon is closed, that is, there is a straight line from the last
 *  point (xn,yn) to the zeroth (x0,y0).
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/2dshapes_polygon.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawSimplePolygon extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object
        Polygon polygon = new Polygon(210,10, 10,210, 410,210);
        /* Alternatively, create an empty polygon by
         *  Polygon polygon = new Polygon();
         * and then add the 3 points:
         *  polygon.getPoints().addAll(new Double[]{
         *  210.0,10.0,
         *  10.0,210.0,
         *  410.0,210.0});
         */

        // Without the following command the polygon would be fully black.
        polygon.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        polygon.setStroke(Color.BLACK);

        // Create a Group (scene graph) with the polygon as single element.
        Group root = new Group(polygon);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Polygon");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
*********************************
DrawRectangle.java: A stage with a rectangle
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


/**
 *  This is an example display a rectangle with sides parallel
 *  to the x- or y-axes.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/2dshapes_rectangle.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawRectangle extends Application{

    /**
     * <pre>
     *  The method starts the graphics for a particular window.
     *  The constructor for a Rectangle takes 4 parameters:
     *  - the x-coordinate of the left upper corner
     *  - the y-coordinate of the left upper corner
     *  - the width
     *  - the height
     *
     *   A rectangle is created.
     *   (20,30)            100
     *      +---------------------------------+
     *      |                                 |
     *      |                                 |
     *      |                                 |
     *  50  |                                 |
     *      |                                 |
     *      |                                 |
     *      |                                 |
     *      +---------------------------------+
     *  </pre>
     *
     *  The scene takes as arguments a scene graph, the width (in
     *  pixels), and the height (in pixels).
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rectangle = new Rectangle(20, 30, 100, 50);
        rectangle.setFill(Color.BLUE);
        //Creating a scene graph, consisting of the rectangle only.
        Group root = new Group(rectangle);
        //The scene containing one scene graph
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Rectangle");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
**********************************************
DrawRegularPolygons.java: A stage with regular polygons
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;

/**
 *  This is an example how to create and display regular polygons.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/2dshapes_polygon.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawRegularPolygons extends Application{
    public static Polygon[] polygons;

    /**
     *  A regular polygon with vertices number edges and corners is created.
     *  @param vertices The number of vertices (which is also the number of edges).
     *  @param rotation The counterclockwise rotation of the polygon, e.g., with Math.PI/2 the polygon is rotated by 90 degrees.
     *  @param scale Without a scale greater than 1 the whole polygon is only a single pixel.
     *  @param xOffset The amount of pixels the polygon is moved on the x-axis to the right.
     *  @param yOffset The amount of pixels the polygon is moved on the y-axis down.
     *  @return The regular polygon defined by the parameters above.
     */
    public static Polygon makePolygon(int vertices, double rotation, double scale, double xOffset, double yOffset) {
	Double[] coordinates = new Double[2*vertices];

        /* Define a one-dimensional array that can be used to make
         * a polygon (or a polyline). In a polygon the edges are closed.
         * Here all vertices are equally distributed on a circle.
         */
	for (int i = 0; i< vertices; i++){
            coordinates[2*i] = xOffset +
                scale * Math.cos(rotation + 2*i*Math.PI/vertices);
            coordinates[2*i+1] = yOffset +
                scale * Math.sin(rotation + 2*i*Math.PI/vertices);
        }

        // Create an empty polygon
        Polygon polygon = new Polygon();
        // Add the points specified by the coordinates
        polygon.getPoints().addAll(coordinates);
        // Without the following command the polygon would be fully black.
        polygon.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        polygon.setStroke(Color.BLACK);
        return polygon;
    }

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {

        // Create a Group (scene graph) with the polygons as elements.
        Group root = new Group();
        for (Polygon polygon : polygons) {
            root.getChildren().add(polygon);
        }

        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Polygons");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        Polygon polygon1 = makePolygon( 7, 0.0, 100.0, 130.0, 130.0);
        Polygon polygon2 = makePolygon(12, 0.3,  80.0, 330.0, 130.0);
        Polygon[] poly = {polygon1, polygon2};
        polygons = poly;
        launch(args);
    }
}
***************************************************************
DrawCircleEllipse.java: A stage with a circle and an oval (ellipse)
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

/**
 *  This is an example how to display a circle and an ellipse.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_2d_shapes.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawCircleEllipse extends Application{

    /**
     *  A circle is defined by the coordinates of the center and the
     *  radius.
     *
     *  Likewise an ellipse is defined by the coordinates of the
     *  centre the radiusX and the radiusY.
     *
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(200, 150, 100);
        circle.setFill(Color.BLUE);
        Ellipse ellipse = new Ellipse(400, 150, 150, 100);
        // Without the following command the ellipse would be fully black.
        ellipse.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        ellipse.setStroke(Color.BLACK);

        //Creating a scene graph, consisting of the circle and the ellipse.
        Group root = new Group(circle, ellipse);
        //The scene containing one scene graph
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Circle and Ellipse");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}


******************************
DisplayText.java: An stage is created and some text is added
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *  This is an example of how to add text to a group.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_text.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DisplayText extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a text object at position (100,150)
        Text text = new Text(100.0,150.0, "Hello World");

        //Changing the font to "verdana" at a size of 70 pt
        text.setFont(Font.font("verdana", 70));

        /* FontWeight accepts nine values: BLACK,BOLD,EXTRA_BOLD,
         * EXTRA_LIGHT,MEDIUM, NORMAL, SEMI_BOLD, and THIN.
         * FontPosture two values: REGULAR and ITALIC.
         */
        //text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 100));
        //The text gets a horizontal line in the middle through it.
        //text.setStrikethrough(true);

        //The text is underlined.
        text.setUnderline(true);

        // Create a Group (scene graph) with the text as single element.
        Group root = new Group(text);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 900, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Text");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
*****************************
Colour.java: How to deal with rgb colour
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


/**
 * In this class, we test predefined colours. Some are predefined by
 * constants such such as BLACK, RED and so on. They can also be
 * defined by Color(r,g,b) where r,g,b are values between 0 and
 * 255. r=red, g=green, and b=blue. 0,0,0 stands for black, 255,0,0
 * for red, 0,255,0 for green, and 0,0,255 blue with other values in
 * between. Values such as 100,100,100 represent different levels of grey.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_colors.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class Colour extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Setting text colours to blue, red, and green.
        Text blue = new Text(20.0,30.0, "Blue");
        Text red = new Text(20.0,70.0, "Red");
        Text green = new Text(20.0,110.0, "Green");
        blue.setFill(Color.BLUE); blue.setFont(Font.font("verdana", 30));
        red.setFill(Color.RED); red.setFont(Font.font("verdana", 30));
        green.setFill(Color.GREEN); green.setFont(Font.font("verdana", 30));
        // Create a Group (scene graph) with the text as single element.
        Group root = new Group(blue,red,green);

        int[]      r = {0,255,  0,  0,255,255,  0,255,255,255,200,128, 64, 32,164};
        int[]      g = {0,  0,255,  0,200,175,255,  0,255,255,200,128, 64, 32,255};
        int[]      b = {0,  0,  0,255,  0,175,255,255,  0,255,200,128, 64, 32, 64};
        boolean[] bg = {false,false,false,false,false,false,false,false,true,true,false,false,false,false,false};

        for (int i = 0; i < 15; i++){
            Text text = new Text(120.0,30.0+ 40*i, String.format("rgb(%d,%d,%d)", r[i], g[i], b[i]));
            Color colour = Color.rgb(r[i],g[i],b[i]);
            text.setFill(colour); text.setFont(Font.font("verdana", 30));
            if (bg[i]) {
                Rectangle rect = new Rectangle(120.0,40*i, 2000, 40);
                rect.setFill(Color.BLACK);
                root.getChildren().add(rect);

            }
            root.getChildren().add(text);
        }


        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 700);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Text");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
*************************************************
Grid.java: Translating two-dimensional arrays into coloured dots.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

/**
 *  This is an example of to display a two-dimensional array of zeroes, ones, and twos as big coloured dots.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class Grid extends Application{
    /**
     *  grid is the static variable that is used to store the
     *  2-dimensional array to be displayed by coloured dots.
     */
    private static int[][] grid;
    /** OFFSET moves the board on the x-axis and y-axis out of the left upper corner.
     *  It is also used as the distance between the centres of two adjacent circles.
     */
    public static final int OFFSET = 90;
    /** RADIUS is the radius of the circles.
     */
    public static final int radius = 40;

    /**
     *  @param stage The window to be displayed.
     */
   @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        for (int i = 0; i< grid.length; i++) {
            for (int j = 0; j< grid[i].length; j++) {
                Circle circle = new Circle(OFFSET+j*OFFSET,OFFSET+i*OFFSET, radius);
                if (grid[i][j] == 1) {
                    circle.setFill(Color.GREEN);
                } else if (grid[i][j] == 2) {
                    circle.setFill(Color.RED);
                }
                root.getChildren().add(circle);
            }
        }

        //Creating a scene graph, consisting of the circles.
        //The scene containing one scene graph
        int SCENE_WIDTH  = OFFSET + OFFSET * (grid[0].length + 1);
        int SCENE_HEIGHT = OFFSET + OFFSET * (grid.length + 2);
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        stage.setTitle("Dots");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to initialize a matrix and to launch the application.
     */
    public static void main(String[] args) {
                int[][] grid1 = {{0,1,0,1,1},
                                 {1,2,0,0,1},
                                 {1,1,0,1,2,1}};
                grid = grid1;
        launch(args);
     }
}
*******************************************************
Draw Function graph
import java.util.function.Function;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;

/**
 *  This shows how to display a function such as x goes to x*x.
 *  It is done by drawing the x-axis and the y-axis as well as
 *  defining a polyline from the function and then displaying the
 *  polyline.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class FunctionGraph extends Application{

    /** X_SIZE is the width of the panel in pixels.
     */
    public static final int X_SIZE = 600;
    /** Y_SIZE the height of the panel in pixels.
     */
    public static final int Y_SIZE = 600;
    /** dYSize adds some extra to the y-size of the window in order to foster for the header.
     */
    public static final int D_Y_SIZE = 50;
    /**
     *  f is the function to be displayed. We introduce it as a global
     *  variable so that it can be used in the start method, but be
     *  defined in the main method.
     */
    private static Function<Double,Double> f;
     /**
      * a is the left border of the interval on which the function is
      * to be displayed. We introduce it as a global variable so that
      * it can be used in the start method, but be defined in the main
      * method.
      */
    private static double a;
    /**
      * b is the right border of the interval on which the function is
      * to be displayed. We introduce it as a global variable so that
      * it can be used in the start method, but be defined in the main
      * method.
      */
    private static double b;
    /** min is an approximation of the minimum of f in the interval
     * [a,b]. It is introduced as a global variable so that it does
     * not have to be recomputed.
     */
    private static double min;
    /** min is an approximation of the minimum of f in the interval
     * [a,b]. It is introduced as a global variable so that it does
     * not have to be recomputed.
     */
    private static double max;
    /**
     *  n is the granularity. More concretely, the interval [a,b] will
     *  be subdivided in n parts and on each the function will be
     *  approximated by a straight line.
     */
    private static int n;
    /**
     *  The polyline will be the approximation of the function and be displayed.
     */
    private static Polyline polyline;

    /**
     *   The method approximates the maximal value of the function f
     *   in the interval [a,b] by dividing the interval in n equal
     *   parts and evaluating the function at the (n+1) different
     *   elements. It is assumed that b is greater than a.
     *   @param f The function to be evaluated.
     *   @param n The number of points to be evaluated.
     *   @param a The lowest x-value to be considered.
     *   @param b The highest x-value to be considered.
     *   @return An approximation of the maximal value of f in the
     *   interval [a,b] (evaluated at a and b, and at the n-1
     *   equidistant values in between).
     */
    public static double max(Function<Double,Double> f, int n,
                             double a, double b) {
        double x, y;
        double max = f.apply(a);
        double delta = (b - a)/n;
        /* Loop invariant: max contains the maximum of all values of
         * the function f(x) considered so far, i.e., the maximum of
         * f(a), f(a + delta), f(a + 2 * delta), ..., f(a + i * delta).
         * Consider for i = 0: f(a); for i = n: f(b).
         */
        for (int i = 0; i <= n ; i++){
            x = a + delta * i;
            y = f.apply(x);
            if (y > max) {
                max = y;
            }
        }
        return max;
    }

    /**
     *   The method approximates the minimal value of the function f
     *   in the interval [a,b] by dividing the interval in n equal
     *   parts and evaluating the function at the (n+1) different
     *   elements. It is assumed that b is greater than a.
     *   @param f The function to be evaluated.
     *   @param n The number of points to be evaluated.
     *   @param a The lowest x-value to be considered.
     *   @param b The highest x-value to be considered.
     *   @return An approximation of the minimal value of f in
     *   the interval [a,b] (evaluated at a and b, and at the n-1
     *   equidistant values in between).
     */
    public static double min(Function<Double,Double> f, int n,
                             double a, double b) {
        double x, y;
        double min = f.apply(a);
        double delta = (b - a)/n;
        /* Loop invariant: min contains the minimum of all values of
         * the function f(x) considered so far, i.e., the minimum of
         * f(a), f(a + delta), f(a + 2 * delta), ..., f(a + i * delta).
         * Consider for i = 0: f(a); for i = n: f(b).
         */
        for (int i = 0; i <= n ; i++){
            x = a + delta * i;
            y = f.apply(x);
            if (y < min) {
                min = y;
            }
        }
        return min;
    }

    /**
     *   The method generates a polyline corresponding to the graph of
     *   function f in the interval [a,b]
     *   @param f The function to be drawn.
     *   @param n The number of equidistant intervals to be drawn.
     *   @param a The minimal x-value in the interval.
     *   @param b The maximal x-value in the interval.
     *   @return The polyline corresponding to the function f over the
     *   interval [a,b] with granularity n.
     */
    public static Polyline functionToPolyline(Function<Double,Double> f,
                                    int n, double a, double b) {
        if (a >= b) {
            throw new IllegalArgumentException();
        } else {
            double[] points = new double[2*(n+1)];
            double x, y;
            double max = max(f,n,a,b);
            double min = min(f,n,a,b);
            /* Loop: Add x and y values to the corresponding arrays
             * for a, b and n-1 equidistant values in between.
             */
            for (int i = 0; i <= n ; i++){
                x = a + (b - a) * i / n;
                y = f.apply(x);
                points[2*i]   = (x-a) * X_SIZE/(b-a);
                points[2*i+1] = (max - y)* Y_SIZE/(max-min);
            }
            /* Draw graph */
            return new Polyline(points);
        }
    }

    /**
     *   The method draws the x-axis if 0 is in the interval [min,max]
     *   It is assumed that the function is not constant.
     *   @param root The group to which the x-axis is to be added.
     */
    public static void drawXAxis(Group root){
        if (min <= 0 && max >=0 && min != max) {
            Line line = new Line(0, max * Y_SIZE/(max-min),
                                 X_SIZE, max * Y_SIZE/(max-min));
            root.getChildren().add(line);
        }
    }

    /**
     *   The method draws the y-axis if 0 is in the interval [a,b]
     *   @param root The group to which the y-axis is to be added.
     */
    public static void drawYAxis(Group root) {
        if (a <= 0 && b >= 0 && a != b){
            Line line = new Line(b * X_SIZE/(b-a), 0,
                                 b * X_SIZE/(b-a), Y_SIZE);
            root.getChildren().add(line);
        }
    }

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object

        // Create a Group (scene graph) with the line as single element.
        Group root = new Group(polyline);
        drawXAxis(root);
        drawYAxis(root);

        // The scene consists of just one group.
        Scene scene = new Scene(root, X_SIZE,Y_SIZE+D_Y_SIZE);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Function Graph");
        stage.setScene(scene);
        stage.show();
    }


    /**
     *  The method gives values to the static variables a, b, n, min,
     *  max, and polyline.
     *  @param f The function to be displayed.
     *  @param numberOfValues The number of points on the polyline.
     *  @param left The left border of the interval to be displayed.
     *  @param right The right border of the interval to be displayed.
     */
    public static void setValues(Function<Double, Double> f,
                                 int numberOfValues, double left, double right){
            a = left;
            b = right;
            n = numberOfValues;
            min = min(f,n,a,b);
            max = max(f,n,a,b);
            polyline = functionToPolyline(f, numberOfValues, left, right);
        }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        //f = x -> {return Math.exp(x/(x*x +2));};
        Function<Double, Double> f1 = x -> {return x*x*x - 8 * x * x;};
        //setValues(f1, 200, -20, 20);
        setValues(f1, 200, -2, 9);
        launch(args);
    }
}
***********************************************
Animation exampleimport javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;

/**
 *  This is an example how to create and display regular polygons.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_animations.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-29
 *  @author Manfred Kerber
 */
public class AnimationExample extends Application{

    /**
     *  polygons must contain at least two elements, the zeroth with
     *  be rotating, the first shrinking and expanding.  We define it
     *  at a static variable so that it can be used in the start
     *  methods, but be defined in the main method.
     */
    public static Polygon[] polygons;

    /**
     *  A regular polygon with vertices number edges and corners is created.
     *  @param vertices The number of vertices (which is also the number of edges).
     *  @param rotation The counterclockwise rotation of the polygon, e.g., with Math.PI/2 the polygon is rotated by 90 degrees.
     *  @param scale Without a scale greater than 1 the whole polygon is only a single pixel.
     *  @param xOffset The amount of pixels the polygon is moved on the x-axis to the right.
     *  @param yOffset The amount of pixels the polygon is moved on the y-axis down.
     *  @return The regular polygon defined by the parameters above.
     */
    public static Polygon makePolygon(int vertices, double rotation, double scale, double xOffset, double yOffset) {
	Double[] coordinates = new Double[2*vertices];

        /* Define a one-dimensional array that can be used to make
         * a polygon (or a polyline). In a polygon the edges are closed.
         * Here all vertices are equally distributed on a circle.
         */
	for (int i = 0; i< vertices; i++){
            coordinates[2*i] = xOffset +
                scale * Math.cos(rotation + 2*i*Math.PI/vertices);
            coordinates[2*i+1] = yOffset +
                scale * Math.sin(rotation + 2*i*Math.PI/vertices);
        }

        // Create an empty polygon
        Polygon polygon = new Polygon();
        // Add the points specified by the coordinates
        polygon.getPoints().addAll(coordinates);
        // Without the following command the polygon would be fully black.
        polygon.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        polygon.setStroke(Color.BLACK);
        return polygon;
    }

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a rotate transition
        RotateTransition rotateTransition = new RotateTransition();

        //Setting the duration for the transition
        rotateTransition.setDuration(Duration.millis(10000));

        //Setting the angle of the rotation
        rotateTransition.setByAngle(360);

        //Setting the cycle count for the transition
        rotateTransition.setCycleCount(5);

        //Setting auto reverse value to false
        rotateTransition.setAutoReverse(false);

        //Setting the nodes for the transition
        rotateTransition.setNode(polygons[0]);
        //Playing the animation
        rotateTransition.play();

        //Creating scale Transition
        ScaleTransition scaleTransition = new ScaleTransition();

        //Setting the duration for the transition
        scaleTransition.setDuration(Duration.millis(1000));

        //Setting the node for the transition
        scaleTransition.setNode(polygons[1]);

        //Setting the dimensions for scaling
        scaleTransition.setByY(-0.5);
        scaleTransition.setByX(-0.5);

        //Setting the cycle count for the translation
        scaleTransition.setCycleCount(50);

        //Setting auto reverse value to true
        scaleTransition.setAutoReverse(true);



        // Create a Group (scene graph) with the polygons as elements.
        Group root = new Group();
        for (Polygon polygon : polygons) {
            root.getChildren().add(polygon);
        }

        //Playing the rotate animation
        rotateTransition.play();

        //Playing the scale animation
        scaleTransition.play();

        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Animated Polygons");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        Polygon polygon1 = makePolygon( 7, 0.0, 100.0, 130.0, 130.0);
        Polygon polygon2 = makePolygon(12, 0.3,  80.0, 330.0, 130.0);
        Polygon[] poly = {polygon1, polygon2};
        polygons = poly;
        launch(args);
    }
}
*********************************************Java
JavaFX
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

/**
 *  Realization of an EventHandler by an inner class.
 *  This class contains a start method that puts a single Button in a
 *  Group, which forms a Scene that is associated with a Stage. The
 *  Button is linked to an EventHandler that is defined as a Function.
 *  Essentially, when the button is clicked the program is terminated
 *  by the System.exit(1) command.
 *
 *  The example is adapted from the 4th edition of "Absolute Java" by
 *  Walter Savitch, p.971.
 *
 *  @version 2018-11-29
 *  @author Manfred Kerber
 */
public class DisplayEndButton extends Application {
    @Override
    /**
     *  The start method.
     *  @param stage The stage on which the button is displayed.
     */
    public void start(Stage stage) throws Exception {
        // A new Button is created with the label "End"
        Button endButton = new Button("End");
        // The position of the Button is determined.
        endButton.setLayoutX(60);
        endButton.setLayoutY(60);

        /*
         * The event that triggers the EventHandler eventHandlerEnd is
         * that the endButton is clicked with the mouse.
         * The EventHandler is defined in the constructor as an inner class.
         */
        EventHandler<MouseEvent> eventHandlerEnd =
            new EventHandler<MouseEvent>() {
                @Override
                /**
                 *  The eventHandlerEnd is defined by the method
                 *  handle which takes a MouseEvent as parameter. In
                 *  case of a suitable mouse event, the two commands
                 *  to firstly print something and secondly to
                 *  terminate the program are executed.
                 */
                public void handle(MouseEvent e) {
                    System.out.println("This is the end.");
                    System.exit(1);
                }
            };

        /*
         * The event that triggers the EventHandler eventHandlerEnd is
         * that the endButton is clicked with the mouse.
         */
        endButton.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandlerEnd);

        //Creating a scene graph, consisting of the endButton.
        Group root = new Group(endButton);
        //The scene containing one scene graph
        Scene scene = new Scene(root, 150, 150);
        stage.setTitle("End");
        stage.setScene(scene);
        stage.show();
    }
}
*********************************
Java FX function
import java.util.function.Function;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

/**
 *  Realization of an EventHandler by a Function.
 *  This class contains a start method that puts a single Button in a
 *  Group, which forms a Scene that is associated with a Stage. The
 *  Button is linked to an EventHandler that is defined as a Function.
 *  Essentially, when the button is clicked the program is terminated
 *  by the System.exit(1) command.
 *
 *  @version 2018-11-29
 *  @author Manfred Kerber
 */
public class DisplayEndButton extends Application{
    /**
     *  The eventHandlerEnd constant is a function that maps an event
     *  to the two command to firstly print something and secondly to
     *  terminate the program.
     */
    private final EventHandler<MouseEvent> eventHandlerEnd = e -> {
        System.out.println("This is the end.");
        System.exit(1);
    };

    @Override
    /**
     *  The start method.
     *  @param stage The stage on which the button is displayed.
     */
    public void start(Stage stage) throws Exception {
        // A new Button is created with the label "End"
        Button endButton = new Button("End");
        // The position of the Button is determined.
        endButton.setLayoutX(60);
        endButton.setLayoutY(60);

        /*
         * The event that triggers the EventHandler eventHandlerEnd is
         * that the endButton is clicked with the mouse.
         */
        endButton.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandlerEnd);

        //Creating a scene graph, consisting of the endButton.
        Group root = new Group(endButton);
        //The scene containing one scene graph
        Scene scene = new Scene(root, 150, 150);
        stage.setTitle("End");
        stage.setScene(scene);
        stage.show();
    }

    /**
     *  main method to call the start method.
     *  @param args Passed on to launch. Not used in the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
******************************************************
Polyline FX
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polyline;

/**
 *  This is an example display how to display a polyline with the
 *  points (x0,y0), (x1,y1), ..., and (xn,yn) using constructors
 *  Polyline(x0,y0, x1,y1), Polyline(x0,y0, x1,y1, x2,y2), and so on.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_2d_shapes.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawPolyline extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object 
        Polyline polyline = new Polyline(210,10, 10,210, 410,210); 
         
        /* Alternatively, create an empty polyline by
         *  Polyline polyline = new Polyline(); 
         * and then add the 3 points:
         *  polyline.getPoints().addAll(new Double[]{
         *  210.0,10.0,
         *  10.0,210.0,
         *  410.0,210.0);
         */
         
        // Create a Group (scene graph) with the line as single element.
        Group root = new Group(polyline);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Polyline");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}
****************************************************************
DrawLine JavaFx
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;

/**
 *  This is an example how to display a straigh line with the
 *  two end points (x1,y1) and (x2,y2) with the constructor
 *  Line(x1,y1, x2,y2).
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_application.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawLine extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object 
        Line line = new Line(100,150, 500,180); 
         
        /* Alternatively, create an empty line by
         *  Line line = new Line(); 
         * and then set the 4 values:
         *  line.setStartX(100.0); 
         *  line.setStartY(150.0); 
         *  line.setEndX(500.0); 
         *  line.setEndY(180.0); 
         */
         
        // Create a Group (scene graph) with the line as single element.
        Group root = new Group(line);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Line");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application. If not present, start
     *  will be executed.
     */
    /*    public static void main(String[] args) { 
     *   launch(args);
     *}
     */
}
************************************************
SimplePolygon Java FX
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color; 

/**
 *  This is an example display how to display a polygon with the
 *  points (x0,y0), (x1,y1), ..., and (xn,yn) using constructors
 *  Polygon(x0,y0, x1,y1), Polygon(x0,y0, x1,y1, x2,y2), and so on.
 *  The main difference between a polygon and a polyline is that the
 *  polygon is closed, that is, there is a straight line from the last
 *  point (xn,yn) to the zeroth (x0,y0).
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/2dshapes_polygon.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawSimplePolygon extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object 
        Polygon polygon = new Polygon(210,10, 10,210, 410,210); 
        /* Alternatively, create an empty polygon by
         *  Polygon polygon = new Polygon(); 
         * and then add the 3 points:
         *  polygon.getPoints().addAll(new Double[]{
         *  210.0,10.0,
         *  10.0,210.0,
         *  410.0,210.0});
         */

        // Without the following command the polygon would be fully black.
        polygon.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        polygon.setStroke(Color.BLACK);
         
        // Create a Group (scene graph) with the polygon as single element.
        Group root = new Group(polygon);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Polygon");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}
*********************************************
DrawRectangle JavaFx
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color; 


/**
 *  This is an example display a rectangle with sides parallel 
 *  to the x- or y-axes.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/2dshapes_rectangle.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawRectangle extends Application{

    /**
     * <pre>
     *  The method starts the graphics for a particular window.
     *  The constructor for a Rectangle takes 4 parameters: 
     *  - the x-coordinate of the left upper corner 
     *  - the y-coordinate of the left upper corner 
     *  - the width
     *  - the height
     *
     *   A rectangle is created.
     *   (20,30)            100
     *      +---------------------------------+
     *      |                                 |
     *      |                                 |
     *      |                                 |
     *  50  |                                 |
     *      |                                 |
     *      |                                 |
     *      |                                 |
     *      +---------------------------------+
     *  </pre>
     *
     *  The scene takes as arguments a scene graph, the width (in
     *  pixels), and the height (in pixels).
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rectangle = new Rectangle(20, 30, 100, 50);
        rectangle.setFill(Color.BLUE);
        //Creating a scene graph, consisting of the rectangle only. 
        Group root = new Group(rectangle);
        //The scene containing one scene graph
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Rectangle");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}
*********************************************
Draw RegularPolygon
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color; 

/**
 *  This is an example how to create and display regular polygons.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/2dshapes_polygon.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawRegularPolygons extends Application{
    public static Polygon[] polygons;

    /**
     *  A regular polygon with vertices number edges and corners is created.
     *  @param vertices The number of vertices (which is also the number of edges).
     *  @param rotation The counterclockwise rotation of the polygon, e.g., with Math.PI/2 the polygon is rotated by 90 degrees.
     *  @param scale Without a scale greater than 1 the whole polygon is only a single pixel.
     *  @param xOffset The amount of pixels the polygon is moved on the x-axis to the right.
     *  @param yOffset The amount of pixels the polygon is moved on the y-axis down.
     *  @return The regular polygon defined by the parameters above.
     */   
    public static Polygon makePolygon(int vertices, double rotation, double scale, double xOffset, double yOffset) {
	Double[] coordinates = new Double[2*vertices];

        /* Define a one-dimensional array that can be used to make
         * a polygon (or a polyline). In a polygon the edges are closed.
         * Here all vertices are equally distributed on a circle.
         */
	for (int i = 0; i< vertices; i++){
            coordinates[2*i] = xOffset + 
                scale * Math.cos(rotation + 2*i*Math.PI/vertices);
            coordinates[2*i+1] = yOffset + 
                scale * Math.sin(rotation + 2*i*Math.PI/vertices);
        }

        // Create an empty polygon
        Polygon polygon = new Polygon();
        // Add the points specified by the coordinates
        polygon.getPoints().addAll(coordinates);
        // Without the following command the polygon would be fully black.
        polygon.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        polygon.setStroke(Color.BLACK);
        return polygon;
    }
    
    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
         
        // Create a Group (scene graph) with the polygons as elements.
        Group root = new Group();
        for (Polygon polygon : polygons) {
            root.getChildren().add(polygon);
        }
        
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Polygons");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        Polygon polygon1 = makePolygon( 7, 0.0, 100.0, 130.0, 130.0);
        Polygon polygon2 = makePolygon(12, 0.3,  80.0, 330.0, 130.0);
        Polygon[] poly = {polygon1, polygon2};
        polygons = poly;
        launch(args);
    }
}
*******************************************************************
Draw Eclipse JavaFx
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color; 

/**
 *  This is an example how to display a circle and an ellipse.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_2d_shapes.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawCircleEllipse extends Application{

    /**
     *  A circle is defined by the coordinates of the center and the
     *  radius.
     *
     *  Likewise an ellipse is defined by the coordinates of the
     *  centre the radiusX and the radiusY.
     *
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(200, 150, 100);
        circle.setFill(Color.BLUE);
        Ellipse ellipse = new Ellipse(400, 150, 150, 100);
        // Without the following command the ellipse would be fully black.
        ellipse.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        ellipse.setStroke(Color.BLACK);

        //Creating a scene graph, consisting of the circle and the ellipse. 
        Group root = new Group(circle, ellipse);
        //The scene containing one scene graph
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Circle and Ellipse");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}



*********************************************************************
Colour JavaFx
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color; 


/**
 * In this class, we test predefined colours. Some are predefined by
 * constants such such as BLACK, RED and so on. They can also be
 * defined by Color(r,g,b) where r,g,b are values between 0 and
 * 255. r=red, g=green, and b=blue. 0,0,0 stands for black, 255,0,0
 * for red, 0,255,0 for green, and 0,0,255 blue with other values in
 * between. Values such as 100,100,100 represent different levels of grey.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_colors.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class Colour extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Setting text colours to blue, red, and green.
        Text blue = new Text(20.0,30.0, "Blue");
        Text red = new Text(20.0,70.0, "Red");
        Text green = new Text(20.0,110.0, "Green");
        blue.setFill(Color.BLUE); blue.setFont(Font.font("verdana", 30));
        red.setFill(Color.RED); red.setFont(Font.font("verdana", 30));
        green.setFill(Color.GREEN); green.setFont(Font.font("verdana", 30));
        // Create a Group (scene graph) with the text as single element.
        Group root = new Group(blue,red,green);

        int[]      r = {0,255,  0,  0,255,255,  0,255,255,255,200,128, 64, 32,164};
        int[]      g = {0,  0,255,  0,200,175,255,  0,255,255,200,128, 64, 32,255};
        int[]      b = {0,  0,  0,255,  0,175,255,255,  0,255,200,128, 64, 32, 64};
        boolean[] bg = {false,false,false,false,false,false,false,false,true,true,false,false,false,false,false};

        for (int i = 0; i < 15; i++){
            Text text = new Text(120.0,30.0+ 40*i, String.format("rgb(%d,%d,%d)", r[i], g[i], b[i]));
            Color colour = Color.rgb(r[i],g[i],b[i]);
            text.setFill(colour); text.setFont(Font.font("verdana", 30));
            if (bg[i]) {
                Rectangle rect = new Rectangle(120.0,40*i, 2000, 40);
                rect.setFill(Color.BLACK);
                root.getChildren().add(rect);

            }
            root.getChildren().add(text);
        }

         
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 700);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Text");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}

     
*****************************************************************
GridJava Fx
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color; 

/**
 *  This is an example of to display a two-dimensional array of zeroes, ones, and twos as big coloured dots.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class Grid extends Application{
    /**
     *  grid is the static variable that is used to store the
     *  2-dimensional array to be displayed by coloured dots.
     */
    private static int[][] grid;
    /** OFFSET moves the board on the x-axis and y-axis out of the left upper corner.
     *  It is also used as the distance between the centres of two adjacent circles.
     */
    public static final int OFFSET = 90;
    /** RADIUS is the radius of the circles.
     */
    public static final int radius = 40;

    /**
     *  @param stage The window to be displayed.
     */
   @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        for (int i = 0; i< grid.length; i++) {
            for (int j = 0; j< grid[i].length; j++) {
                Circle circle = new Circle(OFFSET+j*OFFSET,OFFSET+i*OFFSET, radius);
                if (grid[i][j] == 1) {
                    circle.setFill(Color.GREEN);
                } else if (grid[i][j] == 2) {
                    circle.setFill(Color.RED);
                }
                root.getChildren().add(circle);
            }
        }

        //Creating a scene graph, consisting of the circles. 
        //The scene containing one scene graph
        int SCENE_WIDTH  = OFFSET + OFFSET * (grid[0].length + 1);
        int SCENE_HEIGHT = OFFSET + OFFSET * (grid.length + 2);
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        stage.setTitle("Dots");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to initialize a matrix and to launch the application.
     */
    public static void main(String[] args) {
                int[][] grid1 = {{0,1,0,1,1},
                                 {1,2,0,0,1},
                                 {1,1,0,1,2,1}};
                grid = grid1;
        launch(args);
     }
}
**********************************************************************
Rectangle JavaFX
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color; 


/**
 *  This is an example display a rectangle with sides parallel 
 *  to the x- or y-axes.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/2dshapes_rectangle.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawRectangle extends Application{

    /**
     * <pre>
     *  The method starts the graphics for a particular window.
     *  The constructor for a Rectangle takes 4 parameters: 
     *  - the x-coordinate of the left upper corner 
     *  - the y-coordinate of the left upper corner 
     *  - the width
     *  - the height
     *
     *   A rectangle is created.
     *   (20,30)            100
     *      +---------------------------------+
     *      |                                 |
     *      |                                 |
     *      |                                 |
     *  50  |                                 |
     *      |                                 |
     *      |                                 |
     *      |                                 |
     *      +---------------------------------+
     *  </pre>
     *
     *  The scene takes as arguments a scene graph, the width (in
     *  pixels), and the height (in pixels).
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rectangle = new Rectangle(20, 30, 100, 50);
        rectangle.setFill(Color.BLUE);
        //Creating a scene graph, consisting of the rectangle only. 
        Group root = new Group(rectangle);
        //The scene containing one scene graph
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Rectangle");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}
****************************************
Polygon using array (JavaFX)
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color; 

/**
 *  This is an example how to create and display regular polygons.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/2dshapes_polygon.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawRegularPolygons extends Application{
    public static Polygon[] polygons;

    /**
     *  A regular polygon with vertices number edges and corners is created.
     *  @param vertices The number of vertices (which is also the number of edges).
     *  @param rotation The counterclockwise rotation of the polygon, e.g., with Math.PI/2 the polygon is rotated by 90 degrees.
     *  @param scale Without a scale greater than 1 the whole polygon is only a single pixel.
     *  @param xOffset The amount of pixels the polygon is moved on the x-axis to the right.
     *  @param yOffset The amount of pixels the polygon is moved on the y-axis down.
     *  @return The regular polygon defined by the parameters above.
     */   
    public static Polygon makePolygon(int vertices, double rotation, double scale, double xOffset, double yOffset) {
	Double[] coordinates = new Double[2*vertices];

        /* Define a one-dimensional array that can be used to make
         * a polygon (or a polyline). In a polygon the edges are closed.
         * Here all vertices are equally distributed on a circle.
         */
	for (int i = 0; i< vertices; i++){
            coordinates[2*i] = xOffset + 
                scale * Math.cos(rotation + 2*i*Math.PI/vertices);
            coordinates[2*i+1] = yOffset + 
                scale * Math.sin(rotation + 2*i*Math.PI/vertices);
        }

        // Create an empty polygon
        Polygon polygon = new Polygon();
        // Add the points specified by the coordinates
        polygon.getPoints().addAll(coordinates);
        // Without the following command the polygon would be fully black.
        polygon.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        polygon.setStroke(Color.BLACK);
        return polygon;
    }
    
    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
         
        // Create a Group (scene graph) with the polygons as elements.
        Group root = new Group();
        for (Polygon polygon : polygons) {
            root.getChildren().add(polygon);
        }
        
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Polygons");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        Polygon polygon1 = makePolygon( 7, 0.0, 100.0, 130.0, 130.0);
        Polygon polygon2 = makePolygon(12, 0.3,  80.0, 330.0, 130.0);
        Polygon[] poly = {polygon1, polygon2};
        polygons = poly;
        launch(args);
    }
}
*************************************************
Ellipse (JavaFX)
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color; 

/**
 *  This is an example how to display a circle and an ellipse.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_2d_shapes.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DrawCircleEllipse extends Application{

    /**
     *  A circle is defined by the coordinates of the center and the
     *  radius.
     *
     *  Likewise an ellipse is defined by the coordinates of the
     *  centre the radiusX and the radiusY.
     *
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(200, 150, 100);
        circle.setFill(Color.BLUE);
        Ellipse ellipse = new Ellipse(400, 150, 150, 100);
        // Without the following command the ellipse would be fully black.
        ellipse.setFill(null);
        /* After setting the fill colour to null the polygon would be
         * invisible unless the stroke colour is explicitly set.
         */
        ellipse.setStroke(Color.BLACK);

        //Creating a scene graph, consisting of the circle and the ellipse. 
        Group root = new Group(circle, ellipse);
        //The scene containing one scene graph
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Circle and Ellipse");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}



**********************************************************
Hello World . text 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;

/**
 *  This is an example of how to add text to a group.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_text.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class DisplayText extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a text object at position (100,150)
        Text text = new Text(100.0,150.0, "Hello World");

        //Changing the font to "verdana" at a size of 70 pt
        text.setFont(Font.font("verdana", 70));

        /* FontWeight accepts nine values: BLACK,BOLD,EXTRA_BOLD,
         * EXTRA_LIGHT,MEDIUM, NORMAL, SEMI_BOLD, and THIN. 
         * FontPosture two values: REGULAR and ITALIC.
         */
        //text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 100));
        //The text gets a horizontal line in the middle through it.
        //text.setStrikethrough(true);

        //The text is underlined.
        text.setUnderline(true); 
         
        // Create a Group (scene graph) with the text as single element.
        Group root = new Group(text);
        // The scene consists of just one group.
        Scene scene = new Scene(root, 900, 300);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Text");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}
***************************************************

Colours JavaFX
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color; 


/**
 * In this class, we test predefined colours. Some are predefined by
 * constants such such as BLACK, RED and so on. They can also be
 * defined by Color(r,g,b) where r,g,b are values between 0 and
 * 255. r=red, g=green, and b=blue. 0,0,0 stands for black, 255,0,0
 * for red, 0,255,0 for green, and 0,0,255 blue with other values in
 * between. Values such as 100,100,100 represent different levels of grey.
 *
 *  The example is adapted from
 *  <a href="https://www.tutorialspoint.com/javafx/javafx_colors.htm">
 *  www.tutorialspoint.com</a>.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class Colour extends Application{

    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        //Setting text colours to blue, red, and green.
        Text blue = new Text(20.0,30.0, "Blue");
        Text red = new Text(20.0,70.0, "Red");
        Text green = new Text(20.0,110.0, "Green");
        blue.setFill(Color.BLUE); blue.setFont(Font.font("verdana", 30));
        red.setFill(Color.RED); red.setFont(Font.font("verdana", 30));
        green.setFill(Color.GREEN); green.setFont(Font.font("verdana", 30));
        // Create a Group (scene graph) with the text as single element.
        Group root = new Group(blue,red,green);

        int[]      r = {0,255,  0,  0,255,255,  0,255,255,255,200,128, 64, 32,164};
        int[]      g = {0,  0,255,  0,200,175,255,  0,255,255,200,128, 64, 32,255};
        int[]      b = {0,  0,  0,255,  0,175,255,255,  0,255,200,128, 64, 32, 64};
        boolean[] bg = {false,false,false,false,false,false,false,false,true,true,false,false,false,false,false};

        for (int i = 0; i < 15; i++){
            Text text = new Text(120.0,30.0+ 40*i, String.format("rgb(%d,%d,%d)", r[i], g[i], b[i]));
            Color colour = Color.rgb(r[i],g[i],b[i]);
            text.setFill(colour); text.setFont(Font.font("verdana", 30));
            if (bg[i]) {
                Rectangle rect = new Rectangle(120.0,40*i, 2000, 40);
                rect.setFill(Color.BLACK);
                root.getChildren().add(rect);

            }
            root.getChildren().add(text);
        }

         
        // The scene consists of just one group.
        Scene scene = new Scene(root, 600, 700);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Text");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) { 
        launch(args);
    }
}

     
***************************************
Grid formation JavaFX
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color; 

/**
 *  This is an example of to display a two-dimensional array of zeroes, ones, and twos as big coloured dots.
 *
 *  @version 2018-08-28
 *  @author Manfred Kerber
 */
public class Grid extends Application{
    /**
     *  grid is the static variable that is used to store the
     *  2-dimensional array to be displayed by coloured dots.
     */
    private static int[][] grid;
    /** OFFSET moves the board on the x-axis and y-axis out of the left upper corner.
     *  It is also used as the distance between the centres of two adjacent circles.
     */
    public static final int OFFSET = 90;
    /** RADIUS is the radius of the circles.
     */
    public static final int radius = 40;

    /**
     *  @param stage The window to be displayed.
     */
   @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        for (int i = 0; i< grid.length; i++) {
            for (int j = 0; j< grid[i].length; j++) {
                Circle circle = new Circle(OFFSET+j*OFFSET,OFFSET+i*OFFSET, radius);
                if (grid[i][j] == 1) {
                    circle.setFill(Color.GREEN);
                } else if (grid[i][j] == 2) {
                    circle.setFill(Color.RED);
                }
                root.getChildren().add(circle);
            }
        }

        //Creating a scene graph, consisting of the circles. 
        //The scene containing one scene graph
        int SCENE_WIDTH  = OFFSET + OFFSET * (grid[0].length + 1);
        int SCENE_HEIGHT = OFFSET + OFFSET * (grid.length + 2);
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        stage.setTitle("Dots");
        stage.setScene(scene);
        stage.show();
    }

    /*
     *  main method to initialize a matrix and to launch the application.
     */
    public static void main(String[] args) {
                int[][] grid1 = {{0,1,0,1,1},
                                 {1,2,0,0,1},
                                 {1,1,0,1,2,1}};
                grid = grid1;
        launch(args);
     }
}
**************************************************************








