package switchExercises;

import java.util.Scanner;

public class SwitchEx1a 
{

	public static void main(String[] args) 
	{
		/*Write  a  program  that  creates  a  menu  for  the  user,  allowing  them  to  select  from  6 
		options (with option 6 being Exit).  The program should output the option selected by 
		the  user.    If  an  invalid  option  has  been  input,  the  program  should  output  an  error 
		message.*/
		
		Scanner key = new Scanner(System.in);
		
		int op=0, op1=0, op2=0, op3=0, op4=0, op5=0, exit=0, option=0;
		
		System.out.print("\n\tPick an option 1-6: ");
		option = key.nextInt();

		switch (option)
		{
		case 1:System.out.print("\n\tty for choosing option 1 ");
		break;
		case 2:System.out.print("\n\tty for choosing option 2 ");
		break;
		case 3:System.out.print("\n\tty for choosing option 3 ");
		break;
		case 4:System.out.print("\n\tty for choosing option 4 ");
		break;
		case 5:System.out.print("\n\tty for choosing option 5 ");
		break;
		case 6:System.out.print("\n\tyou have exit ");
		break;
		default: System.out.print("\n\tERROR TRY AGAIN Pick an option 1-6 ");
		}
		
	}
	
}
