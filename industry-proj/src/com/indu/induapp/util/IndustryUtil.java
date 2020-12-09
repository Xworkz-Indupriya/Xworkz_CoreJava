package com.indu.induapp.util;

import com.indu.induapp.industry.SteelIndustry;

public class IndustryUtil {

	public static void main(String[] args) {
		
		SteelIndustry industry = new SteelIndustry("HSR Layout ", 35 ," manufacture ");
		/*industry.setArea("HSR Layout");
		industry.setNoOfWorkers(34);
		industry.setType("manufacture");
		*/
		System.out.println(industry.getType() + industry.getNoOfWorkers() +  industry.getArea() );
	}
}
