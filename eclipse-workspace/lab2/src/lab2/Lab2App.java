package lab2;
import java.util.Scanner;

/**
 * <p> Title: Lab 2: Parsing a URL </p>
 * <p> Description: Ask the user to enter a URL. [finish the description here] </p>
 * @author [Alesandel Lantigua, Noicolas Copete]
 *
 */

public class Lab2App {
	public static void main(String[] args)
	{
		String url;
		int positionOfColon;
		String protocol;
		String restOfUrl;
		String domainName;
		String fileName;
		int positionOfSlash;
		int fileNameLength;
		char firstLetter;
		char lastLetter;
		
		Scanner scnr = new Scanner(System.in);
		// prompt the user for a URL
		System.out.print("Please enter the complete URL: ");
		// read the user's input and store it in the variable url
		url = scnr.nextLine();
		
		// find the : which separates the protocol from the rest of the URL
		positionOfColon = url.indexOf(":");
		
		// extract the protocol from the url
		protocol = url.substring(0, positionOfColon-1);
		
		/* the rest of the URL is everything after the www. 
		 * it begins with the domain name and goes to the end of the file name
		 * the purpose of the restOfUrl to to be able to break the domain and the
		 * file name apart using the position of the / between them */
		restOfUrl = url.substring(positionOfColon+1);
		positionOfSlash = url.indexOf("/");
		domainName = url.substring(positionOfColon, positionOfSlash+2);
		
		
		// output
		System.out.println("The URL is " + url);
		System.out.println("The position of the colon is " + positionOfColon);
		System.out.println("The protocol is " + domainName);
		System.out.println("The rest of the URL is " + restOfUrl);
		System.out.println("The domain name is " + domainName);
		
		scnr.close();
	}
}