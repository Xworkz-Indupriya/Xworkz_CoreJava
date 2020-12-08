package com.xworkz.book;

public class Book {

	private String name;
	private String typeOfBook;
	private String size;
	private double price;
	private int noOfPages;
	
	public Book()
	{
		System.out.println("Notebook");
	}
	
	public Book(String name, String typeOfBook, String size, double price, int noOfPages)
	{
		this.name=name;
		this.typeOfBook=typeOfBook;
		this.size=size;
		this.price=price;
		this.noOfPages=noOfPages;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getTypeOfBook()
	{
		return typeOfBook;
	}
	
	public void setTypeOfBook(String typeOfBook)
	{
		this.typeOfBook=typeOfBook;
	}
	
	public String getSize()
	{
		return size;
	}
	
	public void setSize(String size)
	{
		this.size=size;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public int getNoOfPages()
	{
		return noOfPages;
	}
	
	public void setNoOfPages(int noOfPages)
	{
		this.noOfPages=noOfPages;
	}
	
}
