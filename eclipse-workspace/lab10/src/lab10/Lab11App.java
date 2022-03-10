package lab10;
import java.io.*;
import java.util.*;
/**
 * <P>Title:Lab11 <P>
 * <P>Description: reads the file & stores the content from files into variables <P>
 * 
 * @author Alesandel Lantigua, Randall Rubio
 */


public class Lab11App {

	public static void main (String [ ] args) throws IOException
	{

		String id;
		String firstName;
		String lastName;
		double[] grades = new double[4];

		Course theCourse = new Course();
		System.out.println("The course contains: ");
		Scanner fileScan = new Scanner(new File("courseData.txt"));

		while(fileScan.hasNext())
		{

			id = fileScan.nextLine();
			lastName = fileScan.next();
			firstName = fileScan.nextLine();

			//System.out.println(id + " " + firstName + " " + lastName);

			for (int i=0; i < grades.length; i++)
			{

				grades[i] = fileScan.nextDouble();
				
			}
			
			fileScan.nextLine();

			Student yab = new Student(id, firstName, lastName, grades);
			
			
			theCourse.insertStudent(yab);
		}


		fileScan.close();
		System.out.println( "\n"+ theCourse);
		Student poppy = new Student();
		Student bean = new Student(); 
		Student tomato = new Student();
		Student  sunflower = new Student();
		bean.setId("123-45-6789");
		tomato.setId("765-43-2100");
		sunflower.setId("999-99-9999");
		poppy.setId("666-66-6666");
		
		System.out.println("Position of the student with id '123-45-6789' in the array: " + theCourse.findStudent(bean));
		System.out.println("Position of the student with id '765-43-2100' in the array: " + theCourse.findStudent(tomato));
		System.out.println("Position of the student with id '999-99-9999' in the array: " + theCourse.findStudent(sunflower));
		System.out.println("Position of the student with id '666-66-6666' in the array: " + theCourse.findStudent(poppy));
		
		
	}


}
