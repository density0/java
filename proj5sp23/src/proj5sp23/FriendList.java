package proj5sp23;

public class FriendList {
	private int count;

	private Node header;

	public FriendList()
	{
		header = null;
		count = 0;
	}

	public int size()
	{
		return count;
	}

	public boolean isEmpty()
	{
		return count == 0;
	}

	public void addtoFront(User person)
	{
		header = new Node(person, header);

		count++;
	}

	public User remove(User person)
	{
		Node current = header.getNext();
		Node prev = header;

		while(current != null)
		{
			if(current.getItem().equals(person))
			{
				prev.setNext(current.getNext());
				count--;
				return (User)current.getItem();
			}
			prev = current;
			current = current.getNext();	
		}
		return null;
	}

	public String listOfFriends()
	{
		Node current = header;
		String result = "";		
		while (current != null)
		{
			result = result + current.getItem().getname() + "\n";
			current = current.getNext();
		}
		return result;
	}
	
	public boolean search(User person)
	{
		if(isEmpty())
		{
			throw new FriendNotFoundException("no one existed");
		}
		
		Node current = header;		
		
		while(current != null)
		{
			if (person.equals(current.getItem()))
				return true;
			else
				current = current.getNext();
		}
		return false;		
	}

	class Node 
	{
		private User item;
		private Node next;

		public Node() 
		{
			next = null;
		}

		public Node(User item, Node nextItem) 
		{
			this.item = item;
			next = nextItem;
		}

		public void setItem(Node newItem)
		{
			next = newItem;
		}

		public void setNext(Node next) 
		{
			this.next = next;
		}

		public User getItem() 
		{
			return item;
		}

		public Node getNext() 
		{
			return next;
		}
	}
}

