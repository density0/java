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
		Node newNode = new Node(person);
		
		if(isEmpty())
		{
			header = newNode;
		}

		newNode.setNext(header.getNext());
        header.setNext(newNode);

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
		
		StringBuilder friendList = new StringBuilder();
        Node current = header.getNext();

        while (current != null) 
        {
            friendList.append(current.getItem().toString()).append("\n");
            current = current.getNext();
        }

        return friendList.toString();
}


class Node 
{
    private User item;
    private Node next;

    public Node() {
        next = null;
    }

    public Node(User item) {
        this.item = item;
        next = null;
    }

    public User getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
}

