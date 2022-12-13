package proj4;
import java.util.Random;

/**
 * <p>Title: Math Questions  </p>
 * <p>Description: This program creates addition/subtraction basic math questions  </p>
 * @author Alesandel Lantigua
 */

public class Question {

	private int num1;
	private int num2;
	private char operator;

	/*
	 * default constructor
	 * sets the instance variables to default values 
	 */
	public Question()
	{

		Random randGen = new Random();
		

		// randomly generates two characters '-' and '+'
		operator = randGen.nextBoolean()? '-' : '+';

		
		// if operator is "+" then num1 & num2 will be range 0-12, otherwise one is 0-12 and 6-12
			if(operator == '+')
			{
				// num1 & num2 are in the range of 0-12
				num1 = randGen.nextInt(13);
				num2 = randGen.nextInt(13);
			}
			else
				{
					// num1 range is 0-12, and num2 range is 6-12
					num1 = randGen.nextInt(13);
					num2 = randGen.nextInt(12)+6;
					
					if(num1 > num2)
					{	// num1 equals num2 if num1 bigger than num2
						num1 = num2;
					}
				}
	
	}		
			

	/**
	 * toString method
	 * * this method creates and returns a reference to a String object with the state of the object
	 * @return the values stored in the instance variables 
	 */
	public String toString() 
	{
			String str = new String(num2 + " " + operator + " " + num1 + " = ");
			return str;
		
	}

	/**
	 * accessor method for operator
	 * returns the value stored for the operator
	 * @return the symbol used in the math question
	 */
	public char getOperator()
	{
		return operator;
	}

	/**
	 * determineAnswer method
	 * determines the answer with nested if else statements
	 * @return what final value is stored in a question by what operator is being used
	 */
	public int determineAnswer()
	{
		if (operator == '+' )
		{
			return (num2 + num1);
		}
		else 
			{
				return (num2 - num1);
			}	
	}	
}
