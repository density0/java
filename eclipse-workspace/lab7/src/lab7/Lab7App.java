package lab7;

/*@Author Randall Rubio Alesandel Lantigua
 * Description: /*@Author Randall Rubio Alesandel Lantigua
 * Description: . The Application class will define instance methods that can update each instance variable, can retrieve the data stored in
each instance variable and can return the state of an entire Contact object
Title: User Information
 */

public class Lab7App {
	public static void main(String[] args)
	{
	Contact theContact = new Contact();
	 System.out.println("Testing default constructor: " + "\n" + theContact.toString());
	 
	 Contact updatedContact = new Contact("Mary", "Johnson", "631-123-4567", "mjohnson@gmail.com","03/15/1990");
	 System.out.println("\n" + "Testing parameterized constructor: " + "\n" + updatedContact.toString());
	 
	 updatedContact.getFirstName();
	 updatedContact.getLastName();
	 updatedContact.getMobilePhoneNumber();
	 updatedContact.getEmail();
	 updatedContact.getBirthDate();
	 
	 System.out.println("\n" + "Testing accessor methods: ");
	 System.out.println("First Name: " + updatedContact.getFirstName());
	 System.out.println("Last Name: " + updatedContact.getLastName());
	 System.out.println("Phone Number: " + updatedContact.getMobilePhoneNumber());
	 System.out.println("Email: " + updatedContact.getEmail());
	 System.out.println("Date of Birth: " + updatedContact.getBirthDate());
	 
	 updatedContact.setFirstName("Kevin");
	 updatedContact.setLastName("Newton");
	 updatedContact.setMobilePhoneNumber("516-987-6543");
	 updatedContact.setEmail("knewton@hotmail.com");
	 updatedContact.setBirthDate("08/08/1988");
	 
	 System.out.println("\n" + "Testing mutator methods on default objects: " + "\n" + updatedContact.toString());
	 


	 
}
}
