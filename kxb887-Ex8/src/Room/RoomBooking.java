package Room;

import java.util.HashMap;

/**
 * RoomBooking class allows users to book a number of rooms.
 *
 * @version 5/12/18
 * @author Kam Bansal
 */
public class RoomBooking {

	/**
	 * Default constructor. Initiates booking hashMap, available rooms and suitable
	 * hours for booking.
	 */
	public RoomBooking() {
		this.bookingMap = new HashMap<>();
		this.rooms = new String[] { "R217", "R222", "R225", "R245" };
		this.hours = new int[] { 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		this.dateOfBooking = new Date(07, "December", 2018);
	}

	/**
	 * Creates RoomBooking class with custom rooms and year. Rest of fields
	 * initialized with default values.
	 *
	 * @param year  Enter year of booking.
	 * @param rooms Enter array of available rooms for booking.
	 */
	public RoomBooking(int year, String[] rooms) {
		this.bookingMap = new HashMap<>();
		this.hours = new int[] { 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		this.rooms = rooms;
		this.dateOfBooking = new Date(07, "December", year);
	}

	/**
	 * Holds default date of booking.Initialized in constructor.
	 */
	Date dateOfBooking;

	/**
	 * Gets value of dateOfBooking
	 *
	 * @return Returns value of dateOfBooking
	 */
	public Date getDateOfBooking() {
		return dateOfBooking;
	}

	/**
	 * Sets value of dateOfBooking
	 *
	 * @param dateOfBooking Enter new value of date of booking.
	 */
	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	/**
	 * Holds array of rooms, available for booking.
	 */
	String[] rooms;

	/**
	 * Gets array of rooms
	 *
	 * @return Returns value of rooms
	 */
	public String[] getRooms() {
		return rooms;
	}

	/**
	 * Sets array of rooms.
	 *
	 * @param rooms Enter new array of rooms.
	 */
	public void setRooms(String[] rooms) {
		this.rooms = rooms;
	}

	/**
	 * Holds the list of id-booking pairs for booking data. Id which is combination
	 * of room+date+hour values, used as key to reach the related booking object
	 * value.
	 *
	 */
	// key=room+date+hour, value=Booking
	private HashMap<String, Booking> bookingMap;

	/**
	 * Gets value of bookingMap
	 *
	 * @return Returns the value of bookingMap
	 */
	public HashMap<String, Booking> getBookingMap() {
		return bookingMap;
	}

	/**
	 * Sets value of bookingMap
	 *
	 * @param bookingMap Enter new value of bookingMap
	 */
	public void setBookingMap(HashMap<String, Booking> bookingMap) {
		this.bookingMap = bookingMap;
	}

	/**
	 * Holds the array of integer, representing available hours for booking.
	 * Bookings can be made for hours starting at 9:00, 10:00, ..., 17:00. Valid
	 * input are integer values from 9 to 17.Initialized in constructor.
	 *
	 */
	int[] hours;

	/**
	 * Gets value of hours
	 *
	 * @return Returns value of hours
	 */
	public int[] getHours() {
		return hours;
	}

	/**
	 * Sets the value of hours
	 *
	 * @param hours Enter new value of hours.
	 */
	public void setHours(int[] hours) {
		this.hours = hours;
	}

	/**
	 * This method book rooms using date, hour and purpose inputs provided. Data is
	 * saved to bookingMap with help of Booking objects, key(id) values for
	 * bookingMap are created by combination of roomId+date+hour values. If
	 * bookingMap already has the same slot values as the entered slot, then booking
	 * process is canceled and relevant information is provided through command
	 * line.
	 *
	 * @param date    Enter date of booking. Ex:new Date(07, "December",2018)
	 * @param roomId  Enter room id. Ex:"R217"
	 * @param hour    Enter hour of booking (integer from 9 to 17). Ex:14
	 * @param purpose Enter purpose of meeting. Ex:"Java Meeting"
	 *
	 * @return Returns true if the room is available, false else
	 */
	public boolean book(String room, Date date, int hour, String purpose) {
		// if any of input is null or empty
		if (room == null || date == null || purpose == null || room.isEmpty() || purpose.isEmpty() || hour < 9
				|| hour > 17) {
			return false;
		}
		// Create id from inputs.
		String id = room.trim() + date.toString().trim() + hour;
		// Check if bookingMap already contains, booking data
		if (bookingMap.containsKey(id)) {
			// if true, booking is canceled and appropriate info provided.
			Booking booking = bookingMap.get(id);
			System.out.println("Can not allocate the room.");
			System.out.println("Room " + room + " is already booked for " + booking.getPurpose() + " on "
					+ booking.getDate() + " at " + booking.getHour() + ":00 hours");
			return false;
		} else {
			// if false, then booking info saved to the bookingMap and appropriate info
			// provided.
			bookingMap.put(id, new Booking(date, room, hour, purpose));
			System.out.println("Booked successfully!");
			System.out.println(
					"Room " + room + " is now booked for " + purpose + " on " + date + " at " + hour + ":00 hours.");
			return true;
		}
	}

	/**
	 * This method deletes booking if it exists, so that the room is again available
	 * for further bookings, does nothing if the booking does not exist.
	 *
	 * @param date   Enter date of booking. Ex:new Date(07, "December",2018)
	 * @param roomId Enter room id. Ex:"R217"
	 * @param hour   Enter hour of booking (integer from 9 to 17). Ex:14
	 * @return Returns true if canceled, or vice versa.
	 */
	public boolean cancel(String roomId, Date date, int hour) {
		// if any of input is null or empty
		if (roomId == null || date == null || roomId.isEmpty() || hour < 9 || hour > 17) {
			return false;
		}
		// Create id from inputs.
		String id = roomId.trim() + date.toString().trim() + hour;
		// Check if bookingMap contains, booking data
		if (bookingMap.containsKey(id)) {
			// if true, then cancel the booking
			Booking booking = bookingMap.remove(id);
			System.out.println("Booking is canceled.");
			System.out.println("Room " + booking.getRoomId() + " has been deallocated and available for booking on "
					+ booking.getDate() + " at " + booking.getHour() + ":00 hours");
			return true;
		} else {
			// if false, do nothing.
			System.out.println("Room " + roomId + " is NOT booked on " + date + " at " + hour + ":00 hours.");
			return false;
		}
	}

	/**
	 * Prepares booking matrix of rooms for specified date.
	 *
	 * @param date Enter date of display for bookings.
	 * @return Returns tabular form of booking matrix for specified date.
	 */
	public String displayDay(Date date) {
		// Holds id to search booking in bookingMap
		String id;
		// Holds stringified booking matrix
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
		// Booking rooms using default date of "07 December 2018"
		roomBooking.book("R222", roomBooking.dateOfBooking, 12, "Tutor meeting");
		roomBooking.book("R222", roomBooking.dateOfBooking, 12, "Java meeting");// No booking since room booked already
		roomBooking.book("R222", roomBooking.dateOfBooking, 13, "Interviews");
		roomBooking.book("R245", roomBooking.dateOfBooking, 16, "Project meeting");
		roomBooking.book("R225", roomBooking.dateOfBooking, 14, "Top-up tutorial");
		System.out.println(roomBooking.displayDay(roomBooking.dateOfBooking));
	}

}
