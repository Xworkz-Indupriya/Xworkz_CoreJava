package com.xworkz.uber;

public class Uber {

	private String enterDestination;
	private double price;
	private String typeOfVechile;
	private String pickupSpot;
	
	public Uber() 
	{
		System.out.println("Best");
	}
	
	public Uber(String enterDestination, double price,String typeOfVechile, String pickupSpot)
	{
		this.enterDestination=enterDestination;
		this.price=price;
		this.typeOfVechile=typeOfVechile;
		this.pickupSpot=pickupSpot;
	}
	
	public String getEnterDestination() 
	{
		return enterDestination;
	}
	
	public void setEnterDestination(String enterDestination)
	{
		this.enterDestination=enterDestination;
	}
	
	public String getTypeOfVechile()
	{
	return  typeOfVechile;
	}
	
	public void setTypeOfVechile(String typeOfVechile)
	{
		this.typeOfVechile=typeOfVechile;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	
	
	public String getPickupSpot()
	{
		return pickupSpot;
	}
	
	public void setPickupSpot(String pickupSpot)
	{
		this.pickupSpot=pickupSpot;
	}
}
