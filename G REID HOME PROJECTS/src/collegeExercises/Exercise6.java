package collegeExercises;

import java.util.Scanner;

public class Exercise6 
{

	public static void main(String[] args) 
	{
		/*A town in the desert has a water tank that contains 10,000 gallons of water. 
		 * If there is no rain, calculate the number of weeks the water will last 
		 * for an input weekly water usage of 650 gallons
		 */
		Scanner key = new Scanner(System.in);
		
		double waterTank =0;
		double waterUsage=650; 
		double days =0;
		
		System.out.print("\n\tPlease enter level of water in tank in gallons: ");
		waterTank = key.nextInt();
		
		days=(waterTank/waterUsage); 
		System.out.printf("\n\tThis water should last in days: "+"%.2f", days);
		
		
	}

}
