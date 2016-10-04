import java.util.Scanner;

public class IfElseStatementsWhileDoLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		
		//Else if statements are what help create choices for users.
		
		//ex: lets use age..
		
		// Lets say the integer of "age" will be used to determine the If/Else results. 
		// while loops will also keep looping until the argument thats in the parenthesis becomes false.
	
	// this loop prints out "Count is: 1-4"
// In a do while, the do prints but the while evaluates the expression at the bottom of the loop instead of top.
	        int count = 1;
	        do {
	            System.out.println("Do While is: " + count);
	            count++;
	        } while (count < 5);
	    
	//this loop prints out as a while loop.
	        int i = 1;
	        while (i <5) { 
	        	System.out.println("While Loop " + i); i++;
	        }
	        
	        //another way to get the "continue?" input
	        String choice = "y";
	        /*
	        while (choice.equalsIgnoreCase("y")) {
	        	System.out.println("Continue?: (y/n)");
	        	choice = scanner.next();
	        }
	        */
	        // put it all together!
	        
	        while (choice.equalsIgnoreCase("y")) {
	        	System.out.println("pick a number 1-5");
	        	int anyInt = scanner.nextInt();
	        	if (anyInt == 2) {
	        		System.out.println("you guessed right! Continue?: (y/n)");
	        		choice = scanner.next();
	        	}else{ System.out.println("You guessed wrong. Continue?: (y/n)");
	        	choice = scanner.next();
	        }
	        	
	        	}
	        	
	        
	}
}
	