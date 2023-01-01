package org.research;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	

     /**
     * @param args
     */
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
         
         Collections.sort(ar3);
         Integer max = Collections.max(ar3);
         System.out.println(max);
         
         
         
         Iterator<Integer> iterator = ar3.iterator();
         
         
//         while(iterator.hasNext()) {
//        	 
//        	 Integer next = iterator.next();
//        	 if(iterator.next() ==23 | iterator.next() ==23) {
//        		 System.out.println("test comp");
//        	 }
//         }
//         
//         ArrayList<Students> sr3 = new ArrayList();
//         
//        for(Students i : sr3) {
//        	
//        	if(i.getLastname().equals("Raj")) {
//        		sr3.remove(i);
//        	}
// 
//        }
//        
//        for(int i=0; i<ar3.size(); i++) {
//        	
//        }
//        
//        ar3.forEach(s ->{
//        	System.out.println(s);
//        });
//        
        
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        
        lh.add(7);
        lh.add(null);
        lh.add(null);
        lh.add(2); 
        lh.add(3);
         
        
        
         System.out.println(lh);
         
         
//         List<String> intList = Arrays.asList("Tony","Sam","Bruce","Andy");
//         
//         
//         Collections.sort(intList);
         
        // intList.forEach(i->System.out.println(i));
         
         List<Students> studentList = new ArrayList<>();
         
         studentList.add(new Students(2, 19, "Tony"));
         studentList.add(new Students(3, 16, "Namaz"));
         studentList.add(new Students(1, 18, "Danish"));
         studentList.add(new Students(4, 20, "Shaikh"));
         
         //Collections.sort(studentList);
         
         Comparator<Students> comparator = (o1, o2) ->  o1.getLastname().compareTo(o2.getLastname());
         
         
         
         //Collections.sort(studentList, (o1, o2) ->  o1.getLastname().compareTo(o2.getLastname()));
         
         Collections.sort(studentList, (o1, o2) -> {
				if (o1.getId() == o2.getId())
					return 0;
				else if (o1.getId() > o2.getId())
					return 1;
				else
					return -1;
			});
         
         
         Students st8 = new Students() {
        	 
        	 @Override
        	 public void m1() {
        		 System.out.println("test");
        	 }
         };
         
         st8.m1();
         
         
         
         
         
         //studentList.forEach(System.out::println);
         
         
         
         
         
         
//         //Collections.sort(students);
//         
//         //StudentsComparator sc = new StudentsComparator();
//         
//         Comparator<Students> sc = (Students o1, Students o2) -> {
//
//				return o1.getLastname().compareTo(o2.getLastname());
//
//         };
//         
//         Collections.sort(students, sc);
//         
//         Collections.sort(students, (o1, o2) ->  Integer.compare(o1.getAge(), o2.getAge()));
//         
//         System.out.println(students);
         
         
     }
     
     // 0.75 * 10 =7 
     //10 +7  =17
     //0.75 * 17 = 12
     //17 +12 = 29
     	
}

//class StudentComparatorForNameClass implements Comparator<Students> {
//
//	@Override
//	public int compare(Students o1, Students o2) {
//		
//		return o1.getLastname().compareTo(o2.getLastname());
//	}
//	
//}
//class StudentComparatorForIdClass implements Comparator<Students> {
//
//	@Override
//	public int compare(Students o1, Students o2) {
//		
//		if (o1.getId() == o2.getId())
//			return 0;
//		else if (o1.getId() > o2.getId())
//			return 1;
//		else
//			return -1;
//	}
//	
//}


class Students implements Comparable<Students> {
	
	private int id;
	private int age;
	private String lastname;
	
	
	public Students(int id, int age, String lastname) {
		super();
		this.id = id;
		this.age = age;
		this.lastname = lastname;
	}
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

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

	
 

	@Override
	public String toString() {
		return "Students [id=" + id + ", age=" + age + ", lastname=" + lastname + "]";
	}

	@Override
	public int compareTo(Students o) {
		
		if (age == o.getAge())
			return 0;
		else if (age > o.age)
			return 1;
		else
			return -1;
	}
	
	
	public void m1() {
		System.out.println("metho from parent");
	}
	
	
	
	
	
}


