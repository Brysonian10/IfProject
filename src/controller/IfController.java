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
		//introduces the user to what this program does.
		JOptionPane.showMessageDialog(null, "Welcome to MAKE YOUR DREAM CAR!!");
		
		//asks what kind of car they want then tells the user what car they picked
		String userCarName = JOptionPane.showInputDialog(null, "Lets start with what kind of car it is, so... what kind of car do you want this to be? It can be anything, just go ahead and type it in.");
		 JOptionPane.showMessageDialog(null, "That's so sick how you have a " + userCarName + "!!! I wish I had one of those...");
		 
		 //Asks how many wheels the car has
		 String wheels = JOptionPane.showInputDialog(null, "How many wheels does " + userCarName + " have?");
		 JOptionPane.showMessageDialog(null, "Wow " + userCarName + " has " + wheels + "!!! That's pretty neat.");
		 
		 //Asks if the car has a roof, if yes, tells the user, if not then tells the user it doesn't have one
		 String roof = JOptionPane.showInputDialog(null, "Is your car a convertible?");
		 if( roof .equals("yes"))
				 {
			 JOptionPane.showMessageDialog(null, "Your car is a convertible, that is so cool!!");
				 }else
				 {
					 JOptionPane.showMessageDialog(null, "Your car isn't a convertible, but that's ok it is still super cool.");
				 }
		 //Asks for the price of the car
		 String price = JOptionPane.showInputDialog(null, "How much exactly do you think your car is worth?");
		 if (price >15000)
		 
		 
		 
		 
		 
		
		
	}

}
