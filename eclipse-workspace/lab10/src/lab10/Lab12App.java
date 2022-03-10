package lab10;
/**
 * <p>Title: Lab12App</p>
 * <p>Description: it flips the order of students from the file & 
 * it searches the students with matching ID's and deletes it.</p>
 * @author Randall Rubio, Alesandel Lantigua

 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab12App {
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
			theCourse.insertStudentAtBeginning(yab);

			//theCourse.insertStudent(yab);
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
		
		/**
		if(theCourse.deleteStudents(tomato) == true)
		{
			System.out.println("deletion successful!\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		}
		else
			System.out.println("not able to delete. Student not found in the course\nthe number of Students in this course" + theCourse.getNumStudents() + "\n");
		
		if(theCourse.deleteStudents(sunflower) == true)
		{
			System.out.println("deletion successful!\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		}
		else
			System.out.println("not able to delete. Student not found in the course\nthe number of Students in this course" + theCourse.getNumStudents() + "\n");
		
		if(theCourse.deleteStudents(bean) == true)
		{
			System.out.println("deletion successful!\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		}
		else
			System.out.println("not able to delete. Student not found in the course\nthe number of Students in this course" + theCourse.getNumStudents() + "\n");
		
		if(theCourse.deleteStudents(poppy) == true)
		{
			System.out.println("deletion successful!\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		}
		else
			System.out.println("not able to delete. Student not found in the course\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		System.out.println( "\n"+ theCourse);
		**/
		Student yams = new Student();
		Student kale = new Student();
		Student eggplant = new Student();
		Student watermelon = new Student();
		
		yams.setId("333-44-5555");
		kale.setId("222-34-5555");
		eggplant.setId("888-44-2222");
		watermelon.setId("666-66-6666");
		
		if(theCourse.deleteStudentByShifting(yams) == true)
		{
			System.out.println("deletion successful!\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		}
		else
			System.out.println("not able to delete. Student not found in the course\nthe number of Students in this course" + theCourse.getNumStudents() + "\n");
		
		if(theCourse.deleteStudentByShifting(kale) == true)
		{
			System.out.println("deletion successful!\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		}
		else
			System.out.println("not able to delete. Student not found in the course\nthe number of Students in this course" + theCourse.getNumStudents() + "\n");
		
		if(theCourse.deleteStudentByShifting(eggplant) == true)
		{
			System.out.println("deletion successful!\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		}
		else
			System.out.println("not able to delete. Student not found in the course\nthe number of Students in this course" + theCourse.getNumStudents() + "\n");
		
		if(theCourse.deleteStudentByShifting(watermelon) == true)
		{
			System.out.println("deletion successful!\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		}
		else
			System.out.println("not able to delete. Student not found in the course\nthe number of Students in this course " + theCourse.getNumStudents() + "\n");
		System.out.println( "\n"+ theCourse);
		

	}
	}


