package org.research;

public class LamExample2 {

	public static void main(String[] args) {
		
		ValidatorClass vc = new ValidatorClass();
		
		vc.setAge(20);
		
		vc.validateAge((int age)-> {
				if(age < 18 ) {
					System.out.println("not valid");
				}else {
					System.out.println("Valid");
				}
				
			
		});
		
	}
	
	
}


interface GeneralValidation{
	
	public void validate(int age);
}


class ValidatorClass {

	private int age ;
	
	public void validateAge(GeneralValidation alpha) {
		
		alpha.validate(age);
		System.out.println("validateAge");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}