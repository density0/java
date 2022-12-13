package proj5;
import java.util.Random;

/**
 * <p>Title: DiceArray  </p>
 * <p>Description: This program creates a DiceArray object, each roll is default is 0 and each one is rolled from the range 1-6,
 * It calculates the total number from the rolls and counts how many 1's show up in each roll.   </p>
 * @author Alesandel Lantigua
 */
public class DiceArray {
	// declares array variable
	private int[] dice;
	
	
	/**
	 * Default Constructor
	 * sets the default values for each array item in the dice array variable
	 * 
	 */
	public DiceArray()
	{
		dice = new int[3];
		for(int i = 0; i < dice.length; i++)
		{
			dice[i] = 0;
		}	
	}
	
	
	/**
	 * roll method
	 * 
	 * rolls each array from the range 1-6
	 */
	public void roll()
	{
		Random randGen = new Random();
		for(int i = 0; i < dice.length; i++)
		{
			dice[i] = randGen.nextInt(6)+1;
		}
	}
	
	
	/**
	 * calcTotalRoll method
	 * adds the total of all three arrays 
	 * @return the total roll 
	 */
	public int calcTotalRoll()
	{
		int total = 0;
		
		for(int i = 0; i < dice.length; i++)
		{
			total = total + dice[i];
		}
		return total;
		
	}
	
	
	/**
	 * countNumOnes method
	 * checks if any of the dice array items rolled a 1 and then counts how many 1's there were between the 3 rolls
	 * @return countOne
	 */
	public int countNumOnes()
	{
		int countOne = 0;
		
		for (int i = 0; i < dice.length; i++)
		{
			if (dice[i] == 1)
			{
				countOne++;
			}		
		}
		
		return countOne;
	}
	
	
	/**
	 * toString method
	 * creates & returns a String with the face values of the 3 die
	 * @return the state of the object
	 */
	public String toString()
	{
		 String str = new String(); 
		for(int i = 0; i < dice.length; i++)
		{
			str = str + dice[i] + " " ;
		}
		return str;
	}
}
