package exceptionclasses;


@SuppressWarnings("serial")
public class EmptyQueueException extends Exception{
	

	public EmptyQueueException(String str) 
	{
		super(str);
	}
}