package proj3sp23;
import queue.LinkedQueue;
import java.io.IOException;
import exceptionclasses.EmptyQueueException;



public class Portfolio {

	private LinkedQueue<Stock>[] companyQueues;
	private int numCompanies;
	private SymbolTable symbols;
	private double gainLoss;


	public Portfolio(SymbolTable table) throws IOException
	{
		symbols = table;
		numCompanies = symbols.getNumSymols();
		gainLoss = 0.0;

		companyQueues = new LinkedQueue[numCompanies];

		for(int i = 0; i < numCompanies; i++)
		{
			companyQueues[i] = new LinkedQueue<Stock>();
		}
	}

	/**
	 * processTransaction method
	 * proceesses the transcation made and calulates the gain/loss of profits
	 * @param bs
	 * @param numShares
	 * @param price
	 * @param ticker
	 * @throws InvalidSaleException
	 * @throws EmptyQueueException
	 */
	public void processTransaction(char bs, int numShares, double price, String ticker) throws InvalidSaleException, EmptyQueueException
	{
		if (symbols.findCompany(ticker) == null) 
		{
			throw new InvalidSaleException("there is no symbol like that");
		}

		int index = findCompany(ticker);

		LinkedQueue<Stock> queue = companyQueues[index];

		if (bs == 'b') {

			Stock stock = new Stock(numShares, price, ticker);
			queue.enqueue(stock);

		} 
		else 
			if (bs == 's') {

				Stock stock = queue.front();
				
				
				if(stock == null)
				{
					throw new EmptyQueueException();
				}

				//  if numShares higher than shares owned throw exception
				if (numShares > stock.getSharesOwned()) {
					throw new InvalidSaleException("Not enough shares to sell");
				}


				double totalPurchasePrice = stock.getSharesOwned() * stock.getPurchasePrice();
				double sellPrice = numShares * price;
				gainLoss += (sellPrice - totalPurchasePrice);


				stock.setSharesOwned(stock.getSharesOwned() - numShares);

				// Remove stock objects
				if (stock.getSharesOwned() == 0) {
					queue.dequeue();
				}
			}
	}


	
	/**
	 * findCompany method
	 * tries to find the pos of the ticker.
	 * @param ticker
	 * @return the int pos of the ticker
	 */
	private int findCompany(String ticker) 
	{
		String name = symbols.findCompany(ticker);
		
		for (int i = 0; i < symbols.getNumSymols(); i++) 
		{
			if (symbols.findCompany(ticker).equals(ticker))
			{
				return i;
			}
		}
		return -1; 
	}

	
	/**
	 * toString method
	 * companyQueues
	 * @returns str
	 */
	public String toString()
	{
		String str = new String();

		for(int i =0; i < numCompanies; i++)
		{
			str +="\n" + companyQueues[i].toString() + gainLoss;
		}
		return str;
	}
}
