import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

		/*
		try ()
		catch() catch(inputMismatchExpection ex) {
		RandomAccessFile in = new RandomAccessFiler(
		Runtime Errors
		Exceptions - There are two types: IO Exception and Runtime Exception.
		Under IO Expection are file not found exception
		Under Runtime exceptinon are Input MME and Null Pointer Ex
		throw new (exception)
		
		
		*/
		
		System.out.println("Enter a number");
		
		try {
			int number = scanner.nextInt();
			System.out.println("you entered: " + number);
		} catch (NullPointerException e) {
			System.out.println("Null point!!!");
		} catch (InputMismatchExpception e) {
			System.out.println("Null point!!!");
		}
		System.out.println("Goodbye.");
		scanner.close();
		
		}
		
		
		
	}


