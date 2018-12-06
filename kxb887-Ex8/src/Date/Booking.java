package Date;

/**
 * Booking class shows the variables needed to create a booking @ version
 * 5-12-18
 * 
 * @author Kam Bansal
 */

public class Booking {
	private String room;
	private Date date;
	private int hour;
	private String purpose;

	/**
	 * Constructor for Booking
	 * 
	 * @param _room    to be booked
	 * @param _date    for the booking
	 * @param _hour    what time need to book room for
	 * @param _purpose and the purpose for using the room
	 * @return
	 */
	public Booking(String _room, Date _date, int _hour, String _purpose) {

		this.room = _room;
		this.date = _date;
		this.hour = _hour;
		this.purpose = _purpose;

	}

	/**
	 * Getter for room
	 * 
	 * @return room
	 */

	public String getRoom() {
		return room;
	}

	/**
	 * Setter for room
	 * 
	 * @param _room
	 */
	public void setRoom(String _room) {
		room = _room;
	}

	/**
	 * Getter for date
	 * 
	 * @return Date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Setter for setting the room
	 * 
	 * @param _date
	 */
	public void setDate(Date _date) {
		date = _date;
	}

	/**
	 * Getter for hour to book room
	 * 
	 * @return hour
	 */

	public int getHour() {
		return hour;
	}

	/**
	 * Setter for purpose of room
	 * 
	 * @return purpose
	 */

	public void setPurpose(String _purpose) {
		purpose = _purpose;
	}

	/**
	 * Getter for purpose of room
	 * 
	 * @return purpose
	 */
	public String getPurpose() {
		return purpose;
	}
}
