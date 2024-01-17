package proj2sp23;
/**
 * <p>Title: Fish class <p>
 * <p>Description: subclass of the Animal class, uses the values of its parents to create a bear object <p>
 * @author Alesandel Lantigua
 */
public class Bear extends Animal  {

	/**
	 * Default Constructor
	 * Initialized instance variables to default values
	 */
	public Bear()
	{
		super();
	}


	public String toString()
	{
		String str = new String();

		str = "type: bear" + super.toString();

		return str;
	}

}
