package org.research;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test5 {
	
	static int a =10;

	public static void main(String[] args) {
		
		Test5 name = new Test5();
		
		System.out.println(name.a);
		
		//extracted();
		
		double arr [] = {5,3,1,-1,4,2,-5,8,7, 6.9, 5.3, 3.1, 0};
		
		double temp=0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		for(double a : arr) {
			System.out.println(a);
		}
	}

	private static void extracted() {
		String s = "America";
		
		Map<String, Integer> map = new HashMap<>();
		
		
		for (int i = 0; i < s.length(); i++) {
			
			if(map.get(String.valueOf(s.charAt(i)).toLowerCase()) != null) {
				map.put(String.valueOf(s.charAt(i)).toLowerCase(), map.get(String.valueOf(s.charAt(i)).toLowerCase()) +1);
			}
			else {
				map.put(String.valueOf(s.charAt(i)).toLowerCase(), 1);
			}
			
			
		}
		
		map.forEach(( t, u) -> System.out.println(t +" "+ u));
	}
}
