package room;

import java.util.HashMap;

/**
 *
 * @author Xxxx
 */
public class RoomBooking {

	public RoomBooking() {
		this.bookingMap = new HashMap<>();
		this.rooms = new String[] { "R217", "R222", "R225", "R245" };
		this.hours = new int[] { 9, 10, 11, 12, 13, 14, 15, 16, 17 };
	}

	public RoomBooking(int year, String[] rooms) {
		this.hours = new int[] { 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		this.rooms = rooms;

	}

	String[] rooms;
	int[] hours;
	// key=room+date+hour, value=Booking
	private HashMap<String, Booking> bookingMap;

	public boolean book(String room, Date date, int hour, String purpose) {
		String id = room.trim() + date.toString().trim() + hour;
		if (bookingMap.containsKey(id)) {
			Booking booking = bookingMap.get(id);
			System.out.println("Can not allocate the room.");
			System.out.println("Room " + room + " is already booked for " + booking.getPurpose() + " on "
					+ booking.getDate() + " at " + booking.getHour() + ":00 hours");
			return false;
		} else {
			bookingMap.put(id, new Booking(date, room, hour, purpose));
			System.out.println("Booked successfully!");
			System.out.println(
					"Room " + room + " is now booked for " + purpose + " on " + date + " at " + hour + ":00 hours.");
			return true;
		}
	}

	public void cancel(String room, Date date, int hour) {
		String id = room.trim() + date.toString().trim() + hour;
		if (bookingMap.containsKey(id)) {
			Booking booking = bookingMap.remove(id);
			System.out.println("Booking is canceled.");
			System.out.println("Room " + booking.getRoomId() + " has been deallocated and available for booking on "
					+ booking.getDate() + " at " + booking.getHour() + ":00 hours");
		} else {
			System.out.println("Room " + room + " is NOT booked on " + date + " at " + hour + ":00 hours.");
		}
	}

	public String displayDay(Date date) {
		String id;
		StringBuilder builder = new StringBuilder();
		// Printing date to displayed
		builder.append("                                                          " + date.toString()
				+ "                                                     \n\n");
		// Printing rooms as table columns.
		builder.append("\t|");
		for (String room : rooms) {
			builder.append("\t\t" + room + "\t\t|");
		}
		builder.append("\n");
		builder.append(
				"-----------------------------------------------------------------------------------------------------------------------------------------\n");
		// Printing hours and rooms as matrix
		for (int j = 0; j < hours.length; j++) {
			int hour = hours[j];
			builder.append(" " + hour + ":00\t|");
			for (String room : rooms) {
				id = room.trim() + date.toString().trim() + hour;
				if (this.bookingMap.containsKey(id)) {
					builder.append("\t" + this.bookingMap.get(id).getPurpose() + "\t\t|");
				} else {
					builder.append("\t\t\t\t|");
				}
			}
			builder.append("\n");
			builder.append(
					"-----------------------------------------------------------------------------------------------------------------------------------------\n");

		}
		return builder.toString();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		RoomBooking roomBooking = new RoomBooking();
		Date dec07 = new Date(07, "December", 2018);
		roomBooking.book("R222", dec07, 12, "Tutor meeting");
		roomBooking.book("R222", dec07, 12, "Java meeting");// No booking since room booked already
		roomBooking.book("R222", dec07, 13, "Interviews");
		roomBooking.book("R245", dec07, 16, "Project meeting");
		roomBooking.book("R225", dec07, 14, "Top-up tutorial");
		System.out.println(roomBooking.displayDay(dec07));
	}

}
