package com.xworkz.util;

import com.xworkz.book.Book;

public class BookUtil {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setName("Classmate");
		book.setTypeOfBook("ruled");
		book.setSize("long");
		book.setPrice(45);
		book.setNoOfPages(200);
		System.out.println(book.getName()+" "+ book.getTypeOfBook()+ " " + book.getSize()+ " " + book.getPrice() + " " + book.getPrice() + " " + book.getNoOfPages());
	}
}
	
