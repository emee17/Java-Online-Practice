package org.javapractice;

public class Test3 {

	
	public static void main(String[] args) {
		
		
		OS os = new Samsung(30);
		
		System.out.println(os.id);
		//os.ui();
		
//		OS o2 = new Motorola();
//		
//		o2.ui();
	}
}


abstract class OS {

	
	int id;
	
	OS(){
		
		System.out.println("Condtrictor from Abstract");
	}
	
	OS( int id){
		this.id = id;
	}
	
	abstract void call();
	
	public void ui() {
		System.out.println("UI from OS");
	}

	
}

abstract class someClass{
	
}

class Samsung extends OS{//, someClass
	
	
	Samsung(){
		super();
		System.out.println("Condtrictor from Child");
		
		
	}
	
	Samsung(int id){
		super(id);
		System.out.println("param Condtrictor from Child");
		
		
	}
	
	
	void call() {
		System.out.println("TSamsung is Calling");
	}
	
	public void ui() {
		System.out.println("UI from Samsung");
	}
	
	
}

class Motorola extends OS{

	
	
	@Override
	void call() {
		System.out.println("Motorola is calling");
		
	}
	
}
	

