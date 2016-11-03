import java.util.Scanner;
public class Vowels {
	 public static void main(String[] args)  {
		 Scanner keyboard = new Scanner(System.in);
		 System.out.print("Please enter a phrase:");
		 String s =keyboard.nextLine();
		 System.out.print("The number of vowels in that sentence is "+countVowels(s)+".");
	 }
	
/**
* Recursively determine the number of vowel characters present in a String.
* This method counts both upper-case and lower-case vowels in the total,
* and assumes that ’y’ and ’Y’ are consonants (and so does not count them
* as vowels).
*
* @param str the String in which to count
* @return the number of question marks appearing in the argument
*/
	 public static int countVowels(String s){
		 int count=0;
		 int len = s.length();
		// System.out.println(len);
		 s=s.toLowerCase();
		 if(s.length()==0){
			 return 0;
		 }
		 if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'){
			 count=1;
		 }
	return 	 count+countVowels(s.substring(1,len));
	}
}



