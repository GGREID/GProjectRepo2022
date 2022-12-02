package unconditionalLoops;

import java.util.Scanner;

public class UnconditionalLoopex8 {

	public static void main(String[] args) 
	{
	//As in problem 7 but output the N times table where N is input initially
		Scanner key = new Scanner(System.in);
		
		int num =0;
		System.out.print("Which times table would you like to publish? ");
		num = key.nextInt();
		for(int i = 1; i<=12; i++)
		{
			System.out.printf("\n\t%d * "+num+" = %d",i,i*num);
		}
	}

}
