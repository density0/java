package proj2sp23;
import java.util.Random;

public class River {
	
	
	private int moving;
	private Animal[] organism;
	private Bear[] pooh;
	private Fish[] bruce;
	
	public River(int num)
	{
		Random random = new Random();
		
		organism = new Animal[num];
		
		for(int i = 0; i < organism.length/2; i++)
		{
			int index = random.nextInt(organism.length);
			
			if(organism[index] != null) 
			{
				i--;
				continue;
			}
			
			organism[index] = new Animal();
			 
		}
		
	}
	
	

	
	public int movement()
	{
		Random mover = new Random();
		
		moving = mover.nextInt(3)+1;
		
		
		for(int i = 0; i < organism.length; i++)
		{
			moving = mover.nextInt(3)+1;
			
			
			if(organism[0] != null)
			{
				
			}
			
			if(moving == 1)
			{
				organism[i] = organism[i+1];
			}
			else
				if(moving == 2)
				{
					organism[i] = organism[i-1];
				}

		}
			
		
		
		return moving;
	}
	
	
	
						

	
	
	
	
	public String toString()
	{
		String str = new String();
		
		for(int i = 0; i <organism.length; i++)
		{
			if(organism[i] == null)
			{
				str = str + "null" + "\n";
			}
			else
			{
				str = str + organism[i].toString() + "\n";
			}
		}
		
		return str;
	}
	

}
