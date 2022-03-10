package lab6;

public class Lab6App {
	
	public static void main(String[] args)
	{
	
	Dice theDice = new Dice();
	System.out.println("After instantiation: " + theDice.toString());

	theDice.setDie1(2);
	System.out.println("\nUpdated die 1: " + theDice.toString());
	theDice.setDie2(4);
	System.out.println("Updated die 2: " + theDice.toString());
	theDice.setDie3(6);
	System.out.println("Updated die 3: " + theDice.toString());

	theDice.getDie1();
	System.out.println("\nValue of Die 1: " + theDice.getDie1());

	theDice.getDie2();
	System.out.println("Value of Die 2: " + theDice.getDie2());
	
	theDice.getDie3();
	System.out.println("Value of Die 3: " + theDice.getDie3());
	
	theDice.roll();
	System.out.println("\nAfter rolling the dice: " + theDice.toString());

	theDice.calcTotalRoll();
	
	System.out.println("The roll total is " + theDice.calcTotalRoll());
	
	
	
	theDice.threeOfAKind();
	if (theDice.threeOfAKind())
		System.out.println("Three of a kind");
	else 
		System.out.println("Not three of a kind");
	
	theDice.setDie1(4);
	theDice.setDie2(4);
	theDice.setDie3(4);
	System.out.println("\nUpdated the dice " + theDice.toString());
	
	if (theDice.threeOfAKind())
		System.out.println("Three of a kind");
	else 
		System.out.println("Not three of a kind");
	
	theDice.roll();
	System.out.println("\nUpdated the dice " + theDice.toString());
	
	theDice.findHighestDieValue();
	System.out.println("The highest value of the three die is " + theDice.findHighestDieValue());
	
	theDice.roll();
	System.out.println("\nUpdated the dice " + theDice.toString());
	
	theDice.findHighestDieValue();
	System.out.println("The highest value of the three die is " + theDice.findHighestDieValue());
	
	theDice.roll();
	System.out.println("\nUpdated the dice " + theDice.toString());
	
	theDice.findHighestDieValue();
	System.out.println("The highest value of the three die is " + theDice.findHighestDieValue());
	
	
	
	}
}
