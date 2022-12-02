package progAssignment1;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
import java.text.SimpleDateFormat;    
import java.util.Date;    
import java.util.Calendar;  
class Product   
    {  
        // properties  
        private String customerReferenceNumber;  
        private String pname;  
        private int qty;  
        private double price;  
        private double totalPrice;  
           
        // constructor  
        Product(String id, String pname, int qty, double price, double totalPrice)   
        {  
            this.customerReferenceNumber=id;  
            this.pname = pname;  
            this.qty = qty;  
            this.price = price;  
            this.totalPrice = totalPrice;  
        }  
            // getter methods  
            public String getId()   
                {  
                    return customerReferenceNumber;  
                }  
                public String getPname()   
                {  
                    return pname;  
                }  
                public int getQty()   
                {  
                    return qty;  
                }  
                public double getPrice()   
                {  
                    return price;  
                }  
                public double getTotalPrice()   
                {  
                    return totalPrice;  
                }  
                //displayFormat  
                public static void displayFormat()   
                {  
                    System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
                    System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\tTotal Price\n");  
                    System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
                }  
                   
                // display  
                public void display()   
                {  
                    System.out.format("   %-9s             %-9s      %5d               %9.2f                       %11.2f\n" ,id, pname, qty, price, totalPrice);  
                }  
    }  

	public class FloorsDirectBill

	{
		public static void main(String args[]) 
		{
			// variables
			String id = null;
			String productName = null;
			int quantity = 0;
			double price = 0.0;
			double totalPrice = 0.0;
			double overAllPrice = 0.0;
			double vat, subtotal = 0.0, discount = 0.0;
			char choice = '\0';
			System.out.println("\n\t\t\t --------------------ITEMISED BILL-----------------");
			System.out.println("\n\t\t\t\t\t     " + "FLOORS DIRECT");
			System.out.println("\t\t\t\t     Tower Building Strand Road ");
			System.out.println("\t\t\t\t\t " + " Londonderry BT48 7AL");
			System.out.println("\nVAT reg number: 912541843" + "\t\t\t\t\t\t\tContact: 028 7127 6000");
			
			// format of date and time
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
					"Saturday" };
			
			// prints current date and time
			System.out.println("Date: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]
					+ "\t\t\t\t\t  floorsdirect@live.nwrc.co.uk");
			Scanner scan = new Scanner(System.in);
			System.out.print("\nEnter Customer Name: ");
			String customername = scan.nextLine();
			
			// create Scanner class object
			// creating an ArrayList to store the product
			List<Product> product = new ArrayList<Product>();
			do {
				// read input values
				System.out.println("Enter the product details: ");
				System.out.print("Product ID: ");
				id = scan.nextLine();
				System.out.print("Product Name: ");
				productName = scan.nextLine();
				System.out.print("Quantity: ");
				quantity = scan.nextInt();
				System.out.print("Price (per unit): ");
				price = scan.nextDouble();
				
				// calculate total price for a particular product
				totalPrice = price * quantity;
				
				// calculates overall price
				overAllPrice = overAllPrice + totalPrice;
				
				// creates Product class object and add it to the List
				product.add(new Product(id, productName, quantity, price, totalPrice));
				
				// ask for continue shopping?
				System.out.print("Want to add more items? (y or n): ");
				
				// reads a character Y or N
				choice = scan.next().charAt(0);
				
				// read remaining characters, don't store (no use)
				scan.nextLine();
			} while (choice == 'y' || choice == 'Y');
			
			// display all product with its properties
			Product.displayFormat();
			for (Product p : product) 
			{
				p.display();
            }  
                
                //price calculation  
                System.out.println("\n\t\t\t\t\t\t\t\t\t        TOTAL PRICE (GBP.) " +overAllPrice);
                
                //calculating discount  
                discount = overAllPrice-overAllPrice;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t    DISCOUNT (GBP.) " +discount); 
                
                //total amount after discount  
                subtotal = overAllPrice-discount;   
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SUBTOTAL "+subtotal);
                
                //calculating vat  
                vat=overAllPrice*20/100;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t         VAT (@20%) "+vat);  
                
                //calculating amount to be paid by buyer  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t      INVOICE TOTAL " +(subtotal+vat)); 
                
                System.out.println("\n\t\t\t----------------THANK YOU FOR CHOOSING FLOORS DIRECT-----------------");  
                System.out.println("\n\t\t\t         HAVE A MERRY CHRISTMAS AND A HAPPY NEW YEAR  ");  
                // close Scanner  
                scan.close();  
                }
		}  