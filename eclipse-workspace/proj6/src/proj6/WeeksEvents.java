package proj6;
/**
 * <p>Title: WeeksEvents <p>
 * <p>Description: This program shows the weekEvents as a ref to the CollectionEvent<p>
 * @author Alesandel Lantigua
 */


public class WeeksEvents {

	private CollectionEvent[] weekEvents;
	private int events;


	public WeeksEvents()
	{
		weekEvents = new CollectionEvent[10];
		events = 0;
	}

	/**
	 * addEvent method
	 * stores the CollectionEvent passed to the method in the
	 * next available location in the array and increments
	 * the number of CollectionEvent by 1
	 * @param eve the CollectionEvent to be placed in the array
	 */
	public void addEvent(CollectionEvent eve)
	{
		if (events < weekEvents.length) 
		{
			weekEvents[events] = eve;
			events++;
		}
	}

	/**
	 * scheduleVolunteer method
	 * find the first CollectionEvent
	 * that still needs volunteers and matches the volunteer’s availability
	 * @param day
	 * @param min
	 * @param max
	 * @return  reference to weekEvent if true and null if false
	 */
	public CollectionEvent scheduleVolunteer(char day, int min, int max)
	{
		for(int i = 0; i < events; i++)
		{

			if(weekEvents[i].sameAs(day) && (weekEvents[i].determineVolunteersNeeded() > 0)  &&  weekEvents[i].scheduleVolunteer(min, max))
			{

				return weekEvents[i];

			}

		}
		return null;	
	}

	/**
	 * needsMoreVolunteers method
	 * shows how many vols are needed for events
	 * @return the number of volunteers still needed
	 */
	public boolean needsMoreVolunteers()
	{
		for(int i = 0; i < events; i++)
		{

			if(weekEvents[i].determineVolunteersNeeded() > 0)
			{
				return true;
			}

		}
		return false;
	}

	/**
	 * totalVolunteersNeeded method
	 * tells the number of volunteers still needed for the events
	 * @return 
	 */
	public int totalVolunteersNeeded()
	{
		for(int i = 0; i < events; i++)
		{
			return weekEvents[i].determineVolunteersNeeded();
		}
		return events;
	}
	
	 

	public String toString()
	{
		String str = new String();
		for(int i = 0; i<events; i++)
			str = str + weekEvents[i].toString() + "\n";
		return str;
	}



}
