package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.fruits.Fruit;
import com.xworkz.xworkzapp.fruits.Mango;

public class FruitUtil {

	public static void main(String[] args) {
		
		Fruit fruit = new Mango();
		Mango mango = (Mango) fruit;
		mango.colour="yellow";
		mango.price=200.00;
		mango.makesHappy();
		System.out.println(mango.colour+ " " +mango.price);
		
	}
	
	
	
	
	
}
