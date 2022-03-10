package lab8;

public class Lab8App {
	
	public static void main(String[] args)
	{
		
		
		Student studentInfo = new Student();
		
		System.out.println("Student object created by the default constructor:" + studentInfo.toString());
	
		double[] sGrades = {85.5, 90.0, 88.5, 93.0};
		
		
		Student studentNot = new Student("N483793", "Fried", "Chicken", sGrades);
		 sGrades = studentNot.getExamGrades();

		System.out.println("\nStudent object parameterized contructor:" + studentNot.toString());
	
		
		
		Student studentBad = new Student();
		studentBad.setId("N483963");
		
		double[] mGrades = {88.0, 93.5, 79.5, 92.0};
		studentBad.setExamGrades(mGrades);
		
		System.out.println("\nStudent object created by the default constructor after calling the mutator methods:" + studentBad.toString());
		
		
		
		Student studentGood = new Student("N749353"," "," ",sGrades);
		studentGood.getStudentId();
		studentGood.getExamGrades();
		System.out.println("\nTesting the accessor methods on the object created by the parameterized constructor:" + "\n" +studentGood.getStudentId());
		for (int i=0; i<sGrades.length; i++) {
			System.out.println(sGrades[i]);
			}
		
		System.out.println("\nThe average for the object created by the default constructor:" + studentBad.calcExamAverage());
		
		System.out.println("\nThe average for the object created by the default constructor:" + studentGood.calcExamAverage());
		
		
		
		
	}

	
	
	
	
	

}
