package proj5sp23;

import java.io.*;
import java.util.Scanner;

/**
 * <p>Title: Project5<p>
 * <p>Description: This class reads a file and creates a SFacebook object, then inserts new users and adds/deletes friends from their friendlist and checks if someone is friends with 
 * someone else or not.  </p>
 * 
 * @author Alesandel Lantigua
 */

public class Project5 {
	public static void main(String[] args) throws IOException{

		FriendList list = new FriendList();

		File dataFile = new File("fbData.txt");

		BufferedReader reader = new BufferedReader(new FileReader(dataFile));

		Scanner scnr = new Scanner(dataFile);
		String fbInfo;

		SFacebook page = new SFacebook();

		while (reader.readLine() != null)
		{			
			fbInfo = scnr.nextLine();
			String letter;
			String name;

			String otherName;

			int posOfSpace = fbInfo.indexOf(" ");

			letter = fbInfo.substring(0,posOfSpace);
			name = fbInfo.substring(posOfSpace+1);


			if (letter.equals("A"))
			{	
				//list.addtoFront(new User(name));

				page.addToFacebook(name);
			}


			int posOfSpace2 = fbInfo.indexOf(" ", posOfSpace + 1);

			if(letter.equals("F"))
			{
				otherName = fbInfo.substring(posOfSpace2);

				try
				{
					page.makeFriends(otherName, name);
				}
				catch (FriendNotFoundException ex)

				{
					System.out.println("theres no such name");
				}


				System.out.println(otherName + " and " + name + " are now friends!");
			}


			if(letter.equals("U"))
			{
				otherName = fbInfo.substring(posOfSpace2);

				try
				{
					page.breakFriendship(otherName, name);
				}
				catch (FriendNotFoundException ex)

				{
					System.out.println("theres no such name");
				}


				System.out.println(otherName + " and " + name + " are no longer friends!");
			}

			if(letter.equals("L"))
			{
				try
				{
					page.findFriend(name).getFriends();
				}
				catch (FriendNotFoundException ex)

				{
					System.out.println("theres no such name");
				}
			}

			if(letter.equals("Q"))
			{
				otherName = fbInfo.substring(posOfSpace2);
				try
				{
					
					if(page.findFriend(name).friendsWith(page.findFriend(otherName)))
					{
						System.out.println( name + " and " + otherName + otherName  + "are friends");
					}
					else
						System.out.println( name + " and " + otherName + otherName  + "arent friends");
				}
				catch (FriendNotFoundException ex)

				{
					System.out.println("theres no such name");
				}
			}

		}
		

		System.out.println(page.toString());
	}
	}

