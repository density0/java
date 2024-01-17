package proj2sp23;
import javax.swing.JOptionPane;
import java.io.*;
/**
 * <p>Title: Project2<p>
 * <p>Description: This class asks the user how large they want their river to be, then ask's them if they would like to start
 * a simulation of the river moving and shows where the animals are in the river and tells what is happening as they all move. The program also tells the user
 * what error they are currently having. </p>
 * 
 * @author Alesandel Lantigua
 */
public class Project2  {



	public static void main(String[] args) throws IOException
	{
		

		boolean quit = true;
		
		try {
			String water = JOptionPane.showInputDialog("How large do you want your totally natural river to be?");

			int numWater = Integer.parseInt(water);
			River koolAid = new River(numWater);

			while(quit)
			{
				String[] choices = {"Start simulation", "Exit simulation"};


				int choice = JOptionPane.showOptionDialog(null, "Enter your choice...", "Main Menu",JOptionPane.DEFAULT_OPTION, +
						JOptionPane.QUESTION_MESSAGE, null, choices,choices[0]);


				if(choice == 0)
				{
					for(int i = 0; i < 5; i++)
					{
						
						JOptionPane.showMessageDialog(null, koolAid.toString());
						JOptionPane.showMessageDialog(null,koolAid.movement());
						JOptionPane.showMessageDialog(null, koolAid.toString());
					}
				}
				else
				{
					quit = false;
				}
			}
		}
		catch(NumberFormatException  ex)
		{
			System.out.println("NumberFormatException: " + ex.getMessage());
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println("NumberFormatException: " + ex.getMessage());
		}
		catch(IOException ex)
		{
			System.out.println("IOException: " + ex.getMessage());
		}
	}
}
