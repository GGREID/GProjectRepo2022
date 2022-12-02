package methods;

import java.util.Scanner;

import general.My;

public class MethodsEx8 
{

	public static void main(String[] args) 
	{

		Scanner key = new Scanner(System.in);

		for (int i = 2; i < 1000; i++) 
		{
			if (perfect(i))
				My.p("\n\n\t" + i);
		}
	}

	public static boolean perfect(int no) 
	{
		int tot = 1;
		for (int i = 2; i < no; i++) {
			if ((no % i) == 0)
				tot += i;
		}

		if (tot == no)
			return true;
		else
			return false;

	}

}
/*8. An integer is said to be a perfect number if the sum of its factors, including 1 but not the 
number itself, is equal to the number. 
For  example,  6  is  a  perfect  number  because  6  =  1  +  2  +  3.  Write  a  method  perfect  that 
determines whether parameter number is a perfect number. Use this method in a program 
that determines and prints all the perfect numbers between 1 and 1000. Print the factors 
of each perfect number to confirm that the number is indeed perfect.*/