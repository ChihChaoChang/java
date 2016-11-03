import java.util.Scanner;
import java.io.*;
public class Mirror {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter a string:");
		String str1 =keyboard.nextLine();
		int len=str1.length();
		int i=0;
		boolean isSame=true; 
		boolean isPal=true; 
		while (i< len/2 && isSame && isPal)
		{
			if(str1.charAt(i)==str1.charAt(len-i-1)){
				i++;
			}else{
				isSame=false;
				isPal=false;
			}
		}
		
		if(isPal==true){
			System.out.println(str1);
			}
		else if(i!=0){
		System.out.println(str1.substring(0,i));
		}else{
			System.out.println(len);
			System.out.println(i);
			System.out.println("the length is 0");
		}
	}
}
