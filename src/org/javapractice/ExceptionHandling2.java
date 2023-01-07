package org.javapractice;

public class ExceptionHandling2 {
	
	public static void main(String[] args)   {
	
		int age = 17;
		
		
		
		//passNameAndAge(17, "Bruce");
		try {
			passNameAndAge(17,"Namaz");
		} catch (AgeLessThanException e) {
			System.out.println("AgeLessThanException occured + "+ e.getMessage());
		} 
		finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("Execution continued");
		
		
		
	
		
	}

	
	private static void passNameAndAge (int age , String name) throws AgeLessThanException {
		
		
		validateAge(age);
		
		System.out.println("name : "+name);
	}
	private static void validateAge(int age) throws AgeLessThanException {
		
		
		if(age < 18) {
			
			throw new AgeLessThanException("Age is less than 18");
			
		}
		
		System.out.println(age);
	}
}	

class AgeLessThanException extends RuntimeException {
	
	AgeLessThanException( String s){
		super(s);
	}
	
	@Override
	public String getMessage() {
		
		return super.getMessage();
	}
}




