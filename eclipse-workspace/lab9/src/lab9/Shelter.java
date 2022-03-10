package lab9;

/**
 * <p>Title: The Shelter Class</p>
 * <p>Description: The class defines an emergency shelter by its name, how many beds it
 * has and the number of guests currently at the shelter.  It can register guests at the 
 * shelter, determine if the shelter is full and determine how many beds are currently
 * available.</p>
 * @author Prof Postner
 */

public class Shelter {
	private int numBeds;
	private int numGuests;
	private String shelterName;

	/**
	 * default constructor
	 * sets the instance variables to default values
	 */
	public Shelter()
	{
		shelterName = new String("Name not specified");
		numBeds = 0;
		numGuests = 0;
	}

	/**
	 * parameterized constructor
	 * sets the instance variables to the parameters
	 * @param name the name of the shelter
	 * @param beds the number of beds the shelter has
	 */
	public Shelter(String name, int beds)
	{
		shelterName = name;
		numBeds = beds;
		numGuests = 0;
	}
	
	/**
	 * mutator method for the shelter name
	 * this method sets the instance variable shelter name
	 * to the parameter sName
	 * @param sName the name of the shelter
	 */
	public void setShelterName(String sName)
	{
		shelterName = sName;
	}
	
	/**
	 * mutator method for the number of beds the shelter has
	 * this method sets the instance variable numBeds
	 * to the parameter max
	 * @param max the maximum number of beds the shelter has
	 */
	public void setNumBeds(int max)
	{
		numBeds = max;
	}
	
	/**
	 * accessor method for the shelter name
	 * this method returns the value stored in the instance variable
	 * shelterName
	 * @return the name of the shelter
	 */
	public String getShelterName()
	{
		return shelterName;
	}
	
	/**
	 * accessor method for the number of beds the shelter has
	 * this method returns the value stored in the instance variable
	 * getNumBeds
	 * @return the total number of beds the shelter has
	 */
	public int getNumBeds()
	{
		return numBeds;
	}
	
	/**
	 * accessor method for the number of guests currently at the shelter
	 * this method returns the current number of guests
	 * @return the number of guests currently at the shelter
	 */
	public int getNumGuests()
	{
		return numGuests;
	}
	
	/**
	 * registerGuests method
	 * this method adds the number of guests registering at the shelter
	 * to the number of current guests as long as enough beds are available
	 * @param num the number of guests who are registering
	 */
	public void registerGuests(int num)
	{
		if (num <= this.bedsAvailable())
		{
			numGuests = numGuests + num;
		}	
	}
	
	/**
	 * bedsAvailable method
	 * this method subtracts the number of guests from the number of beds
	 * available and returns the difference
	 * @return the number of beds the shelter has available
	 */
	public int bedsAvailable()
	{
		int beds = numBeds - numGuests;
		return beds;
	}
	
	/**
	 * isFull method
	 * this method determines if the shelter is full based upon the number
	 * of beds and the current number of guests
	 * @return true if the shelter is full, false if the shelter still has beds available
	 */
	public boolean isFull()
	{
		if (numBeds == numGuests)
			return true;
		else
			return false;
	}
	
	/**
	 * toString method
	 * this method creates and returns a reference to a String object with the state of the object
	 * @return the values stored in the instance variables
	 */
	public String toString()
	{
		String str = new String(shelterName + " has " + numGuests + " guests and a capacity of " + numBeds +
				".");
		return str;
	}
}
