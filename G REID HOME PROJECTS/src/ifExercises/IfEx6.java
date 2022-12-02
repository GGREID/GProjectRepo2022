package ifExercises;
import java.util.*;
public class IfEx6 
{

		public static void main(String[] args) 
		{
		//Write a program that prompts the user for two integers and then prompts 
		//the user to enter an option. If the choice is 1, add the two integers.  
		//If it is 2 subtract the second integer from the first and if it is 3, 
		//multiply the integers. Display the results of the arithmetic.
		//Modify the program so the user can enter 4 for divide. If the user enters 
		//4 and the second integer is 0, display an error message "Cannot divide by 
		//Zero"; otherwise divide the first number by the second and display the result.
		Scanner key = new Scanner(System.in);
		int no1 = 0, no2 = 0;
		double ans = 0.0;
		int opt = 0;
		char sign = ' ';
		boolean error = false;
		//Enter 2 numbers and mathematical function requires
		System.out.print("\n\tPlease enter number 1: "); 
		no1 = key.nextInt();
		System.out.print("\n\tPlease enter number 2: "); 
		no2 = key.nextInt();
		System.out.print("\n\n\tDo you want to:");
		System.out.print("\n\n\t1  Add");
		System.out.print("\n\t2  Subtract");
		System.out.print("\n\t3  Multiply");
		System.out.print("\n\t4  Divide");
		System.out.print("\n\n\tPlease enter option required: "); 
		opt = key.nextInt();
		//Calculate answer
		if (opt == 1)
		{
		ans = no1 + no2;
		sign = '+';
		}
		else if (opt == 2)
		{
		ans = no1 - no2;
		sign = '-';
		}
		else if(opt == 3)
		{
		ans = no1 * no2;
		sign = '*';
		}
		else if (opt ==4)
		{
		if (no2 == 0)
		{
		error = true;
		System.out.print("\n\n\tError - Cannot divide by Zero");
		}
		else
		{
		ans = (double)no1 / (double)no2;
		sign = '/';
		}

		}
		}
}
