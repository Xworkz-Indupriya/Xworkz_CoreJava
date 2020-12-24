package com.xworkz.xworkzapp.farm.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.farm.FarmDTO;
import com.xworkz.xworkzapp.farm.Operation;

public class FarmUtil {

	public static void main(String[] args) {
		
		/*FarmDTO farmOne = new FarmDTO("black soil","2 acre","peanuts");
		FarmDTO farmTwo = new FarmDTO("red soil","2 acre","cotton");
		
		Operation operation = new Operation(2);
	
		operation.addFarmDetails(farmOne);
		operation.addFarmDetails(farmTwo);
		operation.showAllFarmDetails();
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the farm size");
		int size = sc.nextInt();
		Operation operation = new Operation(size);//object creation for operation class
		for(int i=0; i<size; i++)//for loop size
		{
			FarmDTO dto = new FarmDTO();// amazondto object created  and its data members are accessed
			System.out.println("enter the"+ (i+1) + "Farm details");//i+1 because i starts with 0, if i is 1 then +1 is not required
			System.out.println("enter the soil");
			String typeOfSoil= sc.next();
			System.out.println("enter the area");
			String area=sc.next();
			System.out.println("enter the crop");
			String typeOfCrop=sc.next();
			
		    
			dto.setTypeOfSoil(typeOfSoil);
			dto.setArea(area);
			dto.setTypeOfCrop(typeOfCrop);
			operation.addFarmDetails(dto);//here the dto contains the "amazondto" object and its do reference variable information stored and add product details are in operation		
		}
		
		operation.showAllFarmDetails();
		System.out.println("search the crop");
		String Crop=sc.next();
		operation.searchByCrop(Crop);
		System.out.println("search the Area");
		String Area=sc.next();
		operation.searchByArea(Area);
		System.out.println("search the Soil");
		String Soil=sc.next();
		operation.searchBySoil(Soil);
		sc.close();
		
	}
	
}
