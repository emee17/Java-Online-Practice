package org.javapractice;

public class Test {
	
	
	
	private int a = 4;
	
	protected int b = 5;
	
	int c =0;
	
	
	private String privateModifier = "privateModifier";
	
	protected String protectedModifier = "protectedModifier";
	
	String defaultModifier ="DefaultModifier";
	
	public String  publicModifier = "publicModifier";
	
	
	protected int calculate() {
		
		
		c = a+b;
		
		//System.out.println(c);
		
		return c;
		
	}
	
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		
		System.out.println(t.c);
		
		int x = t.calculate();
		System.out.println(t.c);
		
		
		
		
	}
	
	
	

	
}


