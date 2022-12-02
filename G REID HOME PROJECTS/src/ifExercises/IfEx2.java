package ifExercises;

import java.util.Scanner;

public class IfEx2 
{

	public static void main(String[] args) 
	{
		//Write a program for a furniture company; the program determines the price of a table. 
				//Ask the user to choose 1 for pine, 2 for oak, 3 for mahogany
				//The output is the name of the wood chosen as well as the price of the table. 
				//Pine tables cost £300, oak tables cost £225 and mahogany tables cost £310. 
				//If the user enters an invalid wood code, set the price to 0.
				//Add a prompt to the application above to ask the user to specify a (1) large 
				//or (2) a small table. Add £35 to the price of any large table.

				Scanner key = new Scanner(System.in);

				int choice = 0, size = 0, price = 0;
				String type = "", sz = "";
				char pound = 156;

				// Input type of table required
				System.out.print("\n\n\tPlease enter the type of table you require: ");
				System.out.print("\n\n\t1  Pine");
				System.out.print("\n\t2  Oak");
				System.out.print("\n\t3  Mahogany");
				System.out.print("\n\n\tChoice:  ");

				choice = key.nextInt() ;

				//Calculate price
				if (choice == 1)
				{
					price = 300;
					type = "pine";
				}
				else
					if (choice == 2)
					{
						price = 225;
						type = "oak";
					}
					else
						if (choice == 3)
						{
							price = 310;
							type = "mahogany";
						}
						else
						{
							price = 0;
						}

				//Determine size
				if (price == 0)
					System.out.print("\n\n\tYou have entered an invalid code for table type");
				else
				{
					System.out.print("\n\n\tPlease enter the size of table you require: ");
					System.out.print("\n\n\t1  Large");
					System.out.print("\n\t2  Small");
					System.out.print("\n\n\tSize:  ");

					size = key.nextInt() ;

					if (size == 1)
					{
						price = price + 35;
						sz = "large";
					}
					else if (size == 2)
					{
						sz = "small";
					}
					else
					{
						sz = "invalid";
					}

					if (sz == "invalid")
						System.out.print("\n\n\tYou have entered an invalid code for table size");
					else
						//Output price
						System.out.printf("\n\n\tYou have ordered a %s, %s table at a cost of £%3d", sz, type, price);


	}

}
}  