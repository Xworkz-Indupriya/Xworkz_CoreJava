package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.dto.CarDTO;

import com.xworkz.xworkzapp.showroom.Showroom;

public class ShowroomUtil {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of cars ");
		int size = sc.nextInt();
		Showroom showroom = new Showroom(size);
		for (int i = 0; i < size; i++) {
			CarDTO dto = new CarDTO();
			System.out.println("enter the name");
			String name= sc.next();
			System.out.println("enter the model");
			String model=sc.next();
			System.out.println("enter the price");
			double price=sc.nextDouble();
			
			dto.setName(name);
			dto.setModelNo(model);
			dto.setPrice(price);
			showroom.addCars(dto);
			showroom.displayCars();
		}
		
		System.out.println("enter the car name to be deleted");
		String name1=sc.next();
		showroom.deleteCarByName(name1);
		showroom.displayCars();
		
		System.out.println("enter the car name which will be updated to new car name ");
		String name=sc.next();
		String newName=sc.next();
		showroom.updateCarByName(name, newName);
		showroom.displayCars();
		
		System.out.println("enter the name of the car where price will be updated");
		String name2=sc.next();
		double newPrice=sc.nextDouble();
		showroom.updateCarPriceByName(name2, newPrice);
		showroom.displayCars();
		
		
		/*showroom.displayCars();
		System.out.println("search the car by name");
		String Name=sc.next();
		showroom.displayByName(Name);
		System.out.println("search the car by price");
		double Price=sc.nextDouble();
		showroom.displayByPrice(Price);*/
		
		
		
		sc.close();
		
		
		/*Showroom showroom = new Showroom();
		CarDTO carDTO = new CarDTO();
		carDTO.setName("Jaguar");
		carDTO.setPrice(300000);
		CarDTO carDTO1 = new CarDTO();
		carDTO1.setName("nano");
		carDTO1.setPrice(900000);
		CarDTO carDTO2 = new CarDTO();
		carDTO2.setName("swift");
		carDTO2.setPrice(700000);
		CarDTO carDTO3 = new CarDTO();
		carDTO3.setName("maruthi");
		carDTO3.setPrice(600000);
		
		showroom.addCars(carDTO);
		showroom.addCars(carDTO1);
		showroom.addCars(carDTO2);
		showroom.addCars(carDTO3);
		showroom.displayCars();
		showroom.deleteCarByName("swift");
		showroom.updateCarByName("nano","Balero");
		showroom.updateCarPriceByName("Jaguar",2000.00 );
		showroom.displayCars();
		
		
	
}*/
}
}
