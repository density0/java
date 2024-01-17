package lab9;
import lists.*;
import exceptionclasses.*;


/**
 * 
 *  
 * <p>Title: Lab9App</p>
 * <p>Description: this program creates a new ArrayOrderedList object, shows the size of the list, adds new product objects to the list,
 *    removes those products and tries to search for the item if its there in the program.
 *     
 *	 @author Alesandel Lantigua
 *
 */


public class Lab9App {

	public static void main(String[] args)
	{

		ArrayOrderedList<Product> list = new ArrayOrderedList<Product>(10);



		System.out.println("The size of list is: " + list.size());



		list.add(new Product("222",20,2.99));
		list.add(new Product("555",50,5.99));
		list.add(new Product("444",40,4.99));
		list.add(new Product("777",70,7.99));
		list.add(new Product("111",10,1.99));


		System.out.println("The size of list is: " + list.size());
		System.out.println("The list contains:\n" + list.toString());

		list.remove(new Product("111",10,1.99));

		list.remove(new Product("777",10,1.99));

		list.remove(new Product("444",10,1.99));

		try
		{
			list.remove(new Product("999",10,1.99));
		}
		catch(ElementNotFoundException ex)
		{
			System.out.println(ex);
		}

		System.out.println("The size of list is: " + list.size());
		System.out.println("The list contains:\n" + list.toString());


		ArrayOrderedList<Product> emptyList = new ArrayOrderedList<Product>(10);


		try
		{
			emptyList.remove(new Product("999",10,1.99));
		}
		catch(ElementNotFoundException ex)
		{
			System.out.println(ex);
		}

		list.add(new Product("444",40,4.99));
		list.add(new Product("777",70,7.99));
		list.add(new Product("111",10,1.99));


		System.out.println("After adding items back: " + list.size());
		System.out.println("The list contains:\n" + list.toString());



		System.out.println(list.binSearch(new Product("111",0,0.0)));
		System.out.println(list.binSearch(new Product("777",0,0.0)));
		System.out.println(list.binSearch(new Product("444",0,0.0)));

		try
		{
			System.out.println(list.binSearch(new Product("000",0,0.0)));
		}
		catch(ElementNotFoundException ex)
		{
			System.out.println(ex);
		}
		
		try
		{
			System.out.println(list.binSearch(new Product("999",0,0.0)));
		}
		catch(ElementNotFoundException ex)
		{
			System.out.println(ex);
		}
		
		try
		{
			System.out.println(emptyList.binSearch(new Product("999",0,0.0)));
		}
		catch(ElementNotFoundException ex)
		{
			System.out.println(ex);
		}
	}


	}