package collegeExercises;
import java.util.*;
public class Exercise3 
{	//Input a temperature in degrees Fahrenheit.  Convert to degrees Celsius.
	public static void main(String[] args) 
	{
		
		
		double degF =0;
		double degC =0;
				
		Scanner key = new Scanner(System.in);
		System.out.print("\n\tPlease enter the temperature in Degrees F: ");
		degF =key.nextInt();
		
		degC = (degF-32)/9*5;
		System.out.printf("\n\tThis converts to Degrees C: "+"%.2f", degC);
						
				
	}

}
