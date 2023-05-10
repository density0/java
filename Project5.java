package proj5sp23;

import java.io.*;
import java.util.Scanner;

public class Project5 {
	
	
	public static void main(String[] args) throws IOException{
		
		FriendList list = new FriendList();
		
		File dataFile = new File("fbData.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(dataFile));
		
		Scanner scnr = new Scanner(dataFile);
		String fbInfo;
		
		
		User beemo = new User("beemo");
		
		list.addtoFront(beemo);
		
		System.out.println(list.listOfFriends());
		
		
		while (reader.readLine() != null)
		{			
			fbInfo = scnr.nextLine();
			String letter;
			String name;
			
			int posOfSpace = fbInfo.indexOf(" ");
			
			letter = fbInfo.substring(0,posOfSpace);
			name = fbInfo.substring(posOfSpace+1);
			
			System.out.println(letter);
			if(letter == "A")
			{
			
			}
			scnr.close();
		}
		
		
	
		
		
		
	}

}
