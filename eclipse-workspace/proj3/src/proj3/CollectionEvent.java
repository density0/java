package proj3;

/**
 * <p>Title: Volunteer Participation  </p>
 * <p>Description: This class defines a CollectionEvent object by specifying the
 * what day the event starts, the start and end times, and when/if a volunteer can be added to the event</p>
 * @author Alesandel Lantigua
 *
 */
public class CollectionEvent {
	
	//instance variables
	private Character weekDay;
	private int eventStart;
	private int eventEnd;
	private int volunteers;
	
	
	/**
	 * default constructor
	 * sets the instance variables to default values
	 * 
	 */
	public CollectionEvent()
	{
		Character weekDay = ('.');
		
		eventStart = 0;
		eventEnd = 0;
		volunteers = 0;
		
	}
	
	/** 
	 * parameterized constructor
	 * sets instance variables for weekDay, eventStart, & eventEnd
	 * to parameters, the other instance variable is set to a default
	 * @param day is the week day
	 * @param starting is when the event starts
	 * @param ending is when the event ends
	 */
	public CollectionEvent(Character days, int starting, int ending)
	{
		weekDay = days;
		eventStart = starting;
		eventEnd = ending;
		volunteers = 0;
	}
	
	/** 
	 * accessor method for the event start
	 * returns value stored in the instance variable eventStart
	 * @return the start time of the event
	 */
	public int getStart()
	{
		return eventStart;
	}
	/**
	 * accessor method for the event end
	 * returns value stored in the instance variable eventEnd
	 * @return the end time of the event 
	 */
	public int getEnd()
	{
		return eventEnd;
	}
	
	
	/**
	 * SameAs method
	 * This method returns what day of the week the event will be taking place
	 * @param days
	 * @return true if the input for the event is the same as the weekDay of the event, false otherwise
	 */
	public boolean SameAs(char days)
	{
		
		if (days == weekDay)
		{
			return true;
		}
		
		else
		{
			
			return false;
		}
		
	}
	
	/**
	 * scheduleVolunteer
	 * This method returns what start and end time the user puts in for when they are available
	 * 
	 * @param startTime
	 * @param endTime
	 * @return true if the user input is the same as the start time and end time, then adds the number of volunteers for that event, false otherwise
	 */
	public boolean scheduleVolunteer(int startTime, int endTime)
	{
		
		if((startTime == eventStart) && (endTime == eventEnd))
		{
			volunteers =+ 1;
			return true;
		}
		
		else
		{	
			
			return false;
			
		}	
		
	}
	
	/**
	 * toString method
	 * this method creates and returns a reference to a String object with the state of the object
	 * @return the values stored in the instance variables 
	 */
	public String toString()
	{
		String str = new String("\nCollection occurs on: " + weekDay + "\nStart time: " + eventStart + "\nEnd time: " + eventEnd + "\nNumber of volunteers: " + volunteers);
		return str;
	}

}
