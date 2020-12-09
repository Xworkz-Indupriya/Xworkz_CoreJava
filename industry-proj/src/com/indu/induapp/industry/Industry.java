package com.indu.induapp.industry;
//superclass or parentclass 
public class Industry {
//instance variables applicable throughout the class
	private String type;
	private int noOfWorkers;
	private String area;
	
	
	public Industry(String type,int noOfWorkers,String area) {
		this.type=type;
		this.noOfWorkers=noOfWorkers;
		this.area=area;
	}
	
	public Industry() {
		
	}
	
	public String production(){
		return "Production";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
}
