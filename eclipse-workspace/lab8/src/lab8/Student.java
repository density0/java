package lab8;
/**
 * <p>Title: </p> Lab8
 * <p>Description: </p> The Student class is designed to get the student id, first and last name and their exam grades, and calc their avg.
 * @author Randall Rubio, Alesandel Lantigua, Yousef El-Karimi
 */


public class Student {
	// instance variables
	private String studentId;
	private String firstName;
	private String lastName;
	private double[] examGrades;
	
	/** 
	 * default constructor
	 * the id, first and last names are initialized to "none"
	 * the array is created with 4 elements - each element is
	 * initialized to 0
	 */
	public Student()
	{
		studentId = new String("N000000");
		firstName = new String("None");
		lastName = new String("None");
		examGrades = new double[4];
		for (int i=0; i<examGrades.length; i++)
			examGrades[i] = 0.0;
	}
	
	/** 
	 * parameterized constructor
	 * stores the parameters into the appropriate instance variables
	 * @param sId the value to be stored in the instance variable id
	 * @param sFirstName the value to be stored in the instance variable first name
	 * @param sLastName the value to be stored in the instance variable last name
	 * @param sExams the value to be stored in the instance variable exam grades
	 */
	public Student(String sId, String sFirstName, String sLastName, double[] sExam) 
	{
		studentId = sId;
		firstName = sFirstName;
		lastName = sLastName;
		examGrades = sExam;	
	}
	
	
	/**
	 * mutator method for student id
	 * stores the parameter into the instance variable
	 * @param sId the value to be stored in the instance variable id
	 */
	public void setId(String sId)
	{
		studentId = sId;
	}

	
	/**
	 * mutator method for exam grades
	 * stores the parameter into the instance variable
	 * @param sExams the address of the array to be stored in the instance variable exams
	 */
	public void setExamGrades(double[] sExams)
	{
		examGrades = sExams;
	}

	
	/**
	 * accessor method for student id
	 * @return a reference to the instance variable student id
	 */
	public String getStudentId()
	{
		return studentId;
	}

	
	/**
	 * accessor method for exam grades
	 * @return a reference to the instance variable exam grades
	 */
	public double[] getExamGrades()
	{
		return examGrades;
	}


	
	/**
	 * calcExamAverage method
	 * calculates the average of the exams
	 * @return the exam average
	 */
	public double calcExamAverage()
	{
		double avg = 0;
		for (int i=0; i<examGrades.length; i++) {
			 
			 avg = avg + examGrades[i] / examGrades.length;
			}
		return avg;
	}

	
	/**
	 * findLowestExam method
	 * find and return the lowest exam score in the array
	 * @return the lowest exam grade in the array
	 */
	

	
	/**
	 * toString method
	 * @return a reference to a String containing the student id, first and last names
	 * and the exam grades
	 */
	public String toString()
	{
		
		
		String str = new String ("\nID: " + studentId + "\nName: " + firstName + ", " + lastName + "\nGrades: " );
		
	
		for (int i=0; i < examGrades.length; i++)
		{
		str = str + examGrades[i] + " ";
		}

		return str;
	}


}