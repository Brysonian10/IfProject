package controller;
//importing the JOPtionPane GUI and the model that I made for the User Car.
import javax.swing.JOptionPane;
import model.UserCar;

public class IfController
{
	/**
	 * Builds the instance of the Controller.
	 */
	
	public IfController()
	{
		
	}
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	
	public void start()
	{
		//newLoop();
		//askUser();
		//userStart();
		loopy();
	}
	
	public void userStart()
	{
		//introduces the user to what this program does.
		JOptionPane.showMessageDialog(null, "Welcome to MAKE YOUR DREAM CAR!!");
		
		//asks what kind of car they want then tells the user what car they picked
		String userCarName = JOptionPane.showInputDialog(null, "Lets start with what kind of car it is, so... what kind of car do you want this to be? It can be anything, just go ahead and type it in.");
		 JOptionPane.showMessageDialog(null, "That's so sick how you have a " + userCarName + "!!! I wish I had one of those...");
		 
		 //Asks how many wheels the car has
		 String wheels = JOptionPane.showInputDialog(null, "How many wheels does " + userCarName + " have?");
		 JOptionPane.showMessageDialog(null, "Wow " + userCarName + " has " + wheels + " wheels!!! That's pretty neat.");
		 
		 //Asks if the car has a roof, if yes, tells the user, if not then tells the user it doesn't have one
		 String roof = JOptionPane.showInputDialog(null, "Is your car a convertible?");
		if(roof == null || roof.equalsIgnoreCase(""))
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing >:[ ");
		}
		 
		 
		 
		 if( roof .equals("yes"))
				 {
			 JOptionPane.showMessageDialog(null, "Your car is a convertible, that is so cool!!");
				 }else
				 {
					 JOptionPane.showMessageDialog(null, "Your car isn't a convertible, but that's ok it is still super cool.");
				 }
		 //Asks for the price of the car
			String response = JOptionPane.showInputDialog(null, "How much is the car?");
			UserCar userCar = new UserCar();
			//repeat until finished correctly
			while (!validDouble(response))
			{
				response = JOptionPane.showInputDialog(null, "No!, type in a valid number for the price!!");
			}
			//assign
			userCar.setPrice(Double.parseDouble(response));
			//shows the toString in the model to explain to the user what they have done so far
			JOptionPane.showMessageDialog(null, userCar);
			//asks what color they want
			String color = JOptionPane.showInputDialog(null, "What color is " + userCarName + "?");
			JOptionPane.showMessageDialog(null, "Your car is " + color + "!");
			
			String quantity = JOptionPane.showInputDialog(null, "How many of you cars was made in the world? If you don't know guess!");
			JOptionPane.showMessageDialog(null, "There are only " + quantity + " of your cars ever made. Thats freaking sick if you have one of them");
			
			
				
		
			 //this is where the for loop is to ask the user 3 times the questions above.
		 }
	
	private void loopy()
	{
		//this is the loop
		for (int ask = 0; ask < 3; ask += 1)
		{
			userStart();
		}
		
		
		//this is random code that i put in here to learn how to do it, it's honestly useless.
		
		//define variable before loop
		boolean isDone = false;
		int count = 0;
		
		while (!isDone) //test the variable
		{
			JOptionPane.showMessageDialog(null, "brother may I have some looooooops??");
			//Eventually change the loop variable
			count++;
			if(count > 10)
			{
				isDone = true; //update variable
			}
			
		}
		
		
		
	}
		 	//this is also useless but here because I was practicing things.
	
		private void newLoop()
		{
			boolean toDo = false;
			int count = 10;
			
			while(!toDo)
			{
				JOptionPane.showMessageDialog(null, "You still have things to do");
				count--;
				if(count < 0)
				{
					toDo = true;
				}
			}
			
			for (int loop = 0; loop < 30; loop +=2)
			{
				JOptionPane.showMessageDialog(null, "The loop value is: " + loop);
			}
		
		}
		
		public boolean validInt(String maybeInt)
		{
			boolean isValid = false;
			try
			{
				Integer.parseInt(maybeInt);
				isValid = true;
			}
			catch(NumberFormatException error) 
			{
				JOptionPane.showMessageDialog(null, "Your should type an interger value like -989087");
				
			}
			
			
			return isValid;
		}
		
		
		public boolean validDouble(String maybeDouble)
		{
			boolean isValid = false;
			
			try
			{
				Double.parseDouble(maybeDouble);
				isValid = true;
			}
			catch(NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . >");
			}
			
			
			
			return isValid;
		}
		//me practicing how to ask the user for the price of the car, this isn't used in the main code.
	
		private void askUser()
		{
			//ask
			String response = JOptionPane.showInputDialog(null, "How much is the car?");
			UserCar userCar = new UserCar();
			//repeat until finished correctly
			while (!validDouble(response))
			{
				response = JOptionPane.showInputDialog(null, "No!, type in a valid number for the price!!");
			}
			//assign
			userCar.setPrice(Double.parseDouble(response));
				
		}
		
		public String toString()
		{
			
			String description = "";
			return description;
		}
		
		
	}


