package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.icecream.ButterScotch;
import com.xworkz.xworkzapp.icecream.Chocolate;

public class IceCreamUtil {

	public static void main(String[] args) {
		
		ButterScotch butterScotch = new ButterScotch();
		butterScotch.setCost(44.00);
		butterScotch.setType("Cone");
		System.out.println(butterScotch.getCost() + " " + butterScotch.getType());
		
		
		Chocolate chocolate = new Chocolate();
		chocolate.setCost(50.00);
		chocolate.setType("Cup");
		System.out.println(chocolate.getCost() + " " + chocolate.getType());
	}
	
   
	
	
}
