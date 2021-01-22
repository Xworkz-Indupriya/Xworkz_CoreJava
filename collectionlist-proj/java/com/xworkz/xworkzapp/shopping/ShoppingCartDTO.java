package com.xworkz.xworkzapp.shopping;

import java.util.Objects;

//override--toString ,hashcode,equals
public class ShoppingCartDTO {
	
		  private String itemName;
           private int quantity;
          private double price;


public ShoppingCartDTO(String itemName, int quantity, double price) {
	super();
	this.itemName = itemName;
	this.quantity = quantity;
	this.price = price;
}

public ShoppingCartDTO() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "ShoppingCartDTO [itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + "]";
}


@Override
public int hashCode() {
	return Objects.hash(itemName, price, quantity);
}

@Override
public boolean equals(Object obj) {
	System.out.println("invoked equals on shopping cart dto");
	//return super.equals(obj); 
		//return false;
	
	
	
     return false;
		
	}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}


}
