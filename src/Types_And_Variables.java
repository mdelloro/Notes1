
public class Types_And_Variables {

	public static void main(String[] args) {
		// whole numbers
		byte teensyNumber = 65;
		short smallNumber = 800;
		int number = 7;
		long largeNumber = 7400000000L;

		// floating point (decimal) numbers
		float price = 6.95f;
		double pi = 3.14159265359;

		// character (any number, letter, whitespace, symbol, etc.)
		char letter = 's';

		// true or false
		boolean isRainy = true;

		// a sequence of characters
		String words = "What a fine day for Computer Science!";


		// *Declaration*
		int count;

		// *Initialization* (also assignment)
		count = 5;

		// *Assignment* again but not initialization because it's already been initialized
		count = 10;

		// Declaration and initialization in one line
		int total = 4;

		// implicit cast (widening conversion)
		long larger = number;

		// explicit case (narrowing conversion)
		int smaller = (int) larger;		// TODO Auto-generated method stub

	}

}
