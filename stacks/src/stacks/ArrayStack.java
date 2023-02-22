package stacks;
import exceptionclasses.EmptyStackException;
 
/**
 * <p>Title: The Stack Class</p>
 *
 * <p>Description: Defines the properties and behaviors of a basic stack, including the
 * ability to add items to/remove items from the stack, see what is on top of the stack
 * without removing it, to determine how many items are in the stack, and to determine
 * whether or not the stack is empty. Additionally, you can search for a specific item
 * in the stack.</p>
 *
 * @author <your names>
 */
 
public class ArrayStack<E> implements StackADT<E>
{
	/**
	 * contents - a reference to an array containing the stack items
	 */
	private E[] contents; 
	/**
	 * top - an index to the top-most item in the stack
	 */
	private int top;
	

	
 
	/**
	 * default constructor --
	 * Creates an empty stack capable of storing at most 10 items.
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack()
	{
		contents = (E[]) (new Object[10]);
		top = -1;
	}
 
	/**
	 * parameterized constructor --
	 * Creates a stack whose initial size is specified by the user.
	 * @param size the initial size of the stack
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack(int size)
	{
		contents = (E[]) (new Object[size]);
		top = -1;
	}
 
	/**
	 * push method --
	 * Stores a new item on the top of the stack; the stack size
	 * is increased if necessary.
	 * @param item a reference to the item to be stored on the top of the stack
	 */
	public void push(E item)
	{
 
		if(contents.length - 1 == top)
		{
			this.expandCapacity();
		}
		top++;
		contents[top] = item;
	}
 
	/**
	 * pop method --
	 * Removes the top-most item from the stack.
	 * @return a reference to the item which was stored on top of the stack
	 * @throws EmptyStackException if the stack is empty
	 */
	public E pop() throws EmptyStackException
	{		
		
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		E removePos = contents[top];
		
		top--; 
		return removePos;
		
		
	}
 
	/**
	 * peek method --
	 * Returns the top-most item on the stack without removing it
	 * @return a reference to the item which is currently stored on top of the stack.
	 * @throws EmptyStackException if the stack is empty
	 */    
	public E peek() throws EmptyStackException
	{
	
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		
		E peeking = contents[top]; 
  
		 
		return peeking;
		
		
	}
 
	/**
	 * search method --
	 * Returns the 1-based position where an item is on the stack.
	 * If the item is in the stack, the method returns the distance from the top 
	 * of the stack; the topmost item on the stack is considered to be at distance
	 * 1. The equals method is used to compare target to the items in the stack. 
	 * @param target a reference to the item to search for
	 * @return counter -the 1-based position from the top of the stack where the item 
	 * is located; returns -1 if the item is not on the stack
	 */
	public int search(int target)
	{
		int counter = top; 
  
		for(int i = 0; i < contents.length; i++) 
		{ 
			counter = (int) this.contents[target];		 
		} 
		return counter;
	}
 
	/**
	 * isEmpty method --
	 * Determines whether or not the stack is empty.
	 * @return true if the stack is empty; false if the stack is not empty
	 */
	public boolean isEmpty()
	{
		return top == -1;
	}
 
	/**
	 * size method --
	 * Returns a count of the number of items in the stack.
	 * @return the number of items in the stack
	 */
	public int size()
	{
		return top + 1;
	}
 
	/**
	 * toString method --
	 * Returns a String representing the state of the stack
	 * @return a string containing all items in the stack
	 */
	public String toString()
	{
		String str = new String();
 
		for(int i = top; i > -1; i--)
		{
			str = str + contents[i] + "\n";
		}
		return str;
	}
 
	/**
	 * Creates a new array to store the contents of the stack with
	 * twice the capacity of the old one.
	 */
	private void expandCapacity()
	{
		E[] a = (E[]) new Object[contents.length * 2];
		for(int i = 0; i < contents.length; i++)
		{
			a[i] =  contents[i]; 
		}
		this.contents = a;
	}

	
}