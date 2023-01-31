package org.springcore;


public class FactoryDesignPattern 
{
	
	
	public Car getCar(String carName) {
		
		if(carName.equals("honda")) {
			return new HondaCar();
		}
		if(carName.equals("maruti")) {
			return new MarutiCar();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		FactoryDesignPattern fb = new FactoryDesignPattern();
		
		
		HondaCar honda = (HondaCar) fb.getCar("honda");
		
		MarutiCar maruti = (MarutiCar) fb.getCar("maruti");
		MarutiCar maruti2 = (MarutiCar) fb.getCar("else");
		
		System.out.println(maruti2.a);
		System.out.println(honda.a);
		System.out.println(maruti.a);
		
		
		HondaCar honda1 = new HondaCar();
		
		
	}
	
	
}

interface Car{
	//int a = 20
	
}
class HondaCar implements Car{
	int a = 10;
}
class MarutiCar implements Car{
	int a = 20;
}


