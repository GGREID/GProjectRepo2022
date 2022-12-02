package switchExercises;

import java.util.Scanner;

public class SwitchExercise2 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		int option = 0;
		
		System.out.print
				 ("\n\n\t1 Monday\n\t2 Tuesday\n\t3 Wednesday\n\t4 Thursday\n\t5 Friday\n\t6 Saturday\n\t7 Sunday"
				+ "\n\tPlease choose a day by entering the corresponding number above:");
		option = key.nextInt();
		
		switch (option)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.printf("\n\tOption %d is a weekday", option);
			break;
		case 6:
		case 7:
			System.out.print("\n\tYou have chosen a weekend day");
			break;
		default: 
			System.out.print("\n\tPlease choose an option from 1-7");
			break;
		}

	}

}
		/*Create a program which takes in the day of the week (1 - Monday, 2 - Tuesday, etc) 
		and prints out whether the day is a weekday (1-5) or a weekend (6-7).*/