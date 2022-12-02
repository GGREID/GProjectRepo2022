package collegeExercises;
import java.util.*;
public class Exercise4 
	{

		public static void main(String[] args) 
		
		//Find the Surface Area and Volume of a Cone for a given radius and height
		{
		Scanner key = new Scanner(System.in);
		
		double radius = 0;
		double height = 0;
		double surfaceArea = 0;
		double volume = 0;
		double Pi = Math.PI;
		
		System.out.print("\n\tPlease enter radius: ");
		radius = key.nextDouble();
		
		System.out.print("\n\tPlease enter height: ");
		height = key.nextDouble();
		
		System.out.print("\n\tThe volume of the cone is: "+volume);
		/*volume = //((height*Pi)+(radius*radius));
		//height x π x radius2
		System.out.print("\n\tThe surface area of the cone is: "+surfaceArea);
		/*surfaceArea =
		/*(height+radius)+(Pi);
		//πr (r + √ (h² + r²))*/
			
		
		
		}

	}
