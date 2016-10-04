import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Collections work similiarly to arrays.
		
		//Here's an array
		String[] array = new String[3];
		array[0] = "David";
		array [1] = "Bryan";
		
		System.out.println(array[1]);
		System.out.println(array.length);
		
		
//==========================================================================================================================================
		//Colletion
		ArrayList list = new ArrayList();
		list.add("David");
		list.add("Bryan");
		
		list.add(1,"Kim");
		
		Collections.sort(list); // puts in alphabetical order
		//*********************IMPORTANT****************************
		//To print out certain values in the collection, don't use the [] but the () characters!
		
		System.out.println(list.get(1));
		
		
		System.out.println(list.size());
		System.out.println(list);
		
	

	 
		// TODO Auto-generated method stub
		
		
//==============================================================================================================================================
		//Hashset's don't print duplicates. but lists do.
		
		
		HashSet set = new HashSet();
		set.add("David");
		set.add("Bryan");
		
		System.out.println(set.size());
		System.out.println(set);
		
//==============================================================================================================================================
		
		
		HashMap map = new HashMap();
		map.put("Pepperoni", 4);
		map.put("Cheese", 2);
		map.put("Veggie", 7);
		
		System.out.println(map.size());
		System.out.println(map.get("Pepperoni"));
		System.out.println(map);
		
		
//==============================================================================================================================================	
		
		//you cannot use primitive types in a list. ex: int, doubles, char, string
		
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(1);
		listOfNumbers.add(2);
		listOfNumbers.add(3);
		System.out.println(listOfNumbers);
	}

	private static void sort(ArrayList list) {
		// TODO Auto-generated method stub
		
	}
}

