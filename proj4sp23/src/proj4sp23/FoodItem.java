package proj4sp23;



public class FoodItem implements Comparable<Object> {
	
	
	private int quantity;
	private Date expirationDate;
	
	
	
	public FoodItem(int amount, Date dating)
	{
		quantity = amount;
		expirationDate = dating;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public Date getExpirationDate()
	{
		return expirationDate;
	}
	
	
	public void updateQuantity(int num)
	{
		quantity = num;
	}
	
	
	public boolean equals(Object what)
	{		
		if(this.expirationDate.equals(what))
		{
			return true;
		}
		return false;
	}

	
	public int compareTo(Object otherObj)
	{
		int object = this.expirationDate.compareTo((Date)otherObj);
		
		return object;
	}
	
	public String toString()
	{
		String str;
		str = "Quantity: " + quantity + "\nexpiration date: " + expirationDate;
		return str;
	}
}
