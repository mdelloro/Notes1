import java.util.Scanner;

public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		     
		
		    Scanner o=new Scanner(System.in);    
		    int num,i,temp=1,temp2=1;    
		    System.out.print("\nEnter Table number for powerseries:  ");    
		    num=o.nextInt();    

		    for(i=1;i<=10;i++)    
		        {    
		    System.out.println(num+" ^ "+i+" = "+(temp2*num));    
		    temp2=temp2*num; /*multiply coming number*/
		        }       
		    }   
	
		
		
		
	}

