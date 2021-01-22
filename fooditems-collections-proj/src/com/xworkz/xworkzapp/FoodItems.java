package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FoodItems {
	
	public static void main(String[] args) {
		String idli="Thatey idli";
		String chicken="butter chicken ";
		String juice="muskmelon";
		String icecream="mango icecream";
		String chips="potato";
		
		
		Collection foodItems=new ArrayList();
		foodItems.add(idli);
		foodItems.add(chicken);
		foodItems.add(juice);
		foodItems.add(icecream);
		foodItems.add(chips);
		
		System.out.println(foodItems);
		System.out.println(foodItems.size());
		
		boolean present = foodItems.contains(icecream);
		System.out.println("food item is present:"+present);
		
		
		
	}	
}

