import java.util.Scanner;
public class Divisors {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Given a specific range of positive integers to search, this program will");
		System.out.println("determine a value in the range which has the highest number of divisors.");
		System.out.println("You get to select the range.");		
		System.out.println();
		System.out.println("Please specify the range by entering two positive integers:");
		int numOne =keyboard.nextInt();
		int numTwo =keyboard.nextInt();
		int temp,counter=0,max=0,num=0;
		while ((numOne<=0) ||(numTwo <=0)){
			System.out.println("Please specify the range by entering two positive integers:");
			 numOne =keyboard.nextInt();
			 numTwo =keyboard.nextInt();
		}
		if(numOne>numTwo){
			temp=numOne;
			numOne=numTwo;
			numTwo=temp;
		}
		
		for (int i=numOne;i<numTwo;i++){
			for(int j=1;j<=i;j++){
				if(i%j==0){
					counter++;
				}
				if(counter>num){
					max=i;
					num=counter;
				}
			}
			counter=0;
		}
		
		System.out.println("Okay, checking values between "+numOne+" and "+numTwo+"...");
		System.out.println("The winning number is "+ max+ " with " + num+ " divisors.");
	}
}
