
package lab5;

/**
 * <p>Title: </p> Lab5
 * <p>Description: </p> The Shelter class is designed to model a shelter set up during an emergency evacuation. Often, local
schools become emergency shelters.
 * @author Randall Rubio, Alesandel Lantigua, Yousef El-Karimi
 */
public class Lab5app {

	public static void main(String[] args)
	{
		// declares and instantiates a Shelter object
		Shelter pineElementary = new Shelter();

		// calls the getShelterName method and displays the value returned with a label
		System.out.println("Shelter Name: " + pineElementary.getShelterName());

		// calls the getNumBeds method and displays the value returned with a label
		System.out.println("The number of beds is: " + pineElementary.getNumBeds());

		// calls the getNumGuests method and displays the value returned with a label
		System.out.println("The current number of guests is: " + pineElementary.getNumGuests());

		// calls the toString method and displays the state of the object
		System.out.println(pineElementary.toString());
		
		pineElementary.setShelterName("Pine Elementary School Shelter");
		
		System.out.println("\nAfter calling the setShelterName mutator method:");
		System.out.println(pineElementary.toString());
		
		pineElementary.setNumBeds(150);
		System.out.println("\nAfter calling the setNumBeds mutator method:");
		System.out.println(pineElementary.toString());
		
		
		Shelter walnutMS = new Shelter("Walnut Middle School Shelter", 500);
		System.out.println("\nAfter calling the parameterized constructor:");
		System.out.println(walnutMS.toString());
		
		pineElementary.registerGuests(20);
		walnutMS.registerGuests(5);
		System.out.println("\nThe number of guests at Pine Elementary School Shelter is " + pineElementary.getNumGuests() + ".");
		System.out.println("The number of guests at Walnut Middle School Shelter is " + walnutMS.getNumGuests() + ".");
		
		pineElementary.determineBedsAvailable();
		walnutMS.determineBedsAvailable();
		System.out.println("\nPine Elementary School Shelter has " + pineElementary.determineBedsAvailable() + " beds available.");
		System.out.println("Walnut Middle School Shelter has " + walnutMS.determineBedsAvailable() + " beds available.");
		
		if(walnutMS.isFull())
			System.out.println("\nThe Walnut Middle School Shelter is full.");
		else
			System.out.println("\nThe Walnut Middle School Shelter is not full. It has "+ walnutMS.determineBedsAvailable() + " beds available.\"");
		
		pineElementary.registerGuests(130);
		System.out.println("\n" + pineElementary.toString());
		
		if(pineElementary.isFull())
			System.out.println("The Pine Elementary School Shelter is full.");
		else
			System.out.println("The Pine Elementary School Shelter is not full. It has "+ pineElementary.determineBedsAvailable() + " beds available.\"");


		
		
		
		
		
		
	}
	
}