package proj1sp23;

public class Seat {
	
	
	//instance variables
	private int num;
	private String type;
	private String occupied;
	
	
	
	/**
	 * parameterized constructor
	 * sets instance variables for num and type to parameters.
	 * occupied is set to default "empty"
	 * @param amount
	 * @param kind
	 */
	public Seat(int amount, String kind)
	{
		num = amount;
		type = kind;
		occupied = "empty";
	}
	
	/**
	 * accessor method
	 * returns value stored in the instance variable num
	 * 
	 * @return num
	 */
	public int getNum()
	{
		return num;
	}
	
	/**
	 * accessor method
	 * returns value stored in the instance variable type
	 * @return type
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * accessor method
	 * returns value stored in the instance variable occupied
	 * @return type
	 */
	public String getOccupied()
	{
		return occupied;
	}
	
	/**
	 * reserved method
	 * reserves the seat and makes it occupied if it's empty
	 * @param seating
	 * @return true or false
	 */
	public boolean reserved(int seating)
	{
		if(seating == num && occupied == "empty")
		{
			occupied = "occupied";
			return true;
		}
		
		return false;	
	}
	
	/**
	 * cancel method
	 * cancels the seat and makes it empty if it's occupied
	 * @param seating
	 * @return true or false
	 */
	public boolean cancel(int seating)
	{
		if(seating == num && occupied == "occupied")
		{
			occupied = "empty";
			return true;
		}
		return false;
	}
	
	/**
	 * toString method
	 * creates & returns a String with the seat number, the type of seat it is and if its empty or occupied.
	 * @return the state of the object
	 */
	public String toString()
	{
		String str = new String("seat number: " + num + "\ntype: " + type + "\noccupancy: " + occupied + "\n");
		return str;
	}
	

}
