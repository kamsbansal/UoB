package shopper;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Main {
	static String[] rooms = { "R217", "R222", "R225", "R245" };
	static ArrayList<Booking> bookings = new ArrayList<Booking>();

	public static void main(String[] args) {
		booking();
		displayBookings();
		cancelBooking();
	}

	public static void booking() {

		String room = rooms[1];
		Date date = new Date(1, "November", 2018);
		if (verifyBooking(room, date, 9)) {
			System.out.println("Room is already booked on that date and hour");

		} else {
			Booking booking = new Booking(room, date, 9, "Training");
			bookings.add(booking);
			Booking booking2 = new Booking(room, date, 10, "Training");
			bookings.add(booking2);
			Booking booking3 = new Booking(room, date, 11, "Training");
			bookings.add(booking3);
			System.out.println("booking made successfully");

		}
	}

	public static void cancelBooking() {
		String room = rooms[1];
		Date date = new Date(1, "November", 2018);
		if (verifyBooking(room, date, 9)) {
			Booking booking = getBooking(room, date, 9);
			bookings.remove(booking);
			System.out.println("Booking cancelled");

		} else {
			System.out.println("No booking for that room on that date and hour");

		}
	}

	public static void displayBookings() {
		Date date = new Date(1, "November", 2018);
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
}
