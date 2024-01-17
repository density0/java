package lab7;
import exceptionclasses.EmptyQueueException;
import queue.CircularArrayQueue;
public class Lab7App {

	/**
	 * <p>Title: Lab7App</p>
	 *
	 * <p>Description: this program creates a CircularArrayQueue and enueues product objects
	 * inside of it. it also removes the frontmost item of the queue, .</p>
	 *
	 * @author <Alesandel Lantigua, Sahil Hiranand>
	 */


	public static void main(String[] args) {
		CircularArrayQueue<Product> theQueue = new CircularArrayQueue<Product>(3);
		Product eggos = new Product("111", 1, 1.99);
		Product leggos = new Product("222", 2, 2.99);
		theQueue.enqueue(eggos);
		theQueue.enqueue(leggos);

		System.out.println("The Queue:\n"+theQueue);

		try
		{
			System.out.println("removing from the Queue:\n" + theQueue.dequeue());
		}
		catch (EmptyQueueException e)
		{
			System.out.println(e);
		}

		System.out.print("Modified Queue:\n" + theQueue);

		try
		{
			System.out.println("removing from the Queue:\n" + theQueue.dequeue());
		}
		catch (EmptyQueueException e)
		{
			System.out.println(e);
		}

		Product hammy = new Product("333", 3, 3.99);
		Product milk = new Product("444", 4, 4.99);

		theQueue.enqueue(hammy);
		theQueue.enqueue(milk);

		System.out.println("Modified Queue:\n"+ theQueue);

		Product spoon = new Product("555", 5,5.99);
		Product fork = new Product("666", 6,6.99);

		theQueue.enqueue(spoon);
		theQueue.enqueue(fork);

		System.out.println("The Queue:\n"+theQueue);
		System.out.print(theQueue.size());

		Product apples = new Product("777", 7, 7.99);
		Product ps6 = new Product("888", 8, 8.99);

		theQueue.enqueue(apples);
		theQueue.enqueue(ps6);
		System.out.println("Modified Queue:\n"+ theQueue);

		while(theQueue.size() != 0)
		{
			try
			{
				System.out.println("removing from the Queue:\n" + theQueue.dequeue());
			}
			catch (EmptyQueueException e)
			{
				System.out.println(e);
			}

		}

		try
		{
			System.out.println("removing from the Queue:\n" + theQueue.dequeue());
		}
		catch (EmptyQueueException e)
		{
			System.out.println(e);
		}

		System.out.println("the pos is: " + theQueue.search(ps6));

		theQueue = new CircularArrayQueue<Product>(3);

		System.out.println("the new Queue\n" + theQueue);

		System.out.println("the pos of ID 555 is: " + theQueue.search(new Product("555", 0, 0)));

		Product p1 = new Product("111", 10, 1.99);
		Product p2 = new Product("222", 20, 2.99);
		Product p3 = new Product("333", 30, 3.99);

		theQueue.enqueue(p1);
		theQueue.enqueue(p2);
		theQueue.enqueue(p3);
		System.out.println("the new Queue:\n" + theQueue);

		try
		{
			System.out.println("removing from the Queue:\n" + theQueue.dequeue());
		}
		catch (EmptyQueueException e)
		{
			System.out.println(e);
		}

		System.out.println("the new Queue\n" + theQueue);

		Product p4 = new Product("444", 40, 4.99);
		theQueue.enqueue(p4);
		System.out.println("the pos of ID 222 is: " + theQueue.search(new Product("222", 0, 0)));
		System.out.println("the pos of ID 555 is: " + theQueue.search(new Product("555", 0, 0)));
		System.out.println("the pos of ID 333 is: " + theQueue.search(new Product("333", 0, 0)));
		System.out.println("the pos of ID 444 is: " + theQueue.search(new Product("444", 0, 0)));

		System.out.println("the new Queue:\n" + theQueue);

		int total = 0;
	

		

		CircularArrayQueue<Product> theOtherQueue = new CircularArrayQueue<Product>(3);



		while(theQueue.size() != 0)
		{	
			try
			{
				total += theQueue.front().getQuantity();
			} 
			catch (EmptyQueueException e)
			{
				System.out.println(e.getMessage());
			}
			
			try 
			{
				theOtherQueue.enqueue(theQueue.front());
			} 
			catch (EmptyQueueException e)
			{
				System.out.println(e.getMessage());
			}
			
			try
			{
				System.out.println("removing from the Queue:\n" + theQueue.dequeue());
			}
			catch (EmptyQueueException e)
			{
				System.out.println(e);
			}	
		}

		System.out.println("The Total Quantity of theQueue is: " + total);


		try
		{
			theOtherQueue.front().setQuantity(10);
		}

		catch (EmptyQueueException e)
		{
			System.out.println(e);
		}
		System.out.println("the Queue:\n"+theOtherQueue.toString());
	}

}
