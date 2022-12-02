package progAssignment1;

import java.util.Scanner;

import general.My;

public class AssTileMenu 
{

	public static void main(String[] args) 
	{
			Scanner key = new Scanner(System.in);
				int tileMainMenuChoice = 0;
				int tileMenuChoice = 0;
				int tileFittingMainMenuChoice = 0;;
				
				//TILE MENU
				My.p("\n\tFLOORS DIRECT TILE (MAIN MENU)\n\t" 
						+ "1 = TILES\n\t" 
						+ "2 = EXTRAS\n\t" 
						+ "3 = FITTING\n\t"
						+ "0 = EXIT MENU\n\n\t" 
						+ "CHOOSE AN OPTION 0-3:");
					tileMainMenuChoice = key.nextInt();
					
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
				}
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
					
						
						 if (tileMenuChoice == 2 )
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
						
						
							 if (tileMenuChoice == 3 )
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
								
								
								 if (tileMenuChoice == 4 )
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
								
									 if (tileMenuChoice == 5 )
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

	}

}
