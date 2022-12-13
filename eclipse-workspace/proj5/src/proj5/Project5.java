package proj5;
import java.util.Scanner;
/**
 * <p>Title: DiceArray  </p>
 * <p>Description: This program creates a DiceArray object. And makes the user roll a array of 3, calculates the roll total and the number of 1's that show up.
 * Makes 5 rounds for the player and computer, at the end calculates their total and the winner is the one with the most points.</p>
 * @author Alesandel Lantigua
 */


public class Project5 {


	public static void main(String[] args)
	{

		// game dice object
		DiceArray pve = new DiceArray();
		
		
		Scanner user = new Scanner(System.in);

		// player total score
		int pTotal = 0;
		// total individual round score
		int roundTotal= 0;
		// computer total score
		int cTotal = 0;

		// for loop to make 5 rounds 
		for(int i = 1; i < 6; i++)
		{
			System.out.println("\nRound " + i);
			System.out.println("\nPlayer turn: ");
			// flag var
			boolean rollAgain = true;

			// auto rolls for player at start of new round
			pve.roll();

			pTotal = pTotal + pve.calcTotalRoll();
			roundTotal = roundTotal + pve.calcTotalRoll();


			// if their roll has double 1's then their score for that round is reset to 0
			if(pve.countNumOnes() == 2)
			{
				pTotal = pTotal - roundTotal;
				roundTotal = 0;
				rollAgain = false;
			}

			// if they rolled triple 1's then their score is reset to 0 and they lose their turn
			else
				if(pve.countNumOnes() == 3)
				{
					pTotal = 0;
					roundTotal = 0;
					rollAgain = false;
				}


			// displays the roll 
			System.out.println(pve.toString());
			// displays the round total
			System.out.println("Players round score: " + roundTotal);
			// displays the total score
			System.out.println("Player total score: " + pTotal);
			
			// counter
			int count = 1;
			

			// players turn
			while(rollAgain)
			{

				System.out.println("Would you like to roll? y/n: ");
				char choice = user.next().charAt(0);

				// if player says yes than roll and count their total score
				if(choice == 'y')
				{

					// player rolls
					pve.roll();
					// total score is added up
					pTotal = pTotal + pve.calcTotalRoll();
					// round total score
					roundTotal = roundTotal + pve.calcTotalRoll();


					// if their roll has double 1's then their score for that round is reset to 0
					if(pve.countNumOnes() == 2)
					{
						pTotal = pTotal - roundTotal;
						roundTotal = 0;
						rollAgain = false;
					}

					// if they rolled triple 1's then their score is reset to 0 and they lose their turn
					else
						if(pve.countNumOnes() == 3)
						{
							pTotal = 0;
							roundTotal = 0;
							rollAgain = false;
						}

					// Displays the roll
					System.out.println(pve.toString());

					// increments count by 1
					count++;
				}
				// if player doesn't enter 'y' then their turn ends
				else
				{
					rollAgain = false;
				}


				// once count reaches 3 then the player's turn is over
				if(count <= 2)
				{
					System.out.println("Players round score: " + roundTotal);
					rollAgain = true;
				}
				else
				{
					System.out.println("Players round score: " + roundTotal);
					roundTotal = 0;
					rollAgain = false;
				}

				// Displays the total score
				System.out.println("Player total score: " + pTotal);
			}


			// flag var
			boolean compRoll = true;

			// computer turn
			System.out.println("\nComputer turn:");
			while(compRoll)
			{
				// computer roll
				pve.roll();

				// adds up computer score total
				cTotal = cTotal + pve.calcTotalRoll();

				// round total score
				roundTotal = roundTotal + pve.calcTotalRoll();

				System.out.println(pve.toString());


				// if computer roll has double 1's then their score for that round is reset to 0
				if(pve.countNumOnes() == 2)
				{

					cTotal = cTotal - roundTotal;
					roundTotal = 0;
					System.out.println("Computer round score: " + roundTotal);
					compRoll = false;
				}

				// if computer roll has triple 1's then score is reset to 0 and computer turn ends.
				else
					if(pve.countNumOnes() == 3)
					{

						cTotal = 0;
						roundTotal = 0;
						System.out.println("Computer round score: " + roundTotal);
						compRoll = false;
					}

				// if computer score is above or equals 20 then turn ends.
				if(roundTotal >= 20)
				{
					System.out.println("Computer round score: " + roundTotal);
					roundTotal = 0;
					compRoll = false;
				}


				System.out.println("Computer total score: " + cTotal);

			}
		}


		// if computer score is greater than player score, then computer wins
		if(cTotal > pTotal)
		{
			System.out.println("\nPlayer score: " + pTotal + "\nComputer score: " + cTotal);
			System.out.println("Computer wins with: " + cTotal + " points." );
		}

		// player wins if player score is greater
		else
			if(cTotal < pTotal)
			{
				System.out.println("\nPlayer score: " + pTotal + "\nComputer score: " + cTotal);
				System.out.println("Player wins with: " + pTotal + " points." );
			}
		
			// else if both have the same score then its a tie
			else
			{
				System.out.println("\nPlayer score: " + pTotal + "\nComputer score: " + cTotal);
				System.out.println("It's a tie! everybody loses!");
			}


		user.close();
	}
}
