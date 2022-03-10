package proj3;

/**
 * <p>Title: Volunteering hours </p> 
 * <p>Description: This program tells what days and the time for when you can volunteer.  </p> 
 * @author Alesandel Lantigua
 */

import java.util.Scanner;

public class Project3 {

    public static void main(String[] args)
    {

        Scanner scnr = new Scanner(System.in);

        char input = scnr.nextLine().charAt(0);

        // declares and instantiates a CollectionEvent object
        CollectionEvent week = new CollectionEvent('M',1100,1500);

		// calls the toString method and displays the state of the object
        if (week.scheduleVolunteer(input, input) && week.sameAs(input))
            System.out.println("Thank you! You are scheduled to volunteer on "+ input + " from  to.\n"+ week.toString());
        else
            System.out.println("Sorry, we do not need volunteers at those times.\n" +week.toString());

        scnr.close();
    }

}
