package proj2sp23;

public class Project2 {
	
	
	
	public static void main(String[] args)
	{
		
		
		Bear pooh = new Bear();
		Fish tod = new Fish();
		
		System.out.println(pooh.toString() + "\n");
		System.out.println(tod.toString() + "\n");
		System.out.println(pooh.compareType(tod) + "\n");
		
		River yellowStone = new River(10);
		
		System.out.println(yellowStone.toString());
	}

}
