/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
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

	public static void main(String[] args) {
		Date d1 = new Date(26, "October", 2018);
		System.out.println(d1);
		Date d2 = new Date(32, "October", 2018);
		System.out.println(d2);
		Date d3 = new Date(20, "Friday", 2018);
		System.out.println(d3);
	}
}
