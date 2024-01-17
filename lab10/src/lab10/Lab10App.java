package lab10;

import exceptionclasses.EmptyListException;
import lists.LinkedList;


/**
 * 
 *  
 * <p>Title: Lab10App</p>
 * <p>Description: this program creates a new LinkedList object, shows the size of the list, adds new product objects to the list from the front 
 * 		and rear and after a specified object,
 *    	removes those products from the front and rear.
 *     
 *	 @author Alesandel Lantigua
 *
 */

public class Lab10App {

	public static void main(String[] args)
	{
		LinkedList<Product> grocery = new LinkedList<Product>();



		grocery.addtoRear(new Product("112", 1,3.2));


		System.out.print(grocery.toString());

		System.out.println("The size of the LinkedList is: " + grocery.size() + "\n");
		grocery.addtoRear(new Product("233", 2, 3.3));

		System.out.println(grocery.toString());

		System.out.println("first item in the list:\n" + grocery.first());
		
	


		LinkedList<Product> emptyList = new LinkedList<Product>();


		
		emptyList.addtoRear(new Product("343", 3,3.4));
		
		System.out.println("\nState of the emptyList:\n" + emptyList.toString());

		System.out.println("The size of the emptyList is: " + emptyList.size() + "\n");
		
		LinkedList<Product> emptyList2 = new LinkedList<Product>();
		
		try
		{
			emptyList2.removeFirst();
		}

		catch(EmptyListException ex)
		{
			System.out.println(ex);
		}


		System.out.println("removing when theres multiple items: " + grocery.removeFirst());


		System.out.println("The state of the LinkedList:\n" + grocery.toString() + "\nthe size of the list: " + grocery.size());


		System.out.println("removing when theres one item: " + grocery.removeFirst());


		System.out.println("The state of the LinkedList:\n" + grocery.toString() + "\nthe size of the list: " + grocery.size());

	}
}
