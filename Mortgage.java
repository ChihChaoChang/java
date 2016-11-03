import java.text.DecimalFormat;
import java.util.Scanner;
public class Mortgage {
	public static void main(String[] args)
	   {
		  Scanner keyboard = new Scanner(System.in);
	      System.out.println("Please enter the outstanding balance (no commas, please): ");
	      double balance = keyboard.nextDouble();
	      System.out.println("Now, enter the monthly mortgage payment (again, no commas):");
	      double monthlyMortgage = keyboard.nextDouble();
	      System.out.println("Next, we need the annual interest rate. For example, enter 4.98% as 0.0498.");
	      System.out.print("Please enter the rate:");
	      double rate = keyboard.nextDouble();
	      
	      
	      DecimalFormat df = new DecimalFormat("##.00");
	      
	      double interest1=balance*rate/12;
	      interest1= Double.parseDouble(df.format(interest1));
	      double pricipalOne=monthlyMortgage-interest1;
	      pricipalOne= Double.parseDouble(df.format(pricipalOne));
	      
	      balance=balance-pricipalOne;
	      double interest2=balance*rate/12;
	      interest2= Double.parseDouble(df.format(interest2));
	      double pricipalTwo=monthlyMortgage-interest2;
	      pricipalTwo= Double.parseDouble(df.format(pricipalTwo));
	          
	      System.out.println("First Month");
	      System.out.println("Amount going to interest:" +interest1);
	      System.out.println("Amount going to principal:"+pricipalOne);
	      System.out.println("Second Month");
	      System.out.println("Amount going to interest:"+interest2);
	      System.out.println("Amount going to principal:"+pricipalTwo);
  
	   }
}
