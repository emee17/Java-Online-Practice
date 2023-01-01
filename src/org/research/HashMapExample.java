package org.research;

import java.util.HashMap;

public class HashMapExample {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap();
		
		hm.put("Aa", "Tony"); //It already present (2112 & 15) = 3
		// 3rd Index -> 2112 Aa Tony address 
		
		hm.put("BB", "Bruce"); // 2112 & 15 = 3  BB.eqauls("Aa")
		// 3rd Index -> 2112 BB Tony address
		
		hm.put("hBO", "Bruce"); // 3456 & 15 = 5
		// 5th Index -> 3456 hBO Bruce address
		
		
		hm.get("BB"); //2112 & 15 = 3   BB.equals(Aa) false  BB.equals(BB) true
		
		hm.put(null, "Peter");
		
		hm.put("Some", "value");
		
		System.out.println(hm);
		
		//hashcode of key 64578
		
		//64578 % 15  = 3
		
		
        System.out.println("Aa".equals("Aa"));
		System.out.println(hm);
		
		String s = "Aa";
		
		String s2 = "BB";
		
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		
//		hm.put("ABC", "Tony");
//		hm.put("DEF", "Bruce");
//		hm.put("PQR", "Stark");
//
//
//		hm.put(null, "Banner");
//		hm.put(null, "Parker");
//		
//		hm.put("XYZ", "Stark");
//		
//		System.out.println(hm);
//	
//		
//		
//		
		String str = "ABC";
		
		Integer id = 255;
		
		//System.out.println(str.hashCode());
	}
}
