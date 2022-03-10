package proj6;
/**
 * <p>Title:Collection Event <p>
 * <p>Description: This program creates the time and the day the event is.<p>
 * @author Alesandel Lantigua
 */
public class CollectionEvent {
	
	// instance variables
	private final int VOLS_NEEDED = 3;
	private char day;
	private int timeStart; 
	private int timeEnd;
	private int numVolunteer;
	
	/**
	 * parameterized constructor
	 * @param weekdays
	 * @param min
	 * @param max
	 */
	public CollectionEvent (char weekdays, int beginning , int ending)
	{
		day = weekdays;
		timeStart = beginning;
		timeEnd = ending;
		numVolunteer = 0;
	}
	
	/**
	 * accessor method for Start time
	 * @return the times of which it starts and ends
	 */
	public int setTimeStart(int start)
	{
		return timeStart;	
	}
	/**
	 * accessor method for End time
	 * @param end
	 * @return the time the event ends
	 */
	public int setTimeEnd(int end)
	{
		return timeEnd;
	}
	
	/**
	 * sameAs method
	 * This method determines what days are available
	 * for volunteering
	 * @param weekdays 
	 * @return true if day equals weekdays
	 */
	public boolean sameAs (char weekdays)
	{
		if (day == weekdays)
		return true;
		else
			return false;
	}
	
	/**
	 * scheduleVolunteer method
	 * This method determines the time of the event 
	 * which you can volunteer
	 * @return true if the time is equal to start and end time
	 */

	public boolean scheduleVolunteer(int min, int max)
	{
		if (timeStart == min &&  timeEnd == max)
		{
			numVolunteer++;
			return true;
		}
		else
			return false;
	}
	
	/**
	 * determineVolunteersNeeded method
	 * this method:
	 * @return number of Volunteers needed
	 */
	
	public int determineVolunteersNeeded()
	{
		return VOLS_NEEDED - numVolunteer;
	}
	
	/**
	 * toString method 
	 * creates & returns a String with the day, when the time starts 
	 * and ends with the number of volunteers for those times
	 */
	public String toString()
	{
		String str = new String ("Collection day: " + day + "\nStart time: " + timeStart + "\nEnd time: " + timeEnd + "\nNumber of volunteers: " + numVolunteer);
		return str;
	}
	
	
	
}

