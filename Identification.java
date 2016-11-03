import java.util.Scanner;
public class Identification {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		//named constant representing desired PIN value
		final String TARGET_PIN = "1234";
		int counter=0;
		String pinNumber;
		boolean Value=false;
	
		while (!Value && counter<3){
			 System.out.print("Please enter your PIN number:");
			 pinNumber =keyboard.next();
			 counter++; 
			 if(pinNumber.equals(TARGET_PIN)){
				 Value=true;
				 break;
			 }
		 }
		
		 if(Value){
			 System.out.println("You are successfully logged in.");
		 }else{
			 System.out.println("You made 3 unsuccessful login attempts.");
			 System.out.println("Your account is locked. Please contact the bank.");
		 }
		 System.out.println("Goodbye.");
	}	
}
