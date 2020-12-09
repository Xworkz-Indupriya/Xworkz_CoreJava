package com.indu.induapp.institution;

public class Institution {

	/*public String name;
	public String address;
	public String courses;
	*/
	
	
	private String address;
	private String courses;
	
public Institution(String address,String courses)
{
	this.address=address;
	this.courses=courses;
}

public Institution() {
	
}


public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCourses() {
	return courses;
}

public void setCourses(String courses) {
	this.courses = courses;
}

}
