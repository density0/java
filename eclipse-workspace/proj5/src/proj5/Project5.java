package proj5;
import java.util.Scanner;
/**
 * <p>Title:The pig game <p>
 * <p>Description: This program shows the the pig match and tells the user points and the computer points,
 * and says who had won the game.<p>
 * @author Alesandel Lantigua
 */

public class Project5 {

	public static void main(String[] args)
	{
		// instance variables
		int total = 0;
		int Player_Score = 0;
		int comp_total = 0;
		int Computer_Score = 0;
		char again = 0;
		int p_turns = 0;
		int c_turns = 0;
		int[] User_Roundtotals = new int[5];
		int[] Comp_Roundtotals = new int [5];
		Scanner scnr = new Scanner(System.in);

		// declare & create a DiceArray object
		DiceArray comp = new DiceArray();
		DiceArray player = new DiceArray();
		
		// for loop for the number of rounds
		for(int i= 0; i < 5; i++)
		{
			// while loop for the number of turns a player can do in one round
			while(p_turns == 0)
			{

				p_turns++;

				//the dice roll
				player.roll();
				Player_Score += player.calcTotalRoll();
				User_Roundtotals = new int[player.calcTotalRoll()];
				total += Player_Score;

				//prints out your dice roll and the total total score
				System.out.println("\nYour roll: " + player.toString());
				System.out.println("Your roll total is " + Player_Score);

				//if statement saying what happens when your dice has 2 or 3 "1"
				boolean passed = true;
				
				
				if(player.countNumOnes() == 2)
				{
					
					Player_Score = 0;
					System.out.println("Your total score for this round is " + Player_Score);
					passed = true;
				}
				else if(player.countNumOnes() == 3)
				{
					total = 0;
					passed = true;
				}
				else
				{
					System.out.println("Would you like to roll again? (y/n): ");

					again = scnr.next().charAt(0);
				}

				// if statement asking if you'd like to continue or not
				if(again == 'y')
				{
					continue;
				}
				else
				{
					System.out.println("Your total score for this round is " + Player_Score);
					break;
				}

			}

			
			System.out.println("");
			
			// while statement saying to run only three times max
			while(c_turns == 0)
			{
				c_turns++;

				comp.roll();
				Computer_Score += comp.calcTotalRoll();
				Comp_Roundtotals = new int[comp.calcTotalRoll()];
				comp_total += Computer_Score;

				System.out.println("\nComputer roll: " + comp.toString());
				System.out.println("Computer roll total is " + Computer_Score);

				//if statement saying what happens when computer dice has 2 or 3 "1"
				if(comp.countNumOnes() == 2)
				{
					Computer_Score = 0;
					break;
				}
				else if(comp.countNumOnes() == 3)
				{
					comp_total = 0;
					break;
				}

				// if statement ending the computer round if the total is 20
				if(comp_total >= 20)
				{
					System.out.println("\nComputer total score for this round is " + Computer_Score +"\n");
					break;
				}
				else
				{
					continue;
				}	
			}
		}
		
		
		int won = 0;
		int lose = 0;
		
		System.out.println("The game is over");
		System.out.println("The finals scores:");
		System.out.println("Your Score:\t" + total);
		System.out.println("Computer Score:\t" + comp_total);

		// if statement saying if you won or not
		if(total > comp_total)
		{
			won++;
			System.out.println("\nYou Won! your prize? dopamine.");
		}
		else if(total < comp_total)
		{
			lose++;
			System.out.println("\nYou lost :(");
		}
		else
		{
			System.out.println("Being tied is one step closer to lo- I mean winning");
		}

		// prints out the finals results of the match
		System.out.println("User round totals:" );
		System.out.println(User_Roundtotals);
		System.out.println("Computer round totals:");
		
		System.out.println(Comp_Roundtotals);
		System.out.println("You won " + won + " " + "the computer won " + lose);
		scnr.close();
	} 
}







