package Date;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ version 5/12/18
 * 
 * @author Kam Bansal
 */

public class Main {
	static String[] rooms = { "R217", "R222", "R225", "R245" }; // rooms to be used (given)
	static ArrayList<Booking> bookings = new ArrayList<>(); // create a new booking
	static Scanner scanner = new Scanner(System.in); // use of scanner to input the data

	public static void main(String[] args) {
		menu(); // provide a menu that user wil use to choose options
	}

	/**
	 * menu method for user to make a selection from options
	 */

	public static void menu() {
		System.out.println("1. Make Booking\n2. Cancel Booking\n3. display Bookings"); // user can input the booking
		String choice = scanner.next(); // use of a scanner so that room availability can be checked, using options
										// below
		if (null == choice) {
			System.out.println("Invalid Choice");
			menu();
		} else
			switch (choice) {
			case "1":
				booking();
				break;
			case "2":
				cancelBooking();
				break;
			case "3":
				displayBookings();
				break;
			default:
				System.out.println("Invalid Choice");
				menu();
				break;
			}
	}

	/**
	 * Method for booking
	 */

	public static void booking() {
		System.out.println("Select room");
		displayRoomChoices();
		System.out.print("Enter choice: ");
		String choice = scanner.next();
		while (verifyInt(choice) == false) {
			System.out.println("Use numbers indicated only. Enter choice");
			choice = scanner.next();
		}
		while (verifyRoomChoice(Integer.parseInt(choice)) == false) {
			System.out.println("Enter the correct room choice: ");
			choice = scanner.next();
		}
		System.out.println("Enter date");
		System.out.print("Day: ");
		String day = scanner.next();
		while (verifyInt(day) == false) {
			System.out.print("Enter the correct day: ");
			day = scanner.next();
		}
		System.out.print("Month: ");
		String month = scanner.next();
		System.out.print("Year: ");
		String year = scanner.next();
		while (verifyInt(year) == false) {
			System.out.print("Enter the correct year: ");
			year = scanner.next();
		}
		Date date = new Date(Integer.parseInt(day), month, Integer.parseInt(year));
		System.out.println("Enter the hour to book room");
		System.out.print("Hour: ");
		String hour = scanner.next();
		while (verifyInt(hour) == false) {
			System.out.print("Enter a valid hour: ");
			hour = scanner.next();
		}
		while (Integer.parseInt(hour) < 9 || Integer.parseInt(hour) > 17) {
			System.out.print("Enter a valid hour between 9 and 17: ");
			hour = scanner.next();
		}
		System.out.print("Enter purpose: ");
		String purpose = scanner.nextLine();
		String room = rooms[Integer.parseInt(choice) - 1];
		if (verifyBooking(room, date, Integer.parseInt(hour))) {
			System.out.println("Room is already booked on that date and hour");
			menu();
		} else {
			Booking booking = new Booking(room, date, Integer.parseInt(hour), purpose);
			bookings.add(booking);
			System.out.println("booking made successfully");
			menu();
		}
	}

	/**
	 * Method for cancel booking
	 */
	public static void cancelBooking() {
		System.out.println("Select room");
		displayRoomChoices();
		System.out.print("Enter choice: ");
		String choice = scanner.next();
		while (verifyInt(choice) == false) {
			System.out.println("Use numbers indicated only. Enter choice");
			choice = scanner.next();
		}
		while (verifyRoomChoice(Integer.parseInt(choice)) == false) {
			System.out.println("Enter the correct room choice: ");
			choice = scanner.next();
		}
		System.out.println("Enter date");
		System.out.print("Day: ");
		String day = scanner.next();
		while (verifyInt(day) == false) {
			System.out.print("Enter the correct day: ");
			day = scanner.next();
		}
		System.out.print("Month: ");
		String month = scanner.next();
		System.out.print("Day: ");
		String year = scanner.next();
		while (verifyInt(year) == false) {
			System.out.print("Enter the correct year: ");
			year = scanner.next();
		}
		Date date = new Date(Integer.parseInt(day), month, Integer.parseInt(year));
		System.out.println("Enter the hour to book room");
		System.out.print("Hour: ");
		String hour = scanner.next();
		while (verifyInt(hour) == false) {
			System.out.print("Enter a valid hour: ");
			hour = scanner.next();
		}
		while (Integer.parseInt(hour) < 9 || Integer.parseInt(hour) > 17) {
			System.out.print("Enter a valid hour between 9 and 17: ");
			hour = scanner.next();
		}
		String room = rooms[Integer.parseInt(choice) - 1];
		if (verifyBooking(room, date, Integer.parseInt(hour))) {
			Booking booking = getBooking(room, date, Integer.parseInt(hour));
			bookings.remove(booking);
			System.out.println("Booking cancelled");
			menu();
		} else {
			System.out.println("No booking for that room on that date and hour");
			menu();
		}
	}

	/**
	 * Method for display booking
	 */

	public static void displayBookings() {
		System.out.println("Enter date");
		System.out.print("Day: ");
		String day = scanner.next();
		while (verifyInt(day) == false) {
			System.out.print("Enter the correct day: ");
			day = scanner.next();
		}
		System.out.print("Month: ");
		String month = scanner.next();
		System.out.print("Day: ");
		String year = scanner.next();
		while (verifyInt(year) == false) {
			System.out.print("Enter the correct year: ");
			year = scanner.next();
		}
		Date date = new Date(Integer.parseInt(day), month, Integer.parseInt(year));
		System.out.println(date.toString());
		for (int i = 9; i <= 17; i++) {
			for (int j = 0; j < rooms.length; j++) {
				System.out.print("|");
				String format = "%-40s%";
				System.out.printf(format, rooms[j]);
				System.out.print("|");

				String format2 = "%-40s%s%s%s%";
				System.out.printf(format2, "---------------------+", "---------------------+", "---------------------+",
						"---------------------+");
				System.out.println(i + ":00");
				for (int l = 0; l < bookings.size(); l++) {
					Booking booking = bookings.get(l);
					if (booking.getDate().equals(date) && booking.getHour() == i
							&& booking.getRoom().equals(rooms[j])) {
						System.out.print(booking.getPurpose());
					}
				}

				System.out.printf(format2, "---------------------+", "---------------------+", "---------------------+",
						"---------------------+");
			}
		}

	}

	public static boolean verifyBooking(String room, Date date, int hour) {
		boolean status = true;
		if (bookings.isEmpty()) {
			status = true;
		} else {
			for (int i = 0; i < bookings.size(); i++) {
				Booking booking = bookings.get(i);
				if (booking.getRoom().equals(room) && booking.getDate().equals(date) && booking.getHour() == hour) {
					status = false;
				}
			}
		}
		return status;
	}

	public static Booking getBooking(String room, Date date, int hour) {
		Booking booking = null;
		if (bookings.isEmpty()) {
			booking = null;
		} else {
			for (int i = 0; i < bookings.size(); i++) {

				if (booking.getRoom().equals(room) && booking.getDate().equals(date) && booking.getHour() == hour) {
					booking = bookings.get(i);
				}
			}
		}
		return booking;
	}

	public static boolean verifyRoomChoice(int choice) {
		if (choice >= 1 && choice <= 4) {
			return true;
		} else {
			return false;
		}
	}

	public static void displayRoomChoices() {
		for (int i = 0; i < rooms.length; i++) {// creating a loop to loop throug the rooms array and displaying each
												// room
			int index = i + 1;
			System.out.println(index + ". " + rooms[i]);
		}
	}

	public static boolean verifyInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
