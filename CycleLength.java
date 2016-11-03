import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
public class CycleLength {
	
	public static void main(String[] args)throws IOException{
	PrintWriter outFile = new PrintWriter(new FileWriter("lcg.txt"));
	Scanner keyboard = new Scanner(System.in);
	System.out.println("This program calculates values generated by a linear congruential generator.");
	System.out.println("Separating values by spaces, please enter the multiplicative constant a,");
	System.out.println("additive constant b, seed value x0, and modulus N.");
	int a =keyboard.nextInt();
	int b =keyboard.nextInt();
	long x =keyboard.nextInt();
	int N =keyboard.nextInt();
	
	long tortoise=nextValue(a,b,x,N);
	long hare=nextValue(a,b,nextValue(a,b,x,N),N);
	
	while(tortoise != hare){
		tortoise =nextValue(a,b,tortoise,N);
		hare= nextValue(a,b,nextValue(a,b,hare,N),N);
	}
	
	int count=0;
	tortoise=x;
	 while (tortoise != hare){
		 tortoise =nextValue(a,b,tortoise,N);
		 hare =nextValue(a,b,hare,N);
		 count++;
	 }
	
	 int length=1;
	 hare = nextValue(a,b,tortoise,N);
	 while (tortoise != hare){
		 hare = nextValue(a,b,hare,N);
		 length++;
	 }
	
	
	System.out.println("The cycle length is "+length);
}
	public static long nextValue(int a, int b, long x, int N){
		boolean isVal=true;
		x=(a*x+b)%N;
		return x;	
	}	
}
