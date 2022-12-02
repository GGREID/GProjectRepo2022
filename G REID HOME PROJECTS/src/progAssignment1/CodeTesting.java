package progAssignment1;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import general.*;
import java.util.Scanner;



public class CodeTesting 
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
	
	
	
	
		/* EXTRA MENU TESTING-----------------------------------------------------------------------------------------------------------------------------------------
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
					+ "2 = SPACERS 				@ 5.99 		(PACK OF 50)\n\t"
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
				My.p("\n\tYOU WILL REQUIRE " + spacersRequired + " SPACERS		 @£"+ tileExtraCost + " EACH PACK OF 50		TOTAL INC VAT " + df.format(totalIncVatToPay));
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
	/*TILE MENU TESTING---------------------------------------------------------------------------------------------------------------------
        //MAIN MENU
		My.p("\n\tFLOORS DIRECT TILE (MAIN MENU)\n\t" 
				+ "1 = TILES\n\t" 
				+ "2 = EXTRAS\n\t" 
				+ "3 = FITTING\n\t"
				+ "0 = EXIT MENU\n\n\t" 
				+ "CHOOSE AN OPTION 0-3:");
		tileMainMenuChoice = key.nextInt();
		
		//TILE MENU
		if (tileMainMenuChoice == 1) 
		{
			My.p("\n\tFLOORS DIRECT (TILE MENU)\n\t"
					+ "1 = CODA GREY				31CM X 56CM (L) @ £4.67 EACH TILE\n\t"
					+ "2 = GREY MARBLE SPLIT MOSAIC		30CM X 15CM (S) @ £2.99 EACH TILE\n\t"
					+ "3 = PRESEALED TERRACOTTA		30CM X 30CM (M) @ £6.89 EACH TILE\n\t"
					+ "4 = QUARTZ STONE MIDNIGHT BLACK		30CM X 30CM (M) @ £5.99 EACH TILE\n\t"
					+ "5 = SUPER WHITE PORCELAIN		30CM X 60CM (L) @ £3.29 EACH TILE\n\n\t"
					+ "0 = EXIT MENU\n\n\t" 
					+ "CHOOSE AN OPTION 0-5:");
			tileMenuChoice = key.nextInt();
			// TILE MENU CHOICE 1
		
			if (tileMenuChoice == 1 )
			{
				My.p("\n\tYOU HAVE SELECTED 1 = CODA GREY				31CM X 56CM (L) @ £4.67 EACH TILE");
				My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
				My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
				double length = key.nextDouble(); 
				My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
				double width = key.nextDouble();
				double tileCoverageDimension = (length * width);
				double tileSize = 0.1736;
				int tileQuantity = (int) Math.ceil(tileCoverageDimension / tileSize);
				double tileCost = 4.67;
				double totalIncVatToPay = (tileQuantity * tileCost);
				My.p("\n\tYOU WILL REQUIRE " + tileQuantity + " TILES		 @£"+ tileCost + " EACH TILE		TOTAL INC VAT £" + totalIncVatToPay);
			}
			
				
				else if (tileMenuChoice == 2 )
				{
					My.p("\n\tYOU HAVE SELECTED 2 = GREY MARBLE SPLIT MOSAIC		30CM X 15CM (S) @ £2.99 EACH TILE");
					My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
					My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
					double length = key.nextDouble(); 
					My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
					double width = key.nextDouble();
					double tileCoverageDimension = (length * width);
					double tileSize = 0.045;
					int tileQuantity = (int) Math.ceil(tileCoverageDimension / tileSize);
					double tileCost = 2.99;
					double totalIncVatToPay = (tileQuantity * tileCost);
					My.p("\n\tYOU WILL REQUIRE " + tileQuantity + " TILES		 @£"+ tileCost + " EACH TILE		TOTAL INC VAT £" + totalIncVatToPay);
				}
				
				
					else if (tileMenuChoice == 3 )
					{
						My.p("\n\tYOU HAVE SELECTED 3 = PRESEALED TERRACOTTA		30CM X 30CM (M) @ £6.89 EACH TILE");
						My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
						My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
						double length = key.nextDouble(); 
						My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
						double width = key.nextDouble();
						double tileCoverageDimension = (length * width);
						double tileSize = 0.09;
						int tileQuantity = (int) Math.ceil(tileCoverageDimension / tileSize);
						double tileCost = 6.89;
						double totalIncVatToPay = (tileQuantity * tileCost);
						My.p("\n\tYOU WILL REQUIRE " + tileQuantity + " TILES		 @£"+ tileCost + " EACH TILE		TOTAL INC VAT £" + totalIncVatToPay);
					}
						
						
						else if (tileMenuChoice == 4 )
						{	
							My.p("\n\tYOU HAVE SELECTED 4 = QUARTZ STONE MIDNIGHT BLACK		30CM X 30CM (M) @ £5.99 EACH TILE");
							My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
							My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
							double length = key.nextDouble(); 
							My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
							double width = key.nextDouble();
							double tileCoverageDimension = (length * width);
							double tileSize = 0.09;
							int tileQuantity = (int) Math.ceil(tileCoverageDimension / tileSize);
							double tileCost = 5.99;
							double totalIncVatToPay = (tileQuantity * tileCost);
							My.p("\n\tYOU WILL REQUIRE " + tileQuantity + " TILES		 @£"+ tileCost + " EACH TILE		TOTAL INC VAT £" + totalIncVatToPay);
						}
						
							else if (tileMenuChoice == 5 )
							{	
								My.p("\n\tYOU HAVE SELECTED 5 = SUPER WHITE PORCELAIN		30CM X 60CM (L) @ £3.29 EACH TILE");
								My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
								My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
								double length = key.nextDouble(); 
								My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
								double width = key.nextDouble();
								double tileCoverageDimension = (length * width);
								double tileSize = 0.18;
								int tileQuantity = (int) Math.ceil(tileCoverageDimension / tileSize);
								double tileCost = 3.29;
								double totalIncVatToPay = (tileQuantity * tileCost);
								My.p("\n\tYOU WILL REQUIRE " + tileQuantity + " TILES		 @£"+ tileCost + " EACH TILE		TOTAL INC VAT £" + totalIncVatToPay);
							}
						}----------------------------------------------------------------------------------------------------------------------------------------*/
					}

	
	
}
