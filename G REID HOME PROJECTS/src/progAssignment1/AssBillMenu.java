package progAssignment1;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import general.*;

 
public class AssBillMenu 
{	
	//PROPERTIES
	private int tileMainMenuChoice;
	private int tileMenuChoice;
	private int tileQuantity;
	private double tileCost;
	private int tileExtraMenuChoice;
	private double tileExtraMenuCost; 
	private int tileExtraMenuQuantity; 
	private int tileFittingMenuChoice; 
	private double tileFittingMenuCost; 
	private double totalDiscount; 
	private double totalVat;
	private double totalPriceBeforeVat;
	private double totalIncVatToPay;
	
	//CONSTRUCTOR
	AssBillMenu( int tileMainMenuChoice, int tileMenuChoice, int tileQuantity, double tileCost, int tileExtraMenuChoice, 
				double tileExtraMenuCost, int tileExtraMenuQuantity, int tileFittingMenuChoice, double tileFittingMenuCost, 
				double totalDiscount, double totalVat, double totalPriceBeforeVat, double totalIncVatToPay )
	{
		this.tileMainMenuChoice = tileMainMenuChoice;
		this.tileMenuChoice = tileMenuChoice;
		this.tileQuantity = tileQuantity;
		this.tileCost = tileCost;
		this.tileExtraMenuChoice = tileExtraMenuChoice;
		this.tileExtraMenuQuantity = tileExtraMenuQuantity;
		this.tileExtraMenuCost = tileExtraMenuCost;
		this.tileFittingMenuChoice = tileFittingMenuChoice;
		this.tileFittingMenuCost = tileFittingMenuCost;
		this.totalDiscount = totalDiscount;
		this.totalPriceBeforeVat = totalPriceBeforeVat;
		this.totalVat = totalVat;
		this.totalIncVatToPay = totalIncVatToPay;
	}
	
	//GET METHODS
	public int gettileMainMenuChoice()   
    {  
        return tileMainMenuChoice;  
    }  
    public int gettileMenuChoice()   
    {  
        return tileMenuChoice;  
    }  
    public int gettileQuantity()   
    {  
        return tileQuantity;  
    }  
    public double gettileCost()
    {
    	return tileCost;
    }
    public int gettileExtraMenuChoice()
    {
    	return tileExtraMenuChoice;
    }
    public double gettileExtraMenuQuantity()
    {
    	return tileExtraMenuQuantity;
    }
    public double gettileExtraMenuCost()
    {
    	return tileExtraMenuCost;
    }
    public int gettileFittingMenuChoice()
    {
    	return tileFittingMenuChoice;
    }
    public double gettileFittingMenuCost()
    {
    	return tileFittingMenuCost;
    }
    public double gettotalDiscount()
    {
    	return totalDiscount;
    }
    public double gettotalPriceBeforeVat()
    {
    	return totalPriceBeforeVat;
    }
    public double gettotalVat()
    {
    	return totalVat;
    }
    public double gettotalIncVatToPay()
    {
    	return totalIncVatToPay;
    }
    
    
    //DISPLAY FORMAT  
    public static void displayFormat()   
    {  
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
        System.out.print("\nPRODUCT ITEM \t\tName \t\tQUANTITY \t\tUNIT RATE \t\t\tTOTAL £GBP\n");  
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
    }  
       
    //DISPLAY  
    public void display()   
    {  
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %11.2f\n" ,tileMenuChoice, tileQuantity, tileCost, totalPriceBeforeVat, totalIncVatToPay);  
    }
    
    public class FloorsDirectItemisedBill
    {
    
	public static void main(String[] args) 
	{
		//VARIABLES
		double length = 0;
		double width = 0;
		double tileCoverageDimension = 0;
		double tileSize = 0;
		int tileQuantity = 0;
		double tileCost = 0;
		double totalIncVatToPay = 0;
		
		
		System.out.println("\n\t\t\t\t --------------------ITEMISED BILL-----------------");
		System.out.println("\n\t\t\t\t\t\t     " + "FLOORS DIRECT");
		System.out.println("\t\t\t\t\t     Tower Building Strand Road ");
		System.out.println("\t\t\t\t\t\t " + " Londonderry BT48 7AL");
		System.out.println("\n\tVAT reg number: 912541843" + "\t\t\t\t\t\t\tContact: 028 7127 6000");
		
		// FORMAT DATE AND TIME
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		// PRINT DATE AND TIME
		System.out.println("\tDate: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]
				+ "\t\t\t\t\t  floorsdirect@live.nwrc.co.uk");
		Scanner key = new Scanner(System.in);  
        System.out.print("\nEnter Customer Name: ");  
        String customername=key.nextLine();
		//CREATE SCANNER CLASS OBJECT  
        //CREATE ARRAY LIST FOR PRODUCTS  
        List<Product> product = new ArrayList<Product>();     
          {
        	
        //MAIN MENU
		My.p("\n\tFLOORS DIRECT TILE (MAIN MENU)\n\t" 
				+ "1 = TILES\n\t" 
				+ "2 = EXTRAS\n\t" 
				+ "3 = FITTING\n\t"
				+ "0 = EXIT MENU\n\n\t" 
				+ "CHOOSE AN OPTION 0-3:");
		tileMainMenuChoice = key.nextInt();
		
		
		
		
		
		
		/*EXTRAS MENU-----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//EXTRAS MENU
		if (tileMainMenuChoice == 2)
		{
			My.p("\n\tFLOORS DIRECT (EXTRAS MENU)\\n\t"
					+ "1 = GREY GROUT COVERS	20 SQ M		@ £29.95	5KG\n\t"
					+ "2 = SPACERS 				@ 5.99 		(PACK OF 50)\n\t"
					+ "3 = WHITE GROUT COVERS	8 SQ M 		@ £19.95	2KG\n\t"
					+ "0 = EXIT MENU\n\n\t"
					+ "CHOOSE AN OPTION 0-3:");
			tileExtraMenuChoice = key.nextInt();
		}
		// TILE MENU CHOICE 1
		else if (tileExtraMenuChoice == 1 )
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
		My.p("\n\tYOU WILL REQUIRE " + tileExtraQuantity + " GREY GROUT		 @£"+ tileExtraCost + " EACH TILE		TOTAL INC VAT £" + totalIncVatToPay);
	}
		
		/*TILE MENU----------------------------------------------------------------------------------------------------------------------------------------------------
		
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
		}
			
				// TILE MENU CHOICE 1
				else if (tileMenuChoice == 1 )
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
		
		-------------------------------------------------------------------------------------------------------------------------------------------*/
						}
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
}
							
							
							
							
							
							/*
		//EXTRAS MENU
		if (tileMainMenuChoice == 2) 
		{
			My.p("\n\tFLOORS DIRECT TILE (EXTRA MENU)\n\t" 
					+ "1 = GREY GROUT COVERS	20 SQ M		@ £29.95	5KG\n\t"
					+ "2 = SPACERS 				@ 5.99 		(PACK OF 50)\n\t"
					+ "3 = WHITE GROUT COVERS	8 SQ M 		@ £19.95	2KG\n\t"
					+ "0 = EXIT MENU\n\n\t"
					+ "CHOOSE AN OPTION 0-3:");
		}
		//FITTING MENU
		if (tileMainMenuChoice == 3) 
		{
			My.p("\n\tFLOORS DIRECT TILE (FITTING MENU)\n\t"
					+ "ADVISE CUSTOMER THAT FITTING WILL INCURR A SET MINIMUM FEE OF £50 PER PER PURCHASE\n\t"
					+ "1 = FITTING PER LARGE TILE		£1.75 EACH\n\t"
					+ "2 = FITTING PER MEDIUM TILE		£1.50 EACH\n\t"
					+ "3 = FITTING PER SMALL TILE		£1.25 EACH\n\t" 
					+ "0 = EXIT MENU\n\n\t"
					+ "CHOOSE AN OPTION 0-3:");
		}
		
					
            break;
         case 2:
           	System.out.print("Please select your choice of");
           	break;
         case 3:
           	System.out.print("");
           	break;
         case 4:
           	System.out.print("");
           	break;
         }
		 //System.out.print("You have chosen: ");  
        // item = scan.nextInt();
         
         /*switch (item)
         {
         case 1:
         	System.out.print("Floors Direct Tile Menu, please make a selection"
         			+ "\n\t1	CODA GREY						310mm X 560mm (L) @ £4.67 EACH TILE"
         			+ "\n\t2	GREY MARBLE SPLIT MOSAIC		300mm X 150mm (S) @ £2.99 EACH TILE"
         			+ "\n\t3	PRESEALED TERRACOTTA			300mm X 300mm (M) @ £6.89 EACH TILE"
         			+ "\n\t4	QUARTZ STONE MIDNIGHT BLACK		300mm X 300mm (M) @ £5.99 EACH TILE"
         			+ "\n\t5	SUPER WHITE PORCELAIN			300mm X 600mm (L) @ £3.29 EACH TILE"
         			+ "\n\t0	NO OPTION,EXIT TILES");
         	break;
         case 2:
         	System.out.print("Please select your choice of");
         	break;
         case 3:
         	System.out.print("");
         	break;
         case 4:
         	System.out.print("");
         	break;
         	
         	
         }
         System.out.print("Product Name: ");  
         productName = scan.nextLine();  
         System.out.print("Quantity: ");  
         quantity = scan.nextInt();  
         System.out.print("Price (per unit): ");  
         price = scan.nextDouble();  */
