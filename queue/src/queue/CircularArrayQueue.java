package queue;
import exceptionclasses.*;

/**
 * <p>Title: CircularArrayQueue Class</p>
 *
 * <p>Description: Provides basic Queue functionality, including the ability
 * to enqueue and dequeue items to/from the queue, get the front-most item, 
 * determine whether or not the queue is empty, determine the queue's size, 
 * and to get a String representation of the items in the queue.</p>
 *
 * @author <Alesandel Lantigua, Sahil Hiranand>
 */
public class CircularArrayQueue<E> implements QueueADT<E>
{

	private int front;
	private int rear;
	private E[] contents;
	private int count;

	/**
	 * default constructor -- creates an empty queue.
	 */
	@SuppressWarnings("unchecked")
	public CircularArrayQueue()
	{
		front = 0;
		rear = 0;
		contents = (E[]) (new Object[100]);
		count = 0;
	}

	/**
	 * parameterized constructor --
	 * creates an empty queue that is initially capable of storing 
	 * 'size' items.
	 * @param size the initial size of the queue as specified by the user
	 */
	@SuppressWarnings("unchecked")
	public CircularArrayQueue(int size)
	{
		front = 0;
		rear = 0;
		if (size > 0)
			contents = (E[]) (new Object[size]);
		else
			contents = (E[]) (new Object[100]);
		count = 0;
	}

	/**
	 * enqueue --
	 * stores a new item at the rear of the queue; if the queue becomes
	 * full, it's size is automatically increased to accommodate additional items.
	 * @param newItem a reference to the item to be stored at the rear of the queue
	 */
	public void enqueue (E newItem)
	{

		if(size() >= contents.length)
		{
			this.expandCapacity();

		}
		if(count <= contents.length)
		{
			contents[rear] = newItem;
			count++;
			rear = (rear+1) % contents.length;
		}
	}


	/**
	 * deQueue -- removes the front-most item from the queue.
	 * @return a reference to the object which was stored at the front of the
	 * queue
	 * @throws EmptyQueueException if the queue is empty
	 */
	public E dequeue() throws EmptyQueueException
	{

		if(isEmpty())
		{
			throw new EmptyQueueException("is so empty, the only thing to remove here is air.");
		}

		E removed = contents[front];
		contents[front] = null;
		front = (front+1) % contents.length;
		count--;

		return removed;
	}

	/**
	 * front --
	 * returns the item stored at the front of the queue; the queue 
	 * is not modified.
	 * @return a reference to the object which is stored at the front of the queue
	 * @throws EmptyQueueException if the queue is empty
	 */
	public E front() throws EmptyQueueException
	{ 
		if (isEmpty())
			throw new EmptyQueueException("CircularArrayQueue is empty!");
		else
			return contents[front];
	}

	/**
	 * isEmpty -- determines whether or not the queue is empty.
	 * @return true if the queue is empty; false otherwise
	 */
	public boolean isEmpty()
	{
		return count == 0;
	}

	/**
	 * count -- returns the count of the number of items in the queue.
	 * @return count
	 */
	public int size()
	{
		return count;
	}

	/**
	 * expandCapacity --
	 * a private method called upon by the enqueue method when the queue 
	 * becomes full; the queue size is doubled to accommodate the storage of
	 * additional items.
	 */
	@SuppressWarnings("unchecked")
	private void expandCapacity()
	{
		E[] otherContents = (E[]) (new Object[contents.length * 2]);
		int index = front;

		if(size() >= contents.length)
		{
			for(int i=0; i< size(); i++)
			{
				otherContents[i] = contents[index];
				index = (index +1) % contents.length;
			}
			front = 0;
			rear = count;
			contents = otherContents;
		}
	}


	/**
	 * search method- accepts a ref to an item and returns where it is in the pos.
	 * @param target
	 * @return
	 */
	public int search(E target)
	{
		int counter = -1;
		for(int i =0; i < size(); i++)
		{

			counter++;
			if(target.equals(contents[counter]))
			{
				return counter +1;
			}
		}
		return -1;
	}

	/**
	 * toString method - returns a String representing the current state of the queue.
	 * @return a String containing all items in the queue
	 */
	public String toString()
	{
		String str = new String();

		int index = front;

		for(int i= 0; i < size(); i++)
		{
			str += contents[index] + "\n";
			index = (index +1) % contents.length;
		}
		return str;
	}
}