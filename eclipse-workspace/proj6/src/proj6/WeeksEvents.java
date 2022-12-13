package proj6;
/**
 * <p>Title: Volunteer Participation  </p>
 * <p>Description: This program creates a new WeeksEvents object. that stores a reference array of CollectionEvent. It makes a method to 
 * schedule a volunteer, adds a CollectionEvent object to the array, tell you the total needed for all events  </p>
 * @author Alesandel Lantigua
 *
 */
public class WeeksEvents {


	private CollectionEvent[] events;
	private int numEvents;


	/**
	 * default constructor
	 * sets the instance variables to default values
	 */
	public WeeksEvents()
	{
		events = new CollectionEvent[10];
		numEvents = 0;
	}

	/**
	 * addEvent method
	 * adds new event object to WeeksEvent array
	 * @param event
	 */
	public void addEvent(CollectionEvent event)
	{
		if(numEvents < events.length)
		{
			events[numEvents] = event;
			numEvents++;
		}
	}
	
	/**
	 * scheduleVolunteer method
	 * adds a volunteer to a CollectionEvent object
	 * 
	 * @param day
	 * @param start
	 * @param end
	 * @return a reference to CollectionEvent 
	 */
	public CollectionEvent scheduleVolunteer (char day, int start, int end)
	{
		CollectionEvent con = events[0];

		for(int i = 0; i < numEvents; i++)
		{
			if(events[i].sameAs(day))
			{
				if(events[i].determineVolunteersNeeded() != 0 && events[i].scheduleVolunteer(start, end) == true && events[i].sameAs(day) == true)
				{
					con = events[i];

				}
			}
		}
		return con;
	}


	/**
	 * totalVolunteersNeeded method
	 * tells the number of volunteers still needed for the events
	 * @return the number of volunteers still needed
	 */
	public boolean needsMoreVolunteers()
	{

		for(int i = 0; i < numEvents; i++)
		{
			if(events[i].determineVolunteersNeeded() != 0)
			{
				return true;
			}

		}
		return false;
	}


	/**
	 * totalVolunteersNeeded method
	 * tells the number of volunteers still needed for the events
	 * @return the total amount of volunteers needed for the entire WeeksEvents
	 */
	public int totalVolunteersNeeded()
	{
		int left = 0;

		for(int i = 0; i < numEvents; i++)
		{
			left = left + events[i].determineVolunteersNeeded();
		}
		return left;
	}

	
	public String toString()
	{
		String str = new String();
		for (int i = 0; i < numEvents; i++)
		{
			str = str + events[i] + "\n";
		}
		return str;
	}
}
