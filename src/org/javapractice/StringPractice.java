package org.javapractice;

public class StringPractice {
	
	/***
	 * Namaz Shaikh
	 * 27th Dec 2022			
	 */
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String literal
		String s ="Bruce";
		
		//New Keyword
		String s1 = new String("Bruce"); //Heap = s1> Bruce
		
		String s2 = s; // SCP = s> s2> Namaz 
		
		String s3 = "Tony"; // SCP = s3> Tony 
		
		
		System.out.println(s+" Wayne"); // SCP = New Object Created but no reference point to this Object
		
		//(Double Equals) ==  check whether both s and s2 refers to the same object
		System.out.println(s == s2); //true 
		System.out.println(s1 == s); // false
		
		// .equals() method compares the content of the String
		System.out.println(s.equals(s1)); //true
		
		System.out.println(s.equals(s3)); //false
		
		//String methods
		String s4 = "BCD";
		
		String s5 = "PQR";
		
		System.out.println(s4.compareTo(s5)); //s4 is smaller than s5
		// if it compareTO return 0 then both String are equal
		// if it compareTO return Negative number then left String is smaller then right String.
		// if it compareTO return Positive number then left String is greater then right String.
		
		
		s4 = s4+" some text" + 17; 
		//if we concat String by using + operator then internally JVM performs below operation
		
		s4 = new StringBuffer(s4).append(" some text").append(17).toString();
		
		s4 = s4.concat(s3); // By this way we can only concat 2 String.
		
		String s6 = new String ("Peter");
		String s7 = "Peter";
		
		System.out.println(s6 == s7); //false  Here both variable are referring to different Object on in Heap and Other in SCP
		
		s6 = s6.intern(); // By using Intern method we are forcing s6 to  point only the object which is present in SCP
		
		System.out.println(s6 == s7); //True Result after using intern method
		
		
		String s8 = "We are Super Coder";
		
		
		System.out.println(s8.replace('e', 'z')); 
		// replace method will take 2 argument and 1st will be the character to be replace and 2nd would be the character to be replaced with
		
		/***
		 * Practice other methods too
		 */
		
		String s9 = "Alpha";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		s9.concat("Beta");
		
		
		
		
		
		
		
		if(s9.equals("Alpha")){
			
		}
		
		
		
		
		
		
	}

}
