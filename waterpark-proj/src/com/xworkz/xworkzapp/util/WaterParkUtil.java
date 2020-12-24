package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.waterpark.WorkersDTO;
import com.xworkz.xworkzapp.waterparkk.WaterPark;

public class WaterParkUtil {

	public static void main(String[] args) {
		
		WaterPark waterpark = new WaterPark();
		waterpark.addManager("Indu", 8549898499L);
		
		waterpark.displayManager();
		
		WorkersDTO dto = new WorkersDTO();
		dto.setName("kallu");
		dto.setWorkerId(345);
		
		WorkersDTO dto1 = new WorkersDTO();
		dto1.setName("lallu");
		dto1.setWorkerId(395);
		
		waterpark.workersDTOs=new WorkersDTO[2];
		
		waterpark.addWorkers(dto);
		waterpark.addWorkers(dto1);
		waterpark.showWorkers();
		//WorkersDTO workersDTO = waterpark.showWorkersByName("rahul");
		//System.out.println(workersDTO.getName()+" "+workersDTO.getWorkerId());
		
		
	}
}

