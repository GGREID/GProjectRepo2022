package methods;

import general.My;

public class MEx9 
{

	public static void main(String[] args) 
	{
		int col = 0;

		My.p("\n\n\t---------------------------------");
		My.p("\n\tPrime Numbers between 2 and 10000");
		My.p("\n\t---------------------------------\n\n");

		for (int i = 2; i <= 10000; i++)
		{
			if (isPrime(i))
			{
				My.p("\t" + i);
				
				col++;
				
				if (col == 12)
				{
					My.p("\n");
					col = 0;
				}
			}
		}
}
	
	public static boolean isPrime(int no)
	{
		if (no >= 2)
		{
			for (int i = 2; i <= no / 2; i++)
			{
				if ((no % i) == 0)
					return false;
			}
		}
		return true;		

	}

}
/*9. An integer is said to be prime if it is divisible by only 1 and itself. For example, 2, 3, 5 and 7 
are prime but 4, 6, 8 and 9 are not.
(a) Write a method that determines whether a number is prime.
(b) Use  this  method  in  a  program  that  determines  and  prints  all  the  prime  numbers 
between 2 and 10,000.*/