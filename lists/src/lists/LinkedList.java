package lists;
import exceptionclasses.ElementNotFoundException;
import exceptionclasses.EmptyListException;
import queue.Node;

/**
 * <p>Title: LinkedList.java</p>
 *
 * <p>Description: Represents a linked implementation of a list. The front of
 * the list is referenced by first and the back of the list is referenced by last. 
 * This class will be extended to create a specific kind of list.</p>
 *
 * @author <your names here>
 */
public class LinkedList<E> implements ListADT<E>
{
	protected int count;
	protected Node<E> first, last;

	/**
	 * default constructor --
	 * Creates an empty list.
	 */
	public LinkedList()
	{
		count = 0;
		first = last = null;
	}

	/**
	 * size --
	 * returns a count of the number of items in the list.
	 * @return the number of items currently in the list
	 */
	public int size()
	{
		return count;
	}

	/**
	 * isEmpty --
	 * determines whether or not the list is empty.
	 * @return true if this list is empty; false otherwise
	 */
	public boolean isEmpty()
	{
		return count == 0;
	}

	/**
	 * first --
	 * returns a reference to the item at the front of the list. The item
	 * is not removed from the list.
	 * @return a reference to the first item in the list
	 * @throws EmptyListException if the list is empty
	 */
	public E first()
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		return (E) first.getItem();
	}

	/**
	 * last -- 
	 * returns a reference to the item at the end of the list. The item
	 * is not removed from the list.
	 * @return a reference to the last item in the list
	 * @throws EmptyListException if the list is empty
	 */
	public E last()
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		return (E) last.getItem();
	}

	/**
	 * contains --
	 * returns true if the list contains the specified target.
	 * @param target a reference to the item to be located
	 * @return true if the target is found; false otherwise
	 */
	public boolean contains (E target)
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		boolean found = false;

		Node<E> current = first;

		while (current != null && !found)
		{
			if (target.equals(current.getItem()))
				found = true;
			else
				current = current.getNext();
		}

		return found;
	}

	/**
	 * removeFirst -- 
	 * removes and returns the first item in the list.
	 * @return a reference to what was the first item in the list
	 * @throws EmptyListException if the list is empty
	 */
	public E removeFirst()
	{
		if (isEmpty())
	        throw new EmptyListException("List is empty!");
		
		E item = (E) first.getItem();
		
		if (first == last) 
	    {
	        first = last = null;
	        count--;
	    }
	    else
	    {
	        first = first.getNext();
	        count--;
	    }
		
		return item;

	}

	/**
	 * removeLast -- 
	 * removes and returns the last item in the list.
	 * @return the item removed from the end of the list
	 * @throws EmptyListException if the list is empty
	 */
	//THIS METHOD DOES NOT WORK AS EXPECTED
	public E removeLast()
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		Node<E> temp = first;
		Node<E> current = first;  
		Node<E> prev = null;		

		while (current.getNext() != null) 
		{
			prev = current; 
			current = current.getNext();
		} 
		prev.setNext(null); 
		last = prev;

		count--;
		return (E) temp.getItem();
	}


	public void addtoRear(E item)
	{


		Node<E> current = first;
		if(isEmpty())
		{
			first = new Node<E>(item,last);
			last = first;

			count++;
		}
	
		
		else
		{
			first = new Node<E>(item, current);
				
			count++;
		}
	}

	/**
	 * remove --
	 * locates and removes the target from the list.
	 * @param target a reference to an initialized item containing data 
	 * in its key-field
	 * @return a reference to the removed item
	 * @throws EmptyListException if the list is empty
	 * @throws ElementNotFoundException if the target is not found
	 */
	//THIS METHOD DOES NOT WORK AS EXPECTED
	public E remove (E target)
	{
		/**
		if (isEmpty())
			throw new EmptyListException("Target is not found!");

		Node<E> current = first;
		Node<E> prev = null;
		boolean found = false;

		while (!found && current != null)
		{
			if (current.getItem().equals(target))
				found = true;
			prev = current;
			current = current.getNext();
		}

		if (!found)
			throw new ElementNotFoundException("Target is not found!");
		else
		{
			prev.setNext(current.getNext());
			count--;
		}
		return current.getItem();
		 */
		if (isEmpty())
			throw new EmptyListException("Target is not found!");

		Node<E> current = first;

		if(target.equals(first.getItem())) {
			if (count ==1)
			{
				last = null;
			}
			first = first.getNext();
			count--;

		}

		return (E) current.getItem();

	}



	/**
	 * removeDups --
	 * locates the first occurrence of the target, then removes all other 
	 * occurrences of target from the list.
	 * @param target a reference to an initialized item containing data 
	 * in its key-field
	 * @throws EmptyListCollection if the list is empty
	 * @throws ElementNotFoundException if the target is not found
	 */
	public void removeDups(E target)
	{
		Node<E> current = first;
		int i = 0;
		
		while( current != null)
		{
			if(target.equals(first.getItem()))
				
			{
				if(i < 0)
				{
					this.remove((E) first.getItem());
				}
				
				i++;
			}
		}
	}

	/**
	 * toString --
	 * returns a string representation of the list.
	 * @return a reference to a String containing the items in the list
	 */
	public String toString()
	{
		Node<E> current = first;
		String result = new String();

		while (current != null)
		{
			result = result + current.getItem().toString() + "\n";
			current = current.getNext();
		}

		return result;
	}

}