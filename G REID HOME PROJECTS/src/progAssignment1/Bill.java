package progAssignment1;

//java.util.ArrayList;
import general.*;
import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Floors Direct::");

		//menu driven template
		while(true){
			System.out.println("To execute case 1, Enter value 1");
			System.out.println("To execute case 2, Enter value 2");
			System.out.println("To execute case 1, Enter value 1");
			System.out.println("To execute case 1, Enter value 1");
			System.out.println("To Exit, Enter value 9");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();//accept user input

			switch(choice){
			case 1: System.out.println("I am case 1");
			//method call or logic for case 1
			break;
			case 2: System.out.println("I am case 2");
			//method call or logic for case 2
			break;
			case 9: System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}

}
