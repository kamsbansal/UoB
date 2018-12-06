import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * The class creates an image in form of a greyscale image which is read in from
 * a file. It contains a method to crop the left upper half of the picture and
 * write it out again.
 *
 * @version 2018-08-24
 * @author Manfred Kerber
 */
public class PGMImage {
	private int width;
	private int height;
	private int maxShade;
	private String typeOfFile;
	private short[][] pixels;

	/**
	 * @param filename The name of a file that contains an image in pgm format of
	 *                 type P2.
	 *
	 */
	public PGMImage(String filename) {
		// try since the file may not exist.
		try {
			// we read from the scanner s which is linked to the file filename.
			Scanner s = new Scanner(new File(filename));

			/*
			 * The field variables are assigned by reading in from a file. The file should
			 * start with something like P2 150 176 255
			 * 
			 * where P2 is the file type, 150 the width of the image, 176 the height, and
			 * 255 the maximal grey value. Then follow 150*176 grey values between 0 and
			 * 255.
			 */

			// We read the initial element that is in our case "P2"
			typeOfFile = s.next();
			// Next we read the width, the height, and the maxShade.
			width = s.nextInt();
			height = s.nextInt();
			maxShade = s.nextInt();
			// We initialize and read in the different pixels.
			pixels = new short[height][width];
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					pixels[i][j] = s.nextShort();
				}
			}
		} catch (IOException e) {
			// If the file is not found, an error message is printed,
			// and an empty image is created.
			System.out.println("File not found.");

			typeOfFile = "P2";
			width = 0;
			height = 0;
			maxShade = 0;
			pixels = new short[width][height];
		}
	}

	/**
	 * @return The width of the image.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return The height of the image.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return The maximal grey value of the image.
	 */
	public int getMaxShade() {
		return maxShade;
	}

	/**
	 * @return The file type of the image.
	 */
	public String getTypeOfFile() {
		return typeOfFile;
	}

	/**
	 * @return The matrix representing the pixels of the image.
	 */
	public short[][] getPixels() {
		return pixels;
	}

	/**
	 * The method crops the left upper half of an image.
	 * 
	 * @param filename The filename of the file in which the cropped image should be
	 *                 saved.
	 */
	public void rotate(String filename) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));

			// We write the file type to go out.
			out.write(getTypeOfFile() + "\n");

			// We write the dimensions to go out.
			out.write((getWidth() / 2) + " " + (getHeight() / 2) + "\n");

			// We write maximal number.
			out.write(getMaxShade() + "\n");

			byte counter = 0;
			for (int i = 0; i < getWidth(); i++) {
				for (int j = 0; j < getHeight(); j++) { // switch the width and height around instead
					out.write(getPixels()[getHeight() - 1 - j][i] + " "); // swap the dimensions around
																			// so we have [j]
					// [i]
					counter++; // except that we get the height of the image and subtract it from 1 and then j
								// so that when the image rotates, the dimensions of the height will change.
					if (counter == 15) {
						out.write("\n"); // such that we do not have too long lines
						counter = 0;
					}
				}
			}
			out.write("\n");
			// We close the file.
			out.close();
		} catch (IOException e) {
			// Errors are caught.
			System.out.println("File not found.");
		}
	}

	/**
	 * The method inverts the grey scale in a picture so that dark goes to bright
	 * and vice versa
	 * 
	 * @param filename The filename of the file in which the inverted image should
	 *                 be saved.
	 */
	public void invert(String filename) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			// We write the file type to out.
			out.write(getTypeOfFile() + "\n");

			// We write the dimensions to out.
			out.write((getWidth()) + " " + (getHeight()) + "\n");

			// We write maximal number.
			out.write(getMaxShade() + "\n");

			byte counter = 0;
			for (int i = 0; i < getHeight(); i++) {
				for (int j = 0; j < getWidth(); j++) {
					out.write((255 - getPixels()[i][j]) + " ");
					counter++;
					if (counter == 15) {
						out.write("\n");
						counter = 0;
					}
				}
			}
			out.write("\n");
			// We close the file.
			out.close();
		} catch (IOException e) {
			// Errors are caught.
			System.out.println("File not found.");
		}
	}

	/*
	 * An example.
	 */
	public static void main(String[] args) {
		PGMImage cs = new PGMImage("ComputerScience.pgm");
		cs.rotate("ComputerScienceRotate.pgm");
		// cs.invert("ComputerScienceInvert.pgm");
	}
}
