import java.util.Scanner;

public class User_Y_N_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Do you live in Michigan? (y/n)");
		String yesOrNo = scanner.next();

		if (yesOrNo.equals("y")) {
			System.out.println("Excellent!");
			
			System.out.println("Do you live in Detroit? (y/n)");
			yesOrNo = scanner.next();
			if (yesOrNo.equalsIgnoreCase("y")) {
				System.out.println("Come visit Grand Circus!");
			} else {
				System.out.println("You should move.");
			
			}
		} else {
			System.out.println("Sorry to hear that. :(");
		}

		scanner.close();
		
	}

}
