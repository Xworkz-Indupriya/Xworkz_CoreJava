package com.xworkz.xworkzapp.waterparkk;

import com.xworkz.xworkzapp.waterpark.ManagerDTO;
import com.xworkz.xworkzapp.waterpark.WorkersDTO;

public class WaterPark {

	public ManagerDTO manager;
	
	public WorkersDTO[] workersDTOs;
	public int index;

	
	public void addManager(String name,long contactNo)//adding manager by others
	{
		System.out.println("Adding the manager by name and contactno");
		if(name !=null && contactNo > 0)
		this.manager=new ManagerDTO(name, contactNo);//creating object of manager
		System.out.println("Added the manager name and contactno");
	}
	
	
	public void addManager(ManagerDTO dto)//adding manage directly
	{
		System.out.println("Adding manager directly");
		if(dto != null)
		this.manager=dto;
		else {
			System.out.println("Manager not added : null");
		}	
	}
	
	public void addWorkers(WorkersDTO workersDTO) {
		System.out.println(" ");
		if(workersDTO !=null) {
		workersDTOs[index++]=workersDTO;
		}
		}
	
	public void removeManager() {
		System.out.println("removing manager bcoz hes not good");
		this.manager=null;
	}
	
	public WorkersDTO showWorkersByName(String name) {
		WorkersDTO dto = null;
		for (int i = 0; i < workersDTOs.length; i++) 
		{
			if(workersDTOs[i]!=null)//fetching the individual data 
			{
				if(workersDTOs[i].getName().equals(name))//each and every object is of WorkerDTO 
				{
					System.out.println(workersDTOs[i].getName()+" "+workersDTOs[i].getWorkerId());
					dto=workersDTOs[i];
				}
			}
		}
		return dto;
	}
	
	public void displayManager() {
		System.out.println(this.manager.getName());
		System.out.println(this.manager.getContactNo());
	}

	
	public void showWorkers() {
		for(WorkersDTO workersDTO: workersDTOs) {
			if(workersDTO!=null) {
				System.out.println(workersDTO.getName()+" "+workersDTO.getWorkerId());
			}
		}
	}
	
}
