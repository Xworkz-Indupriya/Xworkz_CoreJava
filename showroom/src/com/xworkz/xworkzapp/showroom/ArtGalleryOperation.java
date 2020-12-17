package com.xworkz.xworkzapp.showroom;

public class ArtGalleryOperation {

	public MonumentsDTO[] monumentsdtos;
	
	public int index;
	
	public ArtGalleryOperation(int size) {
		monumentsdtos= new MonumentsDTO[size]; 
	}
	
	public void addAllMonumentsDetail(MonumentsDTO monuments) {
		System.out.println("Adding monuments detail");
		monumentsdtos[index++]=monuments;
		System.out.println("Added all monuments detail");
	}
	
	public void showAllMonumentsDetail() {
		for (MonumentsDTO monuments: monumentsdtos) {
			if(monuments!=null) {
				System.out.println(monuments.getName()+ " " + monuments.getYear());	
			}
			else {
				System.out.println("All monument details are added");
			}
		}
	}
	
	
	
}
