package proj3sp23;

public class SymbolPair {
	
	private String tickerSym; 
	private String companyName;
	
	public SymbolPair(String ticket, String name)
	{
		tickerSym = ticket;
		companyName = name;
	}
	
	public String getTickerSymbol()
	{
		return tickerSym;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	public String toString()
	{
		String str;
		str = "ticker: " + tickerSym + "\nCompany Name: " + companyName;
		return str;
	}
}