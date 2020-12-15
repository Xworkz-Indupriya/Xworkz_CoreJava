package com.xworkz.xworkzapp.farm;
//performing operation of dto (crude operation)
public class Operation {
	

	public FarmDTO[]  farmDTOs;
	
	public int index;
	
	// initialize the size of array
	public Operation(int size) {
		farmDTOs = new FarmDTO[size];
	}
	
	public void addFarmDetails(FarmDTO farm) {
		System.out.println("Adding farm details");
		farmDTOs[index++]=farm;
		System.out.println("Added farm deatils");
	}
	
	public void showAllFarmDetails() {
		for (FarmDTO farmDTO : farmDTOs) {
			//null check operation
			if(farmDTO != null){
				System.out.println(farmDTO.getTypeOfSoil()+ " " + farmDTO.getArea()+ " " + farmDTO.getTypeOfCrop());
			}
			else {
				System.out.println("Please add farm details");
			}
		}
	}	
}
