package org.research;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodOverLoading { //This is the example of Method Overloading/ Compile time Polymorphism/ Static Polymorphism
	
	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<>();	
		
		vehicles.add(new Vehicle(1343, 112104L, "Suzuki", "Dezire"));
		vehicles.add(new Vehicle(2542, 984354L, "Honda", "Civic"));
		vehicles.add(new Vehicle(1095, 326322L, "Maruti", "800"));
		vehicles.add(new Vehicle(9837, 432933L, "Toyota", "Innova"));
		vehicles.add(new Vehicle(5637, 127647L, "Suzuki", "Baleno"));//064844L
		
		Showroom show = new Showroom(vehicles); 
		
		List<Vehicle> matchedVehicleFromModelNo = show.getInfo(1095);
		
		matchedVehicleFromModelNo.forEach(v-> System.out.println(v.getVehicleInfo()) );
		
		Factory matchedVehicleFromCarName = show.getInfo("Toyota");
		System.out.println(matchedVehicleFromCarName.a);
		
		System.out.println(matchedVehicleFromCarName.getVehicleInfo());
		
		List<Vehicle> matchedVehicleFromEngineNo = show.getInfo("Baleno",127647L);
		
		matchedVehicleFromEngineNo.forEach(v-> System.out.println(v.getVehicleInfo()) );
		
		
	}
	
}

interface exampleInterface{
	
	int a=10;
}


class Showroom {	 
	
	List<Vehicle> vehicles;
	
	public Showroom(List<Vehicle> vehicles) {
		super();
		this.vehicles = vehicles;
	}
	

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<Vehicle> getInfo(int modelNo) {
		List<Vehicle> collect = vehicles.stream().filter(v -> v.getModelNo() == modelNo).collect(Collectors.toList());
		
		return  collect;
	}
	
	public Factory getInfo(String carName) {
		
		Vehicle vehicle = vehicles.stream().filter(v -> v.getCarName().equals(carName)).findFirst().get();
		
		return vehicle; 
	}
	
	
	public List<Vehicle> getInfo(String modelName, Long engineNo) {
		
		return vehicles.stream().filter(v -> v.getModelName().equals(modelName) && v.getEngineNo().equals(engineNo)).collect(Collectors.toList());
	}
	
}

abstract class Factory{
	
	int a = 2;
	
	public abstract String getVehicleInfo();
	
	public Factory() {
		
	}
	
	public Factory(int a) {
		this.a = a;
	}
	
}

class Vehicle extends Factory{
	
	private int modelNo;
	private Long engineNo;
	private String CarName;
	private String modelName;
	
	
	
	public Vehicle(int modelNo, Long engineNo, String carName, String modelName) {
		super();
		this.modelNo = modelNo;
		this.engineNo = engineNo;
		CarName = carName;
		this.modelName = modelName;
	}


	public int getModelNo() {
		return modelNo;
	}


	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}


	public Long getEngineNo() {
		return engineNo;
	}


	public void setEngineNo(Long engineNo) {
		this.engineNo = engineNo;
	}


	public String getCarName() {
		return CarName;
	}


	public void setCarName(String carName) {
		CarName = carName;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	@Override
	public String getVehicleInfo() {
		return "Vehicle [modelNo=" + modelNo + ", engineNo=" + engineNo + ", CarName=" + CarName + ", modelName="
				+ modelName + "]";
	}
	
}





