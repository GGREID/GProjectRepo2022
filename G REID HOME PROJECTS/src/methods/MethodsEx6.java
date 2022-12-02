package methods;

import java.util.Scanner;

import general.My;

public class MethodsEx6 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		double degC = 0, degF = 0;

		My.p(String.format("\n\n\t%7s %15s", "Celsius", "Farenheit"));

		for (double i = 0.0; i <= 100.0; i++)
			My.p(String.format("\n\t%6.2f %15.2f", i, cToF(i)));

		My.p(String.format("\n\n\n\t%7s %13s", "Farenheit", "Celsius"));

		for (double i = 32.0; i <= 212.0; i++)
			My.p(String.format("\n\t%6.2f %15.2f", i, fToC(i)));

		key.close();
	}

	public static double cToF (double celsius)
	{
		return (celsius * 9/5) + 32;
	}

	public static double fToC (double farenheit)
	{
		return (farenheit - 32) * 5/9;
	}


	}

		/*6. Implement the following integer functions:
		(a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature
		(b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature.
		Use  these  functions  to  write  a  program  that  prints  charts  showing  the  Fahrenheit 
		equivalent of all Celsius temperature for 0 to 100 degrees and the Celsius equivalents of all 
		Fahrenheit temperatures from 32 to 212.*/
		
		
