package switchExercises;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) 
	{
		/*Write a program which prompts the user to input an integer value.  Using a switch 
		statement, print out the value in words if the amount is a valid sterling coin. If the 
		integer value does not represent a valid coin, it should print out an error message 
		“Invalid coin value: xx” (where xx is the value entered)*/
		
		Scanner key = new Scanner(System.in);
		int num=0, coin100=100, coin50=50, coin20=20, coin10=10, coin5=5, coin2=2, coin1=1;
		System.out.print("\n\t Please enter an integer value: ");
	
		num = key.nextInt();
		
			switch (num)
		{
			case 100:
			System.out.print("\n\tThat is one pound sterling");
			break;
			
			case 50:
			System.out.print("\n\tThat is fifty pence");
			break;
			
			case 20:
			System.out.print("\n\tThat is twenty pence");
			break;
			
			case 10:
			System.out.print("\n\tThat is ten pence");
			break;
			
			case 5:
			System.out.print("\n\tThat is 5 pence");
			break;
			
			case 2:
			System.out.print("\n\tThat is two pence");
			break;
			
			case 1:
			System.out.print("\n\tThat is one pence");
			break;
			
			default: System.out.print("\n\tInvalid coin value: "+num);
		
		}

	}

}