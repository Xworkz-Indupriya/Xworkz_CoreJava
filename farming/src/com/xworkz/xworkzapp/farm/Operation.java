package com.xworkz.xworkzapp.farm;
//performing operation of dto (crude operation)
public class Operation {
	
// CRUD operation
	public FarmDTO[]  farmDTOs; // we need to store multiple so we create array FarmDTO and we need reference as farmDTOs	
	public int index;// index value is used for accessing the array elements
	
	//declare an array
	// initialize the size of array
	public Operation(int size) { //operation constructor created which have the size as a parameter
		farmDTOs = new FarmDTO[size];// here the FarmDTO object is created which is array type
									//array will be of same type as FarmDTO
	}
	
	public void addFarmDetails(FarmDTO farm) { // we pass parameter as FarmDTO to access the objects of FarmDTO where FarmDTO is array type
		System.out.println("Adding farm details");
		farmDTOs[index++]=farm;//adding element into the array.
		System.out.println("Added farm deatils");
	}
	
	public void showAllFarmDetails() {
		for (FarmDTO farmDTO : farmDTOs) {//it is used to access the segregated data one by one
			//null check operation is used to check the data is empty or not
			if(farmDTO != null){
				System.out.println(farmDTO.getTypeOfSoil()+ " " + farmDTO.getArea()+ " " + farmDTO.getTypeOfCrop());
			}
			else {
				System.out.println("Please add farm details");
			}
		}
	}
	
	public void searchByCrop(String Crop) {
		
		for (FarmDTO farmDTO : farmDTOs) {//it is used to access the segregated data one by one
			//null check operation is used to check the data is empty or not
			if(farmDTO != null){
				if(farmDTO.getTypeOfCrop().equals(Crop)){
					System.out.println( " Crop is present ");
					System.out.println(farmDTO.getTypeOfSoil()+ " " + farmDTO.getArea()+ " " + farmDTO.getTypeOfCrop());
				}
				
			}
			else {
				System.out.println("Please add farm details");
			}
		}	
	}
	
public void searchByArea(String Area) {
		
		for (FarmDTO farmDTO : farmDTOs) {//it is used to access the segregated data one by one
			//null check operation is used to check the data is empty or not
			if(farmDTO != null){
				if(farmDTO.getTypeOfCrop().equals(Area)){
					System.out.println( " Crop is present ");
					System.out.println(farmDTO.getTypeOfSoil()+ " " + farmDTO.getArea()+ " " + farmDTO.getTypeOfCrop());
				}
				
			}
			else {
				System.out.println("Please add farm details");
			}
		}	
	}

public void searchBySoil(String Soil) {
	
	for (FarmDTO farmDTO : farmDTOs) {//it is used to access the segregated data one by one
		//null check operation is used to check the data is empty or not
		if(farmDTO != null){
			if(farmDTO.getTypeOfCrop().equals(Soil)){
				System.out.println( " Crop is present ");
				System.out.println(farmDTO.getTypeOfSoil()+ " " + farmDTO.getArea()+ " " + farmDTO.getTypeOfCrop());
			}
			
		}
		else {
			System.out.println("Please add farm details");
		}
	}	
}
}
	/*public FarmDTO showFarmDetailsByCrop(String Crop) {
	FarmDTO dto = null;

	for (FarmDTO farmDTO : farmDTOs) {// it is used to access the segregated data one by one
		// null check operation is used to check the data is empty or not
		if (farmDTO != null) {
			if (farmDTO.getTypeOfCrop().equals(Crop)) {

				System.out.println(" Crop is present ");
				dto = farmDTO;
			}

		} else {
			System.out.println("Please add farm details");
		}
	}
	return dto;
	}
}*/




