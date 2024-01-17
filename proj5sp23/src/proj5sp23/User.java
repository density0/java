package proj5sp23;

public class User {
	
	
	private String name;
	private FriendList friends;
	
	
	
	public User(String naming)
	{
		name = naming;
		
		friends = new FriendList();
	}
	
	
	
	public String getname()
	{
		return name;
	}
	
	public void addFriend(User person)
	{
		friends.addtoFront(person);
	}
	
	
	public void unFriend(User person)
	{
		friends.remove(person);
	}
	
	
	
	
	public boolean friendsWith(User person)
	{
		if(friends.search(person))
		{
			return true;
		}
		return false;
	}
	
	
	
	public String getFriends()
	{
		String list = "Friends List: \n" + friends;
		return list;
	}
	
	
	
	public boolean equals(User person)
	{
		if (this.name.equals(((User)person).name))
			return true;
		
		else
			return false;
	}

}
