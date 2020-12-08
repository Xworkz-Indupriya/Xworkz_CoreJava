package com.xworkz.util;

import com.xworkz.uber.Uber;

public class UberUtil {

	public static void main(String[] args) {
		
		Uber uber  = new Uber();
		uber.setEnterDestination("KLE College");
		uber.setTypeOfVechile("Auto");
		uber.setPrice(200);
		uber.setPickupSpot("Railway Station Back Gate");
		System.out.println(uber.getEnterDestination() + " " + uber.getPrice() + " " + uber.getTypeOfVechile() + " " + uber.getPickupSpot());
	}
}
