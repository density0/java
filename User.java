package proj5sp23;

public class User {
	
	
	private String name;
	private FriendList friends;
	
	
	
	public User(String naming)
	{
		name = naming;
	}
	
	
	
	public String getname()
	{
		return name;
	}
	
	public void addFriend(User person)
	{
		friends.addtoFront(person);
	}
	
	
	public void removeFriend(User person)
	{
		friends.remove(person);
	}

}
