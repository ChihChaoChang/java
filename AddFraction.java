import java.util.Scanner;
public class AddFraction {
	public static void main(String[] args)
	   {
	      Scanner keyboard = new Scanner(System.in);
	      System.out.print("Please enter the numerator of the first fraction: ");
	      int n1 = keyboard.nextInt();
	      System.out.print("Please enter the denominator of the first fraction: ");
	      int d1 = keyboard.nextInt();
	      System.out.print("Please enter the numerator of the second fraction: ");
	      int n2= keyboard.nextInt();
	      System.out.print("Please enter the denominator of the second fraction: ");
	      int d2 = keyboard.nextInt();
	   
	      int sumn =n1*d2+n2*d1;
	      int sumd = d1*d2;
	      
	      System.out.println("Now adding fractions "+n1+"/"+d1+" and "+n2+"/"+d2+"... ");
	      System.out.println("Their sum is "+sumn+"/"+sumd+".");
	      System.out.println(".");
	   }
	
	
	
	
}
