

   import java.util.Scanner;

   public class Question8 {
	
			
		// the number is called palindrome if it is equal to reverse of its number
		
		public static void main(String[]args)   {
			// TODO Auto-generated method stub
			
		int num = 0, reversedNum = 0 , remainder;
		int originalNum = num;
		
		Scanner palindrome= new Scanner(System.in);
		  //originalNum=palindrome.nextInt();
		// enter number  to determine if it 's palindrome/ match
		
		System.out.println(" Enter  your number");
		
		while(num != 0) {      //get the reversed of the orignum and store it to originalNum(variable)
			remainder = num % 10;
				remainder = num % 10;
				reversedNum = reversedNum * 10 + remainder;
				num/=10;
			}
		//originalNumn = palindrome.nextLine();
		 
		 if (originalNum == reversedNum {
			 
		 	System.out.println("Palindrome");
			  //num =  palindrome.nextInt.in();
		 }
			 	
		if (originalNum !=  reversedNum) {
			 
				 System.out.println("Not Palindrome");
			 }
		 
			 else
			 {
			System.out.println ("iInvalied Input"); 
			
			 }
		 }

		
			 
			
		

				



	
	
	
	

}
