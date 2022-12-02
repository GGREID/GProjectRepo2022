 package ifExercises;

import java.util.Scanner;

public class ifEx3 
		{
		public static void main(String[] args) 
		{
			Scanner key = new Scanner(System.in);
			double gpa = 0.0, testScore = 0.0;
		
		//Input GPA and test score
			System.out.print("\n\tPlease enter your GPA: ");
			gpa = key.nextDouble();
		
			System.out.print("\n\tPlease enter test score: ");
			testScore = key.nextDouble();
		
			//Determine if accepted/rejected
		if (((gpa < 0) || (gpa > 4)) || ((testScore < 0) || (testScore > 100)))
		{
			System.out.print("\n\tInvalid score/s entered");
			System.out.print("\n\tPlease re-enter your data!");
		}
		else if 
				((gpa >= 3) && (testScore >= 60))
				System.out.print("\n\n\tAccept");
		
		else if 
				((gpa < 3) && (testScore >= 80))
				System.out.print("\n\n\tAccept");
		
		else
				System.out.print("\n\n\tReject");
		}
	}



