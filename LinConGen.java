import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
public class LinConGen {
	public static void main(String[] args)throws IOException{
    PrintWriter outFile = new PrintWriter(new FileWriter("lcg.txt"));
	Scanner keyboard = new Scanner(System.in);
	System.out.println("This program calculates values generated by a linear congruential generator.");
	System.out.println("Separating values by spaces, please enter the multiplicative constant a,");
	System.out.println("additive constant b, seed value x0, and modulus N.");
	int a =keyboard.nextInt();
	int b =keyboard.nextInt();
	int x =keyboard.nextInt();
	int N =keyboard.nextInt();
	System.out.println("Writing the first "+N+" values of the sequence to file lcg.txt.");
	int counter=0;
	int times=N;
	while(times!=0){
		outFile.printf("%4d ",x);
		x=nextValue(a,b,x,N);		
		counter++;
		if(counter==16){
			outFile.println();
			counter=0;	
		}
	times--;
	}
	outFile.close();
	}
	public static int nextValue(int a, int b, int x, int N){
		boolean isVal=true;
		x=(a*x+b)%N;
		return x;	
	}	
}

