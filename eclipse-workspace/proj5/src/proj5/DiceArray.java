package proj5;
import java.util.Random;
/**
 * <p>Title:The pig game <p>
 * <p>Description: This program sets up the game for the number of dice roll and what numbers it could generate, the total of dice when rolled,
 * The number on "1's" on the dices rolled, and the toString to show what was rolled.<p>
 * @author Alesandel Lantigua
 */
public class DiceArray {
	private int[] theDice;
	
	
	/**
	 * default constructor
	 * creates theDice array of size 3 & initializes each element to 0
	 */
	public DiceArray()
	{
		theDice = new int [3];
		for (int i=0; i<theDice.length; i++)
			theDice[i] = 0;
	}
	
	/**
	 * roll method
	 * stores a random number in the range 1 to 6 in each of the 3 die
	 */
	public void roll()
	{
		Random randGen = new Random();
		for (int i = 0; i<theDice.length; i++)
		{
			theDice[i] = randGen.nextInt(6) + 1;
		}
	}
	
	/**
	 * calcTotalRoll method
	 * adds up the roll numbers and gives the total
	 * @return the total number the dice adds up to
	 */
	public int calcTotalRoll()
	{
		int total = 0;
		
		for (int i = 0; i<theDice.length; i++) 
			total = total + theDice[i];
		return total;
	}
	
	/**
	 * countNumOnes
	 * determines how many of the dice have a a face value of 1
	 * @return the number of ones
	 */
	public int countNumOnes()
	{
		int count = 0;
		for (int i = 0; i<theDice.length; i++)
		{
			if (theDice[i] == 1)
				count++;
		}
		return count;
	}

	/**
	 * toString method
	 * creates a String with the values of each of the three dice
	 * @return the String with the state of the object
	 */
	public String toString()
	{
		String str = new String ();
		for (int i = 0; i<theDice.length; i++)
			str = str + theDice[i] + " ";
		return str;
	}

}
