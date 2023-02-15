package lab4;
import stacks.ArrayStack;
import exceptionclasses.EmptyStackException;
public class Lab4App {
	
	public static void main(String[] args)
	{
		
		ArrayStack pigs = new ArrayStack(4);
		
		pigs.push(18);
		pigs.push(3);
		pigs.push(34);
		pigs.push(28);
		
		System.out.println(pigs.toString());
		
		pigs.push(43);
		
		System.out.println(pigs.toString());
		
		
		
		
		
		
	}
	

}
