package com.indu.induapp.forest;

public class Forest {
	
	public String address;
	public int acres;
	
	public Forest(String address,int acres) {
		this.address=address;
		this.acres=acres;
	}
	
	public Forest() {
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAcres() {
		return acres;
	}

	public void setAcres(int acres) {
		this.acres = acres;
	}
	
	
	
	
}
