package progAssignment1;
import java.util.Scanner;
import general.*;

public class Calculations {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		/*
		My.p("\n\tYOU HAVE SELECTED 1 = CODA GREY				31CM X 56CM (L) @ £4.67 EACH TILE");
		My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
		My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
		double length = key.nextDouble(); 
		My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
		double width = key.nextDouble();
		double tileCoverageDimension = (length * width);
		double tile1Size = 0.1736;
		int tileQuantity = (int) Math.ceil(tileCoverageDimension / tile1Size);
		double tileCost = 4.67;
		double totalIncVatToPay = (tileQuantity * tileCost);
		
		
		My.p("\n\tYOU WILL REQUIRE " + tileQuantity + " TILES		 @£"+ tileCost + " EACH TILE		TOTAL INC VAT £" + totalIncVatToPay);*/
		
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

}
