package lab1;
import java.util.Scanner;
/**
 * <p>Title: Store Receipt</p>
 * <p>Description: This program prompts the user to enter the item price and the tax rate.  
 * It calculates the amount owed and displays a receipt.</p>
 * @author <Kalee To lentino Alesandel Lantigua>
 */

public class Lab1PracticeApp {
	public static void main(String[] args) {
		double taxRate;
		double price;
		double price1;
		int quantity;
		int quantity1;
		double subtotal;
		double taxOwed;
		double total;

		Scanner scnr = new Scanner(System.in);
		
		System.out.print("ham price:");
		price = scnr.nextDouble();
			
		System.out.print("quantity of ham:");
		quantity = scnr.nextInt();
		
		System.out.print("cheese price:");
		price1 = scnr.nextDouble();
			
		System.out.print("quantity of cheese:");
		quantity1 = scnr.nextInt();
		
		
		System.out.print("Please enter the tax rate:");
		taxRate = scnr.nextDouble();

		
		subtotal = price + price1;
		taxOwed = (price * quantity + price1 * quantity1 ) * (taxRate / 100);
		total = subtotal + taxRate;
		
		
		System.out.println("Price:   $" + (price + price1) + (quantity1 + quantity)  );
		System.out.println("Quantity:" + (quantity + quantity1));
		System.out.println("Subtotal:   $" + (price * quantity + price1 * quantity1 ) );
		System.out.println("Tax Rate:"  + taxRate + "%");
		System.out.println("Tax:   $" + taxOwed);
		System.out.println("Total:   $" + (price * quantity + price1 * quantity1 + taxOwed ));
		scnr.close();

	}
}
