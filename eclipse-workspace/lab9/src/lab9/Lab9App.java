package lab9;

/**
 * <p>Title: Shelters
 * <p>Description: Displays the shelters store under the nassauCounty Object. Displays the amount of guests and capacity of the shelters. Then displays the total amount of beds available, if there are any shelters available or if its they are all full. Also displays the shelter with the most beds available. 
 * @author Randall Rubio Alesandel Lantigua Yousef El-Karimi
 */

public class Lab9App {
	public static void main(String[] args)
	{
		CountyShelters nassauCounty = new CountyShelters();

		// array of shelter names - to be used when calling the parameterized constructor in the Shelter class
		String[] sNames = {"Pine St. Shelter", "Walnut St. Shelter", "Oak St. Shelter", "Elm St. Shelter", "Chestnut St. Shelter"};

		/* array containing the number of beds in each shelter (based upon the order above)
		 will be used when calling the parameterized constructor in the Shelter class */
		int[] numB = {150, 250, 400, 325, 50};
		Shelter tempShelter;

		// loop for the number of elements in the sNames array (which is 5)
		for (int i=0; i<sNames.length; i++)
		{
			// create the shelter
			tempShelter = new Shelter(sNames[i], numB[i]);
			// add it to the county shelters object
			nassauCounty.insertShelter(tempShelter); 
		}

		// call the toString method on the CountyShelters object and display the value returned

		System.out.println(nassauCounty.toString());


		// display the total number of beds available in the county

		System.out.println("Total number of beds available in this county: " + nassauCounty.calcTotalBedsAvailable());


		// check if the county has any beds available - display an appropriate message

		if(nassauCounty.allFull() == true)
			System.out.println("All shelters are full");
		else
			System.out.println("There are shelters available");


		/* display both the index of and the shelter information for the shelter with 
		 * the most availability */

		System.out.println("The shelter with the most availability: \n" + nassauCounty.determineShelter(2));


		/* loop that
		 * asks the user how many guests to register and reads in the user's answer
		 * calls the method to register the guests
		 * displays if the registration has been successful or not
		 * displays the current state of the county shelters object 
		 * displays how many beds are currently available county wide 	 
		 * asks the user if they want to register more guests - if they do, start the loop again
		 *
		 * this loop ends when a) all the shelters in the county are full or 
		 * b) when the user types 'n' to indicate they don't want to register more guests */


	}
}
