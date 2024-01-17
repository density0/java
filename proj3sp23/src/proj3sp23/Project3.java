package proj3sp23;
import java.io.*;
import exceptionclasses.EmptyQueueException;
/**
 * <p>Title: Project3<p>
 * <p>Description: This class takes a file and puts it in a SymbolTable object to read and process the transcations </p>
 * 
 * @author Alesandel Lantigua
 */
public class Project3 {

	public static void main(String[] args) throws IOException {

		// File object for symboldata.txt
		File symbols = new File("symboldata.txt");

		// SymbolTable object 
		SymbolTable testing = new SymbolTable(symbols);



		System.out.println(testing.getNumSymols());
		System.out.println(testing.toString());


		System.out.println(testing.findCompany("GE"));

		Portfolio good = new Portfolio(testing);
		System.out.println(good);


		char boughtSell;
		int numShare;
		double price;
		String ticking;


		int posOfSpace;

		//File object for stockdata.txt 
		File dataFile = new File("stockdata.txt");

		BufferedReader reader = new BufferedReader(new FileReader(dataFile));
		BufferedReader inserting = new BufferedReader(new FileReader(dataFile));

		// keep reading until there is no nextline
		while(reader.readLine() != null)
		{

			String data = inserting.readLine();


			String[] spaceSplit = data.split(" ");

			boughtSell = spaceSplit[0].charAt(0);
			numShare = Integer.parseInt(spaceSplit[1]);
			price = Double.parseDouble(spaceSplit[2]);
			ticking = spaceSplit[3];

			try
			{
				good.processTransaction(boughtSell, numShare, price, ticking);
			}
			catch (EmptyQueueException e)
			{
				System.out.println(e);
			}

		}
		System.out.println(good.toString());


	}
}
