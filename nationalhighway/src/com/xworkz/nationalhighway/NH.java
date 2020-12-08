package com.xworkz.nationalhighway;

public class NH {
 
	private String name;
	private String typesOfVehicles;
	private int noOfLanes;
	
	public NH()
	{
		System.out.println("Speed");
	}
	
	public NH(String name, String typesOfVehicles, int noOfLanes)
	{
		this.name=name;
		this.typesOfVehicles=typesOfVehicles;
		this.noOfLanes=noOfLanes;
	}
	
	public String getName()
	{
	return name;	
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getTypeOfVehicles()
	{
	return typesOfVehicles;	
	}
	
	public void setTypesOfVehicles( String typesOfVehicles)
	{
		this.typesOfVehicles=typesOfVehicles;
	}
	
	public int getNoOfLanes()
	{
	return noOfLanes;	
	}
	
	public void setNoOfLanes( int noOfLanes)
	{
		this.noOfLanes=noOfLanes;
	}

}
