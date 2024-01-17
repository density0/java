package lists;
import exceptionclasses.*;
import queue.Node;

/**
 * <p>Title: LinkedUnorderedList.java</p>
 *
 * <p>Description: Represents a linked implementation of an unordered list.</p>
 *
 * @author <Alesandel Lantigua>
 */
public class LinkedUnorderedList<E> extends LinkedList<E>
         							implements UnorderedListADT<E>
{
	/**
	 * default constructor --
	 * creates an empty list.
	 */
	public LinkedUnorderedList()
	{
		super();
	}

	
	/**
	 * addToFront -- 
	 * adds a new item to the beginning of the list.
	 * @param item a reference to the item to add to the list
	 */
	public void addToFront(E item)
	{
		first = new Node<E>(item, first);
		if (last == null)
			last = first;
		count++;
	}

	
	/**
	 * addToRear -- 
	 * adds a new item to the end of the list.
	 * @param item a reference to the item to add to the list
	 */
	public void addToRear(E item)
	{
		Node<E> newNode = new Node<E>(item, null);
		
		if(isEmpty())
		{
			first = last = newNode;
		}
		
		else
		{
			last.setNext(newNode);
			
			last = newNode;
		}
		count++;
		
		
	}

	/**
	 * addAfter --
	 * adds the new item after the specified target.
	 * @param item a reference to the new item to be added
	 * @param target a reference to the item to be located in the list
	 * @throws ElementNotFoundException if the target is not found in the list
	 */
	public void addAfter (E item, E target)
	{
		
	}

}