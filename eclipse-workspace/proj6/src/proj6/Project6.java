package proj6;
import java.io.*;
import java.util.*;
/**
 * <p>Title: Volunteer Participation  </p>
 * <p>Description: This program creates a new event object, and ask's a user for input to see if they can be added to this event  </p>
 * @author Alesandel Lantigua
 *
 */
public class Project6 {

	public static void main (String [ ] args) throws IOException
	{

		// instance variables
		char day = 'M' ;
		int start = 0000;
		int end = 0000;
		int num = 0;

		// new WeeksEvents object created
		WeeksEvents soMuch = new WeeksEvents();

		Scanner fileScan = new Scanner(new File("events.txt"));

		// new CollectionEvent object created
		CollectionEvent event = new CollectionEvent(day, start, end);
		// while loop to read the event.txt file
		while(fileScan.hasNext())
		{
			day = fileScan.next().charAt(0);
			start = fileScan.nextInt();
			end = fileScan.nextInt();

			event = new CollectionEvent(day, start, end);
			soMuch.addEvent(event);
			num++;
		}
		fileScan.close();


		System.out.println(soMuch.toString());
		Scanner user = new Scanner(System.in);


		// while loop for asking and scheduling the user 
		while(soMuch.totalVolunteersNeeded() != 0)
		{
			int openSpace = soMuch.totalVolunteersNeeded();

			System.out.println("please enter the day, start and end time: ");
			
			day = user.next().charAt(0);
			start = user.nextInt();
			end = user.nextInt();
			
			soMuch.scheduleVolunteer(day, start, end);

			System.out.println(soMuch.toString());
			System.out.println(openSpace + " volunteers are still needed for this week's events!");
		}
		user.close();
	}
}
