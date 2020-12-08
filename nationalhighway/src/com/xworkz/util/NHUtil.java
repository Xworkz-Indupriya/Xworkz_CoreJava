package com.xworkz.util;

import com.xworkz.nationalhighway.NH;

public class NHUtil {

	public static void main(String[] args) {
		
		NH nh =new NH();
	    nh.setName("Mumbai NH7");
	    nh.setTypesOfVehicles("Cars");
	    nh.setNoOfLanes(3);
		System.out.println(nh.getName() + " " + nh.getTypeOfVehicles() + " " + nh.getNoOfLanes());
	}
}
