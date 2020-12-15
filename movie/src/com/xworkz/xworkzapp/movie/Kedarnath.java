package com.xworkz.xworkzapp.movie;

import java.util.Date;

public class Kedarnath extends Movie{


	public Kedarnath(String director, String hero, String heroine, Date e) {
		super(director, hero, heroine, e);
		// TODO Auto-generated constructor stub
	}

	public void toEntertain(String director) {
		System.out.println("Entering into theater");
		super.toGetEntertain();
		System.out.println("The End");
	}
	
	{
		String director="Ashokkk";
		super.director=director;
		System.out.println(director);
	}
		
		
	}
