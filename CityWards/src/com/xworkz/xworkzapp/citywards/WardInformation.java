package com.xworkz.xworkzapp.citywards;



public class WardInformation {

	public CityWardDTO[] cityWard= new CityWardDTO[2];
	public int index;
	public int i;
	
	/*public WardInformation() {
		System.out.println("Ward Information object is created");
	}*/
	
public void addWardDetails(CityWardDTO cityward) {
		
		System.out.println("Adding Ward Details");
		if(cityward!=null) {
		  if(cityward.getWardNo()!=0){
			if(cityward.getWardName()!=null){
				if(cityward.getPopulation() >= 5000) {
					cityWard[index++]=cityward;
						System.out.println("Added Ward Details ");
					}else 
					{
						System.out.println("Ward is not available");
				}
			}else {
				System.out.println("Population should be greater than 5000");
			}
		}	
	}
  }
	
	public void displayWardDetails() {
		for (int i = 0; i < cityWard.length; i++) {
			if(cityWard!=null) {
				System.out.println("Ward No"+cityWard[i].getWardNo()+" "+"Ward Name"+cityWard[i].getWardName()+" "+"Corporate Name"+cityWard[i].getCorporateName()+" "+"Population"+cityWard[i].getPopulation()+"Area"+cityWard[i].getAreaInSqKiloMeters());
			}else 
			{
				System.out.println("Ward is not available");
			}
		}
	}
	
	public void searchCityWardByWardName(String name) {
		boolean point=false;
		System.out.println("Searching the city by the wardName " + name);
		for (int i = 0; i < cityWard.length; i++) {
			if(cityWard[i]!=null) {
				if(cityWard[i].getWardName().equals(name)) {
					System.out.println("It matches so prints as");
					point=true;
					System.out.println(cityWard[i].getWardNo()+" "+cityWard[i].getWardName()+" "+cityWard[i].getPopulation()+" "+cityWard[i].getCorporateName()+" "+cityWard[i].getAreaInSqKiloMeters());
			}else
			{
				point=false;
			}
		}
	}
		if(point==false) {
			System.out.println("CityWard Details is not available of " + name);
		}
}
	
	
	public void returningCorparatorNameByWardNo(int wardNo) {
		boolean point=false;
		System.out.println("Returning the corparator name by ward No "+ wardNo);
		for (int i = 0; i < cityWard.length; i++) {
			if(cityWard!=null) {
			if(cityWard[i].getWardNo()==wardNo)	{
			point=true;
			System.out.println(cityWard[i].getCorporateName());
			}
			else{
				point=false;
			}
		}
	}
		if(point==false) {
			System.out.println("But Corparator name is not present in ward no " + wardNo);
		}
 }
}
