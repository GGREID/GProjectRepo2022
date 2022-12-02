package progAssignment1;

public class saving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package progAssignment1;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import general.*;


public class AssBillMenu 
{
	//CONSTRUCTOR
	AssBillMenu( int tileMainMenuChoice, int tileMenuChoice, int tileQuantity, double tileCost, int tileExtraMenuChoice, 
				double tileExtraMenuCost, int tileExtraMenuQuantity, int tileFittingMenuChoice, double tileFittingMenuCost, 
				double totalDiscount, double totalVat, double totalPriceBeforeVat, double totalIncVatToPay )
	{
		this.mainMenuChoice = tileMainMenuChoice;
		this.tileMenuChoice = tileMenuChoice;
		this.quantity = tileQuantity;
		this.tileCost = tileCost;
		this.tileExtrasMenuChoice = tileExtraMenuChoice;
		this.tileExtraMenuQuantity = tileExtraMenuQuantity;
		this.tileExtrasMenuCost = tileExtraMenuCost;
		this.fittingMenuChoice = tileFittingMenuChoice;
		this.fittingMenuCost = tileFittingMenuCost;
		this.discount = totalDiscount;
		this.priceBeforeVat = totalPriceBeforeVat;
		this.vat = totalVat;
		this.totalToPay = totalIncVatToPay;
	}
	
	//GETTER METHODS
	public int getmainMenuChoice()   
    {  
        return mainMenuChoice;  
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
    public int gettileExtrasMenuChoice()
    {
    	return tileExtrasMenuChoice;
    }
    public double gettileExtraMenuQuantity()
    {
    	return tileExtraMenuQuantity;
    }
    public double gettileExtrasMenuCost()
    {
    	return tileExtrasMenuCost;
    }
    public int getfittingMenuChoice()
    {
    	return fittingMenuChoice;
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
    public double gettotalIncVatToPay()
    {
    	return totalIncVatToPay;
    }
    
    
    //DISPLAY FORMAT  
    public static void displayFormat()   
    {  
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
        System.out.print("\nProduct item \t\tName\t\tQuantity\t\tRate \t\t\tTotal Price\n");  
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
    }  
       
    //DISPLAY  
    public void display()   
    {  
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %11.2f\n" ,tileMenuChoice, tileQuantity, tileCost, totalPriceBeforeVat, totalIncVatToPay);  
    }
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
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

		My.p("\n\tFLOORS DIRECT TILE (MAIN MENU)\n\t" 
				+ "1 = TILES\n\t" 
				+ "2 = EXTRAS\n\t" 
				+ "3 = FITTING\n\t"
				+ "0 = EXIT MENU\n\n\t" 
				+ "CHOOSE AN OPTION 0-3:");
		int mainMenuChoice = key.nextInt();

		if (mainMenuChoice == 1) 
		{
			My.p("\n\tFLOORS DIRECT (TILE MENU)\n\t"
					+ "1 = CODA GREY				310mm X 560mm (L) @ £4.67 EACH TILE\n\t"
					+ "2 = GREY MARBLE SPLIT MOSAIC		300mm X 150mm (S) @ £2.99 EACH TILE\n\t"
					+ "3 = PRESEALED TERRACOTTA		300mm X 300mm (M) @ £6.89 EACH TILE\n\t"
					+ "4 = QUARTZ STONE MIDNIGHT BLACK		300mm X 300mm (M) @ £5.99 EACH TILE\n\t"
					+ "5 = SUPER WHITE PORCELAIN		300mm X 600mm (L) @ £3.29 EACH TILE\n\n\t"
					+ "0 = EXIT MENU\n\n\t" 
					+ "CHOOSE AN OPTION 0-5:");
			int tileMenuChoice = key.nextInt();
			
			if (tileMenuChoice ==1 )
			{
				My.p("\n\tYOU HAVE SELECTED 1 = CODA GREY				310mm X 560mm (L) @ £4.67 EACH TILE");
				My.p("\n\tDO YOU KNOW HOW MANY TILES YOU REQUIRE?\n\tSELECT Y FOR YES OR N FOR NO");
				bo
			}
		}
		if (mainMenuChoice == 2) 
		{
			My.p("\n\tFLOORS DIRECT TILE (EXTRA MENU)\n\t" 
					+ "1 = GREY GROUT COVERS	20 SQ M		@ £29.95	5KG\n\t"
					+ "2 = SPACERS 				@ 5.99 		(PACK OF 50)\n\t"
					+ "3 = WHITE GROUT COVERS	8 SQ M 		@ £19.95	2KG\n\t"
					+ "0 = EXIT MENU\n\n\t"
					+ "CHOOSE AN OPTION 0-3:");
		}
		if (mainMenuChoice == 3) 
		{
			My.p("\n\tFLOORS DIRECT TILE (FITTING MENU)\n\t"
					+ "ADVISE CUSTOMER THAT FITTING WILL INCURR A SET MINIMUM FEE OF £50 PER PER PURCHASE\n\t"
					+ "1 = FITTING PER LARGE TILE		£1.75 EACH\n\t"
					+ "2 = FITTING PER MEDIUM TILE		£1.50 EACH\n\t"
					+ "3 = FITTING PER SMALL TILE		£1.25 EACH\n\t" 
					+ "0 = EXIT MENU\n\n\t"
					+ "CHOOSE AN OPTION 0-3:");
		}
		
         
          /*  break;
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

	}

}
