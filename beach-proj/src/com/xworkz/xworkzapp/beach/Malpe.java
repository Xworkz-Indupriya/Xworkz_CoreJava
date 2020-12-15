package com.xworkz.xworkzapp.beach;

public class Malpe extends Beach{

	public Malpe(String place, int noOfCafe, int noOfBoats) {
		super(place, noOfCafe, noOfBoats);
		
		/*super.noOfCafe=noOfCafe;
		super.noOfBoats=noOfBoats;
		super.place=place;
		*/
	}

	public void enjoy(int noOfCafe) {
		System.out.println("entering inside enjoy method of malpe");
		super.enjoyWithFriends();
		System.out.println("end enjoy method of malpe");
	}
	
	{
		int noOfCafe=40;
		String place="5 km from udupi";
		super.noOfCafe=noOfCafe;
		super.place=place;
		System.out.println(noOfCafe);
	}
}
