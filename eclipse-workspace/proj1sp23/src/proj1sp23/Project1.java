package proj1sp23;
import javax.swing.JOptionPane;


public class Project1 {



	public static void main(String[] args)
	{
		/**
		Airplane jetBlue = new Airplane(14);

		System.out.println(jetBlue.toString());

		System.out.println(jetBlue.occupySeats("coach"));

		jetBlue.assigned("first");
		System.out.println(jetBlue.toString());


		jetBlue.cancel("first");
		System.out.println(jetBlue.toString());



		Seat four = new Seat(4, "coach");

		System.out.println(four.toString());

		System.out.println(four.getType());
		System.out.println(four.getOccupied());

		System.out.println(four.reserved(4));

		System.out.println(four.getOccupied());
		 */	

		
		String chairs = JOptionPane.showInputDialog("please enter the number of seats you want your plane to have!" );
		
		int numSeats = Integer.parseInt(chairs);
		
		Airplane jetBlue = new Airplane(numSeats);

		System.out.println(jetBlue.toString());

		String[] choices = {"Make a Reservation", "Cancel a Reservation", "Display a Seating Chart", "Quit"};

		
		
		
		// flag variable
		boolean quit = true;

		// while loop asking the user to pick what options they want until they press quit
		while(quit)
		{
			int choice = JOptionPane.showOptionDialog(null, "Enter your choice...", "Main Menu",JOptionPane.DEFAULT_OPTION, +
			JOptionPane.QUESTION_MESSAGE, null, choices,choices[0]);
			
			
					
			if(choice == 0)
			{				
				String[] seatChoices = {"first", "coach"};

				int seatChoice = JOptionPane.showOptionDialog(null, "Would you like first class or coach?:", "Seat Type Selection", JOptionPane.DEFAULT_OPTION, +
				JOptionPane.QUESTION_MESSAGE, null, seatChoices, seatChoices[1]);

				if(seatChoice == 0)
				{
					jetBlue.assigned(seatChoices[0]);
					JOptionPane.showMessageDialog(null,jetBlue.toString());
				}
				else
				{
					jetBlue.assigned(seatChoices[1]);
					JOptionPane.showMessageDialog(null,jetBlue.toString());
				}
				
				quit = true;
			}

			else
				if(choice == 1)
				{
					
					String[] seatChoices = {"first", "coach"};
					int seatChoice = JOptionPane.showOptionDialog(null, "Would you like first class or coach?:", "Seat Type Selection", JOptionPane.DEFAULT_OPTION, +
							JOptionPane.QUESTION_MESSAGE, null, seatChoices, seatChoices[1]);

					if(seatChoice == 0)
					{
						jetBlue.cancel(seatChoices[0]);
						JOptionPane.showMessageDialog(null,jetBlue.toString());
					}
					else
					{
						jetBlue.cancel(seatChoices[1]);
						JOptionPane.showMessageDialog(null,jetBlue.toString());
					}
				}
			
				else
					if(choice == 2)
					{
						JOptionPane.showMessageDialog(null,jetBlue.toString());
					}
			
			else
				{
					quit = false;
				}

		}
	}

}
