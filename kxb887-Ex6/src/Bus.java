/**
 * The class Bus extends the vehicle user. It inherits all the methods from the
 * superclass, except the ones dealing with fuel consumption.
 */
public class Bus extends Vehicle {

	private double fuelConsumption;

	/**
	 * Constructor
	 * 
	 * @param passengerNumber
	 * @param maxSpeed
	 */

	public Bus(int passengerNumber, int maxSpeed, double fuelConsumption) {
		super(passengerNumber, maxSpeed);
		this.fuelConsumption = fuelConsumption;
	}

	/**
	 * Getter for fuelConsumption *
	 * 
	 * @return the value of fuel consumption
	 */
	public double getFuelConsumption() {
		return this.fuelConsumption;
	}

	/**
	 * Setter for fuel Consumption
	 * 
	 * @param fuelConsumption
	 */
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	/**
	 * Return String representation for Bus
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return super.toString() + " and fuel consumption of " + getFuelConsumption() + ".";
	}

	public static void main(String[] args) {
		Bus brand = new Bus(155, 165, 23);
		System.out.println(brand);

	}
}
