package proj1sp23;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Airplane {

	//instance variables
	Seat[] seats;
	int fancySeats;
	int poorSeats;

	
	/**
	 * parameterized constructor
	 * sets instance variable for num to parameters.
	 * seats array is set to num
	 * both seats variables are dependent on the size of the array, fancySeats is 40% of the array 
	 * and poorSeats is 60% of the array size
	 * @param num
	 */
	public Airplane(int num)
	{
		seats = new Seat[num];

		fancySeats = (int)(num*.40);
		poorSeats = (int) (num*.60);

		for(int i = 0; i < fancySeats; i++)
		{			
			seats[i] = new Seat(i, "first");
		}

		for(int i = fancySeats; i < num; i++)
		{
			seats[i] = new Seat(i, "coach");
		}
	}


	/**
	 * occupySeats method
	 * determines the amount of seats available for a specific type of seats. 
	 * @param type
	 * @return filled, amount of empty seats for either first or coach
	 */
	public int occupySeats(String type)
	{
		int filled = 0;

		for(int i = 0; i < seats.length; i++)
		{

			if(type == "first" &&  seats[i].getType() == "first" && seats[i].getOccupied() == "empty")		
			{
				filled++;
			}
		}

		for(int i = 0; i < seats.length; i++)
		{

			if(type == "coach" &&  seats[i].getType() == "coach" && seats[i].getOccupied() == "empty")		
			{
				filled++;
			}
		}

		return filled;
	}


	/**
	 * assigned method
	 * aske's the user what kind of seat they would like to have and displays all of that type of seat that are empty, prompting the user 
	 * to choose what numbered seat they would like to reserve.
	 * @param type
	 * @return true or false
	 */
	public boolean assigned(String type)
	{
		System.out.println("What kind of seat would you like?");
		Scanner user = new Scanner(System.in);

		int picker = user.nextInt();

		for(int i = 0; i < seats.length; i++)
		{
			if(type == "first" && seats[i].getType() == "first" && seats[i].getOccupied() == "empty")
			{
				
				System.out.print(seats[i].toString());			
				if(seats[i].reserved(picker))
				{
					return true;
				}
			}
		}

		for(int i = 0; i < seats.length; i++)
		{
			if(type == "coach" && seats[i].getType() == "coach" && seats[i].getOccupied() == "empty")
			{
				
							
				if(seats[i].reserved(picker))
				{
					System.out.print(seats[i].toString());
					return true;
				}
			}
		}
		return false;
	}


	/**
	 * cancel method
	 * aske's the user what kind of seat they would like to cancel and displays all of that type of seat that are occupied, prompting the user 
	 * to choose what numbered seat they would like to cancel.
	 * @param type
	 * @return true or false
	 */
	public boolean cancel(String type)
	{

		System.out.print("What kind of seat would you like to cancel?");
		Scanner user = new Scanner(System.in);
		int picker = user.nextInt();

		for(int i = 0; i < seats.length; i++)
		{
			if(type == "first" && seats[i].getType() == "first" && seats[i].getOccupied() == "occupied")
			{
				System.out.print(seats[i].toString());			
				if(seats[i].cancel(picker))
				{
					return true;
				}
			}
		}

		for(int i = 0; i < seats.length; i++)
		{
			if(type == "coach" && seats[i].getType() == "coach" && seats[i].getOccupied() == "occupied")
			{
				System.out.print(seats[i].toString());			
				if(seats[i].cancel(picker))
				{
					return true;
				}
			}
		}	
		return false;	
	}



	/**
	 * toString method
	 * creates & returns a String that has a reference to the Seat object
	 * @return str
	 */
	public String toString()
	{
		String str = new String();
		for (int i = 0; i < seats.length; i++)
		{
			str = str + seats[i] + "\n";
		}
		return str;
	}
}
