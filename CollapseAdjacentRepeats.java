import java.util.Scanner;
public class CollapseAdjacentRepeats {
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a line, and I’ll collapse the adjacent repeated characters in it:");
	String original =keyboard.nextLine();
	System.out.println("Without repeats:");
	System.out.println(collapse(original));

	}
	/**
	* Recursively remove the adjacent duplicate characters in a String.
	*
	* @param original the String from which duplicates will be removed
	* @return the original but with adjacent duplicates removed
	*/

	public static String collapse(String original){
		int len= original.length();
		if(len<=1){
			return original;
		}
		if(original.charAt(0) == original.charAt(1)){
			return collapse(original.substring(1,len));
		}
		
		return original.charAt(0)+collapse(original.substring(1,len));
	}
}
