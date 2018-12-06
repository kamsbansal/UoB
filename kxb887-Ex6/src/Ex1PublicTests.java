import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Ex1PublicTests {
	public static final double TOLERANCE = 0.00001;
	private Vehicle vehicle1, vehicle2;
	private Bus bus;

	@Before
	public void setUp() {

		vehicle1 = new Vehicle(15, 68);
		bus = new Bus(120, 170, 45.7);
		vehicle2 = new Bus(200, 120, 46);
	}

	// testing getters of vehicle1
	@Test
	public void test1() {

		int expectedNumOfPassengers = 15;
		int actualNumOfPassengers = vehicle1.getPassengerNumber();
		assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

		int expectedMaxSpeed = 68;
		int actualMaxSpeed = vehicle1.getMaxSpeed();
		assertEquals(expectedMaxSpeed, actualMaxSpeed);
	}

	// testing getters of bus
	@Test
	public void test2() {

		int expectedNumOfPassengers = 120;
		int actualNumOfPassengers = bus.getPassengerNumber();
		assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

		int expectedMaxSpeed = 170;
		int actualMaxSpeed = bus.getMaxSpeed();
		assertEquals(expectedMaxSpeed, actualMaxSpeed);

		double expectedFuelCons = 45.7;
		double actualFuelCons = bus.getFuelConsumption();
		assertEquals(expectedFuelCons, actualFuelCons, TOLERANCE);
	}

	// testing setters of vehicle1
	@Test
	public void test3() {

		vehicle1.setPassengerNumber(123);
		int expectedNumOfPassengers = 123;
		int actualNumOfPassengers = vehicle1.getPassengerNumber();
		assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

		vehicle1.setMaxSpeed(220);
		int expectedMaxSpeed = 220;
		int actualMaxSpeed = vehicle1.getMaxSpeed();
		assertEquals(expectedMaxSpeed, actualMaxSpeed);
	}

	// testing setters of bus
	@Test
	public void test4() {

		bus.setPassengerNumber(130);
		int expectedNumOfPassengers = 130;
		int actualNumOfPassengers = bus.getPassengerNumber();
		assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

		bus.setMaxSpeed(100);
		int expectedMaxSpeed = 100;
		int actualMaxSpeed = bus.getMaxSpeed();
		assertEquals(expectedMaxSpeed, actualMaxSpeed);

		bus.setFuelConsumption(37.2);
		double expectedFuelCons = 37.2;
		double actualFuelCons = bus.getFuelConsumption();
		assertEquals(expectedFuelCons, actualFuelCons, TOLERANCE);
	}

	// testing getters of vehicle2
	@Test
	public void test5() {

		int expectedNumOfPassengers = 200;
		int actualNumOfPassengers = vehicle2.getPassengerNumber();
		assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

		int expectedMaxSpeed = 120;
		int actualMaxSpeed = vehicle2.getMaxSpeed();
		assertEquals(expectedMaxSpeed, actualMaxSpeed);
	}

	// testing setters of vehicle2
	@Test
	public void test6() {

		vehicle2.setPassengerNumber(130);
		int expectedNumOfPassengers = 130;
		int actualNumOfPassengers = vehicle2.getPassengerNumber();
		assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

		vehicle2.setMaxSpeed(250);
		int expectedMaxSpeed = 250;
		int actualMaxSpeed = vehicle2.getMaxSpeed();
		assertEquals(expectedMaxSpeed, actualMaxSpeed);
	}
}
