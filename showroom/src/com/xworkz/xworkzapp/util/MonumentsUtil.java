package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.showroom.ArtGalleryOperation;
import com.xworkz.xworkzapp.showroom.MonumentsDTO;

public class MonumentsUtil {

	public static void main(String[] args) {
		
		/*MonumentsDTO dtoone = new MonumentsDTO("Taj Mahal",1632);
		MonumentsDTO dtotwo = new MonumentsDTO("Gol Gumbaz",1659);
		
		ArtGalleryOperation artgallery = new ArtGalleryOperation(2);
		artgallery.addAllMonumentsDetail(dtoone);
		artgallery.addAllMonumentsDetail(dtotwo);
		artgallery.showAllMonumentsDetail();
		*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the details size");
		int size = sc.nextInt();
		ArtGalleryOperation artgallery = new ArtGalleryOperation(size);
		for(int i=0; i<size; i++)
		{
			MonumentsDTO dto = new MonumentsDTO();
			System.out.println("enter the"+ (i+1) + "monument details");
			System.out.println("enter the name");
			String name= sc.next();
			System.out.println("enter the year");
			int year=sc.nextInt();
		    
			dto.setName(name);
			dto.setYear(year);
			
			artgallery.addAllMonumentsDetail(dto);		
		}
		artgallery.showAllMonumentsDetail();
		sc.close();
	}
	
		
	}
	
	
	

