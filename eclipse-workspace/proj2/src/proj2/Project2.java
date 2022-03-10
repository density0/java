package proj2;
import java.util.Scanner;

/**
 * <p>Title: Course Info </p>
 * <p>Description: This program shows the different information of the course. </p>
 * @author Alesandel Lantigua
 *
 */
public class Project2 {
	public static void main(String[] args)
	{
		// should store the position of where a space is located
		int posOfSpace;
		int posOfSpace2;
		// should store the position of where a hyphen is located
		int posOfHyphen;
		int posOfHyphen2;
		int lastposOfHypen;
		// should store the full course information as entered by the user
		String courseInfo; 

		// should store the various parts of the course information, do not change the data type of any of these variables
		String dept;
		String section;
		String courseName;
		String courseId;
		int courseNum;
		double credits;
		
		Scanner scnr = new Scanner(System.in);
		/* use 
		18169 CSC-120-G1 4.0-Computer Science I
		as your initial input */
		System.out.println("Please enter a String with the course information");
		
		courseInfo = scnr.nextLine();
		
		/* tells first, & second position of spaces */
		posOfSpace = courseInfo.indexOf(" ");
		posOfSpace2 = courseInfo.indexOf(" ", posOfSpace + 2);
		
		
		/* tells first, second, & last position of hyphens */
		posOfHyphen = courseInfo.indexOf("-");
		posOfHyphen2 = courseInfo.indexOf("-", posOfHyphen + 2);
		lastposOfHypen = courseInfo.lastIndexOf("-");
		
		/* tells info positions of the CourseInfo  */
		courseId = courseInfo.substring(0, posOfSpace);
		dept = courseInfo.substring(posOfSpace,posOfHyphen);
		courseName = courseInfo.substring(lastposOfHypen+1);
		courseNum = Integer.parseInt(courseInfo.substring(posOfHyphen+1, posOfHyphen2 ));
		section = courseInfo.substring(posOfHyphen2+1, posOfSpace2);
		credits =  Double.parseDouble(courseInfo.substring(posOfSpace2+1, lastposOfHypen));
				
				
		System.out.println("The course information is: " + courseInfo);
		scnr.close();
		/* prints out the Course ID */
		System.out.println("Course Id: " + courseId);
		
		
		/* prints out the dept */
		System.out.println("Department: " + dept);
	
		
		/* prints out the courseNum */
		System.out.println("Course Number: " + courseNum);
	
		
		/* prints out the section */
		System.out.println("Section: " + section);
				
		/* prints out the credits */
		System.out.println("Credits: " + credits);
		
		
		/* prints out the courseName */
		System.out.println("Course Name: " + courseName);
		
		
		/* use 
		7531 MATH-1001-T11 4.25-Mathematical Reasoning
		for additional testing */
	}
}