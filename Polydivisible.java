import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
public class Polydivisible {
	public static void main(String[] args)throws IOException{
		
		PrintWriter outFile = new PrintWriter(new FileWriter("poly1.txt.out"));
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the name of the input file:");
		String input = keyboard.next();
		Scanner inFile  = new Scanner(new FileReader(input));
		
		int counter=0;
		int output=0;
		while(inFile.hasNext()){
			 String num=inFile.nextLine();
			// System.out.println("num and length "+num+"  "+num.length());
			 counter++;	
			 if (isPolydivisible(num)){
			//	 System.out.println(num);
				 outFile.println(num);
				 output++;
			 };
			 //System.out.println("yoyo");
		}
		System.out.println("Read "+counter+" values from input file poly1.txt.");
		System.out.println("Wrote "+output+" of them to output file poly1.txt.out.");
		inFile.close();
		outFile.close();
	}
	
	/**
	Check if the specified long integer is
	polydivisible or not.
	@param num the number to check
	@return true exactly when argument
	is polydivisble
	*/
	public static boolean isPolydivisible(String num){
		int len=num.length();
		boolean isPoly=true;
		long Number=Integer.parseInt(num);
		for(int i=len;i>=1;i--){
			if(Number % i==0){
				Number=Number/10;
				continue;
			}else{
				isPoly=false;
				break;
			}
		}
		return isPoly;
	}
}
