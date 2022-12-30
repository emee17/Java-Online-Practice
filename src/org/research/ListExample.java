package org.research;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	

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
         //System.out.println(ar2);
         
         ar.remove(4);
        
         //ar.add(3, "modified");
         //System.out.println( ar);
         
         
         LinkedList<String> link = new LinkedList<>();
         
         link.add("Dog");
         link.add("Cat");
         link.add("Cow");
         //System.out.println(link.get(2));
         
         link.addFirst("Deer");
         link.addLast("Hippo");
         //System.out.println(link);
         
         Vector<String> v = new Vector<>();
         
         v.add("String");
         v.add("String");
         
         
         Stack<String> st = new Stack();	
         
         st.push("Str");
         st.push("abs");
         st.push("pqr");
         
         st.add("String");
         
         System.out.println(st);
         
         System.out.println(st.peek());
         
         System.out.println(st);
         
         
         Set<String> hs = new HashSet<>();
         
         hs.add("ABC");
         hs.add("PQR");
         hs.add("SLL");
         hs.add("NMA");
         hs.add("AKD");
         hs.add("SLL");
         hs.add(null);
         hs.add(null);
        
         
         ArrayList<Integer> ar3 = new ArrayList(); //10 - Load factor 0.75
         
         ar3.add(1);
         ar3.add(61);
         ar3.add(23);
         ar3.add(64);
         ar3.add(98);
         
         
         
         Iterator<Integer> iterator = ar3.iterator();
         
         
         while(iterator.hasNext()) {
        	 
        	 Integer next = iterator.next();
        	 if(iterator.next() ==23 | iterator.next() ==23) {
        		 System.out.println("test comp");
        	 }
         }
         
         ArrayList<Students> sr3 = new ArrayList();
         
        for(Students i : sr3) {
        	
        	if(i.getLastname().equals("Raj")) {
        		sr3.remove(i);
        	}
 
        }
        
        for(int i=0; i<ar3.size(); i++) {
        	
        }
        
        ar3.forEach(s ->{
        	System.out.println(s);
        });
        
        
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        
        lh.add(7);
        lh.add(null);
        lh.add(null);
        lh.add(2); 
        lh.add(3);
         
        
        
         System.out.println(lh);
         
         
     }
     
     // 0.75 * 10 =7 
     //10 +7  =17
     //0.75 * 17 = 12
     //17 +12 = 29
	
	
	
}

class Students{
	
	private int id;
	private int age;
	private String lastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}


