package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.beach.Malpe;

public class BeachUtil {

	public static void main(String[] args) {
		
		Malpe malpe = new Malpe("",5,67);
		System.out.println(malpe.place + " " + malpe.noOfCafe+" " + malpe.noOfBoats);
		malpe.enjoy(6);
	}
}
