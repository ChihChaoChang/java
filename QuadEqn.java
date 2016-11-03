import java.util.Scanner;
public class QuadEqn {
	public static void main(String[] args)
	  {
		  Scanner keyboard = new Scanner(System.in);
		  System.out.println("Please enter a: ");
	      double a = keyboard.nextDouble();
	      System.out.println("Please enter b: ");
	      double b = keyboard.nextDouble();
	      System.out.println("Please enter c: ");
	      double c = keyboard.nextDouble();
	      double root= Math.pow(b,2)-4*a*c;
	      double x1=(-b+Math.sqrt(root))/2*a;
	      double x2=(-b-Math.sqrt(root))/2*a;
			
	      System.out.println("the root:"+x1+"  "+ x2);
	
	   }
}
