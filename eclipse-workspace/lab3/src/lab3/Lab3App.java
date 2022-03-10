package lab3;
/**
 * <p>Title: booleans cookies  </p>
 * <p>Description: This program tells if the sentence contains any of the following words and where they are </p>
 *
 * @author Alesandel Lantigua, Cayla Chapman
 */
public class Lab3App {
	public static void main(String[] args)
	{
		String item1 = new String("    water  ");
		String item2 = new String("pasta");
		String item3 = new String("Pasta");
		String item4 = new String("milk");
		String item5 = new String("chocolate chip cookies and milk");
		
		String item6 = "Apple";
		String item7 = "Apple";
		String item8 = new String("Apple");
		String item9 = new String("Apples");
		String item10 = new String("Appld");
		String item11 = new String("Applc");

		String item1T = item1.trim();
		
		System.out.println("Before trim: " + item1 + "*\nAfter trim: " + item1T + "*");
		
		int position = item5.indexOf("milk");

		
		System.out.println("\nThe result of checking the indexOf " + item4 + " in " + item5 + " is " + position);
		
		int position1 = item5.indexOf("pasta");
		
		System.out.println("The result of checking the indexOf " + item2 + " in " + item5 + " is " + position1);

		boolean result = item5.contains(item4);
		
		System.out.println("\nThe result of checking if " + item5 + " contains " + item4 + " is " + result);
	
		boolean result1 = item2.contains("pasta");
		
		System.out.println("The result of checking if " + item5 + " contains " + item2 + " is " + result1);

		 boolean result2 = item5.startsWith("choco");  
		
		System.out.println("\nThe result of checking if " + item5 + " starts with choco is " + result2);

		boolean result3 = item5.startsWith("Choco");
		
		System.out.println("The result of checking if " + item5 + " starts with Choco is " + result3 + "\n");
		
		// #14 - uncomment the two if/else statements below
		
		if (item6.equals(item7))
		{
			System.out.println(item6 + " and " + item7 + " are the same");
		}
		else
		{
			System.out.println(item6 + " and " + item7 + " are NOT the same");
		}

		if (item6 == item8)
		{
			System.out.println(item6 + " and " + item8 + " are the same");
		}
		else
		{
			System.out.println(item6 + " and " + item8 + " are NOT the same");
		}
		System.out.println();
		

		// #15 - uncomment the two if/else statements below
		
		if (item6 == item7)  
		{
			System.out.println(item6 + " and " + item7 + " are the same");
		}
		else
		{
			System.out.println(item6 + " and " + item7 + " are NOT the same");
		}

		if (item6.equals(item8))
		{
			System.out.println(item6 + " and " + item8 + " are the same");
		}
		else
		{
			System.out.println(item6 + " and " + item8 + " are NOT the same");
		}
		System.out.println();
		
		
		// If time permits
		 int num = item2.compareTo(item4);
		
		System.out.println("The result of comparing " + item2 + " to " + item4 + " is " + num);	
		
		int num1 = item2.compareTo(item3);
		
		System.out.println("The result of comparing " + item2 + " to " + item3 + " is " + num1);		

		int num2 = item3.compareTo(item4);
		
		System.out.println("The result of comparing " + item3 + " to " + item4 + " is " + num2);	
		
		int num3 = item8.compareTo(item7);
		
		System.out.println("The result of comparing " + item8 + " to " + item7 + " is " + num3);
		

	}
}