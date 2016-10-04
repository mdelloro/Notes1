
public class Lab22_ashuri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		package day1;

		import java.util.Scanner;

		public class Lab22 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				String value = null;
				String variableName = value;
				System.out.println("Welcome! What is your name?");
				String firstName = sc.nextLine();
				
				String answer;
				String answery = "yes";
				String answern = "no";
				
				
				String decision;
				String decisionr = "run away";
				String decisionf = "throw hands";
				
				String heads;
				String headsone = "face";
				String headstwo = "chest";
				String headsthree = "stomach";
				
				String weapon;
				String weaponone = "tissue";
				String weapontwo = "lollipop";
				String weaponthree = "dollar"; 
				
				
				String eyecolor;
				String dragonname;
				
				
				System.out.println("Would you like to play a game? (enter \"YES\" or \"NO\")");
				answer = sc.nextLine();

			        if (answer.equalsIgnoreCase(answery)) {
			            System.out.println("Groovy! You are out to get a coffee and a lizardman attempts to kidnap you! What do you do? (enter \"THROW HANDS\" or \"RUN AWAY\")");
			            decision = sc.nextLine();
			            

			            if (decision.equalsIgnoreCase(decisionf)) {
			                System.out.println("So brave! With a mighty force, you rip open your shirt, flex intimidatingly, and assume a defensive stance on all fours. ");
			                System.out.println("The scaled creature rushes toward you and you punch it directly in its _______. (Enter \"face\" or \"chest\" or \"stomach\")");
			                heads = sc.nextLine();
			                
			                if (heads.equals(headsone)) {
			                	System.out.println("You let out a loud \"WHOO!\" as the lizardman winces and rubs its bruised cheek. He begans to weep softly.");
			                	System.out.println("Feeling sorry, you reach into your pocket to give the lizardman a _______. (Enter \"tissue\" or \"lollipop\" or \"dollar\")");
			                	weapon = sc.nextLine();
			                	
			                	if (weapon.equalsIgnoreCase(weaponone))  {
			                		System.out.println("He takes the tissue and wipes away his lizard tears. Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                		
			                	}
			                	if (weapon.equalsIgnoreCase(weapontwo))  {
			                		System.out.println("He unwraps the lollipop, pops it into his lizard mouth, and wipes away his lizard tears. Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                	
			                	
			                	if (weapon.equalsIgnoreCase(weaponthree))  {
			                		System.out.println("Dollar in hand, the lizardman's newfound wealth is sure make him forget of his injuires! Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                	
			                	}
			                	
			                	}
			    
			                }
			                
			                if (heads.equals(headstwo)) {
			                	System.out.println("You let out a loud \"WHOO!\" as the lizardman winces and holds his chest. He begans to weep softly.");
			                	System.out.println("Feeling sorry, you reach into your pocket to give the lizardman a _______. (Enter \"tissue\" or \"lollipop\" or \"dollar\")");
			                	weapon = sc.nextLine();
			                	
			                	if (weapon.equalsIgnoreCase(weaponone))  {
			                		System.out.println("He takes the tissue and wipes away his lizard tears. Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                	
			                	}
			                	if (weapon.equalsIgnoreCase(weapontwo))  {
			                		System.out.println("He unwraps the lollipop, pops it into his lizard mouth, and wipes away his lizard tears. Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                	
			                	}
			                	if (weapon.equalsIgnoreCase(weaponthree))  {
			                		System.out.println("Dollar in hand, the lizardman's newfound wealth is sure make him forget of his injuires! Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                	
			                	}
			                }
			                
			                if (heads.equals(headsthree)) {
			                	System.out.println("You let out a loud \"WHOO!\" as the lizardman winces and holds his chest. He begans to weep softly.");
			                	System.out.println("Feeling sorry, you reach into your pocket to give the lizardman a _______. (Enter \"tissue\" or \"lollipop\" or \"dollar\")");
			                	weapon = sc.nextLine();
			                	
			                	if (weapon.equalsIgnoreCase(weaponone))  {
			                		System.out.println("He takes the tissue and wipes away his lizard tears. Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                	
			                	}
			                	if (weapon.equalsIgnoreCase(weapontwo))  {
			                		System.out.println("He unwraps the lollipop, pops it into his lizard mouth, and wipes away his lizard tears. Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                	
			                	}
			                	if (weapon.equalsIgnoreCase(weaponthree))  {
			                		System.out.println("Dollar in hand, the lizardman's newfound wealth is sure make him forget of his injuires! Upon closer inspection, you realize that his eyes are (Enter \"RED\" or \"BLUE\")");
			                		eyecolor = sc.nextLine();
			                		
			                		System.out.println("Oh my... little does anyone know," + " " + eyecolor + " "+ "colored eyes are your \"thing\". Blushing shyly, you ask it it's name. (Enter a name)");
			                		dragonname = sc.nextLine();
			                		
			                		System.out.println(firstName + " " + "and" + " " + dragonname + " " + "lived happily ever after. The End!");
			                	
			                	}
			                }
			                
			             
			               
			                
			            }
			            if (decision.equalsIgnoreCase(decisionr)) {
			                System.out.println("Smart move. You got away safely, regardless of your cowardice.");
			                System.exit(0);
			            }

			        }
			        if (answer.equalsIgnoreCase(answern)) {
			            System.out.println("K bye.");
			            System.exit(0);
				
			        }
		sc.close();
			}

		}

	}

}
