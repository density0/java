package proj3sp23;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class SymbolTable {


	private SymbolPair[] symbolPairs;
	private int numSymbols;

	public SymbolTable(File company) throws IOException
	{
		
		BufferedReader reader = new BufferedReader(new FileReader(company));

		while(reader.readLine() != null)
		{	
			numSymbols++;
		}

		BufferedReader inserting = new BufferedReader(new FileReader(company));

		symbolPairs = new SymbolPair[numSymbols];

		Scanner scnr = new Scanner(company);
		
		int posOfSpace;
		int posOfComma;
		int posOfComm;
		String nameCompany;
		
		for(int i = 0; i < numSymbols; i++)
		{
			String info = scnr.nextLine();
			posOfSpace = info.indexOf(" ");
			posOfComma = info.indexOf(",");
			posOfComm = info.indexOf("Common");

			String data = inserting.readLine();
			String[] spaceSplit = data.split(" ");

			symbolPairs[i] =  new SymbolPair(spaceSplit[0], (spaceSplit[1]));

			if(!data.contains(String.valueOf(',')))
			{
				nameCompany = data.substring(posOfSpace+1);
				symbolPairs[i] =  new SymbolPair(spaceSplit[0], nameCompany);
			}
			else
			{
				nameCompany = data.substring(posOfSpace+1 ,posOfComma);
				symbolPairs[i] =  new SymbolPair(spaceSplit[0], nameCompany);
			}	
			if(data.contains(String.valueOf("Common")))
			{
				nameCompany = data.substring(posOfSpace+1, posOfComm);
				symbolPairs[i] =  new SymbolPair(spaceSplit[0], nameCompany);
			}
		}
	}

	/**
	 * findCompany method
	 * accepts String of a ticker and gets the company name from it
	 * @param ticker
	 * @return a string of the companies name
	 */
	public String findCompany(String ticker)
	{
		for (int i = 0; i < numSymbols; i++) 
		{
			if (symbolPairs[i].getTickerSymbol().equals(ticker)) 
			{
				return symbolPairs[i].getCompanyName();
			}
		}
		return null;
	}

	/**
	 * getNumSymols method
	 * gets the number of Symbols
	 * @return numSymbols
	 */
	public int getNumSymols()
	{
		return numSymbols;
	}	

	/**
	 * toString method
	 * returns the state of the SymbolTable object
	 * @return str
	 */
	public String toString()
	{
		String str = new String();

		for(int i = 0; i < numSymbols; i++)
		{
			str = str + "\n" + symbolPairs[i].toString() + "\n";
		}
		return str;
	}
}