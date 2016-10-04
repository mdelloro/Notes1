
public class JavaSnippet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		import java.util.Scanner;

		public class Lab3 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("Learn your squares and cubes!");
				Scanner scanner = new Scanner(System.in);
				int lastNumber;
				String choice = "y";
				do {
					System.out.println("Enter an integer");
					lastNumber = scanner.nextInt();
					printTableForLastNumber(lastNumber);
					
					System.out.println("Continue?(y/n):");
					choice = scanner.next();
				} while (choice.equalsIgnoreCase("y"));
				
				System.out.println("Good bye");
			}
			
			public static void printTableForLastNumber(int lastNumber) {
				printTableHeader();
				for (int i = 1; i <= lastNumber; i++) {
					printLineForNumber(i);
				}
			}
			
			public static void printTableHeader() {
				System.out.println("Number" + "\t" + "square" + "\t" + "cube");
				System.out.println("======" + "\t" + "======" + "\t" + "=====");
			}
			
			public static void printLineForNumber(int number) {
				int square = calculateSquare(number);
				int cube = calculateCube(number);
				System.out.println(number + "\t" + square + "\t" + cube);
			}
			
			public static int calculateSquare(int number) {
				return number * number;
			}
			
			public static int calculateCube(int number) {
				return number * number * number;
			}
			
			
		}
		1 Comment
		
		
	}

}
