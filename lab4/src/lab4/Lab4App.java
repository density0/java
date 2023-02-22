package lab4;
import stacks.ArrayStack;
import exceptionclasses.EmptyStackException;
import java.io.*;
/**
 * 
 * @author Alesandel Lantigua
 *
 */
public class Lab4App {	
	public static void main(String[] args) throws EmptyStackException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayStack<Integer> theStack = new ArrayStack<Integer>(4);		
		theStack.push(18);
		theStack.push(3);
		theStack.push(34);
		theStack.push(28);
		theStack.push(43);

		System.out.println(theStack.toString());

		System.out.println("removed: " + theStack.pop() + "\n");
		System.out.println(theStack.toString());




		ArrayStack <Integer>anotherStack = new ArrayStack<Integer>();

		try
		{
			System.out.print(anotherStack.pop());
		}

		catch (EmptyStackException ex)
		{
			System.out.println("EmptyStackException: " + ex.getMessage());
		}


		System.out.println("the top of theStack is: " + theStack.peek());
		System.out.println(theStack.toString());


		try
		{
			System.out.println(anotherStack.peek());
		}

		catch (EmptyStackException ex)
		{
			System.out.println("EmptyStackException: " + ex.getMessage());
		}


		System.out.println("the size of theStack is: "+ theStack.size());
		System.out.println(theStack.toString());

		System.out.println("the size of anotherStack is: " + anotherStack.size());
		System.out.println(anotherStack.toString());



		System.out.println(theStack.search(4));


		anotherStack.push(51);
		anotherStack.push(7);
		anotherStack.push(21);
		anotherStack.push(37);
		anotherStack.push(29);
		anotherStack.push(43);
		anotherStack.push(16);
		anotherStack.push(1);

		System.out.println("anotherStack contains: \n"+ anotherStack.toString());


		int[] papers = new int[]{};
		

		
		int counter = 0;


		while(!(counter > ((theStack.size())) && !(counter > anotherStack.size())))
		{
			if(theStack.size() > anotherStack.size())
			{
				for(int i = 0; i < (theStack.size() + anotherStack.size()) ; i++)
				{

					papers[i] = theStack[i];

					counter++;
					System.out.println( "papers " + papers[i] + "\n");
				}
			}

			else
			{
				for(int i = 0; i < (theStack.size() + anotherStack.size()); i++)
				{
					
					papers[i] = theStack.search(i);
					counter++;
					System.out.println( "papers " + papers[i] + "\n");
				}
			}



		}




	}
}
