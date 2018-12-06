/**
 * 
 * @author Kam Bansal
 * @version 16.11.2018
 * 
 *          Patient implements Measurable, that is, we have to give an
 *          implementation for the methods getValue. This is done by returning
 *          the get Value, which here is the name, age and weight of the
 *          patient.
 *
 */
public class Patient implements Measurable {

	String name;
	int age;
	double weight;

	/**
	 * A Patient object is created by this constructor.
	 * 
	 * @param name   The name of the patient.
	 * @param age    The age of the patient.
	 * @param weight The weight of the patient.
	 */

	public Patient(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	/**
	 * getter for name
	 * 
	 * @return The name of the patient
	 */

	public String getName() {
		return name;
	}

	/**
	 * Setter for name
	 * 
	 * @param name The new name of the patient
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for age
	 * 
	 * @return The age of the patient
	 */

	public int getAge() {
		return age;
	}

	/**
	 * Setter for age
	 * 
	 * @param age The new age of the patient
	 */

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * getter for weight
	 * 
	 * @return The weight of the patient
	 */

	public double getWeight() {
		return weight;
	}

	/**
	 * Setter for weight
	 * 
	 * @param weight The new weight of the patient
	 */

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * The toString() method to print the Patient.
	 * 
	 * @return A printable String for the patient.
	 */

	public String toString() {
		return "Patient's name is: " + name + ". Age is: " + age + " and their weight is: " + weight;
	}

	public static void main(String[] args) {
		Patient kam = new Patient("Kam", 35, 90);
		System.out.println(kam);
	}

	@Override
	public double getValue() {
		return getWeight();

	}
}
