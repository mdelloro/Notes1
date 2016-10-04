import java.util.Scanner;

public class JavaSnippet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		
		String yesOrNo = "n";
		boolean theyWantToQuit = false;
		boolean theyWantToContinue = true;
		
		while ( theyWantToContinue ) {
			System.out.println("Do Something.");
			
			System.out.println("Do you want to quit?");
			yesOrNo = scanner.next();
			theyWantToQuit = yesOrNo.equals("y");
			theyWantToContinue = ! theyWantToQuit;
		}
		
	}

}
