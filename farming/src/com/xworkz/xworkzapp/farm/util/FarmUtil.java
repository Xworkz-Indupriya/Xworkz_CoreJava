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
		Operation operation = new Operation(size);
		for(int i=0; i<size; i++)
		{
			FarmDTO dto = new FarmDTO();
			System.out.println("enter the"+ (i+1) + "Farm details");
			System.out.println("enter the soil");
			String typeOfSoil= sc.next();
			System.out.println("enter the area");
			String area=sc.next();
			System.out.println("enter the crop");
			String typeOfCrop=sc.next();
		    
			dto.setTypeOfSoil(typeOfSoil);
			dto.setArea(area);
			dto.setTypeOfCrop(typeOfCrop);
			operation.addFarmDetails(dto);		
		}
		operation.showAllFarmDetails();
		sc.close();
	}
	
}
