package proj3;
import java.util.Scanner;

/**
 * <p>Title: Volunteer Participation  </p>
 * <p>Description: This program creates a new event object, and ask's a user for input to see if they can be added to this event  </p>
 * @author Alesandel Lantigua
 *
 */
public class Project3 {
	
	
	
	public static void main(String[] args)
	{
		// instance variables
		char day;
		int start;
		int end;
		
		
		Scanner scnr = new Scanner(System.in);
		
		// new CollectionEvent object created
		CollectionEvent rabiRibiing = new CollectionEvent('U', 800, 920);
		
		// Initializing day for the user to input what day they are available 
		day = scnr.next().charAt(0);
		
		// if statement if what the user puts in for the day is the same as the Collection event and calls SameAs method will return true or false
	 	if (rabiRibiing.SameAs(day))
		{	 		
			System.out.println(rabiRibiing.toString() + "\ngreat! what time from what time are you avaiable?:");
			
			// Initializing start and end for the user to input what day they are available
			start = scnr.nextInt();
			end = scnr.nextInt();
			
			/*
			 *  nested if statement if what the user puts in for the start & end time is same as Collection event, 
			 *  calls scheduleVolunteer to add user to the event if they are there for the full event
			 */
			if (rabiRibiing.scheduleVolunteer(start, end))
			{
				System.out.println("Your time has been set, thank you for coming! :D");
				System.out.println(rabiRibiing.toString());
			}
			
			else
			{
				System.out.println("Sorry, you need to be all in or not at all :(");
			}			
		}
			
		else
		{
			System.out.println("Sorry, this is not a day we have an event for.");
			System.out.println(rabiRibiing.toString());	
		}
	 	
	 	
		
	}

}
