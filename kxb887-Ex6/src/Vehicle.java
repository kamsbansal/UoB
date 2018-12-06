/**
 * This Class provides information for a Vehicle in 2 parts, the passenger
 * numbers (type int) and maximum speed (int)
 * 
 * @version 20-11-18
 * @author Kam Bansal
 * 
 */

public class Vehicle {

	private int passengerNumber;
	private int maxSpeed;

	/**
	 * This constructor for Vehicle
	 * 
	 * @param passengerNumber The number of passengers that can fit in the vehicle
	 * @param maxSpeed        The maximum speed of the vehicle
	 */
	public Vehicle(int passengerNumber, int maxSpeed) {
		this.passengerNumber = passengerNumber;
		this.maxSpeed = maxSpeed;
	}

	/**
	 * Getter for passenger number
	 * 
	 * @return the number of passengers
	 */
	public int getPassengerNumber() {
		return passengerNumber;
	}

	/**
	 * Getter for maximum speed
	 * 
	 * @return the maximum speed of the vehicle
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * Setter for passenger number
	 * 
	 * @param passengerNumber the new passenger number
	 */
	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	/**
	 * Setter for maximum speed
	 * 
	 * @param maxSpeed The new maximum speed
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * toString method for a vehicle
	 */

	public String toString() {
		return "The vehicle has a passenger number of " + passengerNumber + " and a max speed of " + maxSpeed;
	}

	public static void main(String[] args) {
		Vehicle brand = new Vehicle(15, 165);
		System.out.println(brand);
	}
}
