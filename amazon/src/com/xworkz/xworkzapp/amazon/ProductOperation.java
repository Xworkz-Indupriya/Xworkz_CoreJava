package com.xworkz.xworkzapp.amazon;

public class ProductOperation {

	
	public ProductDTO[] productdto;
	
	public int index;
	
	public ProductOperation(int size) {
		productdto = new ProductDTO[size];
	}
	
	public void addProductDetails(ProductDTO amazon) {
		System.out.println("Adding product deatils");
		productdto[index++]=amazon;
		System.out.println("Added product deatils");
	}
	
	public void displayAllProducts() {
		for (ProductDTO amazon : productdto ) {
		if(amazon!=null) {
			System.out.println(amazon.getId()+" "+amazon.getCategory()+ " "+amazon.getName()+" "+amazon.getPrice());
		}
		else {
		}
			System.out.println("All product details are added");
		}
	}
}
