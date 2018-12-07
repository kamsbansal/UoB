package Room;

/**
 * Class to use for Booking process
 * 
 * @version 5/12/18
 * @author Kam Bansal
 */
public class Booking {

	/**
	 * Creates new Booking class with date, hour, roomId and purpose of booking.
	 *
	 * @param date    Enter date of booking. Ex:new Date(07, "December",2018)
	 * @param roomId  Enter room id. Ex:"R217"
	 * @param hour    Enter hour of booking (integer from 9 to 17). Ex:14
	 * @param purpose Enter purpose of meeting. Ex:"Java Meeting"
	 */

	public Booking(Date date, String roomId, int hour, String purpose) {
		this.date = date;
		this.roomId = roomId;
		this.hour = hour;
		this.purpose = purpose;
	}

	/**
	 * Holds date of booking. Ex:new Date(07, "December",2018)
	 */

	private Date date;

	/**
	 * Get the value of date
	 *
	 * @return Returns the value of date
	 */

	public Date getDate() {
		return date;
	}

	/**
	 * Set the value of date
	 *
	 * @param date Enter new value of date
	 */

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Holds id of booked room.
	 */

	private String roomId;

	/**
	 * Get the value of roomId
	 *
	 * @return Returns the value of roomId
	 */

	public String getRoomId() {
		return roomId;
	}

	/**
	 * Set the value of roomId
	 *
	 * @param roomId new value of roomId
	 */
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	/**
	 * Holds the hour of booking.Bookings can be made for hours starting at 9:00,
	 * 10:00, ..., 17:00. Valid input are integer values from 9 to 17.
	 */

	private int hour;

	/**
	 * Get the value of hour
	 *
	 * @return Returns the value of hour
	 */

	public int getHour() {
		return hour;
	}

	/**
	 * Set the value of hour
	 *
	 * @param hour Enter new value of hour
	 */

	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * Holds the purpose of booking
	 *
	 *
	 */

	private String purpose;

	/**
	 * Get the value of purpose
	 *
	 * @return Returns the value of purpose
	 */

	public String getPurpose() {
		return purpose;
	}

	/**
	 * Set the value of purpose
	 *
	 * @param purpose new value of purpose
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
