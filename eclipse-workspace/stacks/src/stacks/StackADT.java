package stacks;

public interface StackADT
{
	// Adds one item to the top of the stack
	public void push(int item);

	// Removes and returns the top item from the stack
	public int pop();

	// Returns the top-most item on the stack without removing it
	public int peek();

	// Determines whether or not the stack is empty
	public boolean isEmpty();

	// Determines how many items are in the stack
	public int size();

	// Returns a string representing the state of the stack
	public String toString();
}