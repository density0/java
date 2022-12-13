package proj1;

import java.util.Scanner;

/**
 * <p>Title: Kraft Mac & Cheese: Info </p>
 * <p>Description: This program tells you the how many ounces the product weighs, the cost and the cost per ounce.</p>
 * @author Alesandel Lantigua
 *
 */
public class Project1 {
	public static void main(String[] args)
	{
		String prodInfo;
		int posOfSpace;
		String prodBrand;
		String prodType;
		int brandLength;
		int typeLength;
		int fullProductLength;
		char brandInitial;
		char typeInitial;
		double prodPrice;
		double numOunces;
		double pricePerOunce;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter the product brand (ie. Kraft), followed by a space, followed by the product type (ie. Mac & Cheese)");
		prodInfo = scnr.nextLine();
		posOfSpace = prodInfo.indexOf(" ");
		
		/* the prodBrand substring starting at 1 is'nt the first letter, you start at 0
		*  also should'nt end before the whole word is completed, the brand ends with a space afterwards ".
		*  Fixed it by taking away -1 and replacing 1 with 0 and just removing -1 from posofSpace
		*/
		prodBrand = prodInfo.substring(0, posOfSpace);
		
		/* starting on char 4, the type of product always comes after the brand name. 
		 * Fixed by taking away 4, replacing it with posOfSpace + 1
		 */
		prodType = prodInfo.substring(posOfSpace + 1);
		
		System.out.println("Brand: " + prodBrand + "\nType: " + prodType + "\n");
		
		brandLength = prodBrand.length();
		typeLength = prodType.length();
		fullProductLength = prodInfo.length();
		
		/* product brand was showing the length for the type of product
		 * Fixed by changing typeLength to brandLength
		 * */
		System.out.println("There are " + brandLength + " letters in the product brand " );
		System.out.println("There are " + typeLength + " letters in the product type");
		
		/* the full product length won't always be just 18, there is no var that will say what the actual product length is for other products
		 * Took out "18" and replaced it with the var fullProductLength 
		 * */
		System.out.println("There are " + fullProductLength + " letters in the full product description\n");
		
		brandInitial = prodBrand.charAt(0);
		
		/* brandLength-1 started at an empty space, fixed by putting posOfSpace+1 to the proper initial so after the space the first initial is always placed*/
		typeInitial = prodInfo.charAt(posOfSpace + 1);
		
		/* did'nt have typeInital, added var typeInitial and "\nType:initial */
		System.out.println("Brand initial: " + brandInitial + "\n" + "\nType initial:" + typeInitial);
		
		
		System.out.println("Please enter the product price");
		
		prodPrice = scnr.nextDouble();
		System.out.println("Please enter the product's weight in ounces");
		numOunces = scnr.nextDouble();
		
		/* prodPrice and numOunces were divided the wrong way, no need to divide by 2 either
		 * removed the division by 2 and switched the division to make it prodPrice / numOunces
		 * */
		pricePerOunce = prodPrice / numOunces;
		
		System.out.println("Product Price: $" + prodPrice);
		
		/* did'nt show the products weight value, 
		 * added the var "numOunces" at the end of the quotations 
		 * */
		System.out.println("Product Weight (in ounces): " + numOunces);
		
		/* var that was added prodPrice which tells the price of the item instead of price per Ounce, 
		 * fixed by putting var pricePerOunce
		 **/
		System.out.println("\nProduct Price Per Ounce: $" + pricePerOunce);
	}
}
