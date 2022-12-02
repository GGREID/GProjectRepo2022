package progAssignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

import general.My;

public class Carpet 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		My.p("\n\tYOU HAVE SELECTED 3 SEATTLE LATTE			@£17.59 PER SQ M");
		My.p("\n\tTO ENSURE COVERAGE IS CORRECT PLEASE ENTER YOUR DIMENSIONS IN METRIC (M)\n");
		My.p("\n\tENTER LENGTH REQUIRED IN METRIC (M):");
		double length = key.nextDouble(); 
		My.p("\n\tENTER WIDTH REQUIRED IN METRIC (M):");
		double width = key.nextDouble();
		double tileCoverageDimension = (length * width);
		double tileSize = 1;
		int tileQuantity = (int) Math.ceil(tileCoverageDimension / tileSize);
		double tileCost = 17.59;
		double totalIncVatToPay = (tileQuantity * tileCost);
		DecimalFormat df = new DecimalFormat("£0.00");
		My.p("\n\tYOU WILL REQUIRE " + tileQuantity + " SQ M		 @£"+ tileCost + " PER SQ M		TOTAL INC VAT  " + df.format(totalIncVatToPay));
	

	}

}
