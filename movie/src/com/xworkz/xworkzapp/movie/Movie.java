package com.xworkz.xworkzapp.movie;

import java.util.Date;

public class Movie {

	public String director;
	public String hero;
	public String heroine;
	public Date date;
	
	public Movie(String director,String hero,String heroine , Date e) {
		this.director=director;
		this.hero=hero;
		this.heroine=heroine;
		date = e;
		
	}
	
	public void toGetEntertain() {
		System.out.println("Enjoyment");
	}
	
}
