package proj3;

/**
 * <p>Title: Volunteering hours </p> 
 * <p>Description: This program tells what days and the time for when you can volunteer.  </p> 
 * @author Alesandel Lantigua
 */

public class CollectionEvent {
	
	// instance variables
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
	public CollectionEvent (char weekdays, int min, int max)
	{
		day = weekdays;
		timeStart = min;
		timeEnd = max;
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
	 * @return true if day equals 'M' or 'W' or 'R' or 'F'
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
	 * @return true if the time is 1100 AND ends on 1500
	 */

	public boolean scheduleVolunteer(int min, int max)
	{
		if (timeStart == 1100 &&  timeEnd == 1500)
			return true;
		else
			return false;
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
