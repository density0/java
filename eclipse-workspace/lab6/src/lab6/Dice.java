package lab6;
import java.util.Random;

/**
 * <p>Title: Rolling Dice  </p>
 * <p>Description: This program rolls separate dice and calc the sum, which has the highest value and if the all 3 dices are the same.  </p>
 * @author Alesandel Lantigua, Randall Rubio
 *
 */
public class Dice {
	private int die1;
	private int die2;
	private int die3;

	/**
	 * default constructor
	 * sets each instance variable to an initial value of 0
	 */
	public Dice() 
	{

		die1 = 0;
		die2 = 0;
		die3 = 0;
	}
	/**
	 * setDie1 method
	 * the mutator method changes the value stored in the die1 instance variable 
	 * based upon the value of the parameter
	 * @param num the value to store in the instance variable die1
	 */
	public void setDie1 (int num1) 
	{
		die1 = num1;

	}
	public void setDie2 (int num2) 
	{
		die2 = num2;

	}
	public void setDie3 (int num3) 
	{
		die3 = num3;

	}





	/**
	 * getDie1 method
	 * the accessor method returns the value stored in the die1 instance variable
	 * @return the face value of die1
	 */
	public int getDie1()
	{
		return die1;
	}
	public int getDie2()
	{
		return die2;
	}
	public int getDie3()
	{
		return die3;
	}





	/**
	 * roll method
	 * stores a random number in the range 1 to 6 in each of the 3 die
	 */

	public void roll()
	{
		Random randGen = new Random();
		die1 = randGen.nextInt(6) + 1;
		die2 = randGen.nextInt(6) + 1;
		die3 = randGen.nextInt(6) + 1;
	}




	/**
	 * toString method
	 * creates & returns a String with the face values of the 3 die
	 * @return the state of the object
	 */

	public String toString()
	{
		String str = new String (die1 + " " + die2 + " " + die3 + " ");
		return str;
	}

	/**
	 * calcTotalRoll method - this method calculates the total of the three die
	 * @return the sum of the dice
	 */
	public int calcTotalRoll()
	{
		return die1 + die2 + die3;
	}
	/**
	 * threeOfAKind method - this method determines if all three dice have the same value
	 * @return true if they have the same value, false otherwise
	 */

	public boolean threeOfAKind()
	{
	if (die1 == die2 && die2 == die3)
		return true;
	else
		return false;
	}
	
	/**
	* findHighestDieValue method - this method determines the highest value of the dice
	* @return the value of the highest die
	*/
	
	public int findHighestDieValue()
	{
		if (die1 > die2 && die1 > die3)
			return die1;
		else 
			if(die2 > die1 && die2 > die3)
				return die2;
			else
				return die3;
	}

}

	







