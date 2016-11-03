import java.util.Scanner;
public class Electricity {

	public static void main(String[] args)
	   {
	      Scanner keyboard = new Scanner(System.in);
	      System.out.print("Please input last month’s meter reading [0-99999]: ");
	      int n1 = keyboard.nextInt();
	      System.out.print("Please input this month’s meter reading [0-99999]: ");
	      int n2 = keyboard.nextInt();
	      int num=n2-n1;
	      double cost;
	      System.out.println("You entered readings of "+n1+" and "+n2+".");
	      if (n1<0||n1>99999||n2<0||n2>99999){    	  
	    	 System.out.println("You have entered an invalid input value, so no bill will be produced.");
	      }else{ 
	    	  if(num<0){
	    		  num=num+99999+1;
	    	  }
	    	  if(num<=1000){
	    		  cost=num*0.07;
	    	  }else if(num<=2500){
	    		  cost=(num-1000)*0.05+70; 	  
	    	  }else{
	    		  cost=(num-2500)*0.03+145;
	    	  }
	    	  System.out.printf("You used %d kilowatt-hour(s), and you owe $%.2f.",num,cost);
	    	  
	      }
	   }	
}
