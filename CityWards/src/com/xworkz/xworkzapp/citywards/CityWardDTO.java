package com.xworkz.xworkzapp.citywards;

public class CityWardDTO {

	private int wardNo;
	private String wardName;
	private String corporateName;
	private long population;
	private String areaInSqKiloMeters;
	
	public int getWardNo() {
		return wardNo;
	}
	
	public void setWardNo(int wardNo) {
		this.wardNo=wardNo;
	}
	
	public String getWardName() {
		return wardName;
	}
	
	public void setWardName(String wardName) {
		this.wardName=wardName;
	}
	
	public String getCorporateName() {
		return corporateName;
	}
	
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	
	public long getPopulation() {
		return population;
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}
	
	public String getAreaInSqKiloMeters() {
		return areaInSqKiloMeters;
	}
	
	public void setAreaInSqKiloMeters(String areaInSqKiloMeters) {
		this.areaInSqKiloMeters = areaInSqKiloMeters;
	}
}
