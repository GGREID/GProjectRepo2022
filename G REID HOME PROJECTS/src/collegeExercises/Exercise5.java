package collegeExercises;
import java.util.*;
public class Exercise5 
{

	public static void main(String[] args) 
	{
		/* Write a program which reads two integers, 
		 * divides the second integer into the first and outputs the result as follows:
		 * For example, if the input is: 10      3
		The output should be:
        10 divided by 3 equals 3, remainder 1
		*/
		Scanner key = new Scanner(System.in);
		
		double a =0.0;
		double b =0.0;
		
		System.out.print("\n\tplease enter int a: ");
		a =key.nextInt();
		
		System.out.print("\n\tplease enter int b: "); 
		b =key.nextInt();
		
		double total =(a/b);
		System.out.printf("\n\tThis is a divided by b: "+"%.2f", total);
		
	}


}
