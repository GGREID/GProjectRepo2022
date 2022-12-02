package methods;

import java.util.Scanner;

public class MethodsEx4 {

	public static void main(String[] args) 
	{
		
		Scanner key = new Scanner(System.in);

		int side = 0;
		 
		System.out.print("\n\n\tPlease enter length of side:  ");			
		side = key.nextInt();
		
		Logo(side);
		
		key.close();
	}

	private static void Logo( int side) 
	{
		for (int i = 0; i < side; i++)
		{
			System.out.print("\n\t");

			for (int j = 0; j < side; j++)
			{
				System.out.print("* ");
			}
		}
	}
}	
	
	
	
	/*
	 * Scanner key = new Scanner(System.in);
		
		
	}
	
	public static void printSquare(int length)
	{
		
		}
	}
}

 
	 *4. Write  and  test  a  method  that  displays  at  the  left  margin  of  the  screen  a  solid  square  of 
	asterisks whose side is specified in integer parameter side. For example, if side is 4, the 
	method displays the following: 
	****
	****
	****
	*****/

	
	
	

