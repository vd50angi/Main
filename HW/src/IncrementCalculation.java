
import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		
		System.out.println("Enter the Performance Appraisal Rating");
		double appraisalRating = sc.nextDouble();
		
		if (salary > 0 || appraisalRating < 0.1 || appraisalRating > 0.3) {
			
			System.out.println("Invalid Input");
						
		}
		
		else if (appraisalRating >= 1 && appraisalRating  >=3) {
			salary = (int) (salary + (0.1 * salary));
			
			System.out.println(salary);
		}
		
		else if (appraisalRating > 3.1 && appraisalRating >= 4) {
			salary = (int) (salary + ( 0.25 * salary));
			
			System.out.println(salary);
		}
		
		else if (appraisalRating >= 4.1 && appraisalRating >=5) {
			salary = (int) (salary + (0.3 *salary));
			
			System.out.println(salary);
			
		}
	}
			
			
			
			
		}
		
		
		
		
				
	}
		
	
	
	
	
	
}
