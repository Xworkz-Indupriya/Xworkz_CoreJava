package com.xworkz.xworkzapp.shopping;

import java.util.ArrayList;
import java.util.Collection;

public class CartUtil {
		
		public static void main(String[] args) {
			
			ShoppingCartDTO cartdto1=new ShoppingCartDTO();
			cartdto1.setItemName("shoe");
			cartdto1.setPrice(1500);
			cartdto1.setQuantity(1);
			
			ShoppingCartDTO cartdto2=new ShoppingCartDTO();
			cartdto2.setItemName("dress");
			cartdto2.setPrice(1700);
			cartdto2.setQuantity(1);
			
			
			ShoppingCartDTO cartdto3=new ShoppingCartDTO();
			cartdto3.setItemName("shoe");
			cartdto3.setPrice(1500);
			cartdto3.setQuantity(1);
			
			
		Collection<ShoppingCartDTO> cartDTOs=new ArrayList<ShoppingCartDTO>();
		 cartDTOs.add(cartdto1);
		 cartDTOs.add(cartdto2);
		    
		    boolean contain=cartDTOs.contains(cartdto2);
		    System.out.println("contains" +contain);
		    if(contain) {
		    	System.out.println("shoe is in cart");
		    }
		    else {
		    	System.out.println("adding shoe to cart");
		    	cartDTOs.add(cartdto3);
		    }
		    System.out.println("after adding shoe");
		    
		
		
		    System.out.println("after adding shoe"+ cartDTOs.size());

			
			
		}
}
