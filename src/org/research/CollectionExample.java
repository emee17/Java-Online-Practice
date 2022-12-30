package org.research;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionExample {

	

     public static void main (String [] args) {
    	 
    	 ArrayList ar = new ArrayList<>(); //10 - Load factor 0.75
         
         ar.add(1);
         ar.add(2);
         ar.add(8);
         ar.add("Some");
         ar.add(null);
         
         
         ArrayList ar2 = new ArrayList(); //10 - Load factor 0.75
         
         ar2.add(19);
         ar2.add(61);
         ar2.add("BAlphas");
         System.out.println(ar2);
         
         ar.remove(4);
        
         //ar.add(3, "modified");
         System.out.println( ar);
         
         HashSet<Integer> set = new HashSet<>();
         set.add(3);
         set.add(5);
         set.add(null);
         set.add(2);
         
         
         System.out.println(set);
         
     }
     
     // 0.75 * 10 =7 
     //10 +7  =17
     //0.75 * 17 = 12
     //17 +12 = 29
	
	
	
}


