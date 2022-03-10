package lab10;
/**
 *  <p>Title: The Course Class</p>
 *  <p>Description: This is the app class, Displays the Students ID, first and last name, and their grades. 
 *  it also calculates and displays the average.
 *  shows the number of students in the course too.<p>
 *   
 * @author Randall Rubio, Alesandel Lantigua
 */


import java.util.Scanner;


public class Lab10App {
	
	
	public static void main(String[] args)
	{
		double[] grades = {78.0, 93.5, 91.0, 88.5};
		double[] grades1 = {82.0, 67.5, 90.0, 85.0};
		double[] grades2;
				
		Course CS = new Course();
		
		Student Bob = new Student("N001234", "Bob", "The Builder", grades);
		
		Student Thomas = new Student("N002345", "Thomas", "The tank engine", grades1);
		
		
		System.out.println("Number of students in classroom: " + CS.getNumStudents());
		
		CS.insertStudent(Bob);
		CS.insertStudent(Thomas);
		

		System.out.println("\nNumber of students in classroom: " + CS.getNumStudents());
		
		// Its just the address of the object, "lab10.Course@4926097b" is what was output
		// After doing step 14, it displays the state of the object, Because the program has a toString to look on now.
		System.out.println(CS);
		System.out.println("Test Avg: " + CS.calcExamAverage(1));

		
		Scanner scnr = new Scanner(System.in);
		grades2 = new double[4];
		
		for (int i=0; i < 4; i++)
		{
			
			System.out.println("Whats your grade?: ");
			grades2[i] = scnr.nextDouble();
			
			while(grades2[i] < 0 || grades2[i] > 100)
			{
				System.out.println("Re-enter");
				grades2[i] = scnr.nextDouble();

			}
				
		}
		Student Winnie = new Student("N002561", "Winnie", " The Pooh", grades2);
		CS.insertStudent(Winnie);
		System.out.println("Number of students in classroom: " + CS.getNumStudents());
		System.out.println(CS);
		System.out.println("Test Avg: " + CS.calcExamAverage(1));
		scnr.close();
	}
}

