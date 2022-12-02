package progAssignment1;
import java.util.ArrayList;
import java.util.List;  
import java.util.Scanner;  
import java.text.SimpleDateFormat;    
import java.util.Date;    
import java.util.Calendar;  
	class product   
	    {  
	        //PROPERTIES  
	        private int item;  
	        private String pname;  
	        private int qty;  
	        private double price;  
	        private double totalPrice;  
	           
	        //CONSTRUCTOR  
	        product(int item, String pname, int qty, double price, double totalPrice)   
	        {  
	            this.item=item;  
	            this.pname = pname;  
	            this.qty = qty;  
	            this.price = price;  
	            this.totalPrice = totalPrice;  
	        }  
	            //GET METHODS  
	            public int getitem()   
	                {  
	                    return item;  
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
	                    System.out.format("   %-9s             %-9s      %5d               %9.2f                       %11.2f\n" ,item, pname, qty, price, totalPrice);  
	                }  
	    }  
	public class FloorsDirectItemisedBill 
	{  
	        public static void main(String args[])   
	        {  
	                //VARIABLES
	        		int Tiles = 0, Extras = 0, Fitting = 0;
	                int item = 0;  
	                String productName = null;  
	                int quantity = 0;  
	                double price = 0.0;  
	                double totalPrice = 0.0;  
	                double totalUnitPrice = 0.0;  
	                double vat, subtotal=0.0, discount=0.0;  
	                char choice = '\0';  
	                System.out.println("\n\t\t\t --------------------ITEMISED BILL-----------------");  
	                System.out.println("\n\t\t\t\t\t     "+"FLOORS DIRECT");  
	                System.out.println("\t\t\t\t     Tower Building Strand Road ");  
	                System.out.println("\t\t\t\t\t " +" Londonderry BT48 7AL");  
	                System.out.println("\nVAT reg number: 912541843"+"\t\t\t\t\t\t\tContact: 028 7127 6000"); 
	                
	                //FORMAT DATE AND TIME  
	                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
	                Date date = new Date();    
	                Calendar calendar = Calendar.getInstance();  
	                String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }; 
	                
	                //PRINT DATE AND TIME  
	                System.out.println("Date: "+formatter.format(date)+"  "+days[calendar.get(Calendar.DAY_OF_WEEK) - 1]+"\t\t\t\t\t  floorsdirect@live.nwrc.co.uk");  
	                Scanner scan = new Scanner(System.in);  
	                System.out.print("\nEnter Customer Name: ");  
	                String customername=scan.nextLine();  
	                
	                //CREATES SCANNER CLASS OBJECT  
	                //CREATES ARRAY LIST FOR PRODUCTS  
	                List<Product> product = new ArrayList<Product>();  
	                do   
	                  {  
	                        //READ INPUT VALUES  
	                        System.out.println("What product would you like?  \n\t1	Tiles, \n\t2	Extras,\n\t3	Fitting, \n\t4	Exit");
	                        System.out.print("You have chosen: ");  
	                        item = scan.nextInt();
	                        
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
	                        	
	                        	
	                        }*/
	                        System.out.print("Product Name: ");  
	                        productName = scan.nextLine();  
	                        System.out.print("Quantity: ");  
	                        quantity = scan.nextInt();  
	                        System.out.print("Price (per unit): ");  
	                        price = scan.nextDouble();  
	                        
	                        //CALCULATES PRICE FOR PRODUCT  
	                        totalPrice = price * quantity;  
	                        //CALCULATES FULL PRICE  
	                        totalUnitPrice = totalUnitPrice + totalPrice;  
	                        //CREATES PRODUCT CLASS OBJECT AND ADDS TO LIST  
	                        product.add( new Product(item, productName, quantity, price, totalPrice) );  
	                        //CONTINUE SHOPPING QUESTION 
	                        System.out.print("Want to add more items? (y or n): ");  
	                        //READS Y OR N OR y OR n 
	                        choice = scan.next().charAt(0);  
	                        //READ REMAINING CHARACTERS,DONT STORE AS NO USE  
	                        scan.nextLine();  
	                   }   
	                while (choice == 'y' || choice == 'Y');
	                
	                //DISPLAY PRODUCT INFO FROM ABOVE  
	                Product.displayFormat();  
	                for (Product p : product)   
	                {  
	                    p.display();  
	                }  
	                
	                //CALCULATION OF PRICE  
	                System.out.println("\n\t\t\t\t\t\t\t\t\t        TOTAL PRICE (GBP.) " +totalUnitPrice);
	                
	                //CALCULATION OF DISCOUNT
	                discount = totalUnitPrice-totalUnitPrice;  
	                System.out.println("\n\t\t\t\t\t\t\t\t\t\t    DISCOUNT (GBP.) " +discount); 
	                
	                //CALCULATION OF TOTAL INC DISCOUNT  
	                subtotal = totalUnitPrice-discount;   
	                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SUBTOTAL "+subtotal);
	                
	                //VAT @20%  
	                vat=totalUnitPrice*20/100;  
	                System.out.println("\n\t\t\t\t\t\t\t\t\t\t         VAT (@20%) "+vat);  
	                
	                //CALCULATION OF TOTAL TO BE PAID  
	                System.out.println("\n\t\t\t\t\t\t\t\t\t\t      INVOICE TOTAL " +(subtotal+vat)); 
	                
	                System.out.println("\n\t\t\t----------------THANK YOU FOR CHOOSING FLOORS DIRECT-----------------");  
	                System.out.println("\n\t\t\t/t         HAVE A MERRY CHRISTMAS AND A HAPPY NEW YEAR  "); 
	                
	                //CLOSE SCANNER KEY  
	                scan.close();  
	            }      
	    }  