package proj4;
import java.util.Scanner;
/**
 * <p>Title: Math Questions  </p>
 * <p>Description: This program creates a Question object and displays math questions the user can input and shows them if the answers they got were wrong or right, at the end tells
 * them how many they got right and wrong and displays their percentage grade.</p>
 * @author Alesandel Lantigua
 */

public class Project4 {


	public static void main(String[] args)
	{
		// instance variables
		int addCorrectCount = 0;
		int addIncorrectCount = 0;
		int subCorrectCount = 0;
		int subIncorrectCount = 0;

		Scanner scnr = new Scanner(System.in);


		for (int i = 1; i < 16; i++)
		{		

			// declares and instantiates a Question object
			Question math = new Question();					


			// prints the object's toString
			System.out.println( "\nQ" + i + ": " + math.toString());

			// user input for the answer
			int answer = scnr.nextInt();

			// if else statement for if what the user puts is correct or not, counts how much they got wrong & right.
			if (answer == math.determineAnswer()) 
			{
				System.out.println("Congrats!, you got it right c:"); 

				if (math.getOperator() == '+')
					addCorrectCount++;

				if (math.getOperator() == '-') 
					subCorrectCount++;
			}

			else
			{
				System.out.println("wow did you really put? " + answer + ", im sorry to say this but it's " + math.determineAnswer());

				if (math.getOperator() == '+')
					addIncorrectCount++;

				if (math.getOperator() == '-')
					subIncorrectCount++;
			}
		}


		// instance variables
		int totalCorrect;
		double grade;

		totalCorrect = addCorrectCount + subCorrectCount;
		grade = (totalCorrect / 15.0) * 100.0;


		// if else statement that tells you overall if you need to practice more or if you mastered the material.
		if (grade >= 90)
			System.out.println("\nCongratulations, you mastered basic math :D");
		else
			if (90 > grade && grade >= 75)
				System.out.println("\nYour suppper close to fully understanding it, You can do it!");
			else 
				System.out.println("\nyou need moooore practice, maybe ask your mommy/daddy for help?");


		//prints how much you got wrong & right on addition problems
		System.out.println("\nAddition:");
		System.out.println("Correct:" + addCorrectCount);
		System.out.println("Incorrect:" + addIncorrectCount);

		//prints how much you got wrong & right on subtraction problems
		System.out.println("\nSubtraction:");
		System.out.println("Correct:" + subCorrectCount);
		System.out.println("Incorrect:" + subIncorrectCount);

		//prints your percentage grade
		System.out.println(grade + "%");
		scnr.close();
	}

}
