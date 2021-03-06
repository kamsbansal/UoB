package Room;

/**
 * The Date class here is used to pick up on the simpler Date class from week 2
 * in order to show how we can restrict the creation of dates to admissible
 * dates. To this end we write a method admissible which checks whether inputs
 * of the constructor form a valid date. If not on constuction an
 * IllegalArgumentException is thrown. Note that we have not dealt with the
 * setters here, they would need corresponding checks.
 *
 * @version 5/12/18
 * @author Kam Bansal
 */
public class Date {

	/**
	 * Three field variables for day, month, and year of types int, String and int,
	 * respectively.
	 */
	private int day;
	private String month;
	private int year;

	/**
	 * @param day   The input of a day such as 21 as an int.
	 * @param month The input of a month such as "October" as a String.
	 * @param year  The input of a year such as 2016 as an int.
	 * @return true if the day, the month, and the year are all admissible THIS IS A
	 *         METHOD STUB. THE METHOD NEEDS STILL TO BE WRITTEN!
	 */
	public static boolean admissible(int day, String month, int year) {
		return true;
	}

	public String toString() {
		return this.day + " " + this.month + " " + this.year;
	}

	/**
	 * @param day   The input of a day such as 21 as an int.
	 * @param month The input of a month such as "October" as a String.
	 * @param year  The input of a year such as 2018 as an int. Note that the
	 *              constructor throws an IllegalArgumentException if the date to be
	 *              constructed would be not admissible.
	 */
	public Date(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

//    public static void main(String[] args) {
//        Date d1 = new Date(26, "October", 2018);
//        System.out.println(d1);
//        Date d2 = new Date(32, "Octos", 2018);
//        System.out.println(d2);
//        Date d3 = new Date(20, "Friday", 2018);
//        System.out.println(d3);
//    }

}
