package Room;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 */
public class RoomBookingTest {

	public RoomBookingTest() {
	}

	/**
	 * Test of book method with null parameters, of class RoomBooking.
	 */
	@Test
	public void testBook_WithNullParams() {
		String room = null;
		Date date = null;
		int hour = 0;
		String purpose = null;
		RoomBooking classUnderTest = new RoomBooking();
		boolean expResult = false;
		boolean result = classUnderTest.book(room, date, hour, purpose);
		assertEquals(expResult, result);
	}

	/**
	 * Test of book method with null parameters, of class RoomBooking.
	 */
	@Test
	public void testBook_WithEmptyParams() {
		String room = "";
		Date date = new Date(12, "April", 2018);
		int hour = 12;
		String purpose = "";
		RoomBooking classUnderTest = new RoomBooking();
		boolean expResult = false;
		boolean result = classUnderTest.book(room, date, hour, purpose);
		assertEquals(expResult, result);
	}

	/**
	 * Test of book method with out of range parameters, of class RoomBooking.
	 */
	@Test
	public void testBook_WithOutOfRangeHour() {
		String room = "R217";
		Date date = new Date(12, "April", 2018);
		int hour = 3;
		String purpose = "Meeting";
		RoomBooking classUnderTest = new RoomBooking();
		boolean expResult = false;
		boolean result = classUnderTest.book(room, date, hour, purpose);
		assertEquals(expResult, result);
	}

	/**
	 * Test of book method with valid parameters, of class RoomBooking.
	 */
	@Test
	public void testBook_WithValidParams() {
		String room = "R217";
		Date date = new Date(12, "April", 2018);
		int hour = 13;
		String purpose = "Meeting";
		RoomBooking classUnderTest = new RoomBooking();
		boolean expResult = true;
		boolean result = classUnderTest.book(room, date, hour, purpose);
		assertEquals(expResult, result);
	}

	/**
	 * Test of book method when room already booked on the same time slot, of class
	 * RoomBooking.
	 */
	@Test
	public void testBook_WhenSlotAlreadyBooked() {
		String room = "R217";
		Date date = new Date(12, "April", 2018);
		int hour = 13;
		String purpose = "Meeting";
		RoomBooking classUnderTest = new RoomBooking();
		classUnderTest.book(room, date, hour, purpose);// first booking permitted
		boolean result = classUnderTest.book(room, date, hour, purpose); // second booking should not allowed
		boolean expResult = false;
		assertEquals(expResult, result);
	}

	/**
	 * Test of cancel method with null parameters, of class RoomBooking.
	 */
//    @Test
//    public void testCancel_WithNullParams() {
//        String roomId = null;
//        Date date = null;
//        int hour = 0;
//        RoomBooking classUnderTest = new RoomBooking();
//        boolean result = classUnderTest.cancel(roomId, date, hour);
//        boolean expResult = false;
//        assertEquals(expResult, result);
//    }

	/**
	 * Test of cancel method with empty parameters, of class RoomBooking.
	 */
//    @Test
//    public void testCancel_WithEmptyParams() {
//        String roomId = "";
//        Date date = new Date(12, "April", 2018);;
//        int hour = 13;
//        RoomBooking classUnderTest = new RoomBooking();
//        boolean result = classUnderTest.cancel(roomId, date, hour);
//        boolean expResult = false;
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of cancel method with out of range parameters, of class RoomBooking.
//     */
//    @Test
//    public void testCancel_WithOutOfRangeHour() {
//        String roomId = "R217";
//        Date date = new Date(12, "April", 2018);;
//        int hour = 3;
//        RoomBooking classUnderTest = new RoomBooking();
//        boolean result = classUnderTest.cancel(roomId, date, hour);
//        boolean expResult = false;
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of cancel method when not cancellable with valid parameters, of class RoomBooking.
//     */
//    @Test
//    public void testCancel_WhenNotCancellable_WithValidParams() {
//        String roomId = "R217";
//        Date date = new Date(12, "April", 2018);;
//        int hour = 13;
//        RoomBooking classUnderTest = new RoomBooking();
//        boolean result = classUnderTest.cancel(roomId, date, hour);
//        boolean expResult = false;
//        assertEquals(expResult, result);
//    }

//     /**
//     * Test of cancel method when not cancellable with valid parameters, of class RoomBooking.
//     */
//    @Test
//    public void testCancel_WhenCancellable_WithValidParams() {
//        String roomId = "R217";
//        Date date = new Date(12, "April", 2018);;
//        int hour = 13;
//        RoomBooking classUnderTest = new RoomBooking();
//        classUnderTest.book(roomId, date, hour, "Meeting");
//        boolean result = classUnderTest.cancel(roomId, date, hour);
//        boolean expResult = true;
//        assertEquals(expResult, result);
//    }
}
