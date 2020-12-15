package com.xworkz.xworkzapp.util;

import java.util.Date;

import com.xworkz.xworkzapp.movie.Kedarnath;

public class MovieUtil {
	
 
	public static void main(String[] args) {
		Kedarnath kedarnath = new Kedarnath("Abhishek Kapoor","Sushanth Singh Rajput"," Sara Ali Khan" ,new Date());
	
		System.out.println(kedarnath.director+ " " + kedarnath.hero+ " " +kedarnath.heroine+ " " +kedarnath.date);
	    kedarnath.toEntertain("Kapoorr");
	}
	
}
