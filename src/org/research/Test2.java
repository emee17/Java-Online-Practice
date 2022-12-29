package org.research;

import org.javapractice.Test;

public class Test2 extends Test {
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		
		System.out.println(t.calculate());
		
		//System.out.println(t.privateModifier);
		//System.out.println(t.defaultModifier);
		System.out.println(t.protectedModifier);
		System.out.println(t.publicModifier);
		
	}

}


