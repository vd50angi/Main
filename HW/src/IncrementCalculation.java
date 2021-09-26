
import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		
		System.out.println("Enter the Performance Appraisal Rating");
		double appraisalRating = sc.nextDouble();
		
		if (salary <= 0 || appraisalRating < 5 ) {
		
	//if salary is 0 or negative and appraisal rating  isa not range of 1 to 5 display 	Invalid input
			System.out.println("Invalid Input");
						
		}
		
		else if (appraisalRating >= 1 && appraisalRating  >=3) {
			salary = (int) (salary + (0.1 * salary));
		//	//if the appraisal rating  is between 1 & 3 , the salary increment is 10%	
			System.out.println(salary);
		}
		
		else if (appraisalRating > 3.1 && appraisalRating >= 4) {
			salary = (int) (salary + ( 0.25 * salary));
	// 		//if the appraisal rating  is between 3.1 & 4 , the salary increment is 25%	
			System.out.println(salary);
		}
		
		else if (appraisalRating >= 4.1 && appraisalRating >=5) {
			salary = (int) (salary + (0.3 *salary));
			//if the appraisal rating  is between 4.1 & 5 , the salary increment is 30%	
			System.out.println(salary);
			
		}
	}
			
			
			
			
		
		
		
		
		
	
		
	
	
	
	
	
}
