package org.research;

public class LamExample {

	public static void main(String[] args) {
		
		
		AlphaClass al = new AlphaClass();
		
		al.dance(()-> {
				System.out.println("Performance Started");
				
			
		});
		
		AlphaInterface alph = new AlphaInterface() {
			
			@Override
			public void perform() {
				System.out.println("Dance Started");
				
			}
		};
		
		
		AlphaClass al2 = new AlphaClass() {
			public void m1() {
				
			}
			public void dance(AlphaInterface alpha) {
				
				alpha.perform();
				System.out.println("some");
			}
		};
		
		al2.dance(alph);
	}
	
	
}


interface AlphaInterface{
	
	public void perform();
}


class AlphaClass {

	
	public void dance(AlphaInterface alpha) {
		
		alpha.perform();
		System.out.println("hit");
	}
	
	
}