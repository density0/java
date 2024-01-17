package proj4sp23;

/**
 * <p>Title: The DateException Class</p>
 *
 * @author Kieran Bednarz, Alesandel Lantigua
 */

@SuppressWarnings("serial")
public class DateException extends Exception
{
	public DateException()
	{
		super("Invalid value for Date");
	}
	public DateException(String message)
	{
		super(message);
	}
}