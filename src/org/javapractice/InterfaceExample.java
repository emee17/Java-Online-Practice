package org.javapractice;

import java.io.Serializable;

public class InterfaceExample  {
	
	public static void main(String[] args) {
		
		MotherBoard lap = new Dell();
		
//		System.out.println(lap.role);
//		lap.ram();
		
		//lap.getBattery();
		
		//lap.processor();
		
		lap.m2();
		
		Dell.m1();
		Laptop.m1();
	}

	

}

// Marker Interface
interface MarkerInterface{
	
}//example : Serializable,Cloneable ,RemoteInterface


class example {
	
}


//Functional Interface
@FunctionalInterface
interface FunctionalInterfaceEample{ //Before Java 8 Functional interfaces were called as Simple Abstract Method
	public void method();
}


interface Laptop{
	
	public final static String role="ADMIN";
	
	public void ram();
	public void processor();
	//public void hdarDrive();
	
	
	
	public static void m1() {
		System.out.println("By Default funcitonality Laptop");
	}
	
	
	
	

}


interface MotherBoard {
	
	public void getMotherBoard();
	
	default void m2() {
		System.out.println("m2 from Motherboard");
	}
}

interface Battery extends Laptop{
	
	public void getBattery();
}

class Dell implements Laptop,MotherBoard {

	@Override
	public void ram() {
		System.out.println("DELL RAM");
		
	}

	@Override
	public void processor() {
		System.out.println("DELL Processor");
		
	}

//	@Override
//	public void getBattery() {
//		System.out.println("DELL Batter");
//		
//	}

	@Override
	public void getMotherBoard() {
		
	}
	
	public static void m1() {
		System.out.println("By Default funcitonality from Dell");
	}
	
	
}

class HP implements Laptop{

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processor() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void m2() {
		
	}
	
}
