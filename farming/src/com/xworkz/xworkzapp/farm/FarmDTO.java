package com.xworkz.xworkzapp.farm;// costume package where user is created

public class FarmDTO {
	
     private String typeOfSoil;
     private String area;
	 private String typeOfCrop;
     private String typeOfCrop1;
	public String getTypeOfCrop1() {
		return typeOfCrop1;
	}

	public void setTypeOfCrop1(String typeOfCrop1) {
		this.typeOfCrop1 = typeOfCrop1;
	}

	/*public FarmDTO(String typeOfSoil, String area, String typeOfCrop)//inside parenthesis parameters which is also known as local variable
	 {
		super();
		this.typeOfSoil = typeOfSoil;
		this.area = area;
		this.typeOfCrop = typeOfCrop;
	}
*/
	public String getTypeOfSoil() {
		return typeOfSoil;
	}

	public void setTypeOfSoil(String typeOfSoil) {
		this.typeOfSoil = typeOfSoil;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTypeOfCrop() {
		return typeOfCrop;
	}

	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}
	 
	 
	 

}
