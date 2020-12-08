package com.xworkz.rain;

public class Rain {
	 
	private String using;
	
	public Rain()
	{
		System.out.println("umbrella");
	}
	
	public Rain(String using)
	{
		this.using=using;
	}
	
	public String getUsing()
	{
		return using;
	}
	
	public void setUsing(String using)
	{
	this.using=using;
	}


}
