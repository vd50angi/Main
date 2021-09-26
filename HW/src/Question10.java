
import java.util.Scanner;
public class Question10  {
	
	
	// find the sum  that is divisible by 3, 5 and 7
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Enter 4 positive numbers");
	}
		int number = sc.nextInt();
		 if(number < 0 || number > 100) {
			 System.out.println(number + " is Invalid Number");
		 }
		 else {
			 while(number!=0) {
				int div = number%10;
				sum = sum + div;
				number = number/10;
			 }
		 
		 
			 if (sum%3 ==0 || sum%5==0 || sum%7==0) { 
		
			 
			 System.out.println("Lucky Number");
			 
			
		 }
	
		 }

	
			 
	
		 