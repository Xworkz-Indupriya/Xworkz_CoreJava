package com.xworkz.util;

import com.xworkz.chruch.Chruch;

public class ChruchUtil {

	
	public static void main(String[] args) {
		
		Chruch chruch = new Chruch("St.Josph","Kerala",99);
		/*
		* chruch.setName("St.Mary");
        *chruch.setAddress("Goa");
        * chruch.setNoOfFathersAndSisters(0);
        */
        System.out.println(chruch.getName()+ " " + chruch.getAddress() + " " + chruch.getNoOfFathersAndSisters());
	}
}
