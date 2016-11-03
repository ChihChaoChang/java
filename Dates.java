import java.util.Scanner;
import java.io.*;
public class Dates {
	public static void main(String[] args)
	   {
		boolean valid=true;
		Scanner keyboard = new Scanner(System.in);
	    System.out.print("Please enter the date(YYYY/MM/DD):");
		String dateAsString =keyboard.next();
		int y = Integer.parseInt(dateAsString.substring(0,dateAsString.indexOf('/')));
		int m = Integer.parseInt(dateAsString.substring(dateAsString.indexOf('/')+1,dateAsString.lastIndexOf('/')));
		int d = Integer.parseInt(dateAsString.substring(dateAsString.lastIndexOf('/')+1,dateAsString.length()));
		
		int[] DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if(y<0){
			System.out.println("The date " +dateAsString+" is invalid since "+y+" is not a valid year.");
			return;
		}
	    if(m>=12|| m<=1){
	    	 System.out.println("The date " +dateAsString+" is invalid since "+m+" is not a valid month.");
	    	 return;
	    }	
	    if((y%4==0)&&(y%100!=0)||y%400==0){
	    	DAYS[2]=29;
	    }
	    if(d < 1 || d > DAYS[m]){
	    	System.out.println("The date " +dateAsString+" is invalid since "+d+" is not a valid day for the given month and year.");
	    	 return;
	    }    
	    System.out.println("The date " +dateAsString+" is valid.");
	  }	
}
