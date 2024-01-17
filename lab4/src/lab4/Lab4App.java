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

		ArrayStack theStack = new ArrayStack(4);		
		theStack.push(18);
		theStack.push(3);
		theStack.push(34);
		theStack.push(28);
		theStack.push(43);

		System.out.println(theStack.toString());

		//System.out.println("removed: " + theStack.pop() + "\n");
		System.out.println(theStack.toString());

		System.out.println("the top of this array is: " + theStack.peek());

		ArrayStack anotherStack = new ArrayStack();

		try
		{
			System.out.print(anotherStack.pop());
		}
		
		catch (EmptyStackException ex)
		{
			System.out.println("EmptyStackException: " + ex.getMessage());
		}




	}
}
