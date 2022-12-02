package switchExercises;

import java.util.Scanner;

public class SwitchExercise1 
{

	public static void main(String[] args) 
	{
		/*Write  a  program  that  creates  a  menu  for  the  user,  allowing  them  to  select  from  6 
		options (with option 6 being Exit).  The program should output the option selected by 
		the  user.    If  an  invalid  option  has  been  input,  the  program  should  output  an  error 
		message.*/
		
		Scanner key = new Scanner(System.in);
		int option = 0;
		
		
		System.out.print("\n\tPlease choose an option from 1-6: ");
		option = key.nextInt();
		
		switch (option)
		{
		case 1:
			System.out.print("\n\tYou have chosen option 1");
			break;
		case 2:
			System.out.print("\n\tYou have chosen option 2");
			break;
		case 3:
			System.out.print("\n\tYou have chosen option 3");
			break;
		case 4:
			System.out.print("\n\tYou have chosen option 4");
			break;
		case 5:
			System.out.print("\n\tYou have chosen option 5");
			break;
		case 6:
			System.out.print("\n\tYou have chosen an invalid option");
			break;
		default:
			System.out.print("\n\tPlease choose an option from 1-6");
		}
		
	}

}
