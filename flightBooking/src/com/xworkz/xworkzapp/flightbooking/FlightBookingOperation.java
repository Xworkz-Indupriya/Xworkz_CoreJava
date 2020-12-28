package com.xworkz.xworkzapp.flightbooking;

public class FlightBookingOperation {

	public FlightBookingDTO[] flightBooking = new FlightBookingDTO[2];
	public int index;
	
	/*public FlightBookingOperation(int size) {
		flightBooking= new FlightBookingDTO[size];
	}*/
	
	public void addFlightBooking(FlightBookingDTO flight) {
		
		System.out.println("Adding Flight Booking Details");
		if(flight!=null) {
		  if(flight.getAirplaneCode()!=null){
			if(flight.getCompany()!=null){
				if(flight.getBusinessClassPrice() >= 1000) {
					if(flight.getStartingPoint()!=null) {
						flightBooking[index++]=flight;
						System.out.println("Added flight Booking Details of "+ flight.getCompany());
					}else 
					{
						System.out.println("Booking is not available");
				}
			}else {
				System.out.println("Business class price should be greater than 1000");
			}
		}	
	}
  }
}
	
	public void searchFlightByStartingPoint(String StartingPoint) {
		boolean point=false;
		System.out.println("Searching the starting point of " + StartingPoint);
		for (int i = 0; i < flightBooking.length; i++) {
			if(flightBooking[i]!=null) {
				if(flightBooking[i].getStartingPoint().equals(StartingPoint)) {
					point=true;
					System.out.println("checking the starting point ,if it matches it will print as");
					System.out.println(flightBooking[i].getStartingPoint()+" "+flightBooking[i].getEndingPoint()+" "+flightBooking[i].getEconomyClassPrice()+" "+flightBooking[i].getCompany()+" "+flightBooking[i].getBusinessClassPrice()+" "+flightBooking[i].getAirplaneCode());
			}else
			{
				point=false;
			}
		}
	}
		if(point==false) {
			System.out.println("Flight is not available at the starting point");
		}
}

    public void displayAllFlightBooking() {
    System.out.println("Displaying all flight details");
    	for (int i = 0; i < flightBooking.length; i++) {
			if(flightBooking[i]!=null) {
				System.out.println("Starting point-"+flightBooking[i].getStartingPoint()+"  "+"Ending point-"+flightBooking[i].getEndingPoint()+"  "+"EconomyClassPrice-"+flightBooking[i].getEconomyClassPrice()+"  "+"Company-"+flightBooking[i].getCompany()+"  "+"BusinessClassPrice-"+flightBooking[i].getBusinessClassPrice()+"  "+"AirplaneCode-"+flightBooking[i].getAirplaneCode());
			}
		}
    }
	
	
	
}
