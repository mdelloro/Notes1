import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Array - an object that contains one or more items called "elements.
		 * All elements of an array must be of the same type. arrays in java
		 * have a fixed length or size that indicates the number of elements
		 * that it contains. You can code the number of elements as a literal, a
		 * constant, or a variable of type int.
		 */

		int[] arrayOfNumbers = new int[4]; // since the array is an "int" java
											// will put "0s" in the boxes
		int[] otherArray;

		otherArray = arrayOfNumbers;

		arrayOfNumbers[0] = 4; // This tells that the number 4 is in the first
								// spot of the array.
		arrayOfNumbers[1] = 8; // this tells that the 2nd number is number 8

		System.out.println(arrayOfNumbers[0]);
		System.out.println(arrayOfNumbers[1]);
		System.out.println(arrayOfNumbers[3]);
		System.out.println(arrayOfNumbers[4]);
		// ==============================================================================================
		// How to print an array ofp rices to the console.
		double[] prices = { 10.1, 12.5, 13.6 };
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		{
			// TODO Auto-generated method stub

			String[] students = { "Michael", "Sam", "Joe", "Renee", "Jim" };

			for (int i = 0; i < students.length; i++) {
				System.out.println((i + 1) + ". " + students[i]); // This allows
																	// you to
																	// put
																	// numbers
																	// next to
																	// the
																	// student's
																	// name
				// by adding the i+1 = this makes it so the number starts at 0.
				// and not 1.

			}
			// ORRR use an enhanced loop
			for (String studentList : students) {
				System.out.println(studentList);
			}
			// ORRR another way to do this is...
			int counter = 1;
			for (String studentList2 : students) {
				System.out.println(counter + ". " + studentList2);
				counter++;

			}
			// code that computes the average of the array of prices - look it
			// up

			// TWO DIMENSIONAL ARRAYS
			// the simplest type of two dimensional array is a rectangular
			// array, in which each row has the same number of columns
			// Example: type [] [] arrayName = new type [rowCount]
			// [columnCount];

			// ====================================================================================
			int[] array = new int[6];
			int[] array2 = new int[6];

			Arrays.fill(array, 1); // this fills array with all ones, if not,
									// it's all 0's
			Arrays.fill(array2, 1);

			System.out.println(Arrays.equals(array, array2)); // this tells the
																// computer to
																// check to see
																// if both
																// arrays are
																// equal to each
																// other.
			// In this case, they are both equal to each other.

//==============================================================================================================================================		
			
			
		}
	}

}
