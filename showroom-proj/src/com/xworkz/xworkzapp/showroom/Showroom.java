package com.xworkz.xworkzapp.showroom;

import com.xworkz.xworkzapp.dto.CarDTO;


public class Showroom {

	//public CarDTO carDTO[]= new CarDTO[4]; 
	public CarDTO[] carDTO;
	public int currentIndex;
	
	public Showroom(int size) {
		//System.out.println("showroom object created");
		carDTO = new CarDTO[size];
	}
	
	public void addCars(CarDTO carDTO) {
		if(carDTO!=null) { 
		System.out.println(this.currentIndex);
		this.carDTO[currentIndex++]= carDTO;
	}else if (carDTO == null) {
		
		System.out.println("car dto is not added");
	}
			
}

	public void displayCars(){  
		System.out.println("Shwoing car details"); 
		for (int i = 0; i < carDTO.length; i++) { 
			if(carDTO[i]!=null) { // checking that array has data or not
			 System.out.println(carDTO[i].getName()+" "+carDTO[i].getPrice());
			}else 
			{
				System.out.println("car not available");
			}
		}
		System.out.println("end of showing car details");
		
	}
	
public void displayByName(String Name) {
		
		for (CarDTO carDTOs : carDTO) {//it is used to access the segregated data one by one
			//null check operation is used to check the data is empty or not
			if(carDTOs != null){
				if(carDTOs.getName().equals(Name)){
					System.out.println( " Car is present by name ");
					System.out.println(carDTOs.getName() + " " + carDTOs.getModel()+ " " +carDTOs.getPrice());
				}
				
			}
			else {
				System.out.println("Please add car details");
			}
		}	
	}
	
public void displayByPrice(double Price) {
	
	for (CarDTO carDTOs : carDTO) {//it is used to access the segregated data one by one
		//null check operation is used to check the data is empty or not
		if(carDTOs != null){
			if(carDTOs.getPrice()==Price){
				System.out.println( " Car is present by price ");
				System.out.println(carDTOs.getName() + " " + carDTOs.getModel()+ " " +carDTOs.getPrice());
			}
			
		}
		else {
			System.out.println("Please add car details");
		}
	}	
}

public void deleteCarByName(String name) {
	System.out.println("deleting car by name");
	for (int i = 0; i < carDTO.length; i++) {
		if(carDTO[i] !=null) {
			if(carDTO[i].getName().equals(name)) {
				carDTO[i]=null;
			}	
		}	
	}
}

	public void updateCarByName(String name,String newName) {
		System.out.println("updating car name");
		for (int i = 0; i < carDTO.length; i++) {
			if(carDTO[i] !=null) {
				if(carDTO[i].getName().equals(name)) {
					carDTO[i].setName(newName);
				}	
			}	
		}
	}
		
		public void updateCarPriceByName(String name,double price) {
			System.out.println("updating car price");
			for (int i = 0; i < carDTO.length; i++) {
				if(carDTO[i] !=null) {
					if(carDTO[i].getName().equals(name)) {
						carDTO[i].setPrice(price);
						System.out.println("price updated");
						System.out.println(carDTO[i].getModel()+" " +carDTO[i].getName()+ " " +carDTO[i].getPrice());
					}	
				}	
			}
	
	
}
	
}

	
