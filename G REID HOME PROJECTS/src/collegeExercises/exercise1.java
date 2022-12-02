package collegeExercises;

import java.util.Scanner;

public class exercise1 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		double price = 15000.0, totalPrice = 0.0;
		double int1 = 0.0, int2 = 0.0, int3 = 0.0, int4 = 0.0, 
		int5 = 0.0, totalInt = 0.0;
		//Inputs
		System.out.print("\n\tPlease input vehicle price: £");
		price = key.nextDouble();
		//Process
		int1 = price / 100 * 5;
		int2 = (price / 5 * 4) / 100 * 5;
		int3 = (price / 5 * 3) / 100 * 5;
		int4 = (price / 5 * 2) / 100 * 5;
		int5 = (price / 5) / 100 * 5;
		totalInt = int1 + int2 + int3 + int4 + int5;
		//totalPrice = price + totalInt;
		System.out.print("\n\tPrice:        £" + price);
		System.out.print("\n\tInterest:     £" + totalInt);
		System.out.print("\n\tTotal Price:  £" + (price + 
		totalInt));
		}
}