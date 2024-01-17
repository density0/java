package proj3sp23;

public class Stock {
	
	private String tickerSym;
	private int sharesOwned;
	private double purchasePrice;
	
	
	public Stock(int owning, double price, String symbol)
	{
		sharesOwned = owning;
		purchasePrice = price;
		tickerSym = symbol;
	}
	
	
	public String getTickerSymbol()
	{
		return tickerSym;
	}
	
	public int getSharesOwned()
	{
		return sharesOwned;
	}
	
	public double getPurchasePrice()
	{
		return purchasePrice;
	}
	
	public void setSharesOwned(int num)
	{
		sharesOwned = num;
	}
	
	
	public String toString()
	{
		String str = new String();
		
		str = "Symbol " + tickerSym + "\nStock owned: " + sharesOwned + "\nShare Price: " + purchasePrice;
		
		return str;
	}

}
