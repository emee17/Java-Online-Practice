package org.research;

public class ClonableExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Chair ch = new Chair();
		
		ch.id=20;
		
		Chair clone = (Chair) ch.clone();
		
		System.out.println(clone.id);
	}
	
}


class Chair implements Cloneable{
	
	int id ;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
