package switchExercises;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) 
	{
		/*
		Write  a  program  that  creates  a  menu  for  the  user,  allowing  them  to  select  from  6 
		options (with option 6 being Exit).  The program should output the option selected by 
		the  user.    If  an  invalid  option  has  been  input,  the  program  should  output  an  error 
		message*/
		
			Scanner key = new Scanner(System.in);
			int op=0,op1=0,op2=0,op3=0,op4=0,op5=0,op6=0;
			System.out.print("\n\tPLEASE CHOOSE AN OPTION BELOW:\n\toption 1\n\toption 2\n\toption 3\n\toption 4\n\toption 5\n\toption 6(EXIT ) ");
			op = key.nextInt();
			
		switch(op)
			{
			case 1: System.out.print("\n\tYou have chosen option 1");
			break;
		
			case 2: System.out.print("\n\tYou have chosen option 2");
			break;
		
			case 3: System.out.print("\n\tYou have chosen option 3");
			break;
		
			case 4: System.out.print("\n\tYou have chosen option 4");
			break;
		
			case 5: System.out.print("\n\tYou have chosen option 5");
			break;
			
			case 6: System.out.print("\n\tYou have chosen option 6 (EXIT) Goodbye");
			break;
			
			default: System.out.print("\n\tERROR--THAT IS NOT AN OPTION. CHOOSE AGAIN 1-6 "); 
			}
		
		}
}

