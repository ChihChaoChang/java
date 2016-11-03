import java.util.Scanner;
public class Satellite {
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter an integer number of microseconds:");
		long k =keyboard.nextInt();
		
		System.out.println("he number of different 10-microsecond-long messages is "+countMessages(k)+".");
	}
	
	/**
	* Recursively determine the number of different messages composed
	* of only dots and dashes that can be sent in exactly a specified time.
	* The calculation assumes that a dot takes 2 microseconds to send, and
	* that a dash takes 3 microseconds to send.
	*
	* @param k the length of time, in microseconds, that we have to fill
	* @return the number of different messages which can be sent
	* in exactly the length of time specified by the argument
	*/
	public static long countMessages(long k){
		
		if(k==0){	
			return 1;
		}else if(k==1){
			return 0;
		}else if(k==2){
			return 1;
		}else if(k==3){
			return 1;
		}else if(k==4){
			return 1;
		}
		return countMessages(k-2)+countMessages(k-3);
	}

}
