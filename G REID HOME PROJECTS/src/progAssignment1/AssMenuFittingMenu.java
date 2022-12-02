package progAssignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

import general.My;

public class AssMenuFittingMenu 
{

	public static void main(String[] args) 
	{

		Scanner key = new Scanner(System.in);
		
		int tileFittingMenuChoice = 0; 
		int tileFittingMainMenuChoice = 0;
		
		
	My.p("\n\tFLOORS DIRECT TILE (MAIN MENU)\n\t" 
			+ "1 = TILES\n\t" 
			+ "2 = EXTRAS\n\t" 
			+ "3 = FITTING\n\t"
			+ "0 = EXIT MENU\n\n\t" 
			+ "CHOOSE AN OPTION 0-3:");
		tileFittingMainMenuChoice = key.nextInt();
	
	//FITTING MENU
	if (tileFittingMainMenuChoice == 3)
	{
		My.p("\n\tFLOORS DIRECT (FITTING MENU)\n\t"
				+"(INFORM CUSTOMER)ALL FITTING WILL INCURR A MINIMUM SET FEE OF £50 AS PER FLOORS DIRECT POLICY\n\t"
				+ "1 = FITTING			FITTING OF LARGE TILE				@£1.75 EACH TILE\n\t"
				+ "2 = FITTING			FITTING OF MEDIUM TILE				@£1.50 EACH TILE\n\t"
				+ "3 = FITTING			FITTING OF SMALL TILE				@£1.25 EACH TILE\n\t"
				+ "0 = EXIT MENU\n\n\t"
				+ "CHOOSE AN OPTION 0-3:");
			tileFittingMenuChoice = key.nextInt();
	}
	// EXTRA MENU CHOICE 1
	 if (tileFittingMenuChoice == 1 )
	 {
		 My.p("\n\tYOU HAVE SELECTED 1 = FITTING		FITTING OF LARGE TILE			@£1.75 EACH TILE");
			My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER NUMBER OF TILES TO BE LAID:\n");
			
			int tilesToBeLaid = (int) key.nextInt();
			
			int tileFittingMenuQuantity = tilesToBeLaid; 
			double tileFittingSetFee = 50;
			double tileFittingCost = 1.75;
			double tileFittingFee = Math.ceil(tileFittingMenuQuantity * tileFittingCost);
			double totalIncVatToPay = (tileFittingFee + tileFittingSetFee);
			DecimalFormat df = new DecimalFormat("£0.00");
			My.p("\n\tYOU WILL REQUIRE " + tilesToBeLaid + " TILES TO BE LAID	@£"+ tileFittingCost + " EACH TILE & SET FEE @£" + tileFittingSetFee + "	 TOTAL INC VAT " + df.format(totalIncVatToPay));
	 }
	// EXTRA MENU CHOICE 2
		 if (tileFittingMenuChoice == 2 )
		 {
			 My.p("\n\tYOU HAVE SELECTED 2 = FITTING			FITTING OF MEDIUM TILE		@£1.50 EACH TILE");
				My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER NUMBER OF TILES TO BE LAID:\n");
				
				int tilesToBeLaid = (int) key.nextInt();
				
				int tileFittingMenuQuantity = tilesToBeLaid; 
				double tileFittingSetFee = 50;
				double tileFittingCost = 1.50;
				double tileFittingFee = Math.ceil(tileFittingMenuQuantity * tileFittingCost);
				double totalIncVatToPay = (tileFittingFee + tileFittingSetFee);
				DecimalFormat df = new DecimalFormat("£0.00");
				My.p("\n\tYOU WILL REQUIRE " + tilesToBeLaid + " TILES TO BE LAID	@£"+ tileFittingCost + " EACH TILE & SET FEE @£" + tileFittingSetFee + "	 TOTAL INC VAT " + df.format(totalIncVatToPay));
		 }
		// EXTRA MENU CHOICE 3
				 if (tileFittingMenuChoice == 3 )
				 {
					 My.p("\n\tYOU HAVE SELECTED 3 = FITTING			FITTING OF SMALL TILE		@£1.25 EACH TILE");
						My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER NUMBER OF TILES TO BE LAID:\n");
						
						int tilesToBeLaid = (int) key.nextInt();
						
						int tileFittingMenuQuantity = tilesToBeLaid; 
						double tileFittingSetFee = 50;
						double tileFittingCost = 1.25;
						double tileFittingFee = Math.ceil(tileFittingMenuQuantity * tileFittingCost);
						double totalIncVatToPay = (tileFittingFee + tileFittingSetFee);
						DecimalFormat df = new DecimalFormat("£0.00");
						My.p("\n\tYOU WILL REQUIRE " + tilesToBeLaid + " TILES TO BE LAID	@£"+ tileFittingCost + " EACH TILE & SET FEE @£" + tileFittingSetFee + "	 TOTAL INC VAT " + df.format(totalIncVatToPay));
				 }

	}

}
