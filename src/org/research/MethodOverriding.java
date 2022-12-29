package org.research;

import java.util.ArrayList;
import java.util.List;

public class MethodOverriding { //This is the example of Method Overriding/ RUntime Polymorphism/ Dynamic Polymorphism
	
	public static void main(String[] args) {
		
		Samsung sam = new Samsung();
		//sam.getContacts(new ArrayList());
		
		
	}	
	
}


class GoogleAndroid {	
	
	private int versionNo = 10;
	private String versionName = "Android Q";
	
	
	public int getVersionNo() {
		return versionNo;
	}


	public void setVersionNo(int versionNo) {
		this.versionNo = versionNo;
	}

	
	//List  parent
	
	//ArrayList child   
	
	//private default protected public

	public String getVersionName() {
		return versionName;
	}


	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}


	  protected Parent getOSInfo(Parent l) {
		System.out.println("This is the Stock Android "+ getVersionName());
		
		return new Child();
	}
	
	
}

class Samsung extends GoogleAndroid {
	
	
	@Override
	  protected Child getOSInfo(Parent l) {
		
		System.out.println("This is the Customized Android from Samsung "+ getVersionName());
		return new Child();
	}
	
	
}

class Parent{
	
	
}
class Child extends Parent{
	
	
}




