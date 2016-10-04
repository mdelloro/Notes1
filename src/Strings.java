import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "quick"; // originally we say that String s = quick (System
							// thinks s = quick)

		s = s + "fox"; // By adding this equation, we are telling the computer
						// that String S is NOW s+fox = quickfox

		System.out.println(s);

		// Another way to create strings is using the "NEW STRING ASSIGNER"
		
		String s1 = new String("youtube");
		
		String s2 = new String ("youtube" + s1); // By using "new String" you create ANOTHER "Youtube" in the pool.
		//; You can also add string together as you can see above the line.
		
		System.out.println(s1);
		System.out.println(s2);
		
		String word1 = "Hello World";
		System.out.println(word1);
		
		char character = word1.charAt(1);
		System.out.println(character);;
		System.out.println(word1.indexOf('1'));
		System.out.println(word1.startsWith("World"));
		System.out.println(word1.endsWith("World"));
		
		
		String word2 = word1.replace('1', '5');
		System.out.println(word1.substring(7,  10));
		
		System.out.println(Arrays.asList( word1.split(" ")));
		System.out.println(word1.toUpperCase());
		System.out.println(word1.toLowerCase());
		
		// Strings cannot be changed. But a stringbuffer CAN be changed. Similar to a string.
		// The string buffer is "append()
		
		StringBuffer sb = new StringBuffer();
		sb.append(word1);
		sb.append(" ");
		sb.append("World");
		System.out.println(sb);
		
		/*
		concatenating - joining strings

		word1.concat(word2); - another way to join strings
*/
		
		/* to string method
		 * go to source and generate two string method.
		 */
		
		
	}

}
