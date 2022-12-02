package progAssignment1;
import general.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

public class Tiles {

	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame();
		frame.setTitle("FLOORS DIRECT TILE DEPARTMENT");
		frame.setSize(400,750);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(99,50,100));
		//frame.setIconImage(image);
		//Border border = BorderFactory.createLineBorder(Color.green,3);
		//frame.setLayout(null);
		/*JLabel label = new JLabel();
		label.setText("FLOORS DIRECT TILE DEPARTMENT");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setVisible(true);
		label.setForeground(new Color(0x00ff00));
		label.setFont(new Font("MV Boli", Font.PLAIN,20));
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		//frame.pack();*/
		JMenuBar menuBar = new JMenuBar();
		
		JMenu tileMenu = new JMenu("     TILE CHOICE     ");
		JMenu extrasMenu = new JMenu("EXTRAS     ");
		JMenu fittingMenu = new JMenu("FITTING     ");
		JMenu exitMenu = new JMenu("EXIT     ");
		
		JMenuItem loadItem = new JMenuItem();
		
		menuBar.add(tileMenu);
		menuBar.add(extrasMenu);
		menuBar.add(fittingMenu);
		menuBar.add(exitMenu);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
		
		
		//Scanner scan = new Scanner(System.in);
		/*System.out.println("\n\t\t::::::Floors Direct Tile department::::::");
		System.out.println("\n\tPlease choose your items from the stock below");
		//menu driven template
		while(true){
			
				System.out.println("\n\t1 = Coda Grey");
				System.out.println("\n\t2 = Grey Marble Split Mosaic");
				System.out.println("\n\t3 = Presealed Terracotta");
				System.out.println("\n\t4 = Quartz Stone Midnight Black");
				System.out.println("\n\t5 = Super White Porcelain");
			
				System.out.println("\n\t9 = Exit");
				System.out.println("\n\tEnter your choice:");
			int choice = scan.nextInt();//accept user input

			switch(choice){
			case 1: System.out.println("I am case 1");
			//method call or logic for case 1
			break;
			case 2: System.out.println("I am case 2");
			//method call or logic for case 2
			break;
			case 9: System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}*/
		}


	}


