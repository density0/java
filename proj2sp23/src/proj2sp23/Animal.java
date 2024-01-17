package proj2sp23;
import java.util.Random;
/**
 * <p>Title:Animal class <p>
 * <p>Description: sets all the specifications that are shared with all Animal and is used as the parent class to other Animal classes.<p>
 * @author Alesandel Lantigua
 */
public class Animal {

	// instance variables
	private String gender;
	private int power;


	/**
	 * default constructor 
	 * sets the initial value for animals, randomly assigns gender and gives a strength value from 0-100
	 */
	public Animal()
	{
		Random randGen = new Random();
		int gen = randGen.nextInt(2)+1;

		if(gen == 1)
		{
			gender = "Male";
		}
		else

		{
			gender = "Female";
		}
		power = randGen.nextInt(101);
	}


	/**
	 * getGender method
	 * accessor method to get what gender is
	 * @return the value of power
	 */
	public String getGender()
	{
		return gender;
	}

	/**
	 * getPower method
	 * accessor method get what power is
	 * @return the value of power
	 */
	public int getPower()
	{
		return power;
	}


	/**
	 * increased method
	 * adds power by + 3.
	 * @return the value of whatever power + 3 is.
	 */
	public int increased()
	{
		return power + 3;
	}


	/**
	 * 
	 * accessor method to get
	 * @return
	 */
	public boolean compareGender(Animal otheranimal)
	{
		if(this.gender == otheranimal.gender)
		{
			return true;
		}
		return false;
	}


	/**
	 * compareType method
	 * compares this type of Animal to the animal passed in the method to check if they are the same class or not
	 * @return true or false
	 */
	public boolean compareType(Animal otheranimal)
	{
		if(this.getClass() == otheranimal.getClass())
		{
			return true;
		}
		return false;
	}


	/**
	 * comparePower method
	 * compares this Animal to the animal passed in the method to check which animal has more power then increases the one with more power.
	 * @return true or false
	 */
	public boolean comparePower(Animal otheranimal)
	{
		if(this.getPower() > otheranimal.getPower())
		{	
			this.increased();
			return true;
		}
		else
		{
			otheranimal.increased();
		}
		return false;
	}


	/**
	    * toString method -- 
	    * creates a String representing the current state of the Animal object
	    * @return the state of the Animal as a String
	    */
	public String toString()
	{
		String str = new String();

		str = "\nGender: " + gender + "\nStrength: " + power;

		return str;
	}

}
