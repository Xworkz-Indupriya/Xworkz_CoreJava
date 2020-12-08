package com.xworkz.chruch;

public class Chruch {

	private String name;
	private String address;
	private int noOfFathersAndSisters;
	
	public Chruch()
	{
		System.out.println("+");
	}
	
	
	public Chruch(String name, String address, int noOfFathersAndSisters) {
		this.name=name;
		this.address=address;
		this.noOfFathersAndSisters=noOfFathersAndSisters;
	}


	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public int getNoOfFathersAndSisters()
	{
		return noOfFathersAndSisters;
	}
	
	public void setNoOfFathersAndSisters(int noOfFathersAndSisters)
	{
		this.noOfFathersAndSisters=noOfFathersAndSisters;
	}
}
