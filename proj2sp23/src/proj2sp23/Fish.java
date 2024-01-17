package proj2sp23;
/**
 * <p>Title: Bear class<p>
 * <p>Description:subclass of the Animal class, uses the values of its parents to create a fish object <p>
 * @author Alesandel Lantigua
 */
public class Fish extends Animal{
	
	/**
	 * Default Constructor
	 * Initialized instance variables to default values
	 */
	public Fish()
	{
		super();
	}

	
	public String toString()
	{
		String str = new String();
		
		str = "type: fish"+ super.toString();
		
		return str;
	}

}
