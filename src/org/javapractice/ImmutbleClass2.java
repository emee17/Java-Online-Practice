package org.javapractice;



public final class ImmutbleClass2 {
	
	private final int id;
	private final String name;
	
	public ImmutbleClass2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	
	@Override
	public String toString() {
		return "ImmutbleClass2 [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
//		A a = new A();
//		
//		a.setId(1);
//		a.setName("Bruce");
//		
//		System.out.println(a);
//		
//		a.setId(45);
//		
//		System.out.println(a);
		
		ImmutbleClass2 im = new ImmutbleClass2(1,"Tony");
		
		System.out.println(im);
		
	    im = new ImmutbleClass2(0, null);
		
		
		
		
		
		
		
	}

}

class A {
	
	private int id;
	private String name;
	
	A(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
	
	
	
}



// Class Should be FINAL
// its variable should be final
//its variables hsould be private
// it should have only getters
//it should have paramaeterized constructor

// If Final is added with the Class then class cannot be inherited
// If final is added with the method then method cannot be overrided
//If FInal is added with variable then its value cannot be changed



