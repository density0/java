package proj5sp23;

public class SFacebook {




	private User[] theMembers;
	private int count;


	public SFacebook()
	{
		final int INITIAL_CAPACITY = 10;  

		theMembers = new User[INITIAL_CAPACITY];


		count = 0;
	}



	public void addToFacebook(String person)
	{
		if(count == theMembers.length)
			expandCapacity();

		User newUser = new User(person);

		theMembers[count] = newUser;
		count++;
	}


	public void makeFriends(String friend, String original)
	{
		User friendUser = null;
		User originalUser = null;


		for (int i = 0; i < count; i++) 
		{
			if (theMembers[i].getname().equals(friend)) 
			{
				friendUser = theMembers[i];
			}
			if (theMembers[i].getname().equals(original)) 
			{
				originalUser = theMembers[i];
			}
		}


		if (friendUser != null && originalUser != null) 
		{
			friendUser.addFriend(originalUser);
			originalUser.addFriend(friendUser);
		}

		throw new FriendNotFoundException("they don't exist buddy");

	}



	public void  breakFriendship(String exFriend, String original)
	{
		
		    User exFriendUser = findFriend(exFriend);
		    User originalUser = findFriend(original);

		    
		    
		    if (exFriendUser != null && originalUser != null) 
		    {
		        exFriendUser.unFriend(originalUser);
		        originalUser.unFriend(exFriendUser);
		    } else 
		    {
		        throw new FriendNotFoundException("Either exFriend or original not found");
		    }

	}

	public String toString()
	{
		String str = "";

		for(int i = 0; i < count; i++)
		{
			str += theMembers[i].getname() + "\n";
		}

		return str;
	}



	public User findFriend(String person) 
	{
		for (int i = 0; i < count; i++) 
		{
			User user = theMembers[i];
			
			if (user.getname().equals(person)) 
			{
				return user;
			}
		}	
		throw new FriendNotFoundException("they don't exist buddy");
	}




		public void expandCapacity()
		{
			int newCap = theMembers.length * 2; 
			User[] newMembers = new User[newCap];

			for (int i = 0; i < count; i++) 
			{
				newMembers[i] = theMembers[i];
			}
			theMembers = newMembers;
		}

	}
