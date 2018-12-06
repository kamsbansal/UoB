import java.util.ArrayList;

/**
 * @author Kam Bansal
 * @version 16.11.2018
 * 
 *          Class Statistics to calculate maximum, max number of double.
 *          Average, of double and standDeviation of double.
 */

public class Statistics {

	/**
	 * Calculate the maximum from an Array of elements between i and nth elements
	 * size. maximum is recorded when the the getValue parameter is greater than the
	 * next i in the ArrayList.
	 */

	public static double maximum(ArrayList<Measurable> elements) {

		double maximum = 0;

		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getValue() > maximum) {
				maximum = elements.get(i).getValue();

			}
		}
		return maximum;
	}

	/**
	 * @param Calculate the average from an Array of elements between i and nth
	 *                  elements size. average sums all the values, which is then
	 *                  divided by the size of the element to determine the average.
	 */

	public static double average(ArrayList<Measurable> elements) {

		double average = 0;
		for (int i = 0; i < elements.size(); i++) {
			average += elements.get(i).getValue();
		}
		return average / elements.size();

	}

	/**
	 * Calculates the standard deviation, by taking the average. Then squaring the
	 * difference between the elements and the average. Then we sum the squared
	 * differences. Then this value is divided by the length of the array list minus
	 * one. Finally the standard deviation is the square root of this value.
	 */

	public static double standardDeviation(ArrayList<Measurable> elements) {

		double average = average(elements);
		double sum = 0;

		for (int i = 0; i < elements.size(); i++) {

			sum += (elements.get(i).getValue() - average) * (elements.get(i).getValue() - average);

		}
		return Math.sqrt((sum / (elements.size() - 1)));
	}
}
