package proj2sp23;
import java.util.Random;
public class Animal {

	private String type;
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

		int kind = randGen.nextInt(2)+1;


		if(gen == 1)
		{
			gender = "Male";
		}
		else

		{
			gender = "Female";
		}
		
		
		if(kind == 1)
		{
			type = "Bear";
		}
		else
			if(kind == 2)
			{
				type = "Fish";
			}
			

		power = randGen.nextInt(101);
		
	
	}





	public String getType()
	{
		return type;
	}

	public String getGender()
	{
		return gender;
	}

	public int getPower()
	{
		return power;
	}


	public int increased()
	{
		return power + 3;
	}
	
	
	public boolean compareGender(Animal otheranimal)
	{
		
		if(this.type.getClass() == otheranimal.type.getClass())
		{
			return true;
		}
		return false;
	}
	
	public boolean compareType(Animal otheranimal)
	{
		if(this.type == otheranimal.type)
		{
			return true;
		}
		return false;
	}

	
	public void comparePower(Animal otheranimal)
	{
		if(this.getPower() > otheranimal.getPower())
		{
			this.increased();
		}
		else
		{
			otheranimal.increased();
		}
	}


	public String toString()
	{
		String str = new String();

		str = "Type: " + type + "\nGender: " + gender + "\nStrength: " + power;

		return str;
	}

}
