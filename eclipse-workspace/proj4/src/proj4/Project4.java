package proj4;
import java.util.Scanner;
/**<p>Title: Math Problems </p>
 * <p>Description: This program generates random plus or minus math problems. </p>
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
		
		// for loop for the number of randomly generated questions
		for (int i = 1; i < 11; ++i) {
			

			// declares and instantiates a Question object
			Question math = new Question();
			
			// prints the object's toString
			System.out.println( "\nQ" + i + ": " + math.toString());

			int input = scnr.nextInt();

			// if else statement for if what the user puts is correct or not, counts how much they got wrong & right.
			if (input == math.determineAnswer()) 
			{
				System.out.println("Congrats!, you got it right c:"); 

				if (math.getOperator() == '+')
					addCorrectCount++;

				if (math.getOperator() == '-') 
					subCorrectCount++;
			}
			else
			{
				System.out.println("Dummy! its not " + input + ", it's " + math.determineAnswer());

				if (math.getOperator() == '+')
					addIncorrectCount++;

				if (math.getOperator() == '-')
					subIncorrectCount++;
			}
			
			
			// instance variables
			int totalCorrect;
			int grade;
			
			totalCorrect = addCorrectCount + subCorrectCount;
			grade = totalCorrect * 10;
			
			// if else statement that tells you overall if you need to practice more or if you mastered the material.
			if (grade >= 90)
				System.out.println("\nCongratulations, you mastered basic math :D");
			else
				if (90 > grade && grade >= 75)
					System.out.println("\nYour suppper close to fully understanding it, You can do it!");
				else 
					if (grade < 75)
						System.out.println("\nyou need moooore practice");
			
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
		}	scnr.close();
	} 
}
