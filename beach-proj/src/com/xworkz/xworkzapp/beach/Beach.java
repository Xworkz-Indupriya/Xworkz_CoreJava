package com.xworkz.xworkzapp.beach;

public class Beach {

	public String place;
	public int noOfCafe;
	public int noOfBoats;
	
	public Beach( String place,int noOfCafe,int noOfBoats){
		this.place=place;
		this.noOfCafe=noOfCafe;
		this.noOfBoats=noOfBoats;
	}
	
	public Beach() {
		super();
	}
	public void enjoyWithFriends() {
		System.out.println("Enjoying with Friends");
		return;
	}
}
