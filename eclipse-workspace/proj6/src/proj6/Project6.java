package proj6;
/**
 * <p>Title: Events <p>
 * <p>Description: This program shows the day and time an event is and what time the user can put in so they can volunteer.<p>
 * @author Alesandel Lantigua
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project6 {

	public static void main (String [ ] args) throws IOException
	{

		char day = 0;
		int startTime;
		int endTime;

		WeeksEvents damn = new WeeksEvents();

		System.out.println("The course contains: ");
		Scanner fileScan = new Scanner(new File("events.txt"));

		while(fileScan.hasNext())
		{
			day = fileScan.next().charAt(0);
			startTime = fileScan.nextInt();
			endTime = fileScan.nextInt();

			System.out.println(day + " " + startTime + " " + endTime);


			CollectionEvent divorce = new CollectionEvent(day, startTime, endTime);

			damn.addEvent(divorce);


		}
		fileScan.close();
		System.out.println("\n"+damn);

		Scanner scnr = new Scanner(System.in);

		System.out.println("please enter what day and time you would like to volunteer:\n");


		char dayOfWeek = scnr.next().charAt(0);
		int input = scnr.nextInt();
		int ending = scnr.nextInt();

		

		System.out.println(damn.scheduleVolunteer(dayOfWeek, input, ending));
		
	}	
}