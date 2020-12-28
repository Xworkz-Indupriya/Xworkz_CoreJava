package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.citywards.CityWardDTO;
import com.xworkz.xworkzapp.citywards.WardInformation;

public class CityWardUtil {

	public static void main(String[] args) {
		
		WardInformation wardinfo=new WardInformation();
		CityWardDTO cityward=new CityWardDTO();
		cityward.setWardNo(19);
		cityward.setWardName("ayappa swamy");
		cityward.setPopulation(6232L);
		cityward.setCorporateName("OmPrakash");
		cityward.setAreaInSqKiloMeters("16sqkilometrs");
		
		CityWardDTO cityward1=new CityWardDTO();
		cityward1.setWardNo(20);
		cityward1.setWardName("ragavendra");
		cityward1.setPopulation(8974L);
		cityward1.setCorporateName("Satish");
		cityward1.setAreaInSqKiloMeters("20sqkilometrs");
		
		wardinfo.addWardDetails(cityward);
		wardinfo.addWardDetails(cityward1);
		wardinfo.displayWardDetails();
		
		wardinfo.searchCityWardByWardName("ragavendra");
		wardinfo.returningCorparatorNameByWardNo(19);
		
		
		
		
	}
	
	
}
