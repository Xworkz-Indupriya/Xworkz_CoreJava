package com.xworkz.util;

import com.xworkz.speakers.Speakers;

public class SpeakersUtil {

	public static void main(String[] args) {
		
		Speakers speakers = new Speakers();
		speakers.setName("JBL");
		speakers.setPrice(1200.00);
		System.out.println(speakers.name + " " + speakers.price);
	}
}
