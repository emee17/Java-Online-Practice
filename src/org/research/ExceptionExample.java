package org.research;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("E://Test.txt");
		
//		String a = "Today is Sunday"; // length is 22
//      char c = a.charAt(50); // accessing 25th element
//      System.out.println(c);
		
//		String a = null; //null value
//      System.out.println(a.charAt(0));
		
//		int a = 5, b = 0;
//      int c = a/b;  // cannot divide by zero
//      System.out.println ("Result = " + c);
		
//		int num = Integer.parseInt ("akki") ;
		
//		int a[] = new int[5];
//      a[6] = 9;
		 
		ExceptionExample ex = new ExceptionExample();
		ex.m1();
    
	}
	
	
	public void m1() throws FileNotFoundException {
		FileReader file2= new FileReader("C:\\test\\a.txt");
	}
}
