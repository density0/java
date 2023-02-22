package stacks;
import exceptionclasses.EmptyStackException;





public interface StackADT<E>
{
	// Adds one item to the top of the stack
	public void push(E item);

	// Removes and returns the top item from the stack
	public E pop() throws EmptyStackException;

	// Returns the top-most item on the stack without removing it
	public E peek() throws EmptyStackException;

	// Determines whether or not the stack is empty
	public boolean isEmpty();

	// Determines how many items are in the stack
	public int size();

	// Returns a string representing the state of the stack
	public String toString();
}