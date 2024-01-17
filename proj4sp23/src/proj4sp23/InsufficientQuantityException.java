package proj4sp23;


public class InsufficientQuantityException extends RuntimeException 
{
	public InsufficientQuantityException(String str) 
	{
		super(str);
	}
}