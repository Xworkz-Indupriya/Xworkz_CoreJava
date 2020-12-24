package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.watch.Rolex;
import com.xworkz.xworkzapp.watch.Watch;

public class WatchUtil {

	public static void main(String[] args) {
		
		Watch watch = new Rolex();//up casting - parent reference child object
		Rolex rolex = (Rolex)watch;// down casting - child reference to parent object. It is possible when up casting is done
		            //or
		//Rolex rolex = (Rolex) new Watch();
		
		
		watch.modelNo="RT420";
		watch.price=10000;
		System.out.println(watch.modelNo+ " " +watch.price);
		watch.displayTime();//casting - 
	}
	
	
}
// firefox - browser 
// functinality as browse
// mango-fruit
