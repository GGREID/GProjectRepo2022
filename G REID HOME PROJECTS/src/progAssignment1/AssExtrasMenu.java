package progAssignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

import general.My;

public class AssExtrasMenu 
{

	public static void main(String[] args) 
	{

		int tileExtraMenuChoice = 0; 
		int tileMainMenuChoice = 0;
		
		Scanner key = new Scanner(System.in);
		
		My.p("\n\tFLOORS DIRECT TILE (MAIN MENU)\n\t" 
				+ "1 = TILES\n\t" 
				+ "2 = EXTRAS\n\t" 
				+ "3 = FITTING\n\t"
				+ "0 = EXIT MENU\n\n\t" 
				+ "CHOOSE AN OPTION 0-3:");
		tileMainMenuChoice = key.nextInt();
		
			//EXTRAS MENU
		if (tileMainMenuChoice == 2)
		{
			My.p("\n\tFLOORS DIRECT (EXTRAS MENU)\n\t"
					+ "1 = GREY GROUT COVERS	20 SQ M		@ £29.95	5KG\n\t"
					+ "2 = SPACERS 				@ 5.99 	 	(PACK OF 50)\n\t"
					+ "3 = WHITE GROUT COVERS	8 SQ M 		@ £19.95	2KG\n\t"
					+ "0 = EXIT MENU\n\n\t"
					+ "CHOOSE AN OPTION 0-3:");
			tileExtraMenuChoice = key.nextInt();
		}
		// EXTRA MENU CHOICE 1
		 if (tileExtraMenuChoice == 1 )
	{
		My.p("\n\tYOU HAVE SELECTED 1 = GREY GROUT		COVERS	20 SQ M		@ £29.95	5KG");
		My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
		My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
		double length = key.nextDouble(); 
		My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
		double width = key.nextDouble();
		double tileExtraCoverageDimension = (length * width);
		double tileExtraSize = 20;
		int tileExtraQuantity = (int) Math.ceil(tileExtraCoverageDimension / tileExtraSize);
		double tileExtraCost = 29.95;
		double totalIncVatToPay = (tileExtraQuantity * tileExtraCost);
		DecimalFormat df = new DecimalFormat("£0.00");
		My.p("\n\tYOU WILL REQUIRE " + tileExtraQuantity + " GREY GROUT		 @£"+ tileExtraCost + " EACH 5KG		TOTAL INC VAT " + df.format(totalIncVatToPay));
	}
		 //EXTRA MENU CHOICE 2
		 if (tileExtraMenuChoice == 2 )
			{
				My.p("\n\tYOU HAVE SELECTED 2 = SPACERS 					@ 5.99 		(PACK OF 50)");
				My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER NUMBER OF TILES TO BE LAID:\n");
				
				int tilesToBeLaid = (int) key.nextInt();
				
				int tileExtraMenuQuantity = (int) Math.ceil((tilesToBeLaid * 4) - 4);
				double tileExtraSize = 50;
				int spacersRequired = (int) Math.ceil(tileExtraMenuQuantity / tileExtraSize);
				
				double tileExtraCost = 5.99;
				double totalIncVatToPay = (spacersRequired * tileExtraCost);
				DecimalFormat df = new DecimalFormat("£0.00");
				My.p("\n\tYOU WILL REQUIRE " + spacersRequired + " PACKS OF SPACERS		 @£"+ tileExtraCost + " EACH PACK OF 50		TOTAL INC VAT " + df.format(totalIncVatToPay));
			}
		//EXTRA MENU CHOICE 3
		 if (tileExtraMenuChoice == 3 )
			{
				My.p("\n\tYOU HAVE SELECTED 3 = WHITE GROUT 	COVERS	8 SQ M 		@ £19.95	2KG");
				My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
				My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
				double length = key.nextDouble(); 
				My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
				double width = key.nextDouble();
				double tileExtraCoverageDimension = (length * width);
				double tileExtraSize = 8;
				int tileExtraQuantity = (int) Math.ceil(tileExtraCoverageDimension / tileExtraSize);
				double tileExtraCost = 19.95;
				double totalIncVatToPay = (tileExtraQuantity * tileExtraCost);
				DecimalFormat df = new DecimalFormat("£0.00");
				My.p("\n\tYOU WILL REQUIRE " + tileExtraQuantity + " WHITE GROUT		 @£"+ tileExtraCost + " EACH 2KG		TOTAL INC VAT " + df.format(totalIncVatToPay));
			}

	}

}
