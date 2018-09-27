package model;

public class UserCar
{
	//---------Data Member Section---------
	//---------Always Private---------
	//also called instance variables
	//These are special - they get a "default" value
	//All numbers =>  0
	//boolean => false
	//objects => null!!!
	
	private String name;
	private int wheels;
	private boolean roof;
	private double price;
	private int quantity;
	private String color;
	
	/**
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet about the UserCar.
	 * Initializing data members with "bad" values to be changed.
	 */
	public UserCar()
	{
		this.name = "batmobile";
		this.wheels = 4;
		this.roof = true;
		this.price = 15000;
		this.quantity = 1;
		this.color = "blue";
		
		
	}
	
	/**
	 *  Better constructor when I know the info for the UserCar object.
	 * @param name The name of the car.
	 * @param wheels How many wheels the car has.
	 * @param roof If the car has a roof.
	 * @param price How much the user thinks the car is worth.
	 * @param quantity How many of these cars the user thinks there are.
	 * @param color What color the user wants the car to be.
	 */
	
	
	public UserCar(String name, int wheels, boolean roof, double price, int quantity, String color)
	{
		this.name = name;
		this.wheels = wheels;
		this.roof = roof;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
	}
	
	//---------Getters---------
	public String getName()
	{
		return name;
		
	}
	
	public int getWheels()
	{
		return wheels;
	}
	
	public boolean getRoof()
	{
		return roof;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
		
	}
	
	private String getColor()
	{
		return color;
	}
	
	//--------Setters---------
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void setWheels (int wheels)
	{
		this.wheels = wheels;
	}
	
	public void setRoof (boolean roof)
	{
		this.roof = roof;
	}
	
	public void setPrice (double price) 
	{
		this.price = price;
	}
	
	public void setQuantity (int quantity)
	{
		this.quantity = quantity;
	}
	
	public void setColor (String color)
	{
		this.color = color;
	}
	
	public String toString()
	{
		String description = "My car is the hamburger car from spongebob and has " + wheels + " wheels and costs " + price + " dollars!";
		
		return description;
		
	}

}
