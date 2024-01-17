package proj2sp23;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 * <p>Title: <p>
 * <p>Description: <p>
 * @author Alesandel Lantigua
 */
public class River {


	private int moving;
	int type;
	private Animal[] yellowStone;


	/**
	 * parameterized constructor
	 * specified size of the River array based on the number in the parameter.
	 * @param num
	 */
	public River(int num)throws IOException
	{
		Random random = new Random();

		yellowStone = new Animal[num];

		for(int i = 0; i < yellowStone.length/2; i++)
		{
			type = random.nextInt(2)+1;
			int index = random.nextInt(yellowStone.length);

			if(yellowStone[index] != null) 
			{
				i--;
				continue;
			}

			if(type == 1)
			{
				yellowStone[index] = new Bear();
			}
			else
			{
				yellowStone[index] = new Fish();
			}
		}
	}

	/**
	 * newBorn
	 * adds a new animal in the river that is the same type as the Animal that is passed through the method. 
	 * @param nuisance
	 */
	public void newBorn(Animal nuisance)
	{
		Random randy = new Random();
		int index = randy.nextInt(yellowStone.length);
		Animal baby = new Animal();


		while((yellowStone[index] != null))
		{
			baby = new Animal();
		}

		if(nuisance.getClass().getName() == "proj2sp23.Bear")
		{
			baby = new Bear();
		}
		else
			if(nuisance.getClass().getName() == "proj2sp23.Fish")
			{
				baby = new Fish();
			}

		yellowStone[index] = baby;
	}


	/**
	 * nullify method
	 * makes whatever animal in the index of the array equal to null.
	 * @param clorox
	 */
	public void nullify(int clorox)
	{
		int index = clorox;
		for(int i = 0; i < yellowStone.length; i++)
		{
			yellowStone[index] = null;
		}
	}
	/**
	 * forward method
	 * makes the array next to the index passed through the method equal to the object in the index, then makes the original index null.
	 * @param windex
	 */
	public void forward(int windex)
	{	
		int index = windex;
		Animal chicken = yellowStone[index];

		for(int i = 0; i < yellowStone.length; i++)
		{

			yellowStone[index + 1] = chicken;
			yellowStone[index] = null;
		}
	}

	/**
	 * behind method
	 * makes the array behind to the index passed through the method equal to the object in the index, then makes the original index null.
	 * @param cleanex
	 */
	public void backward(int cleanex)
	{
		int index = cleanex;
		Animal chicken = yellowStone[index];

		for(int i = 0; i < yellowStone.length; i++)
		{
			yellowStone[index - 1] = chicken;
			yellowStone[index] = null;
		}
	}
	/**
	 * movement method
	 * uses all the moving methods to change the position of a random animal in the index, forward, backward or stay in the same spot.
	 * they change positions, or die depending on the situation they are in.
	 * @return "..."
	 */
	public String movement()
	{
		Random mover = new Random();
		// randomize the chosen position of where the river will move
		int index = mover.nextInt(yellowStone.length-1);

		int front = index +1;
		int behind = index - 1;
		Animal frontEnemy;
		Animal backEnemy;

		//Animal object equals to whatever animal is in that array
		Animal boss = yellowStone[index];



		// while chosen position of the animal doesn't exist then keep randomizing the chosen position until one if found 
		while(boss == null)
		{
			index = mover.nextInt(yellowStone.length-1);
			boss = yellowStone[index];
			front = index +1;
			behind = index - 1;
		}
		
		// name of the class the Animal is in
		String bossName = boss.getClass().getName();


		// randomizing how the river moves
		moving = mover.nextInt(3)+1;


		// if index at 0 and moving at 2 the re randomize how the river moves
		while(moving == 2 && index == 0)
		{
			moving = mover.nextInt(3)+1;
		}

		// if index at last index and moving at 1 the re randomize how the river moves
		while(moving == 1 && index == yellowStone.length-1)
		{
			moving = mover.nextInt(3)+1;
		}


		// if 1 then move forward
		if(moving == 1)
		{
			while(index == yellowStone.length-1)
			{
				mover = new Random();
				index = mover.nextInt(yellowStone.length-1);
				frontEnemy = yellowStone[front];
				boss = yellowStone[index];
			}

			frontEnemy = yellowStone[front];

			// if spot is empty then just move
			if(frontEnemy == null)
			{
				this.forward(index);
				if(bossName == "proj2sp23.Bear")
				{
					return ("The Bear at "+ index +" has moved up to an empty spot");
				}
				else
				{
					return ("The Fish at " + index +" has moved up to an empty spot");
				}
			}

			// if there's another animal
			else
			{
				// if the same type of animal
				if(boss.compareType(frontEnemy))
				{
					// if the same gender then fight
					if((boss.compareGender(frontEnemy)))
					{
						// compares the power of two animals
						if(yellowStone[index].comparePower(frontEnemy))
						{

							boss.increased();
							this.forward(index);

							if(bossName == "proj2sp23.Bear")
							{
								return ("Bear " + index + " moved up and encountered a bear... it fought it and won!");
							}
							else
							{
								return ("Fish " + index + " moved up and encountered a Fish... it fought it and won.");
							}
						}
						else
						{
							frontEnemy.increased();
							this.nullify(index);
							if(bossName == "proj2sp23.Bear")
							{
								return ("Bear " + index + " moved up and encountered a bear... it fought it and died.");
							}
							else
							{
								return ("Fish " + index + " moved up and encountered a Fish... it fought it and died.");
							}
						}
					}

					// else different gender then love and stay
					else
						if(!(boss.compareGender(frontEnemy)))
						{
							this.newBorn(boss);
							if(bossName == "proj2sp23.Bear")
							{
								return ("a new baby was made! the Bear stays where they are.");
							}
							else
							{
								return ("a new baby was made! the Fish stays where they are.");
							}
						}
				}
				// else not the same type of animal
				else
				{
					if(bossName == "proj2sp23.Bear")
					{
						this.forward(index);
						return ("The bear " + index +" has moved one space forward and has eaten"
								+ " the fatty salmon for the long hiberation ahead!");

					}
					else
					{

						this.nullify(index);
						return ("The fat lazy bear hasnt moved, while the unfortunate fish at " + index +" has died"
								+ " by moving one space up into the bear's mouth.");
					}
				}
			}
		}

		// if 2 then move backwards
		if(moving == 2)
		{
			while(index == 0)
			{
				mover = new Random();
				index = mover.nextInt(yellowStone.length-1)+1;
				boss = yellowStone[index];
				backEnemy = yellowStone[behind];
			}

			backEnemy = yellowStone[behind];

			// if spot is empty then just move
			if(backEnemy == null)
			{
				this.forward(index);
				if(bossName == "proj2sp23.Bear")
				{
					return ("The Bear at "+ index +" has moved down to an empty spot");
				}
				else
				{
					return ("The Fish at " + index +" has moved down to an empty spot");
				}
			}

			// if there's another animal
			else
			{
				// if the same type of animal
				if(boss.compareType(backEnemy))
				{
					// if the same gender then fight
					if((boss.compareGender(backEnemy)))
					{
						//compares two animals powers
						if(yellowStone[index].comparePower(backEnemy))
						{

							boss.increased();
							this.backward(index);
							if(bossName == "proj2sp23.Bear")
							{
								return ("Bear " + index + " moved down and encountered a bear... it fought it and won!");
							}
							else
							{
								return ("Fish " + index + " moved down and encountered a Fish... it fought it and won.");
							}
						}
						else
						{

							backEnemy.increased();
							this.nullify(index);
							if(bossName == "proj2sp23.Bear")
							{
								return ("Bear " + index + " moved down and encountered a bear... it fought it and died.");
							}
							else
							{
								return ("Fish " + index + " moved down and encountered a Fish... it fought it and died.");
							}
						}
					}

					// else different gender then love and stay
					else
						if(!(boss.compareGender(backEnemy)))
						{
							this.newBorn(boss);
							if(bossName == "proj2sp23.Bear")
							{
								return ("a new baby was made! the Bear stays where they are.");
							}
							else
							{
								return ("a new baby was made! the Fish stays where they are.");
							}
						}
				}

				// else not the same type of animal
				else
				{
					if(bossName == "proj2sp23.Bear")
					{
						this.backward(index);
						return ("The bear " + index +" has moved one space downward and has eaten"
								+ " the fatty salmon for the long hiberation ahead!");

					}
					else
					{
						this.nullify(index);
						return ("The fat lazy bear hasnt moved, while the unfortunate fish at " + index +" has died"
								+ " by moving one space down into the bear's mouth.");				
					}
				}
			}
		}
		// animal fought the current and stayed put
		if(moving == 3)
		{
			if(bossName == "proj2sp23.Bear")
			{
				return ("the Bear has not moved one inch out of fear for what comes next...");
			}
			else
			{
				return ("the Fish has not moved one inch out of fear for what comes next...");
			}
		}
		return ("...");
	}


	/**
	 * toString method
	 * creates a String representing the current state of the River array
	 * @return the state of the River as a String
	 */
	public String toString()
	{
		String str = new String();

		for(int i = 0; i <yellowStone.length; i++)
		{
			if(yellowStone[i] == null)
			{
				str = str + "Pos: " + i + "\n null" + "\n";
			}
			else
			{
				str = str + "Pos: " + i + " \n" + yellowStone[i].toString() + "\n";
			}
		}

		return str;
	}


}
