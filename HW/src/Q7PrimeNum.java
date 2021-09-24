
/*Write  a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive)
 *   input 1 should be lesser input 2. both should be positive
 *   range must be always greater than zero
 * */



import java.util.Scanner;

public class Q7PrimeNum {
	
	//class PrimeNumber {
	
	
	public static void main(String[]args) {
		
		Scanner primeNumber = new Scanner (System.in);
		//prime numbers is only divisible by itself and 1/prime numbers is num that is greater than 1

		int input1 =primeNumber.nextInt();
		int input2 = primeNumber.nextInt();
	    

		
		if (input1> input2 || input1 <=0 || input2<= 0) {
			
			System.out.println("Provide Valid Input");
			
		} else {
			
			int i = 0, number = 0;
			String prime =" ";
			
			for(i = input1; i <= input2; i++ ) {
				int counter =0;
				number = i;
				while(number >=1) {
					if(i % number ==0)
						 counter++;
					number--;
					
				}
				
				if(counter == 2)
					
					prime = prime + i + "";
			}
			
			System.out.println(prime);
		}
	
					
	}
}
			
			
			
			