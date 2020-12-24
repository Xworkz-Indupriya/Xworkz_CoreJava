package com.xworkz.xworkzapp.waterpark;
//class which has reference of another class is known as "has a relation". We don't not need any relation but it need to have reference
// there are 4 types of "has a relation" - one to one(one waterpark one manager , one to many(one waterpark many workers),
public class WaterParkDTO {

	
	private String rides;
	private ManagerDTO manager;
	private WorkersDTO[] workers; // n number of workers will be there so we make use of array
	
	public String getName() {
		return rides;
	}
	public void setName(String rides ) {
		this.rides = rides ;
	}
	
	public ManagerDTO getManager() {
		return manager;
	}
	public void setManager(ManagerDTO manager) {
		this.manager = manager;
	}
	public WorkersDTO[] getWorkers() {
		return workers;
	}
	public void setWorkers(WorkersDTO[] workers) {
		this.workers = workers;
	}
	
	
	
	
}

