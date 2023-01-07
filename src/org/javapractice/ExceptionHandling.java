package org.javapractice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
	
	public static void main(String[] args) throws FileNotFoundException {
	
		
		//somecalculation(50, 10);
		
//		int [] arr = {0,1,2,3,4,5,6};
//		
//		//System.out.println(arr[8]);
//		
//		String s = null;
//		
//		System.out.println(s.charAt(0));
		
		//try {
			FileReader fl = new FileReader("F://foler");
//		} catch (FileNotFoundException e) {
//			System.out.println("FileNotFoundException : "+e.getMessage());
//		}
		
	
		
		
	}
	
	public static void somecalculation(int a, int b) {
		
		
		int sum = a+b;
		System.out.println("sum is "+sum);
		
		int multiplication = a*b;
		System.out.println("multiplication is "+multiplication);
		
		
		try {
			
			int division = a/b;
			System.out.println("division is "+division);
			
//			int [] arr = {0,1,2,3,4,5,6};
//
//			System.out.println(arr[8]);
			
			try {
				String s = null;
				
				System.out.println(s.charAt(0));
			}catch (NullPointerException e) {
				System.out.println("Null poiner has occured here "+e.getMessage());
			}
			
			
		} catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException has occured here "+e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
		
			System.out.println("ArrayIndexOutOfBoundsException has occured here "+e.getMessage());
		
		}
		catch(Exception e) {
			
			System.out.println("Exception has occured here "+e.getMessage());
		
		}
		
		
		int substraction = a-b;
		System.out.println("substraction is "+substraction);
		
	}
}
