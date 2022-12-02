package methods;

import java.util.Scanner;

import general.My;

public class MethodsEx7 {

	public static void main(String[] args) {

		/*
		 * 7. Write a program that inputs three numbers and passes then to a method
		 * which returns the smallest number. The method should take decimal values as
		 * parameters.
		 */
Scanner key = new Scanner(System.in);
		
		double no1, no2, no3;

		My.p("\n\tPlease enter number 1:  ");
		no1 = key.nextDouble();
		My.p("\n\tPlease enter number 2:  ");
		no2 = key.nextDouble();
		My.p("\n\tPlease enter number 3:  ");
		no3 = key.nextDouble();

		My.p(String.format("\n\n\tNumber 1:  %5.2f", no1));
		My.p(String.format("\n\tNumber 2:  %5.2f", no2));
		My.p(String.format("\n\tNumber 3:  %5.2f", no3));

		My.p(String.format("\n\n\tThe smallest number is:  %5.2f", smallest(no1, no2, no3)));	
	}
	
	public static double smallest(double no1, double no2, double no3)
	{
		return Math.min(no1, Math.min(no2, no3));

	}
}
