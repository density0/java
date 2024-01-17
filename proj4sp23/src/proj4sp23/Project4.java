package proj4sp23;
import java.io.*;
import lists.*;

public class Project4 {

	public static void main(String[] args) throws DateException, IOException
	{




		Date annaBDay = new Date("9/23/2991");

		FoodItem apples = new FoodItem(7, annaBDay);


		FoodItem banana = new FoodItem(7, annaBDay);



		System.out.println("anna's b day is:\n" +annaBDay);


		System.out.println(apples);
		System.out.println(banana.equals(apples));

		File dataFile = new File("inventory.txt");

		BufferedReader reader = new BufferedReader(new FileReader(dataFile));
		BufferedReader inserting = new BufferedReader(new FileReader(dataFile));

		int sizing =0;
		while(reader.readLine() != null)
		{
			sizing++;
		}

		System.out.println("-----");
		ArrayUnorderedList<FoodCategory> groceryStore = new ArrayUnorderedList<FoodCategory>(sizing);

		
		File log = new File("dailylog.txt");
		
		BufferedReader daily = new BufferedReader(new FileReader(log));
		BufferedReader inv = new BufferedReader(new FileReader(dataFile));
		
		
		while(daily.readLine() != null)
		{

			int i = 0;
			String data = inserting.readLine();
			String[] spaceSplit = data.split(" ");
			int amount = Integer.parseInt(spaceSplit[1]);
			
			
			/**
			if(i == 0)
			{
				groceryStore.addToFront(new FoodItem(amount,new Date(spaceSplit[2])));
			}

			else
			{
				groceryStore.addAfter(groceryStore.get(i),new FoodItem(amount,new Date(spaceSplit[2])));
			}
			 */
			
			
			if(spaceSplit[0] == "a")
			{
				if(i == 0)
					groceryStore.addToFront(new FoodCategory(spaceSplit[1]));
			}
			

			System.out.println(groceryStore.toString());
			i++;


		}

		

	}
}