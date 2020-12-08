package com.xworkz.speakers;

public class Speakers {

	public String name;
	public double price;
	
	
	public Speakers()
	{
		System.out.println("Playing songs");
	}
	
	public Speakers(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price )
	{
		this.price=price;
	}
}
