package lab7;
/*@Author Randall Rubio Alesandel Lantigua
 * Description: The Contact class will define instance variables for a single contact in a cell phone contact list including
the person's first and last names, mobile phone number, email address and date of birth.
Title: User Information
 */

public class Contact 
{

	private String firstName;
	private String lastName;
	private String mobilePhoneNumber;
	private String email;
	private String birthDate;

	public Contact()
	{
		firstName = "None";
		lastName = "None";
		mobilePhoneNumber = "516-555-5555";
		email = "name@email.com";
		birthDate = "01/01/2000";
	}
	
	public String toString()
	{
		String str = new String (lastName + ", " + firstName + "\n" +  mobilePhoneNumber + "\n" + email + "\n" + birthDate);
		return str;
	}

public Contact(String first, String last, String number, String mail, String birth)
{
firstName = first;
lastName = last;
mobilePhoneNumber = number;
email = mail;
birthDate = birth;

}
  public String getFirstName()
  {
  return firstName;
  }

  public String getLastName()
  {
  return lastName;
  }
  
  public String getMobilePhoneNumber()
  {
  return mobilePhoneNumber;
  }
  
  public String getEmail()
  {
  return email;
  }

  public String getBirthDate()
  {
  return birthDate;
  }

  public void setFirstName(String first)
	{
		firstName = first;			
}

  public void setLastName(String last)
	{
		lastName = last;
	}

  public void setMobilePhoneNumber(String number)
	{
	  mobilePhoneNumber = number;
	}

  public void setEmail(String mail)
	{
	  email = mail;
	}

  public void setBirthDate(String birth)
	{
	  birthDate = birth;
	}

  public boolean equals(Contact otherContact)
  {
	  if(this.equals(otherContact))
		  return true;
	  else 
		  return false;
  }



} 

