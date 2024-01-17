package proj4sp23;
import lists.ArrayOrderedList;




public class FoodCategory {
	
	
	private String categoryName;
	private ArrayOrderedList<FoodItem> items;
	
	
	public FoodCategory(String name)
	{
		categoryName = name;	
	}
	
	
	public void addItem(FoodItem foodies)
	{
		items.add(foodies);
	}
	
	
	
	public String getCategoryName()
	{
		return categoryName;
	}
	
	
	
	public int deleteItems(int num)
	{
		
		int removing = 0;
		
		
		int howMany = items.size();
		if(items.size() < num)
		{
			throw new InsufficientQuantityException("you cant delete this many");
		}
		
		for(int i = 0; i < howMany; i++)
		{
			removing = removing + items.first().getQuantity();
			items.remove(items.first());
		}
		return removing;
	}
	
	
	public boolean isEmpty()
	{
		if(items == null)
		{
			return true;
		}
		return false;
	}
	
	
	public String toString()
	{
		String str = new String();
		
		
		str= str + "CategoryName: " + categoryName + "\nitems: " + items.toString();
		return str;
	}
	
}
