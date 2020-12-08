package com.xworkz.variables;

public class InstanceVariable {
	
	//instance variable
	String name;
	int price;
	
	
	public static void main(String[] args) {
		InstanceVariable iv = new InstanceVariable();
		iv.name="H&M";
		iv.price=1990;
		System.out.println(iv.name);
	    System.out.println(iv.price);
	}
}
