package org.springcore;

public class SingletonMainClass {

	public static void main(String[] args) {
		
		//Steps	to Create Singleton Class
		// Make Costructor Private so no one can create an Object with new Keyword
		//
		
		SingletonClass sc = SingletonClass.getInstance();
		
		sc.a= 20;
		
		SingletonClass sc1 = SingletonClass.getInstance();
		
		System.out.println(sc.a);
		System.out.println(sc1.a);
		
		
		
	}
}

class SingletonClass {

	int a;
	
	static SingletonClass instance = new SingletonClass();
	
	private SingletonClass(){
		
	}
	
	
	public static SingletonClass getInstance() {
		
		return instance;
		
	}
	
}
