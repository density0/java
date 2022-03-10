package lab10;
/**
 * <p>Title: The Course Class</p>
 * 
 * <p>Description: This class models a Course and is capable of storing references 
 * to Student objects. Students can be inserted in the course and the number of students
 * in the course can be determined. The average for a given exam can be calculated, the 
 * position of the Student with the lowest score for a given exam can be determined and 
 * the students at a given position can be returned.</p>
 *
 * @author Randall Rubio, Alesandel Lantigua
 *
 */
public class Course 
{
	//instance variables

	private Student[] course;
	private int numStudents;

	/**
	 * Default constructor --
	 * Creates storage for at most 30 students and sets the number of
	 * students in the course to 0.
	 */
	public Course()
	{
		course = new Student[30];
		numStudents = 0;

	}

	/**
	 * getNumStudents --
	 * Returns the number of students currently in the course.
	 * @return numStudents
	 */
	public int getNumStudents()
	{
		return numStudents;
	}

	/**
	 * insertStudent --
	 * Adds a student to the course if there's room.  If the course is full, 
	 * it doesn't do anything.
	 * @param a reference to the student to be added 
	 */
	public void insertStudent(Student st)
	{
		if (numStudents < course.length)
		{
			course[numStudents] = st;
			numStudents++;
		}
	}

	/**
	 * calcExamAverage --
	 * Calculates the average for a particular exam.
	 * @param the exam number to calculate the average for
	 * @return the average for the specified exam
	 */
	public double calcExamAverage(int whichExam)
	{
		double[]  grades;
		double exam = 0;
		double avg = 0;

		for (int i=0; i<numStudents; i++) 
		{
			grades = course[i].getExams();	
			exam = exam + grades[whichExam - 1];
		}
		avg = exam / numStudents;
		return avg;
	}


	/**
	 * findIndexForStudentWithLowestExam --
	 * Determines the index of the student with the lowest score for a 
	 * particular exam. 
	 * 
	 * @param an integer representing the exam number to find the lowest 
	 * exam score for 
	 * @return the index of the student with the lowest exam score for the 
	 * specified exam
	 */


	/**
	 * toString method -- 
	 * Returns a String representing the state of the Course.
	 * @return a reference to a string containing all the students in
	 * the course
	 */
	public String toString()
	{

		String str = new String();
		for (int i =0; i < numStudents; i++)
			str = str + course[i].toString() + "\n";
		return str;
	}

	public int findStudent(Student otherStudent)
	{
		for(int i = 0; i < numStudents; i++)
		{
			if(course[i].equals(otherStudent))
			{
				return i;
			}
		}
		return -1;
	}

	public boolean deleteStudents(Student otherStudent)
	{

		int index = this.findStudent(otherStudent);

		if(index == -1)
		{
			return false;
		}
		else
		{
			course[index] = course[numStudents -1];
			course[numStudents - 1] = null;
			numStudents--;
			return true;

		}
	}


	public boolean deleteStudentByShifting(Student otherStudent)
	{
		int posToRemove = this.findStudent(otherStudent);

		if(posToRemove == -1)
		{
			return false;
		}
		else
		{
			for(int i = 0 ; i < (numStudents- 1); i++)
			{
				course[i] = course[i + 1];
			}

			course[numStudents - 1] = null;
			numStudents--;
			return true;
		}
	}

	public void insertStudentAtBeginning(Student otherStudent)
	{

		if (numStudents < course.length)
		{


			for(int i = (numStudents + 1); i > 0; i--)
			{
				course[i] = course[i - 1];

			}

			course[0] = otherStudent;
			numStudents++;
			System.out.println(numStudents);
		}

	}


}








