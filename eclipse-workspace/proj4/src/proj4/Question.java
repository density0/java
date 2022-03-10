package proj4;
import java.util.Random;
/**<p>Title: Math Problems </p>
 * <p>Description: This program generates random plus or minus math problems. </p>
 * @author Alesandel Lantigua
 */
public class Question {
	//instance variables 
	private	int number1;
	private	int number2;
	private char operator;

	/**
	 * default constructor
	 * sets the instance variables to default values
	 */
	public Question()
	{
		Random randGen = new Random();
		number1 = randGen.nextInt(6) + 7;
		number2 = randGen.nextInt(5);
		operator = randGen.nextBoolean() ? '+' : '-';
	}


	/**
	 * toString method
	 * this method creates and returns a reference to a String object with the state of the object
	 * @return the value of the instance variables
	 */
	public String toString()
	{
		String str = new String (number1 + " " + operator + " " + number2 + " =");
		return str;
	}

	
	/**
	 * accessor method
	 * this method returns the + or - operator
	 * @return + or - sign
	 */
	public char getOperator()
	{
		return operator;
	}

	
	/**
	 * determineAnswer method
	 * this method adds/subtracts the 2 numbers 
	 * @return the total value 
	 */
	public int determineAnswer()
	{
		if (operator == '+' )
			return (number1 + number2);
		else 
			if(operator == '-')
				return (number1 - number2);
			else
				return number1;
	}	
}
