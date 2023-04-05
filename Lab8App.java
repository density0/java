package lab8;
import lists.*;
import exceptionclasses.*;

public class Lab8App {
	
	public static void main(String[] args)
	{
		
		ArrayUnorderedList<Product> list1 = new ArrayUnorderedList<Product>();
		
		System.out.println("the size of list1 is: " +list1.size());
		
		ArrayUnorderedList<Product> list2 = new ArrayUnorderedList<Product>(3);
		
		System.out.println("the size of list2 is: " +list2.size());
		
		list2.addToRear(new Product("456u78", 10, 5.0));
		list2.addToRear(new Product("355d98", 7, 25.0));
		System.out.println("the size of list2 is: " + list2.size());
		System.out.println(list2.toString());
		
		
		list1.addToFront(new Product("243j58",3,10.0));
		
		
		list2.addToFront(new Product("264j45", 15,13.50));
		
		
		System.out.println("the size of list1 is: " + list1.size());
		System.out.println(list1.toString());
		
		System.out.println("the size of list2 is: " + list2.size());
		System.out.println(list2.toString());
		
		list2.addToFront(new Product("147p34",8,4.5));
		
		
		System.out.println("the size of list2 is: " + list2.size());
		System.out.println(list2.toString());
		
		
		list1 = new ArrayUnorderedList<Product>();
		
		System.out.println("the size of list1 is: " +list1.size());
		System.out.println(list1.toString());
		
		
		try
		{
			list1.addAfter(new Product("653s12", 9, 12.6), new Product("299p41", 34,3.3));
		}
		catch (ElementNotFoundException ex)
		{
			System.out.println(ex);
		}	
		
		try
		{
			list2.addAfter(new Product("123r98", 11, 1.5), new Product("147p34", 8,4.5));
		}
		catch (ElementNotFoundException ex)
		{
			System.out.println(ex);
		}
		
		System.out.println("\nthe size of list2 is: " + list2.size());
		System.out.println(list2.toString());
		
	
		try
		{
			list2.addAfter(new Product("321j78", 12, 2.99), new Product("355d98", 7,25.0));
		}
		catch (ElementNotFoundException ex)
		{
			System.out.println(ex);
		}
		System.out.println("\nthe size of list2 is: " + list2.size());
		System.out.println(list2.toString());
		
		
		try
		{
			list2.addAfter(new Product("703r21", 10 ,12.99), new Product("654f42", 7,25.0));
		}
		catch (ElementNotFoundException ex)
		{
			System.out.println(ex);
		}
		System.out.println("\nthe size of list2 is: " + list2.size());
		System.out.println(list2.toString());
		
		
		
	}
	
	

}
