package com.xworkz.xworkzapp.flightbooking.util;

import com.xworkz.xworkzapp.flightbooking.FlightBookingDTO;
import com.xworkz.xworkzapp.flightbooking.FlightBookingOperation;
import com.xworkz.xworkzapp.flightbooking.constant.Company;

public class FlightUtil {

	public static void main(String[] args) {
		
		FlightBookingDTO fb=new FlightBookingDTO();
		fb.setAirplaneCode("A1");
		fb.setStartingPoint("Bengaluru");
		fb.setEndingPoint("Hyderabad");
		fb.setDomestic(true);
		fb.setTotalSeats(123);
		fb.setBusinessClassPrice(1000.00);
		fb.setCompany(Company.AIRINDIA);
		fb.setEconomyClassPrice(3000.00);
		
		FlightBookingDTO fb1=new FlightBookingDTO();
		fb1.setAirplaneCode("A2");
		fb1.setStartingPoint("Pune");
		fb1.setEndingPoint("Delhi");
		fb1.setDomestic(true);
		fb1.setTotalSeats(250);
		fb1.setBusinessClassPrice(5000.00);
		fb1.setCompany(Company.SPICEJET);
		fb1.setEconomyClassPrice(9000.00);
		
		FlightBookingOperation fbo=new FlightBookingOperation();
		
		fbo.addFlightBooking(fb);
		fbo.addFlightBooking(fb1);
		
		fbo.displayAllFlightBooking();	
		fbo.searchFlightByStartingPoint("Pune");
		
	}
	
	
}
