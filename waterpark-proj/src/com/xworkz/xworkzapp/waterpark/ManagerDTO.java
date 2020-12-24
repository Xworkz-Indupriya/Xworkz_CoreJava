package com.xworkz.xworkzapp.waterpark;

public class ManagerDTO {

	private String name;
	private long contactNo;
	
	
	public ManagerDTO(String name, long contactNo) {
		super();//pointing to object class
		this.name = name;
		this.contactNo = contactNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
