package lab12;

import exceptionclasses.EmptyBTreeException;

public class Lab12App {

	public static void main(String[] args)
	{
		BinarySearchTree<Integer> maple = new BinarySearchTree<Integer>(31);



		maple.add(45);
		maple.add(23);
		maple.add(59);
		maple.add(37);
		maple.add(50);
		maple.add(27);







		System.out.println("maple in order: ");	
		maple.printInOrder();


		System.out.println("\n\nmaple in Preorder: ");	
		maple.printPreOrder();




		System.out.println("\n\nmaple in Postorder: ");	
		maple.printPostOrder();




		System.out.println("\nContains: "+ maple.contains(45));
		System.out.println("Contains: "+ maple.contains(23));
		System.out.println("Contains: "+ maple.contains(50));
		System.out.println("Contains: "+ maple.contains(31));
		System.out.println("Contains: "+ maple.contains(5));


		BinarySearchTree<Integer> emptyness = new BinarySearchTree<Integer>();


		try
		{
			System.out.println("Contains: "+ emptyness.contains(5));
		}
		catch (EmptyBTreeException ex)
		{
			System.out.println(ex);
		}
		
		System.out.println("the smallest number is: ");
		maple.findMin();
		
		
		try
		{
			System.out.println("the smallest number is: ");
			emptyness.findMin();
		}
		catch (EmptyBTreeException ex)
		{
			System.out.println(ex);
		}
	}


}
