package queue;
import exceptionclasses.EmptyQueueException;


public class LinkedQueue<E> implements QueueADT<E>
{
	private Node<E> front, rear; //references to the first and last nodes

	/**
	 * default constructor - creates an empty queue
	 */
	public LinkedQueue()
	{
		front = rear = null;
	}

	/**
	 * enqueue method - adds the specified item to the rear of the queue
	 * @param newItem a reference to the item to be added to the queue
	 */
	public void enqueue (E newItem)
	{
		if(isEmpty()) 
		{
			front = new Node<E>(newItem);
			rear = front;
		}
		else
		{
			rear.setNext(new Node<E> (newItem));	
			rear = rear.getNext();
		}	
	}

	/**
	 * dequeue method - removes the item at the front of the queue
	 * @return a reference to the item removed from the front of the queue
	 * @throws EmptyQueueException 
	 * @throws an EmptyQueueException if the queue is empty
	 */
	public E dequeue() throws EmptyQueueException 
	{

		Node<E> removed;
		removed = front;

		if(isEmpty())
		{
			throw new EmptyQueueException();
		}

		front = front.getNext();
		if(front == null)
		{
			rear = null;
		}

		return (E) removed.getItem();
	}

	/**
	 * front method - returns a reference to the item at the front of the queue
	 * without removing it from the queue
	 * @return a reference to the item at the front of the queue
	 * @throws EmptyQueueException 
	 * @throws an EmptyQueueException if the queue is empty  
	 */
	public E front() throws EmptyQueueException 
	{
		if(isEmpty())
		{
			throw new EmptyQueueException();
		}

		return (E) front.getItem();
	}

	/**
	 * isEmpty method - determines whether or not the queue is empty
	 * @return true if the queue is empty; false if the queue is not empty
	 */
	public boolean isEmpty()
	{
		if(front == null && rear == null)
		{
			return true;
		}	
		return false;
	}

	/**
	 * size method - returns a count of the number of items in the queue
	 * @return the number of items in the queue
	 */
	public int size()
	{
		int counter = 0;
		Node<E> current;
		current = front;
		while(current != null)
		{
			counter++;
			current = current.getNext();
		}
		return counter;
	}


	/**
	 * search method - accepts a node in the queue and shows where they are in the list 
	 * @param target
	 * @return the position of where specific node in the list or -1 if they aren't in the list
	 */
	public int search(E target)
	{

		Node<E> current = front;
		int counter = 0;
		int pos = 0;

		while(current != null) 
		{

			counter++;

			if(current.getItem().equals(target)) 
			{
				pos = counter;
				return pos;
			}
			current = current.getNext();
		}
		return -1;
	}

	/**
	 * removeLast method - deletes the last node from the linked list in the queue
	 * @return the item at the end of the list that's deleted
	 * @throws EmptyQueueException
	 */
	public E removeLast() throws EmptyQueueException
	{
		Node<E> current = front;
		Node<E> other = rear;

		if(isEmpty())
		{
			throw new EmptyQueueException();
		}
		if(front == rear)
		{
			front = null;
			rear = null;
		}
		else
		{
			while(!current.getNext().equals(rear))
			{
				current = current.getNext();
			}

			rear = current;

			current.setNext(null);
		}
		return (E) other.getItem();
	}

	/**
	 * toString method - returns a String representing the state of the queue
	 * @return a string containing all items in the queue
	 */
	public String toString()
	{

		String str = "";
		Node<E> current;
		current = front;

		while (current != null) 
		{
			str += current.getItem() + "\n";
			current = current.getNext();
		}
		return str;
	}
}