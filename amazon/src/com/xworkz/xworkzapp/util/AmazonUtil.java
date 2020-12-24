package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.amazon.ProductDTO;
import com.xworkz.xworkzapp.amazon.ProductOperation;


public class AmazonUtil {

	public static void main(String[] args) {
		
		/*int size;
		ProductDTO[] productdto=new ProductDTO[size];*/
		
		/*ProductDTO amazonone = new AmazonDTO("AL12","bottle","kitchen appliances",300);
	    ProductDTO amazontwo = new AmazonDTO("MI12","headphones","mobile accessories",299);
	    
	    ProductOperation productOperation = new ProductOperation(2);
	    
	    productOperation.addProductDetails(amazonone);
	    productOperation.addProductDetails(amazontwo);
	    productOperation.displayAllProducts();*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of product details");
		int size=sc.nextInt();
		ProductOperation productOperation = new ProductOperation(size);
		for (int i=0;i<size;i++) {
			ProductDTO dto = new ProductDTO();
			System.out.println("enter the "+ (i+1) + " product details");
			System.out.println("enter the product id");
			String id= sc.next();
			System.out.println("enter the product name");
			String name=sc.next();
			System.out.println("enter the product category");
			String category=sc.next();
			System.out.println("enter the product price");
			double price=sc.nextDouble();
			
			dto.setId(id);
			dto.setCategory(category);
			dto.setName(name);
			dto.setPrice(price);
			productOperation.addProductDetails(dto);
		}
		productOperation.displayAllProducts();
		sc.close();
	}
	
//showroom of art gallery .
//mounmentdto -name,id
//Add details of list of monuments-name, id
//class name artgallery(operation)
}
